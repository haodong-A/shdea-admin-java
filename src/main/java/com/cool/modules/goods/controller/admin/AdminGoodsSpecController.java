package com.cool.modules.goods.controller.admin;

import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.modules.goods.entity.GoodsSpecEntity;
import com.cool.modules.goods.service.GoodsSpecService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.cool.modules.goods.entity.table.GoodsSpecEntityTableDef.GOODS_SPEC_ENTITY;


@Tag(name = "商品规格信息", description = "商品规格信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminGoodsSpecController extends BaseController<GoodsSpecService, GoodsSpecEntity> {

    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().fieldEq(GOODS_SPEC_ENTITY.SPEC_NAME)
                .fieldEq(GOODS_SPEC_ENTITY.INFO_ID)
                .keyWordLikeFields(GOODS_SPEC_ENTITY.SPEC_NAME)
                .queryWrapper(QueryWrapper.create().orderBy(GOODS_SPEC_ENTITY.ORDER, false)));
    }
}
