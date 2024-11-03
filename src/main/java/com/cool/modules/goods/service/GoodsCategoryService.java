package com.cool.modules.goods.service;

import com.cool.core.base.BaseService;
import com.cool.modules.goods.dto.category.CategoryLevelDto;
import com.cool.modules.goods.entity.GoodsCategoryEntity;

import java.util.List;

/**
 * 商品分类服务接口
 */
public interface GoodsCategoryService extends BaseService<GoodsCategoryEntity> {

    List<CategoryLevelDto> getCategoryLevel();
}
