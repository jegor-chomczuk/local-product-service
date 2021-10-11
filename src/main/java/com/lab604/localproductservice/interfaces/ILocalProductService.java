package com.lab604.localproductservice.interfaces;

import com.lab604.localproductservice.dto.CurrencyDTO;
import com.lab604.localproductservice.dto.LocalProductDTO;
import com.lab604.localproductservice.dto.PriceExchangeDTO;
import com.lab604.localproductservice.dto.Product;

public interface ILocalProductService {
    LocalProductDTO getLocalProduct(Long id, CurrencyDTO currency);
    Product getProduct(Long id);
    Double getPrice(PriceExchangeDTO priceExchangeDTO);
}
