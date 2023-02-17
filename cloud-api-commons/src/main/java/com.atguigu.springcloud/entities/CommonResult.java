package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    //状态码
    private Integer code;
    //消息体
    private String message;
    //数据体
    private T data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }

}
