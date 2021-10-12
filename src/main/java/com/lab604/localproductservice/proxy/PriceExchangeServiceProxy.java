package com.lab604.localproductservice.proxy;

import com.lab604.localproductservice.dto.PriceExchangeDTO;
import com.lab604.localproductservice.dto.PriceResultDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("price-exchange-service")
public interface PriceExchangeServiceProxy {
    @PostMapping("/exchange")
    PriceResultDTO exchangePrice(@RequestBody PriceExchangeDTO priceExchangeDTO);
}
