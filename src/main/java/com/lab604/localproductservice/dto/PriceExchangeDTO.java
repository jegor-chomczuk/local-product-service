package com.lab604.localproductservice.dto;

import lombok.*;

import java.util.Currency;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PriceExchangeDTO {
    @NonNull
    private Double priceInUSD;
    @NonNull
    private Currency currency;
}