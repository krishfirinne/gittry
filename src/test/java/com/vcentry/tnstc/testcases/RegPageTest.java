package com.vcentry.tnstc.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;
import com.vcentry.tnstc.initializer.INITIALLIZER;

public class RegPageTest extends INITIALLIZER {

	@Test
	public void validateRegPage() throws IOException{
	initialize();

	wd.get(envprop.getProperty("URL"));
	}
}
