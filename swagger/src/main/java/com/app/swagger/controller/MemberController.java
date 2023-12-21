package com.app.swagger.controller;

import com.app.swagger.dto.MemberDTO;
import com.app.swagger.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//https://velog.io/@jeong-god/Spring-boot-Swagger-API-%EC%97%B0%EB%8F%99%ED%95%98%EA%B8%B0
//https://www.youtube.com/watch?v=Q27PGBYmHNA

@Tag(name = "member", description = "Member API")
@RequestMapping("/member")
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @Operation(summary = "회원 찾기", description = "id값으로 회원 찾기")
    @Parameters({
            @Parameter(name = "id", description = "id", example = "1"),
    })
    @GetMapping("/{id}")
    public String findById(@PathVariable Long id, Model model){
        MemberDTO memberDTO = memberService.findById(id);
        model.addAttribute("member", memberDTO);
        return "detail";
    }
}


