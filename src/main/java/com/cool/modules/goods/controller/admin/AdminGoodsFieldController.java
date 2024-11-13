package com.cool.modules.goods.controller.admin;

import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.modules.goods.entity.GoodsFieldEntity;
import com.cool.modules.goods.service.GoodsFieldService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.cool.modules.goods.entity.table.GoodsFieldEntityTableDef.GOODS_FIELD_ENTITY;

@Tag(name = "商品参数字段", description = "商品参数字段")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminGoodsFieldController extends BaseController<GoodsFieldService, GoodsFieldEntity> {

    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().fieldEq(GOODS_FIELD_ENTITY.NAME)
                .queryWrapper(QueryWrapper.create().orderBy(GOODS_FIELD_ENTITY.CREATE_TIME, false)));

    }
}
