package it.suite;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;


/**
 * 使用 tag 组合场景，
 * 目前 Junit5 没有完美的解决方案
 * 此方式依赖与 surefire-plugin 最新版本3。0，目前不稳定
 */
@RunWith(JUnitPlatform.class)
@SuiteDisplayName("一个测试套件")
@SelectPackages("first")
@IncludeTags("w")
public class CTest {

}

