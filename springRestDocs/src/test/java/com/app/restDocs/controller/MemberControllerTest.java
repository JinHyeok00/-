package com.app.restDocs.controller;

import com.app.restDocs.dto.MemberDTO;
import com.app.restDocs.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@WebMvcTest(value = MemberController.class)
@AutoConfigureRestDocs
public class MemberControllerTest {

    @MockBean
    MemberService memberService;

    @Autowired
    MemberDTO memberDTO;

    @Test
    @DisplayName("회원찾기")
    public void findByIdTest(){

    }
}
