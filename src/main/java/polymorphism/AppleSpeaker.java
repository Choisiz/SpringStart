package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("애플 객체");
	}
	public void volumpUp() {
		System.out.println("애플 스피커 --소리 올린다");
	}
	public void volumpDown() {
		System.out.println("애플 스피커 --내린다");
	}
}
