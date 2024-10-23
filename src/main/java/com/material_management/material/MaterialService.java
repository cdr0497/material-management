package com.material_management.material;

import com.material_management.entity.Material;
import com.material_management.material.dto.AddRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    Material add(AddRequestDto dto){
        // 검증
        // 실행
        return null;
    };

    void update(){

    }

}
