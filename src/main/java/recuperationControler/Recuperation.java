package recuperationControler;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class Recuperation {
	
	private GpioPinDigitalOutput level2pin;
	private GpioPinDigitalOutput level3pin;
	private long level2duration;
	private long level3duration;
	final private GpioController gpio = GpioFactory.getInstance();
	
	public Recuperation(int level2duration,int level3duration) {	
		this.level2pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "Level2Pin", PinState.HIGH);
		this.level3pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "Level3Pin", PinState.HIGH);
		this.level2duration = level2duration*1000;
		this.level3duration = level3duration*1000;
	}

	public void runOnLevel2() throws InterruptedException {
		swichONlevle2();
		Thread.sleep(level2duration);
		switOffLevel2();   
	}
	public void runOnLevel3() throws InterruptedException {
		swichONlevle3();
		Thread.sleep(level3duration);
		switOffLevel3();   
	}
	
	public void swichONlevle2(){
		level2pin.low();
	}
	public void switOffLevel2(){
		level2pin.high();
	}
	public void swichONlevle3(){
		level3pin.low();
	}
	public void switOffLevel3(){
		level3pin.high();
	}
	public void destroy(){
		 gpio.shutdown();
	}

	
}

