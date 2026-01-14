package com.codewithmosh.store.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDto {
//    @JsonIgnore
//    @JsonProperty("user_id")
    private Long id;
    private String name;
    private String email;
}
