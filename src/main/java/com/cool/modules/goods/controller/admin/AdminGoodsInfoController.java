package com.cool.modules.goods.controller.admin;

import cn.hutool.core.lang.Dict;
import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.core.request.R;
import com.cool.modules.goods.entity.GoodsInfoEntity;
import static com.cool.modules.goods.entity.table.GoodsInfoEntityTableDef.GOODS_INFO_ENTITY;
import com.cool.modules.goods.service.GoodsInfoService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.servlet.http.HttpServletRequest;

/**
 * 商品信息
 */
@Tag(name = "商品信息", description = "商品信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminGoodsInfoController extends BaseController<GoodsInfoService, GoodsInfoEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().fieldEq(GOODS_INFO_ENTITY.CATEGORY)
                .keyWordLikeFields(GOODS_INFO_ENTITY.TITLE)
                .queryWrapper(QueryWrapper.create().orderBy(GOODS_INFO_ENTITY.CREATE_TIME, false)));
    }

    @Operation(summary = "获得商品数据", description = "获得商品数据信息")
    @PostMapping("/data")
    public R data(@RequestBody Dict body) {
        return R.ok(this.service.info(body.get("types", null)));
    }
}
