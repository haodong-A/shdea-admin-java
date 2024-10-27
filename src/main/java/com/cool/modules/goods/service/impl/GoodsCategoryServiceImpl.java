package com.cool.modules.goods.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.goods.entity.GoodsCategoryEntity;
import com.cool.modules.goods.mapper.GoodsCategoryMapper;
import com.cool.modules.goods.service.GoodsCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 商品分类服务实现类
 */
@Service
@RequiredArgsConstructor
public class GoodsCategoryServiceImpl extends BaseServiceImpl<GoodsCategoryMapper, GoodsCategoryEntity> implements
    GoodsCategoryService {

    final private GoodsCategoryMapper goodsCategoryMapper;

}
