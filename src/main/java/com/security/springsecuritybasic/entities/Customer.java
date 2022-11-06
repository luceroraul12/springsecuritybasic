package com.security.springsecuritybasic.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name ="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "pwd")
    private String psw;
    @Column(name = "role")
    private String role;
}
