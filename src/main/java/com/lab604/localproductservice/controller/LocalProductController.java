package com.lab604.localproductservice.controller;

import com.lab604.localproductservice.dto.*;
import com.lab604.localproductservice.interfaces.ILocalProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocalProductController {

    @Autowired
    private ILocalProductService localProductService;

    @PostMapping("/local-product/{id}")
    public LocalProductDTO getLocalProduct(@PathVariable(name = "id") Long id, @RequestBody CurrencyDTO currency){
        return localProductService.getLocalProduct(id, currency);
    }
}
