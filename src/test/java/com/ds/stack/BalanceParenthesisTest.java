package com.ds.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceParenthesisTest {
    BalanceParenthesis balanceParenthesis;

    @BeforeEach
    void setUp() {
        balanceParenthesis=new BalanceParenthesis();
    }

    @Test
    void isBalancedPositiveTc001() {
        assertEquals(balanceParenthesis.isBalanced("(())"),true);
        assertEquals(balanceParenthesis.isBalanced("[()]{}{[()()]()}"),true);
    }
    @Test
    void isBalancedNegativeTc001(){
        assertEquals(balanceParenthesis.isBalanced("[(])"),false);
    }
}