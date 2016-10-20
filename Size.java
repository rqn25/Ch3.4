
import javax.swing.JOptionPane;

public class Size {

	public static void main(String[] args) {
		String size = JOptionPane.showInputDialog("Enter number of people");
		short numPeople = Short.parseShort(size);
		if (numPeople>10) {
			int groupSize = numPeople/2;
			JOptionPane.showMessageDialog(null, "The number of people is " + numPeople + " and the group size is " + groupSize);
		} else if (numPeople>3 & numPeople<10) {
			int groupSize = numPeople/3;
			JOptionPane.showMessageDialog(null, "The number of people is " + numPeople + " and the group size is " + groupSize);
		} else {
			JOptionPane.showMessageDialog(null, "The number of people has to be at least three.");
			
		}
		
		String size2 = JOptionPane.showInputDialog("Enter number of players");
		short numPlayers = Short.parseShort(size2);
		if (numPlayers>11 & numPlayers<55) {
			int teamSize = numPlayers/11;
			JOptionPane.showMessageDialog(null, "The number of players is " + numPlayers + " and the team size is " + teamSize);
		} else {
			int teamSize = numPlayers/numPlayers;
			JOptionPane.showMessageDialog(null, "The number of players is " + numPlayers + " and the team size is " + teamSize);
		}
	}
}
