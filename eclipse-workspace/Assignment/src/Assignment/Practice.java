package Assignment;

public class Practice {
	
	public static void main(String[] args) {
		
		String text = "this is just to United 123 States of America is Great GOD check if we can code it or not";
		
		int vcount = 0;
		int ccount = 0;
		String temp = text.replaceAll("", " ").toUpperCase();
		for(int i = 0; i < temp.length(); i++) {
			if("AEIOU".contains(String.valueOf(temp.charAt(i)))) {
				vcount++;
			} else {
				ccount++;
			}
		}
		System.out.println("vowel: " + vcount);
		System.out.println("constant: " + ccount);
		
	}
	
	
}
