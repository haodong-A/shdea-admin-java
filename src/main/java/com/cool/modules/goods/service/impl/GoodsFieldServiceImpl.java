package com.cool.modules.goods.service.impl;

import cn.hutool.json.JSONObject;
import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.goods.entity.GoodsFieldEntity;
import com.cool.modules.goods.entity.table.GoodsFieldEntityTableDef;
import com.cool.modules.goods.mapper.GoodsFieldMapper;
import com.cool.modules.goods.service.GoodsFieldService;
import com.mybatisflex.core.query.QueryCondition;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
@RequiredArgsConstructor
public class GoodsFieldServiceImpl extends BaseServiceImpl<GoodsFieldMapper, GoodsFieldEntity>
        implements GoodsFieldService {

    private final GoodsFieldMapper goodsFieldMapper;

    @Override
    public boolean update(JSONObject requestParams, GoodsFieldEntity entity) {

        if(Objects.equals(entity.getStatus(), 1)) {
            List<GoodsFieldEntity> goodsFieldEntities = goodsFieldMapper.selectListByCondition(QueryCondition.
                    create(GoodsFieldEntityTableDef.GOODS_FIELD_ENTITY.STATUS, 1));
            List<GoodsFieldEntity> list = goodsFieldEntities.stream().peek(goodsFieldEntity -> goodsFieldEntity.setStatus(0)).toList();
            updateBatch(list);
        }
        return super.update(requestParams, entity);
    }
}
