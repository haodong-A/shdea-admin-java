package com.cool.modules.goods.service;

import cn.hutool.json.JSONObject;
import com.cool.core.base.BaseService;
import com.cool.modules.goods.dto.product.ProductShowDto;
import com.cool.modules.goods.entity.GoodsInfoEntity;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 商品信息服务接口
 */
public interface GoodsInfoService extends BaseService<GoodsInfoEntity> {

    ProductShowDto getProductShowDto(JSONObject requestParam);

}
