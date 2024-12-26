package com.cool.modules.goods.controller.app;

import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.annotation.TokenIgnore;
import com.cool.core.base.BaseController;
import com.cool.modules.goods.entity.GoodsInfoEntity;
import com.cool.modules.goods.entity.table.GoodsInfoEntityTableDef;
import com.cool.modules.goods.service.GoodsInfoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Tag(name = "商品信息", description = "商品信息")
@CoolRestController(api = { "page", "list", "info"})
@TokenIgnore
public class AppGoodsInfoController extends BaseController<GoodsInfoService, GoodsInfoEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().keyWordLikeFields(GoodsInfoEntityTableDef.GOODS_INFO_ENTITY.TITLE));
    }
}
