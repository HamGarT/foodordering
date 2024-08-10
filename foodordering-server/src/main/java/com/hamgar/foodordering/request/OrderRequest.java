package com.hamgar.foodordering.request;

import com.hamgar.foodordering.model.Address;
import lombok.Data;

@Data
public class OrderRequest {

    private Long restaurantId;
    private Address deliveryAddress;
}
