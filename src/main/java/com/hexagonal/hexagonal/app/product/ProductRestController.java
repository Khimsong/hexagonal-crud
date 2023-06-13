package com.hexagonal.hexagonal.app.product;

import com.hexagonal.hexagonal.core.product.ProductDriving;
import com.hexagonal.hexagonal.core.product.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductDriving driving;
    private final ProductMapper mapper;

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest request) {
        ProductDto dto = mapper.from(request);
        ProductResponse response = mapper.from(driving.create(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
