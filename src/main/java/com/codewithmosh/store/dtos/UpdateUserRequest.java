package com.codewithmosh.store.dtos;


import lombok.Data;

@Data
public class UpdateUserRequest {
    private String name;
    private String email;
}
