package com.ivan.ams.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 14:55
 * @Description: 系统日志类
 */
@Data
@NoArgsConstructor
public class Log extends Model<Log> {

    //主键id
    private Long id;

    //类型
    private String type;

    //标题
    private String title;

    //访问ip地址
    private String remoteAddr;

    //用户名
    private String username;

    //请求路径
    private String requestUri;

    //请求方法
    private String httpMehod;

    //调用的类名
    private String classMethod;

    //请求数据(参数)
    private String params;

    //session id
    private String seesionId;

    //响应
    private String response;

    //使用时间
    private Long useTime;

    //浏览器信息
    private String browser;
    //国家/地区
    private String area;

    //省份
    private String province;

    //市
    private String city;

    //网络服务商
    private String isp;

    //异常信息
    private String exception;

    /**
     * 创建者id
     */
    protected Long createId;

    /**
     * 更新者id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Long updateId;

    /**
     * 创建日期
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Date createDate;

    /**
     * 更新日期
     */
    protected Date updateDate;

    /**
     * 删除标志(Y：正常  N：删除  A：审核)
     */
    protected Boolean delFlag;

    /**
     * 备注
     */
    protected String remarks;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
