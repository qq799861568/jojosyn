package com.jojosyn.blog.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    // 状态码，通常使用HTTP状态码，但也可以是自定义的业务状态码
    private int code;

    // 消息，对状态码的进一步解释或说明
    private String message;

    // 数据，请求成功时返回的实际数据内容
    private T data;

    // 时间戳，表示响应数据生成的时间
    private String timestamp;

    // 带参数的构造函数
    public ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}
