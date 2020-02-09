package org.qsp.testPom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.qsp.genricmethod.BaseTest;
import org.qsp.genricmethod.XL;
import org.qsp.pom.EnterTimeTrackPage;
import org.qsp.pom.LoginPage;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin() throws EncryptedDocumentException, FileNotFoundException, IOException {
		String un = XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
		String pw = XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
		String title = XL.getdata(XL_PATH, SHEET_NAME, 1, 2);

		LoginPage lp = new LoginPage(driver);
		lp.username(un);
		lp.setpassword(pw);
		lp.loginButton();

		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		etp.verifyHPisDisplayed(driver, ETO, title);

	}

}
