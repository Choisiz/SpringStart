package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("���� ��ü");
	}
	public void volumpUp() {
		System.out.println("���� ����Ŀ --�Ҹ� �ø���");
	}
	public void volumpDown() {
		System.out.println("���� ����Ŀ --������");
	}
}
