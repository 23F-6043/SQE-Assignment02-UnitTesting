package com.sqe.assignment;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, StringValidatorTest.class})
public class FastTestSuit {
}