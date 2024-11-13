package com.cool.modules.goods.entity;

import com.cool.core.base.BaseEntity;
import com.mybatisflex.annotation.Table;
import com.tangzc.autotable.annotation.Index;
import com.tangzc.autotable.annotation.mysql.MysqlTypeConstant;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.common.aliasing.qual.Unique;

@Getter
@Setter
@Table(value = "goods_field", comment = "商品参数字段")
public class GoodsFieldEntity extends BaseEntity<GoodsFieldEntity> {

    @ColumnDefine(comment = "参数模板名称", notNull = true)
    @Unique
    @Index
    private String name;

    @ColumnDefine(comment = "参数模板代码", type = MysqlTypeConstant.TEXT, notNull = true)
    private String template;

    @ColumnDefine(comment = "版本", type = MysqlTypeConstant.VARCHAR, notNull = true)
    private String version;

    @ColumnDefine(comment = "启用状态", type = MysqlTypeConstant.TINYINT, notNull = true, defaultValue = "1")
    private Integer status;
}
