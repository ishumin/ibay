package com.ibay.domain;

import java.io.Serializable;

/**
 * @Author shumin
 * @Date 15:11 5.28 0028
 * @Description 用于response的类
 **/
public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code = 200;
    private String msg = "成功";
    private T data = null;
    private String detailMsg = "";

    public ResponseResult(){
    }

    public ResponseResult(int code){
        this.code = code;
    }
    public ResponseResult(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
    public ResponseResult(int code, T data){
        this.code = code;
        this.data = data;
    }
    public ResponseResult(int code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public String getDetailMsg() {
        return detailMsg;
    }
}
