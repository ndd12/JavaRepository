import java.util.*;
import javax.swing.*;
//This was super easy.
public class GameZoneChapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		String[] classes = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};
		int card1Class = rand.nextInt(3);		
		int card2Class = rand.nextInt(3);
		int card1= rand.nextInt(13) + 1;
		int card2= rand.nextInt(13) + 1;
		
		JOptionPane.showMessageDialog(null, "Your First Card is the "+card1+" of "+classes[card1Class]);
		JOptionPane.showMessageDialog(null, "Your Second Card is the "+card2+" of "+classes[card2Class]);
		
		if(card1>card2){
			JOptionPane.showMessageDialog(null, "Card 1 is the higher card.");
		}
		else if(card1 == card2){
			JOptionPane.showMessageDialog(null, "Card 1 and card 2 are equal");
		}
		else{
			JOptionPane.showMessageDialog(null, "Card 2 is the higher card.");
		}
	}

}
