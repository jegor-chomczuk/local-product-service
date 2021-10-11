package com.lab604.localproductservice.proxy;

import com.lab604.localproductservice.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-service")
public interface ProductServiceProxy {

    @GetMapping("/products/{id}")
    Product findById(@PathVariable("id") Long id);
}
