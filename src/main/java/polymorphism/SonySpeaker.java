package polymorphism;

import org.springframework.stereotype.Component;


public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("�Ҵ� ��ü");
	}
	public void volumpUp() {
		System.out.println("�Ҵ� ����Ŀ --�Ҹ� �ø���");
	}
	public void volumpDown() {
		System.out.println("�Ҵ� ����Ŀ --������");
	}
}
