package com.cool.modules.goods.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.goods.entity.GoodsInfoEntity;
import com.cool.modules.goods.mapper.GoodsInfoMapper;
import com.cool.modules.goods.service.GoodsInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 商品信息服务实现类
 */
@Service
@RequiredArgsConstructor
public class GoodsInfoServiceImpl extends BaseServiceImpl<GoodsInfoMapper, GoodsInfoEntity> implements GoodsInfoService {

    final private GoodsInfoMapper goodsInfoMapper;

}
