package com.material_management.material;

import com.material_management.entity.Material;
import com.material_management.material.dto.AddRequestDto;
import com.material_management.material.dto.AddResponseDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/materials")
@RestController
public class MaterialController {

    private final MaterialService materialService;

    @PostMapping()
    public ResponseEntity<?> addMaterial(@RequestBody @NotNull List<@Valid AddRequestDto> dto){
        List<AddResponseDto> result = materialService.add(dto);
        return new ResponseEntity<List<AddResponseDto>>(result,HttpStatus.OK);
    }
}
