package com.sabal.tacocloud.repositories;

import com.sabal.tacocloud.entities.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
