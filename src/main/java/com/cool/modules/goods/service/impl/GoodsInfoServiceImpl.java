package com.cool.modules.goods.service.impl;

import cn.hutool.json.JSONObject;
import com.cool.core.base.BaseServiceImpl;
import com.cool.core.exception.CoolException;
import com.cool.modules.goods.dto.product.ProductShowDto;
import com.cool.modules.goods.entity.GoodsInfoEntity;
import com.cool.modules.goods.entity.GoodsSpecEntity;
import com.cool.modules.goods.entity.table.GoodsInfoEntityTableDef;
import com.cool.modules.goods.entity.table.GoodsSpecEntityTableDef;
import com.cool.modules.goods.mapper.GoodsInfoMapper;
import com.cool.modules.goods.mapper.GoodsSpecMapper;
import com.cool.modules.goods.service.GoodsInfoService;
import com.mybatisflex.core.query.QueryCondition;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * 商品信息服务实现类
 */
@Service
@RequiredArgsConstructor
public class GoodsInfoServiceImpl extends BaseServiceImpl<GoodsInfoMapper, GoodsInfoEntity> implements GoodsInfoService {

    final private GoodsInfoMapper goodsInfoMapper;

    final private GoodsSpecMapper goodsSpecMapper;

    @Override
    public ProductShowDto getProductShowDto(JSONObject requestParam) {
        String goodsId = requestParam.get("goodsId").toString();
        if(StringUtils.isEmpty(goodsId)){
            throw new CoolException("Please input real goodsId!");
        }
        GoodsInfoEntity goodsInfoEntity = goodsInfoMapper.selectOneByCondition(QueryCondition.create(GoodsInfoEntityTableDef.GOODS_INFO_ENTITY.GOODS_ID, goodsId));
        if(Objects.isNull(goodsInfoEntity)){
            return null;
        }
        List<GoodsSpecEntity> goodsSpecEntities = goodsSpecMapper.selectListByCondition(QueryCondition.create(GoodsSpecEntityTableDef.GOODS_SPEC_ENTITY.INFO_ID, goodsInfoEntity.getId()));

        return ProductShowDto.builder()
                .title(goodsInfoEntity.getTitle())
                .description(goodsInfoEntity.getDescription())
                .spec(goodsSpecEntities)
                .cover(goodsInfoEntity.getCover())
                .build();
    }
}
