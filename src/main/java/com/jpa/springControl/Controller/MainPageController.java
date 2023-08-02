package com.jpa.springControl.Controller;

import com.jpa.springControl.Dto.Main.MainListDto;
import com.jpa.springControl.Service.MainPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainPageController {

    private final MainPageService mainPageService;




    // 메인페이지 목록 출력
    @GetMapping("/api/main")
    public List<MainListDto> MainPageList(@RequestBody MainListDto mainListDto) {


        return mainPageService.MainProductList();

    }



}
