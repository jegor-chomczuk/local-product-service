package com.lab604.localproductservice.dto;

import lombok.*;

import java.util.Currency;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyDTO {
    @NonNull
    Currency currency;
}
