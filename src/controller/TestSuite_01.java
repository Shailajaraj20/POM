package controller;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite_01 extends AbstractTest {
@Test(description ="Verification of Login")
public void verifyLogin()
{
	Assert.assertTrue(loginView.login());
}
}
