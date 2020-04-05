package com.ivan.ams.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 15:55
 * @Description: 树形菜单辅助类
 */
public class TreeMenu {

    private Long id;
    private Long pid;
    private String title;
    private String icon;
    private String href;
    //是否展开
    private Boolean spread;

    //子节点菜单
    private List<TreeMenu> children = new ArrayList<>();

    public TreeMenu(Boolean spread) {
        this.spread = false;
    }

    public TreeMenu(Long id, Long pid, String title, String icon, String href) {
        this.id = id;
        this.pid = pid;
        this.title = title;
        this.icon = icon;
        this.href = href;
    }
}
