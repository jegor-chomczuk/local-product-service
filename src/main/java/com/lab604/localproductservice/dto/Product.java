package com.lab604.localproductservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private Double priceInUSD;
}
