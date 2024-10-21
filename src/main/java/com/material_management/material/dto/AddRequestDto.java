package com.material_management.material.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AddRequestDto {


    private String name;

    private String code;

    @Override
    public String toString() {
        return "AddRequestDto{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
