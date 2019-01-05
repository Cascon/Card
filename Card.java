package collab;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Card {
	private String cardName, cardType;
	private int cardAttack, cardDefense;
	private BufferedImage  cardImage;	
	
	
	public Card(String name, String type, int attack, int defense, BufferedImage card) {
		this.cardName = name;
		this.cardType = type;
		this.cardAttack = attack;
		this.cardDefense = defense;
		cardImage = card;
	}

	//returns the attack value of the card as an int
	public int getAttackVaue() {
		return cardAttack;
	}
	public int getDefenseValue() {
		return cardDefense;
	}
	//where cards are mande
	public static void main(String[] args) throws IOException {
		Card BlueEyesWhiteDragon = new Card("Blue eyes white dragon","Light",3000,2500,null);
		Card DarkMagician = new Card("Dark Magician","Dark", 2500, 2100, null);
		Card FlameSwordsman = new Card("Flame Swordsman", "Fire", 1800, 1200, null);		
	}
	
}