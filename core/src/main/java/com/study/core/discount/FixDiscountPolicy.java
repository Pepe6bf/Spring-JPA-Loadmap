package com.study.core.discount;

import com.study.core.member.Member;

import static com.study.core.member.Grade.VIP;

public class FixDiscountPolicy implements DiscountPolicy {

    private static final int discountFixAmount = 1000;   // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}