package com.study.core.member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.study.core.member.Grade.*;
import static org.assertj.core.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @DisplayName("회원가입 테스트")
    @Test
    void join() throws Exception {
        // Given
        Member member = new Member(1L, "memberA", VIP);

        // When
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // Then
        assertThat(findMember.getName()).isEqualTo(member.getName());
    }
}