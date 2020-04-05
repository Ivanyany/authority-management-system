package com.ivan.ams.util;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 16:09
 * @Description: 常量工具类
 */
public class Constant {

    public static final String HASH_ALGORITH = "SHA-1";//shiro采用的加密算法

    public static final int HASH_INTERATIONS = 1024;//生成hash值的迭代次数

    public static final int SALT_SIZE = 8;//生成盐的长度

    public static final String VALIDATE_CODE = "validateCode";//验证码
    public static final String ISVOICE = "ISVOICE";//是否开启语言验证码
    public static final String DEFAULF_PASSWORD = "123456";//默认密码
    public static final String ALLOWEDORIGINS = "http://localhost:63342";//允许跨域请求路径

}
