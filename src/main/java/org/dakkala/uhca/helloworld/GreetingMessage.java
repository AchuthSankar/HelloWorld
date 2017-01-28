package org.dakkala.uhca.helloworld;

import java.util.Calendar;

public class GreetingMessage {
	public String getGreeting(String name) {
		int  where=AMorPM();
		if(where==Calendar.AM) {
			return "Good Morning " + name;
		} 
		else if(where==Calendar.PM) {
			return "Good Night " + name;
		} 
		else {
			return "Hello " + name;
		}
	}
	public int AMorPM() {
		return Calendar.getInstance().get(Calendar.AM_PM);
	}
}
