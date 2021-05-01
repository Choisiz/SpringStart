package polymorphism;

import org.springframework.stereotype.Component;


public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("소니 객체");
	}
	public void volumpUp() {
		System.out.println("소니 스피커 --소리 올린다");
	}
	public void volumpDown() {
		System.out.println("소니 스피커 --내린다");
	}
}
