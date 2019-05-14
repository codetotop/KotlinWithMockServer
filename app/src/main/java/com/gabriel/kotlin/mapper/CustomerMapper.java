package com.gabriel.kotlin.mapper;

import com.gabriel.kotlin.data.dto.CustomerDTO;
import com.gabriel.kotlin.data.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

public class CustomerMapper {

    /*CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    List<CustomerDTO> fromModels(List<Customer> customers);

    List<Customer> fromDTOs(List<CustomerDTO> dtos);*/


    public static List<Customer> fromDTOs(List<CustomerDTO> dtos) {
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < dtos.size(); i++) {
            customers.add(fromDTO(dtos.get(i)));
        }
        return customers;
    }

    private static Customer fromDTO(CustomerDTO dto) {
        return new Customer(dto.getMId(), dto.getMName(), dto.getMAge(), dto.getMCompany());
    }
}
