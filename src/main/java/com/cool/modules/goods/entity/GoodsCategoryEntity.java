package com.cool.modules.goods.entity;

import com.cool.core.base.BaseEntity;
import com.tangzc.autotable.annotation.Index;
import com.tangzc.autotable.annotation.mysql.MysqlTypeConstant;
import com.tangzc.mybatisflex.autotable.annotation.UniIndex;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import com.mybatisflex.annotation.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(value = "goods_category", comment = "商品分类")
public class GoodsCategoryEntity extends BaseEntity<GoodsCategoryEntity> {

    @Index
    @ColumnDefine(comment = "名称", notNull = true)
    private String categoryName;

    @ColumnDefine(comment = "父分类ID", type = MysqlTypeConstant.TINYINT, defaultValue = "0")
    private Long parentCategoryId;

    @ColumnDefine(comment = "排序", notNull = true)
    private Integer sortOrder;

    @ColumnDefine(comment = "状态 0-禁用 1-正常", defaultValue = "1")
    private Integer status;
}
