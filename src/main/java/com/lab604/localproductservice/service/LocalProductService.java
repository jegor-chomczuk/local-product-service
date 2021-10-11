package com.lab604.localproductservice.service;

import com.lab604.localproductservice.dto.CurrencyDTO;
import com.lab604.localproductservice.dto.LocalProductDTO;
import com.lab604.localproductservice.dto.PriceExchangeDTO;
import com.lab604.localproductservice.dto.Product;
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

    public LocalProductDTO getLocalProduct(Long id, CurrencyDTO currency){
        Product product = productServiceProxy.findById(id);
        PriceExchangeDTO priceExchangeDTO = new PriceExchangeDTO(product.getPriceInUSD(), currency.getCurrency());
        Double localPrice = priceExchangeServiceProxy.exchangePrice(priceExchangeDTO);
        return new LocalProductDTO(product.getName(), localPrice);
    }

    public Product getProduct(Long id){
        return productServiceProxy.findById(id);
    }

    public Double getPrice(PriceExchangeDTO priceExchangeDTO){
        return priceExchangeServiceProxy.exchangePrice(priceExchangeDTO);
    }

}
