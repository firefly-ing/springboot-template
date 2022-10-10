package com.fireflying.springbootTemplate.common.result;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public enum ResultCodeEnum {
    SUCCESS(20001, "success"),
    FAILD(50001, "failed")
    ;
    private Integer code;
    private String message;


    private ResultCodeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
