package org.dakkala.uhca.helloworld;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GreetingMessageTest {

	@Test
	public void check_if_am() {
		GreetingMessage gm=Mockito.spy(GreetingMessage.class);
		Mockito.when(gm.AMorPM()).thenReturn(Calendar.AM);
		String greeting=gm.getGreeting("Achuth");
		Assert.assertEquals("Good Morning Achuth@@@", greeting);
	}
	
	
	@Test
	public void check_if_pm() {
		GreetingMessage gm=Mockito.spy(GreetingMessage.class);
		Mockito.when(gm.AMorPM()).thenReturn(Calendar.PM);
		String greeting=gm.getGreeting("Achuth");
		Assert.assertEquals("Good Night Achuth@@@", greeting);
	}
	
	
	@Test
	public void check_if_niether() {
		GreetingMessage gm=Mockito.spy(GreetingMessage.class);
		Mockito.when(gm.AMorPM()).thenReturn(Calendar.HOUR);
		String greeting=gm.getGreeting("Achuth");
		Assert.assertEquals("Hello Achuth@@@", greeting);
	}

}
