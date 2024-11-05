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



}
