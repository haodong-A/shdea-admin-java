package com.cool.modules.attribute.entity;

import com.cool.core.base.BaseEntity;
import com.mybatisflex.annotation.Table;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(value = "attribute_type", comment = "属性类型")
public class AttributeTypeEntity extends BaseEntity<AttributeTypeEntity> {

    @ColumnDefine(comment = "名称", notNull = true)
    private String name;

    @ColumnDefine(comment = "英文名称", notNull = true)
    private String englishName;

    @ColumnDefine(comment = "状态 0-禁用 1-正常", notNull = true, defaultValue = "1")
    private Integer status;

    @ColumnDefine(comment = "排序", notNull = true, defaultValue = "0")
    private Integer sort;

}
