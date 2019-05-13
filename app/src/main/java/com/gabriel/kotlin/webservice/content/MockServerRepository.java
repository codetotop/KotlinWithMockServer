package com.gabriel.kotlin.webservice.content;

import com.gabriel.kotlin.data.model.Customer;
import com.gabriel.kotlin.data.model.CustomerDetail;
import com.gabriel.kotlin.mapper.CustomerDetailMapper;
import com.gabriel.kotlin.mapper.CustomerMapper;
import com.gabriel.kotlin.webservice.WebServiceBuilder;
import io.reactivex.Single;

import java.util.List;

public class MockServerRepository {

    public static Single<CustomerDetail> fetchCustomDetail(Integer id) {

        return WebServiceBuilder.getInstance().getMockServerService()
                .fetchCustomerDetail(id)
                .flatMap(response -> {

                    CustomerDetail detail = CustomerDetailMapper.INSTANCE.fromDTO(response.getMData());
                    return Single.just(detail);
                });
    }

    public static Single<List<Customer>> fetchCustomerList() {
        return WebServiceBuilder.getInstance().getMockServerService()
                .fetchCustomers()
                .flatMap(response -> {
                    List<Customer> customer = CustomerMapper.INSTANCE.fromDTOs(response.getMData());
                    return Single.just(customer);
                });
    }


}
