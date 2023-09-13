package com.yunshucloud.openhis.vo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:
 * 表格数据传输对象
 */
@ApiModel(value="com-yunshucloud-vo-DataGridView")//TO_DO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataGridView implements Serializable {
    private Long total;
    private List<?> data;
}

