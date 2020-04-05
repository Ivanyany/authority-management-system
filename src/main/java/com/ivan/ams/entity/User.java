package com.ivan.ams.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 15:44
 * @Description: 用户实体类
 */
@Data
@NoArgsConstructor
public class User extends Model<User> {

    //主键id
    private Long id;

    private String loginName;
    private String nickName;
    private String icon;
    private String password;

    //shiro加密盐
    private String salt;
    private String phone;
    private String email;
    private Integer locked;

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

    @TableField(exist = false)
    private Set<Role> roleSet = new HashSet<>();

    @TableField(exist = false)
    private Set<Menu> menuSet = new HashSet<>();

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
