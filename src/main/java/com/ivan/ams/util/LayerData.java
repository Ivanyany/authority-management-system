package com.ivan.ams.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 16:58
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayerData<T> {

    private Integer code = 0;

    private Integer count;

    private List<T> data;

    private String msg = "";
}
