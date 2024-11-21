package com.cool.modules.goods.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.goods.entity.GoodsSpecEntity;
import com.cool.modules.goods.mapper.GoodsSpecMapper;
import com.cool.modules.goods.service.GoodsSpecService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsSpecServiceImpl extends BaseServiceImpl<GoodsSpecMapper, GoodsSpecEntity>
        implements GoodsSpecService {

    final GoodsSpecMapper goodsSpecMapper;
}
