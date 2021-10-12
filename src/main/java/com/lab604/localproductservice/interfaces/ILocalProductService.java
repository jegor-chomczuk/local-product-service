package com.lab604.localproductservice.interfaces;

import com.lab604.localproductservice.dto.CurrencyDTO;
import com.lab604.localproductservice.dto.LocalProductDTO;

public interface ILocalProductService {
    LocalProductDTO getLocalProduct(Long id, CurrencyDTO currency);
}
