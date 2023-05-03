package com.study.core;

import com.study.core.discount.DiscountPolicy;
import com.study.core.discount.RateDiscountPolicy;
import com.study.core.member.MemberRepository;
import com.study.core.member.MemberService;
import com.study.core.member.MemberServiceImpl;
import com.study.core.member.MemoryMemberRepository;
import com.study.core.order.OrderService;
import com.study.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
}
