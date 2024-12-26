package com.cool.modules.goods.dto.product;

import com.cool.modules.goods.entity.GoodsSpecEntity;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "产品展示页面")
@Builder
public class ProductShowDto {
    @Schema(description = "标题")
    private String title;

    @Schema(description = "封面")
    private String cover;

    @Schema(description = "描述")
    private String description;

    private List<GoodsSpecEntity> spec;
}
