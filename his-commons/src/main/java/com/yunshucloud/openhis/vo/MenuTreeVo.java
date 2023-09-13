package com.yunshucloud.openhis.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuTreeVo {
    private String id;
    private String serPath; // 菜单表里的url
}
