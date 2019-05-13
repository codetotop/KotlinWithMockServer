package com.gabriel.kotlin.mapper;

import com.gabriel.kotlin.data.dto.CustomerDetailDTO;
import com.gabriel.kotlin.data.model.CustomerDetail;
import org.mapstruct.factory.Mappers;

public interface CustomerDetailMapper {
    CustomerDetailMapper INSTANCE = Mappers.getMapper(CustomerDetailMapper.class);

    CustomerDetail fromDTO(CustomerDetailDTO detailDTO);

    CustomerDetailDTO fromModel(CustomerDetail detail);
}
