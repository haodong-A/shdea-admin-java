package com.cool.modules.attribute.entity;

import com.cool.core.base.BaseEntity;
import com.tangzc.autotable.annotation.Index;
import com.tangzc.mybatisflex.autotable.annotation.UniIndex;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import com.mybatisflex.annotation.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(value = "attribute_info", comment = "属性信息")
public class AttributeInfoEntity extends BaseEntity<AttributeInfoEntity> {

    @UniIndex
    @ColumnDefine(comment = "名称", notNull = true)
    private String name;

    @UniIndex
    @ColumnDefine(comment = "英文名称", notNull = true)
    private String englishName;

    @ColumnDefine(comment = "属性类型ID", notNull = true)
    private Long typeId;

    @ColumnDefine(comment = "是否必填 0-非必填 1-必填", defaultValue = "0")
    private Integer required;

    @Index
    @ColumnDefine(comment = "字段类型 0-字符串 1-文本 2-日期 3-数字 ", defaultValue = "0")
    private Integer fieldType;

    @ColumnDefine(comment = "状态 0-禁用 1-启用", defaultValue = "1")
    private Integer status;

    @ColumnDefine(comment = "备注")
    private String remark;
}
