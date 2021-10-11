package com.lab604.localproductservice.proxy;

import com.lab604.localproductservice.dto.PriceExchangeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("price-exchange-service")
public interface PriceExchangeServiceProxy {

    @GetMapping("/exchange")
    Double exchangePrice(@RequestBody PriceExchangeDTO priceExchangeDTO);
}
