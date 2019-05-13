package com.gabriel.kotlin.mapper;

import com.gabriel.kotlin.data.dto.CustomerDTO;
import com.gabriel.kotlin.data.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    List<CustomerDTO> fromModels(List<Customer> customers);

    List<Customer> fromDTOs(List<CustomerDTO> dtos);

}
