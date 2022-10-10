package com.fireflying.springbootTemplate.common.result;

import lombok.Data;

/**
 * 统一返回结果
 */

public class RestResult<T> {
    private Integer code;
    private String message;
    private T data;

    private RestResult(ResultCodeEnum resultCodeEnum, T data) {
        this(resultCodeEnum);
        this.data = data;
    }

    private RestResult(ResultCodeEnum resultCodeEnum) {
        this(resultCodeEnum.getCode(), resultCodeEnum.getMessage());
    }

    private RestResult(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    private RestResult(Integer code, String message, T data) {
        this(code, message);
        this.data = data;
    }

    private RestResult(String message, T data){
        this(ResultCodeEnum.SUCCESS.getCode(), message, data);
    }

    private RestResult(String message) {
        this(ResultCodeEnum.SUCCESS.getCode(), message);
    }
    private RestResult(T data) {
        this(ResultCodeEnum.SUCCESS, data);
    }

    private RestResult() {
        this(ResultCodeEnum.SUCCESS);
    }




    public static<T> RestResult<T> success(String msg, T data){
        return new RestResult<>(msg, data);
    }

    public static RestResult success(String msg){
        return new RestResult<>(msg);
    }

    public static RestResult failid(Integer code, String msg){
        return new RestResult<>(code, msg);
    }

    public static RestResult failid(){
        return new RestResult<>(ResultCodeEnum.FAILD.getCode(), ResultCodeEnum.FAILD.getMessage());
    }



}
