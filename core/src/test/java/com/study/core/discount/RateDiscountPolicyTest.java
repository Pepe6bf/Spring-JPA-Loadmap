package com.study.core.discount;

import com.study.core.member.Grade;
import com.study.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @DisplayName("[성공 테스트] - 정률 할인")
    @Test
    void vip_o() throws Exception {
        // Given
        Member member = new Member(1L, "memberVIP", Grade.VIP);

        // When
        int discount = discountPolicy.discount(member, 10000);

        // Then
        assertThat(discount).isEqualTo(1000);
    }

    @DisplayName("[실패 테스트] - 정룰 할인")
    @Test
    void vip_x() throws Exception {
        // Given
        Member member = new Member(2L, "memberBASIC", Grade.BASIC);

        // When
        int discount = discountPolicy.discount(member, 10000);

        // Then
        assertThat(discount).isEqualTo(0);
    }

}