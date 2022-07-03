package com.kakaopaysec.accountmanagementapi.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

//@AllArgsConstructor
@Data
public class AccountDTO {

    @ApiModelProperty(value = "사용자 ID", required = true)
    private Long userId;

    @ApiModelProperty(value = "계좌번호", required = true)
    private String accountNumber;

    public AccountDTO() { }

    public AccountDTO(Long userId, String accountNumber) {
        this.userId = userId;
        this.accountNumber = accountNumber;
    }

}
