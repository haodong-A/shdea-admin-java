package com.cool.modules.goods.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.goods.entity.GoodsFieldEntity;
import com.cool.modules.goods.mapper.GoodsFieldMapper;
import com.cool.modules.goods.service.GoodsFieldService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class GoodsFieldServiceImpl extends BaseServiceImpl<GoodsFieldMapper, GoodsFieldEntity>
        implements GoodsFieldService {

    private final GoodsFieldMapper goodsFieldMapper;
}
