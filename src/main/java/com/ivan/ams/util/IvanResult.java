package com.ivan.ams.util;

import java.util.HashMap;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 12:57
 * @Description: 统一返回类
 */
public class IvanResult extends HashMap<String, Object> {

    public static IvanResult success(){
        return success("成功");
    }

    /**
     * 成功
     * @param message
     * @return
     */
    public static IvanResult success(String message){
        IvanResult ivanResult = new IvanResult();
        ivanResult.setSuccess(true);
        ivanResult.setMessage(message);
        ivanResult.setCode(200);

        return ivanResult;
    }

    /**
     * 失败
     * @param message
     * @return
     */
    public static IvanResult fail(String message){
        IvanResult ivanResult = new IvanResult();
        ivanResult.setSuccess(false);
        ivanResult.setMessage(message);
        ivanResult.setCode(-1);

        return ivanResult;
    }

    public IvanResult setSuccess(Boolean success){
        if (success != null ){
            put("success", success);
        }
        return this;
    }

    public IvanResult setMessage(String message){
        if (message != null ){
            put("message", message);
        }
        return this;
    }

    public IvanResult setData(Object data){
        if (data != null ){
            put("data", data);
        }
        return this;
    }

    public IvanResult setCode(Integer code){
        if (code != null ){
            put("code", code);
        }
        return this;
    }

    public IvanResult setPage(Integer page){
        if (page != null ){
            put("page", page);
        }
        return this;
    }

    public IvanResult setCurrentPage(Integer currentPage){
        if (currentPage != null ){
            put("currentPage", currentPage);
        }
        return this;
    }

    public IvanResult setLimit(Integer limit){
        if (limit != null ){
            put("limit", limit);
        }
        return this;
    }

    public IvanResult setTotal(Integer total){
        if (total != null ){
            put("total", total);
        }
        return this;
    }

    public IvanResult setAny(String key, Object value){
        if (key != null && value != null ){
            put(key, value);
        }
        return this;
    }

}
