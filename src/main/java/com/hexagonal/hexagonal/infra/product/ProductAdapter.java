package com.hexagonal.hexagonal.infra.product;

import com.hexagonal.hexagonal.core.product.ProductDto;
import com.hexagonal.hexagonal.core.product.ProductDriven;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductAdapter implements ProductDriven {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public ProductDto create(ProductDto dto) {
        ProductEntity entity = productRepository.save(productMapper.from(dto));
        return productMapper.from(entity);
    }
}
