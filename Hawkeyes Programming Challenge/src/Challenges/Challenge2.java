package Challenges;
import javax .swing.*;
public class Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dN = JOptionPane.showInputDialog(null, "How many delegates does this state have?");
		double delegateNumber = Double.parseDouble(dN);
		
		String cOP = JOptionPane.showInputDialog(null, "What percent of the votes did canidate 1 receive? (Decimal Number Please)");
		double canOnePercent = Double.parseDouble(cOP);
		
		String cTP = JOptionPane.showInputDialog(null, "What percent of the votes did canidate 2 receive?(Decimal Number Please)");
		double canTwoPercent = Double.parseDouble(cTP);
		
		double canThreePercent = 1 - canTwoPercent - canOnePercent;
		
		double canOneDelegates = 0;
		double canTwoDelegates = 0;
		double canThreeDelegates = 0;
		
		if(canOnePercent > .5){
			canOneDelegates = delegateNumber;
			 canTwoDelegates = 0;
			 canThreeDelegates = 0;
		}
		else if(canOnePercent<.15){
			canOneDelegates = 0;
			if(canTwoPercent<.5 && canThreePercent<.5){
				canTwoDelegates = delegateNumber*canTwoPercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		else{
			if(canTwoPercent<.5 && canThreePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canTwoDelegates = delegateNumber*canTwoPercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		if(canTwoPercent > .50){
			canTwoDelegates = delegateNumber;
			canThreeDelegates = 0; 
			canOneDelegates = 0;
		}
		else if(canTwoPercent<.15){
			canTwoDelegates = 0;
			if(canTwoPercent<.5 && canThreePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		else{
			if(canOnePercent<.5 && canThreePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canTwoDelegates = delegateNumber*canTwoPercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		if(canThreePercent > .50){
			canThreeDelegates = delegateNumber;
			canOneDelegates = 0;
			canTwoDelegates = 0;
		}
		else if(canThreePercent<.15){
			canThreeDelegates = 0;
			if(canTwoPercent<.5 && canThreePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canTwoDelegates = delegateNumber*canTwoPercent;
			}
		}
		else{
			if(canTwoPercent<.5 && canOnePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canTwoDelegates = delegateNumber*canTwoPercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		JOptionPane.showMessageDialog(null, "Did it work? " + "\n"+delegateNumber + "\n"+canOneDelegates+ "\n"+canTwoDelegates + "\n"+canThreeDelegates);
	}

}
