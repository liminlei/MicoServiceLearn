package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018-12-17.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

}
