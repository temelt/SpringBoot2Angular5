package com.temelt.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by tanert on 14.03.2018.
 */
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
}
