package com.cool.modules.attribute.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.attribute.dto.LevelAttributeInfoDto;
import com.cool.modules.attribute.entity.AttributeInfoEntity;
import com.cool.modules.attribute.mapper.AttributeInfoMapper;
import com.cool.modules.attribute.mapper.AttributeTypeMapper;
import com.cool.modules.attribute.service.AttributeInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 属性信息服务实现类
 */
@Service
@RequiredArgsConstructor
public class AttributeInfoServiceImpl extends BaseServiceImpl<AttributeInfoMapper, AttributeInfoEntity> implements
    AttributeInfoService {

    final private AttributeInfoMapper attributeInfoMapper;

    final private AttributeTypeMapper attributeTypeMapper;
    @Override
    public List<LevelAttributeInfoDto> getLevelAttributeInfo() {
        return null;
    }
}
