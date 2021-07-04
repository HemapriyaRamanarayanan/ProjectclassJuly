package org.pro2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass {
public Pom() {
	PageFactory.initElements(driver, this);

}
@FindBy(id="username")
private WebElement tUser;

@FindBy(id="password")
private WebElement tPass;

@FindBy(xpath="//input[@type='Submit']")
private WebElement btnLogin;

public WebElement gettUser() {
	return tUser;
}

public WebElement gettPass() {
	return tPass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}

}
