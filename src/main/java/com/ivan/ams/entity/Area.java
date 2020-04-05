package com.ivan.ams.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 23:45
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Area extends Model<Area> {

    private Integer id;
    private String name;
    private Integer pid;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
