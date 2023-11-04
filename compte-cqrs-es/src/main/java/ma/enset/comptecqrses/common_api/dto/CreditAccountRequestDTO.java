package ma.enset.comptecqrses.common_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreditAccountRequestDTO {
    private String accountId;
    private double amount;
    private String currency;

}
