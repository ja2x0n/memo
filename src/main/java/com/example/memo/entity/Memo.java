package com.example.memo.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Controller;


@Data
@Entity
@Table(name = "memo")
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String memo;

}
