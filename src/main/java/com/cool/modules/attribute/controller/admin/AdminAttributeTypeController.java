package com.cool.modules.attribute.controller.admin;

import cn.hutool.core.lang.Dict;
import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.core.request.R;
import com.cool.modules.attribute.entity.AttributeInfoEntity;
import com.cool.modules.attribute.entity.AttributeTypeEntity;
import com.cool.modules.attribute.service.AttributeInfoService;
import com.cool.modules.attribute.service.AttributeTypeService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.cool.modules.attribute.entity.table.AttributeTypeEntityTableDef.ATTRIBUTE_TYPE_ENTITY;


/**
 * 属性信息
 */
@Tag(name = "属性信息", description = "属性信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminAttributeTypeController extends BaseController<AttributeTypeService, AttributeTypeEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().fieldEq(ATTRIBUTE_TYPE_ENTITY.NAME)
                .keyWordLikeFields(ATTRIBUTE_TYPE_ENTITY.NAME, ATTRIBUTE_TYPE_ENTITY.ENGLISH_NAME)
                .queryWrapper(QueryWrapper.create().orderBy(ATTRIBUTE_TYPE_ENTITY.CREATE_TIME, false)));
    }

    @Operation(summary = "获得属性数据", description = "获得属性数据信息")
    @PostMapping("/data")
    public R data(@RequestBody Dict body) {
        return R.ok(this.service.info(body.get("types", null)));
    }
}
