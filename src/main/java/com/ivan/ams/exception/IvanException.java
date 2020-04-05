package com.ivan.ams.exception;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 12:35
 * @Description: 自定义统一异常处理信息
 */
public class IvanException extends RuntimeException {

    public static final long serialVersionUID = 1L;

    private String msg;

    private Integer code;

    public IvanException(){
        this.code = 500;
    }

    public IvanException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }

    public IvanException(String msg, Integer code) {
        super(msg);
        this.code = code;
    }

    public IvanException(String msg, Integer code, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
        this.code = code;
    }

    public IvanException(String msg) {
        this.code = 500;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
