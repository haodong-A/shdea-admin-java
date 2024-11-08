package com.cool.modules.attribute.dto;

import com.cool.modules.attribute.entity.AttributeInfoEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@Schema(description = "属性层级")
public class LevelAttributeInfoDto {

    private String name;

    private String englishName;

    List<AttributeInfoEntity> children;
}
