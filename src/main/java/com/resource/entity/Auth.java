package com.resource.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity@Getter
public class Auth {

    @Id
    @GeneratedValue
    private Long id;

    private String roleType;

    private String roleName;

    private String roleDesc;

    private String roleCode;

    private String roleLevel;

    private LocalDateTime createDate;

    private String createId;

    private LocalDateTime updateDate;

    private String updateId;
}
