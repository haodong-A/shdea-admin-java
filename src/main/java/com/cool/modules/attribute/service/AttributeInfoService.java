package com.cool.modules.attribute.service;

import com.cool.core.base.BaseService;
import com.cool.modules.attribute.dto.LevelAttributeInfoDto;
import com.cool.modules.attribute.entity.AttributeInfoEntity;

import java.util.List;

/**
 * 属性信息服务接口
 */
public interface AttributeInfoService extends BaseService<AttributeInfoEntity> {
    List<LevelAttributeInfoDto> getLevelAttributeInfo();
}
