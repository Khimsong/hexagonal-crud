package com.hexagonal.hexagonal.app.product;

import com.hexagonal.hexagonal.core.product.ProductDto;

public interface ProductMapper {
    ProductResponse from(ProductDto dto);
    ProductDto from(ProductRequest request);


}
