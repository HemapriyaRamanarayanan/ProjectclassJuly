package org.pro10;

import org.testng.annotations.Test;

public class DataProviderCallingSample {
	
	@Test(dataProvider="Sample 2",dataProviderClass=DataProviderMantainsample.class)
    private void tc0(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);

	}
	
	@Test(dataProvider="Sample 3",dataProviderClass=DataProviderMantainsample.class)
	private void tc1(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);

	}
}
