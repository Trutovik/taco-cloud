package com.sabal.tacocloud.repositories;

import com.sabal.tacocloud.entities.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
