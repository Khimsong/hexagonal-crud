package com.hexagonal.hexagonal.infra.product;

import com.hexagonal.hexagonal.core.product.ProductDto;

public interface ProductMapper {

    ProductEntity from(ProductDto dto);
    ProductDto from(ProductEntity entity);

}
