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
    private final ModelMapper modelMapper;
    ;

    Material add(AddRequestDto dto){
        // 검증
        log.info("AddDto = {}", dto);
        log.info("모델 메퍼 = {}", modelMapper);
        Material entity = null;

        try {
            entity = modelMapper.map(dto,Material.class);  // null 발생.
        }catch (Exception e){
            log.error("에러 내용 = {}", e.getMessage());
        }
        log.info("entity 가 값이 왜 비냐? = {}", entity);

        // 실행
        return materialRepository.save(entity);
    };

    void update(){

    }

}
