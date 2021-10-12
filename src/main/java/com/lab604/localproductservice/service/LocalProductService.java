package com.lab604.localproductservice.service;

import com.lab604.localproductservice.dto.*;
import com.lab604.localproductservice.interfaces.ILocalProductService;
import com.lab604.localproductservice.proxy.PriceExchangeServiceProxy;
import com.lab604.localproductservice.proxy.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalProductService implements ILocalProductService {

    @Autowired
    ProductServiceProxy productServiceProxy;

    @Autowired
    PriceExchangeServiceProxy priceExchangeServiceProxy;

    public LocalProductDTO getLocalProduct(Long id, CurrencyDTO currency) {
        Product product = productServiceProxy.findById(id);
        PriceExchangeDTO priceExchangeDTO = new PriceExchangeDTO(product.getPriceInUSD(), currency.getCurrency());
        PriceResultDTO localPrice = priceExchangeServiceProxy.exchangePrice(priceExchangeDTO);
        return new LocalProductDTO(product.getName(), localPrice.getPriceInCurrency());
    }
}
