package Assignment;
import java.util.*;
public class Animal_Details implements Zoo_Animal{
	
	public static void main(String[] args) {
		// I will create objects of class Birds and then will add all objects to an ArrayList.
		Birds bird1 = new Birds("Eagle", "white and brown", "Ghom Ghom");
		Birds bird2 = new Birds("Eagle", "white and brown", "Ghom Ghom");
		Birds bird3 = new Birds("Eagle", "white and brown", "Ghom Ghom");
		Birds bird4 = new Birds("Eagle", "white and brown", "Ghom Ghom");
		Birds bird5 = new Birds("Eagle", "white and brown", "Ghom Ghom");
		ArrayList<Birds> data = new ArrayList<Birds>();
		data.add(bird1);
		data.add(bird2);
		data.add(bird3);
		data.add(bird4);
		data.add(bird5);
		/*
		 * for(Birds b: data) { System.out.println(b.name + " " + b.color + " " +
		 * b.sound1); }
		 */
		// I will create objects of class Mammalia and will add all objects to an ArrayList.
		Mammalia Mam1 = new Mammalia("Lion", " white and yellow ", "roar roar");
		Mammalia Mam2 = new Mammalia("Lion", " white and yellow ", "roar roar");
		Mammalia Mam3 = new Mammalia("Lion", " white and yellow ", "roar roar");
		Mammalia Mam4 = new Mammalia("Lion", " white and yellow ", "roar roar");
		Mammalia Mam5 = new Mammalia("Lion", " white and yellow ", "roar roar");
		List<Mammalia> data2 = new ArrayList<Mammalia>();
		data2.add(Mam1);
		data2.add(Mam2);
		data2.add(Mam3);
		data2.add(Mam4);
		data2.add(Mam5);
		/*
		 * for(Mammalia d: data2) { System.out.println(d.nameMammalia + d.colorMammalia
		 * + d.soundMammalia); }
		 */	
		// I will create objects of class Reptiles and will add all objects to an ArrayList.
				Reptiles Rep1 = new Reptiles("Snake ", "brown ", "fiss fiss");
				Reptiles Rep2 = new Reptiles("Snake ", "brown ", "fiss fiss");
				Reptiles Rep3 = new Reptiles("Snake ", "brown ", "fiss fiss");
				Reptiles Rep4 = new Reptiles("Snake ", "brown ", "fiss fiss");
				Reptiles Rep5 = new Reptiles("Snake ", "brown ", "fiss fiss");
				ArrayList<Reptiles> Reptile = new ArrayList<Reptiles>();
				Reptile.add(Rep1);
				Reptile.add(Rep2);
				Reptile.add(Rep3);
				Reptile.add(Rep4);
				Reptile.add(Rep5);
				/*
				 * for(Reptiles w: Reptile) { System.out.println(w.name + w.color + w.sound); }
				 */
		// I will create objects of class Insect and will add all objects to an ArrayList.
				Insects insect1 = new Insects("Fly ", "Black ", "Bing Bing");
				Insects insect2 = new Insects("Fly ", "Black ", "Bing Bing");
				Insects insect3 = new Insects("Fly ", "Black ", "Bing Bing");
				Insects insect4 = new Insects("Fly ", "Black ", "Bing Bing");
				Insects insect5 = new Insects("Fly ", "Black ", "Bing Bing");
				ArrayList<Insects> insect = new ArrayList<Insects>();
				insect.add(insect1);
				insect.add(insect2);
				insect.add(insect3);
				insect.add(insect4);
				insect.add(insect5);
				/*
				 * for(Insects r: insect) { System.out.println(r.name + r.color + r.sound); }
				 */
				// I will create objects of class Insect and will add all objects to an ArrayList.
				Marine_Animals Marine1 = new Marine_Animals("Fish ", "Gold ", "no sound");
				Marine_Animals Marine2 = new Marine_Animals("Penguin ", "Gold ", "no sound");
				Marine_Animals Marine3 = new Marine_Animals("Barnacle ", "Gold ", "no sound");
				Marine_Animals Marine4 = new Marine_Animals("Albatross ", "Gold ", "no sound");
				Marine_Animals Marine5 = new Marine_Animals("Albatross ", "Gold ", "no sound");
				ArrayList<Marine_Animals> Marine = new ArrayList<Marine_Animals>();
				Marine.add(Marine1);
				Marine.add(Marine2);
				Marine.add(Marine3);
				Marine.add(Marine4);
				Marine.add(Marine5);
				/*
				 * for(Marine_Animals n: Marine) { System.out.println(n.name + n.color +
				 * n.sound); }
				 */
				ArrayList<Zoo_Animal> item = new ArrayList<Zoo_Animal>();
				item.addAll(insect);
				item.addAll(Marine);
				item.addAll(Reptile);
				item.addAll(data);
				item.addAll(data2);
				
				for(Zoo_Animal v: item) {
					System.out.println(v.toString());
				}
				
		}

	@Override
	public void sound(String str) {
		// TODO Auto-generated method stub
		
	}
}
		
	


