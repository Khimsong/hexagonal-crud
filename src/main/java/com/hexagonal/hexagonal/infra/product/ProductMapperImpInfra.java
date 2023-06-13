package com.hexagonal.hexagonal.infra.product;

import com.hexagonal.hexagonal.core.product.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductMapperImpInfra implements ProductMapper {
    @Override
    public ProductEntity from(ProductDto dto) {
        ProductEntity entity = new ProductEntity();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        return entity;
    }

    @Override
    public ProductDto from(ProductEntity entity) {
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        return dto;
    }
}
