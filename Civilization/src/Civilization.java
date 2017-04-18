import java.util.*;
import javax.swing.*;

public class Civilization {
	
	public static int Generatefunds() {
		Random rand = new Random();
		int n = rand.nextInt(25)+75;
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Your Starting Funds are: $"+Civilization.Generatefunds());
		System.out.println("Your opponets and their funds are: ");
		Countries.generateOpps();
	}

}
