package com.gabriel.kotlin.webservice.content;

import com.gabriel.kotlin.data.dto.CustomerDTO;
import com.gabriel.kotlin.data.dto.CustomerDetailDTO;
import com.gabriel.kotlin.data.response.BaseResponse;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface MockServerService {

    @GET("users")
    Single<BaseResponse<List<CustomerDTO>>> fetchCustomers();

    @GET("user/detail")
    Single<BaseResponse<CustomerDetailDTO>> fetchCustomerDetail(@Query("mId") Integer id);

}
