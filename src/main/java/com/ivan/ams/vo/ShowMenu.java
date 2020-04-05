package com.ivan.ams.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 15:52
 * @Description: 菜单辅助类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowMenu {

    private Long id;
    private Long pid;
    private String title;
    private String icon;
    private String href;
    //是否展开
    private Boolean spread = false;

    //子节点菜单
    private List<ShowMenu> children = new ArrayList<>();
}
