package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * Created by Administrator on 2018-12-17.
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
