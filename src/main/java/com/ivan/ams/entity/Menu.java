package com.ivan.ams.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 15:22
 * @Description: 菜单实体类
 */
@Data
@NoArgsConstructor
public class Menu<T> extends Model<Menu> {

    //主键id
    private Long id;

    private String name;

    private String href;

    private String target;

    private String icon;

    private String bgColor;

    private Integer isShow;

    private Integer isMenu;

    private String permission;

    //父节点
    private Long parentId;

    //节点层次(一层、二层、三层...)
    private Long level;

    //节点路径(1,2,3)
    private String parentIds;

    //排序
    private Integer sort;

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

    //子节点
    @TableField(exist = false)
    private List<T> children;

    //父亲树
    @TableField(exist = false)
    private T parentTree;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
