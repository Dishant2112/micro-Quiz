package com.quiz.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Quiz {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;

        @Transient
        private List<Question> questions;
    }
