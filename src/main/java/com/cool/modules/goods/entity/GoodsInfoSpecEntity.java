package com.cool.modules.goods.entity;

import com.cool.core.base.BaseEntity;
import com.mybatisflex.annotation.Table;
import com.tangzc.autotable.annotation.mysql.MysqlTypeConstant;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;
/**
 * @author liuyi
 * 产品规格
 * */
@Setter
@Getter
@Table("goods_info_spec")
public class GoodsInfoSpecEntity extends BaseEntity<GoodsInfoSpecEntity> {
    @ColumnDefine(comment = "规格名称", notNull = true)
    private String specName;

    @ColumnDefine(comment = "规格类型", notNull = true)
    private String specType;

    @ColumnDefine(comment = "主图", notNull = true)
    private String mainImage;

    @ColumnDefine(comment = "副图,限制为5张", type = MysqlTypeConstant.TEXT)
    private String otherImages;

    @ColumnDefine(comment = "起订量-价格映射", notNull = true, type = MysqlTypeConstant.TEXT)
    private String moqPrices;

    @ColumnDefine(comment = "是否接受样品", type = MysqlTypeConstant.TINYINT)
    private Integer haveSample;

    @ColumnDefine(comment = "样品单价", type = MysqlTypeConstant.FLOAT)
    private float samplePrice;

    @ColumnDefine(comment = "详情页", type = MysqlTypeConstant.TEXT)
    private String detailPage;

    @ColumnDefine(comment = "排序")
    private String order;

    @ColumnDefine(comment = "商品信息id")
    private Integer infoId;
}
