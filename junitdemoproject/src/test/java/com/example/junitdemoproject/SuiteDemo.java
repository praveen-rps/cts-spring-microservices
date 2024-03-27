package com.example.junitdemoproject;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
//@SelectClasses({ DemoTest2.class, DemoTests.class })
@SelectPackages({"com.example.junitdemoproject"})
@ExcludeTags("sanity")
@SuiteDisplayName("A demo Test Suite")
public class SuiteDemo {

}


