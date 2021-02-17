package Assignment;

public class Mammalia implements Zoo_Animal{
	
	String nameMammalia;
	String colorMammalia;
	String soundMammalia;
	Mammalia(String nameMammalia, String colorMammalia, String soundMammalia) {
		this.nameMammalia = nameMammalia;
		this.colorMammalia = colorMammalia;
		this.soundMammalia = soundMammalia;
	}
	
	

	@Override
	public void sound(String str) {
		System.out.println(str);
		
	}

}
