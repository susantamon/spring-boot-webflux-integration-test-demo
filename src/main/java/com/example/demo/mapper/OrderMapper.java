package com.example.demo.mapper;

import com.example.demo.entity.WebOrder;
import com.example.demo.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {
    @Mappings({
            @Mapping(source = "productName", target = "name")
    })
    Order toOrderModel(WebOrder webOrder);

    @Mappings({
            @Mapping(source = "name", target = "productName")
    })
    WebOrder toOrderEntity(Order order);
}
