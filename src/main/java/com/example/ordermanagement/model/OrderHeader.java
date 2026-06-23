package com.example.ordermanagement.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order_header")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", columnDefinition = "BIGINT")
    private Long orderId;

    private Date orderDate;
    private String orderStatus;
    private String orderTotal;

    @OneToMany(mappedBy = "orderHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetails> orderDetails = new ArrayList<>();
}
