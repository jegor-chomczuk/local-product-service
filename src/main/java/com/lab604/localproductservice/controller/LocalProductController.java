package com.lab604.localproductservice.controller;

import com.lab604.localproductservice.dto.CurrencyDTO;
import com.lab604.localproductservice.dto.LocalProductDTO;
import com.lab604.localproductservice.dto.PriceExchangeDTO;
import com.lab604.localproductservice.dto.Product;
import com.lab604.localproductservice.interfaces.ILocalProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocalProductController {

    @Autowired
    private ILocalProductService localProductService;

    @GetMapping("/local-product/{id}")
    public LocalProductDTO getLocalProduct(@PathVariable(name = "id") Long id, @RequestBody CurrencyDTO currency){
        return localProductService.getLocalProduct(id, currency);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable(name = "id") Long id){
        return localProductService.getProduct(id);
    }

    @GetMapping("/price")
    public Double getPrice(@RequestBody PriceExchangeDTO priceExchangeDTO){
        return localProductService.getPrice(priceExchangeDTO);
    }
}
