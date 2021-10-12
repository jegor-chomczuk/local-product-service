package com.lab604.localproductservice.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PriceResultDTO {
    @NonNull
    private Double priceInCurrency;
}
