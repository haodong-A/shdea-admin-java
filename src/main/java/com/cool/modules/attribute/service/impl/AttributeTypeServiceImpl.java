package com.cool.modules.attribute.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.attribute.entity.AttributeInfoEntity;
import com.cool.modules.attribute.entity.AttributeTypeEntity;
import com.cool.modules.attribute.mapper.AttributeInfoMapper;
import com.cool.modules.attribute.mapper.AttributeTypeMapper;
import com.cool.modules.attribute.service.AttributeInfoService;
import com.cool.modules.attribute.service.AttributeTypeService;
import io.netty.util.AttributeMap;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 属性类型服务实现类
 */
@Service
@RequiredArgsConstructor
public class AttributeTypeServiceImpl extends BaseServiceImpl<AttributeTypeMapper, AttributeTypeEntity> implements
        AttributeTypeService {

    final private AttributeTypeMapper attributeTypeMapper;

}
