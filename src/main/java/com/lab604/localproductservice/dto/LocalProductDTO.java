package com.lab604.localproductservice.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LocalProductDTO {
    @NonNull
    private String productName;
    @NonNull
    private Double priceInCurrency;
}
