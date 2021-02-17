package Assignment;

public class Birds implements Zoo_Animal{
	
	String name;
	String color;
	String sound1;
	
	public Birds(String name, String color, String sound) {
		
		this.name = name ;
		this.color = color;
		this.sound1 = sound;
	}
	
	 
	@Override
	public	 
	void sound(String str) {
		System.out.println(str);
		
	}	 
}
