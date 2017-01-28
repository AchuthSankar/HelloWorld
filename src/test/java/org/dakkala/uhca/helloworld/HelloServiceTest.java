package org.dakkala.uhca.helloworld;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(PowerMockRunner.class)
@PrepareForTest({HelloService.class})
public class HelloServiceTest {

	@Test
	public void testHello() throws Exception {
		GreetingMessage gm=Mockito.mock(GreetingMessage.class);
		Mockito.when(gm.getGreeting(anyString())).thenReturn("Mocking Worked");
		PowerMockito.whenNew(GreetingMessage.class).withNoArguments().thenReturn(gm);
		HelloService hs=new HelloService();
		ResponseEntity<String> response=hs.hello("Achuth");
		assertSame(response.getBody(), "Mocking Worked");
		assertSame(response.getStatusCode(), HttpStatus.OK);
	}

}
