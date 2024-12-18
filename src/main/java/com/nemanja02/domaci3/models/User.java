package com.nemanja02.domaci3.models;

import com.nemanja02.domaci3.listeners.UserListener;
import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@EntityListeners({UserListener.class})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
//    @NotBlank(message = "Username is mandatory")
    private String username;

    @Column
//    @NotBlank(message = "Password is mandatory")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Transient
    private String fullName;
}

