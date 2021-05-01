package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTv implements TV{
	@Autowired
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("�ＺTV--���� Ų��");
		
	}
	@Override
	public void powerOff() {
		System.out.println("�ＺTV--���� ����");
		
	}
	
	public void volumpUp() {
		speaker.volumpUp();
	}
	public void volumpDown() {
		speaker.volumpDown();
	}

}
