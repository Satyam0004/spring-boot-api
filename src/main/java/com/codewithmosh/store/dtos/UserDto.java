package com.codewithmosh.store.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class UserDto {
//    @JsonIgnore
//    @JsonProperty("user_id")
    private Long id;
    private String name;
    private String email;
}
