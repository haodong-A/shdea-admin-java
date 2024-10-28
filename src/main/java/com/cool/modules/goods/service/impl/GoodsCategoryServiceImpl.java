package com.cool.modules.goods.service.impl;

import com.cool.core.base.BaseEntity;
import com.cool.core.base.BaseServiceImpl;
import com.cool.core.exception.CoolException;
import com.cool.modules.goods.entity.GoodsCategoryEntity;
import com.cool.modules.goods.entity.GoodsInfoEntity;
import com.cool.modules.goods.mapper.GoodsCategoryMapper;
import com.cool.modules.goods.mapper.GoodsInfoMapper;
import com.cool.modules.goods.service.GoodsCategoryService;
import com.mybatisflex.core.query.QueryCondition;
import com.mybatisflex.core.query.QueryWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static com.cool.modules.goods.entity.table.GoodsCategoryEntityTableDef.GOODS_CATEGORY_ENTITY;

/**
 * 商品分类服务实现类
 */
@Service
@RequiredArgsConstructor
public class GoodsCategoryServiceImpl extends BaseServiceImpl<GoodsCategoryMapper, GoodsCategoryEntity> implements
    GoodsCategoryService {

    final private GoodsCategoryMapper goodsCategoryMapper;

    final private GoodsInfoMapper goodsInfoMapper;

    @Override
    public boolean delete(Long... ids) {
        //如果有一级分类的ids, 则查询所有二级分类id
        List<Long> childIds = goodsCategoryMapper
                .selectListByQuery(
                        QueryWrapper
                                .create().in(GoodsCategoryEntity::getParentCategoryId, (Object) ids)).stream().map(BaseEntity::getId).toList();
        List<Long> resultIds = new java.util.ArrayList<>(Arrays.stream(ids).toList());
        resultIds.addAll(childIds);
        //根据查询出来的二级分类id, 查询所有已经绑定分类的产品
        List<String> existCategoryGoods = goodsInfoMapper.selectListByQuery(
                QueryWrapper.create().in(GoodsInfoEntity::getCategory, resultIds)).stream().map(GoodsInfoEntity::getGoodsId).toList();

        if (!existCategoryGoods.isEmpty()) {
            throw new CoolException("抱歉，删除的分类中，已和商品编号为-"+existCategoryGoods.toString()+"-绑定, 请先更换对应的商品类目，再作删除");
        }

        if(!childIds.isEmpty()) {
            goodsCategoryMapper.deleteBatchByIds(childIds);
        }

        return super.delete(ids);
    }
}
