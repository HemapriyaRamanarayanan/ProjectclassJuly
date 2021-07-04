package org.pro2;

import org.openqa.selenium.WebElement;

public class PomSample extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	BaseClass b = new BaseClass();
	b.getDriver();
	b.launchUrl("https://adactinhotelapp.com/");
	
	Pom p = new Pom();
	
	WebElement gettUser = p.gettUser();
	b.type(gettUser, "karthi007");
	
	WebElement gettPass = p.gettPass();
	b.type(gettPass, "Karthi@1989");
	
	WebElement btnLogin = p.getBtnLogin();
	b.buttonLogin(btnLogin);
	
}
}
