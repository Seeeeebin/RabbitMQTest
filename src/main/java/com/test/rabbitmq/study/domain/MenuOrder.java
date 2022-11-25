package com.test.rabbitmq.study.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class MenuOrder implements Serializable {

    private String orderIdentifier;
    private int orderId;
    private List<String> orderList;
    private String customerName;
    @Override
    public String toString() {
        return "MenuOrder{" +
                "orderIdentifier='" + orderIdentifier + '\'' +
                ", orderId=" + orderId +
                ", orderList=" + orderList +
                ", customerName='" + customerName + '\'' +
                '}';
    }



}
