package com.cool.modules.goods.dto.category;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "分类层级")
@Builder
public class CategoryLevelDto {

    @Schema(description = "分类名称")
    private String label;

    @Schema(description = "分类id")
    private Long value;

    @Schema(description = "子类目")
    private List<CategoryLevelDto> children;
}
