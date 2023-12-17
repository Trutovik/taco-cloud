package com.sabal.tacocloud.repositories;

import com.sabal.tacocloud.entities.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {

}
