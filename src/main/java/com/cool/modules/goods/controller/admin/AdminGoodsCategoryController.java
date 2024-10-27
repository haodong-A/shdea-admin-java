package com.cool.modules.goods.controller.admin;

import cn.hutool.core.lang.Dict;
import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.core.request.R;
import com.cool.modules.goods.entity.GoodsCategoryEntity;

import static com.cool.modules.goods.entity.table.GoodsCategoryEntityTableDef.GOODS_CATEGORY_ENTITY;
import com.cool.modules.goods.service.GoodsCategoryService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.servlet.http.HttpServletRequest;

/**
 * 商品分类
 */
@Tag(name = "商品分类", description = "商品分类")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminGoodsCategoryController extends BaseController<GoodsCategoryService, GoodsCategoryEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().fieldEq(GOODS_CATEGORY_ENTITY.PARENT_CATEGORY_ID)
                .keyWordLikeFields(GOODS_CATEGORY_ENTITY.CATEGORY_NAME)
                .queryWrapper(QueryWrapper.create().orderBy(GOODS_CATEGORY_ENTITY.SORT_ORDER, true)));
        setListOption(createOp().fieldEq(GOODS_CATEGORY_ENTITY.PARENT_CATEGORY_ID)
                .queryWrapper(QueryWrapper.create().orderBy(GOODS_CATEGORY_ENTITY.SORT_ORDER, true)));
    }

    @Operation(summary = "获得商品分类数据", description = "获得商品分类数据信息")
    @PostMapping("/data")
    public R data(@RequestBody Dict body) {
        return R.ok(this.service.info(body.get("types", null)));
    }
}
