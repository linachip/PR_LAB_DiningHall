package com.example.demo;

import java.util.List;

/**
 * Order is defined by its unique id, one or more menu items,
 * priority of order and maximum wait-time.
 */

public class Order {

    private int orderId;
    private List<Integer> items;
    private int priority;
    private float maxWait;

    public Order(int orderId, List<Integer> items, int priority, float maxWait){
        this.orderId = orderId;
        this.items = items;
        this.priority = priority;
        this.maxWait = maxWait;
    }

    public int getOrderId(){
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Integer> getItems() {
        return items;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }

}
