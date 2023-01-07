package practice;

import java.util.ArrayList;

import model.Hero;
import model.ICharacter;
import model.Magician;
import model.Person;

public class Extends_p {
	
	public static void main(String[] args) {
		Hero hero = new Hero("슈퍼맨");
		Hero hero2 = new Hero("배트맨");
		
		hero.getName(); // Person에 상속받음
		hero.isFlying();
		hero.attack(hero2);
		
		Character character = new Hero("슈퍼맨2");
		Magician magician = new Magician();
		Character magician2 = new Magician();
		
		ICharacter magician3 = new Magician();
		
		if(magician3 instanceof Magician) {
			
		}
		
		ArrayList<Character> characterArrayList = new ArrayList<>();
		// 다형성의 장점
		characterArrayList.add(magician);
		characterArrayList.add(magician2);
		characterArrayList.add(hero); 
	}
}
