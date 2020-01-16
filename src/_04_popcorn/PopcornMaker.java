package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave mic = new Microwave();
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want? Also, how long do you want it to cook?");
	Popcorn pop = new Popcorn(flavor);
	mic.putInMicrowave(pop);
	mic.setTime(5);
}
}
