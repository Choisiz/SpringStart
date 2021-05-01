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
		System.out.println("»ï¼ºTV--Àü¿ø Å²´Ù");
		
	}
	@Override
	public void powerOff() {
		System.out.println("»ï¼ºTV--Àü¿ø ²ö´Ù");
		
	}
	
	public void volumpUp() {
		speaker.volumpUp();
	}
	public void volumpDown() {
		speaker.volumpDown();
	}

}
