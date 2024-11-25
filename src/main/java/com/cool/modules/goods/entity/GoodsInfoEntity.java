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
@Table(value = "goods_info", comment = "商品信息")
public class GoodsInfoEntity extends BaseEntity<GoodsInfoEntity> {

    @UniIndex
    @ColumnDefine(comment = "编号", notNull = true)
    private String goodsId;

    @Index
    @ColumnDefine(comment = "标题", notNull = true)
    private String title;

    @ColumnDefine(comment = "示例图", notNull = true)
    private String cover;

    @Index
    @ColumnDefine(comment = "分类", notNull = true)
    private String category;

    @ColumnDefine(comment = "描述")
    private String description;

    @Index
    @ColumnDefine(comment = "品牌", notNull = true, defaultValue = "SHDEA")
    private String brand;


    @ColumnDefine(comment = "状态 0-下架 1-上架", defaultValue = "1")
    private Integer status;

}
