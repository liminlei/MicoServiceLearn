package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * Created by Administrator on 2018-12-17.
 */
public interface ProductService {

    /**
     * 查询所有在架的商品列表
     * @return
     */
    List<ProductInfo> findUpAll();
}
