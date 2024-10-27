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

    @Index
    @ColumnDefine(comment = "品牌", notNull = true, defaultValue = "SHDEA")
    private String brand;

    @ColumnDefine(comment = "特殊属性", notNull = true, type = MysqlTypeConstant.TEXT)
    private String specificAttributes;

    @ColumnDefine(comment = "其他属性", type = MysqlTypeConstant.TEXT, notNull = true)
    private String otherAttributes;

    @ColumnDefine(comment = "交货", type = MysqlTypeConstant.TEXT, notNull = true)
    private String delivery;

    @ColumnDefine(comment = "状态 0-下架 1-上架", defaultValue = "1")
    private Integer status;

    @ColumnDefine(comment = "浏览次数", defaultValue = "0")
    private Integer viewCount;

    @ColumnDefine(comment = "收藏次数", defaultValue = "0")
    private Integer favoriteCount;
}
