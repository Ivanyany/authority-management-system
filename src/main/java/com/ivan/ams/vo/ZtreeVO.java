package com.ivan.ams.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 15:58
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZtreeVO {

    private Long id;
    private Long pid;
    private String name;
    private String url;

    private Boolean open = true;

    private Boolean isParent;

    private String icon;

    private List<ZtreeVO> children;
}
