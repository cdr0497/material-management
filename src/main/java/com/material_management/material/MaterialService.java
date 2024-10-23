package com.material_management.material;

import com.material_management.entity.Material;
import com.material_management.material.dto.AddRequestDto;
import com.material_management.material.dto.AddResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    public List<AddResponseDto> add(List<AddRequestDto> dtoList){
        List<Material> materials = dtoList.stream().map(this::convertToToEntity).toList();
        List<Material> saved = materialRepository.saveAll(materials);
        List<AddResponseDto> result = saved.stream().map(this::convertToAddResponseDto).toList();

        return result;
    }

    private Material convertToToEntity(AddRequestDto dto){
        return Material.builder()
                .name(dto.getName())
                .code(dto.getCode())
                .build();
    }

    private AddResponseDto convertToAddResponseDto(Material entity){
        return AddResponseDto.builder()
                .name(entity.getName())
                .code(entity.getCode())
                .build();
    }
}