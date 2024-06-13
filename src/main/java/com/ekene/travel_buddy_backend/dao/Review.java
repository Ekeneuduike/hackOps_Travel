package com.ekene.travel_buddy_backend.dao;

import com.ekene.travel_buddy_backend.dao.myenum.Grade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @OneToOne
    private Tourist Person;
    private String message;
    private Grade value;
    private int rating;
}
