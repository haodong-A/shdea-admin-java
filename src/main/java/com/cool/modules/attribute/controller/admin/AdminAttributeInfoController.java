package com.cool.modules.attribute.controller.admin;

import cn.hutool.core.lang.Dict;
import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.core.request.R;
import com.cool.modules.attribute.entity.AttributeInfoEntity;
import static com.cool.modules.attribute.entity.table.AttributeInfoEntityTableDef.ATTRIBUTE_INFO_ENTITY;
import com.cool.modules.attribute.service.AttributeInfoService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.servlet.http.HttpServletRequest;

/**
 * 属性信息
 */
@Tag(name = "属性信息", description = "属性信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminAttributeInfoController extends BaseController<AttributeInfoService, AttributeInfoEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().fieldEq(ATTRIBUTE_INFO_ENTITY.FIELD_TYPE)
                .keyWordLikeFields(ATTRIBUTE_INFO_ENTITY.NAME, ATTRIBUTE_INFO_ENTITY.ENGLISH_NAME)
                .queryWrapper(QueryWrapper.create().orderBy(ATTRIBUTE_INFO_ENTITY.CREATE_TIME, false)));
    }

    @Operation(summary = "获得属性数据", description = "获得属性数据信息")
    @PostMapping("/data")
    public R data(@RequestBody Dict body) {
        return R.ok(this.service.info(body.get("types", null)));
    }
}
