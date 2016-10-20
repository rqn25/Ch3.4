
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class SizeTwo extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		String username = "Robert";
		String password = "xxx";
		String login = JOptionPane.showInputDialog("Enter username");
		if(username.equals(login)) {
		String input = JOptionPane.showInputDialog("Enter password");
		if(input.equals(password)) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("Welcome Robert");
		alert.showAndWait();
			
		} else {
			String login2 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login2)) {
			String input2 = JOptionPane.showInputDialog("Enter password");
			if(input2.equals(password)) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Welcome Robert");
			alert.showAndWait();
				
		} else {
			String login3 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login3)) {
			String input3 = JOptionPane.showInputDialog("Enter password");
			if(input3.equals(password)) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Welcome Robert");
			alert.showAndWait();
			
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Contact Administrator");
			alert.showAndWait();
						
			}
			
		}}}}} else {
			String input4 = JOptionPane.showInputDialog("Enter password");
			if(input4.equals(password)) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Invalid Username");
			alert.showAndWait();
			String login4 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login4)) {
			String input5 = JOptionPane.showInputDialog("Enter password");
			if(input5.equals(password)) {
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setContentText("Welcome Robert");
			alert3.showAndWait();
			
		} else {
			Alert alert8 = new Alert(AlertType.INFORMATION);
			alert8.setContentText("Invalid Username");
			alert8.showAndWait();
			String login6 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login6)) {
			String input9 = JOptionPane.showInputDialog("Enter password");
			if(input9.equals(password)) {
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setContentText("Welcome Robert");
			alert3.showAndWait();
				
			}
				
		} else {
			String input6 = JOptionPane.showInputDialog("Enter password");
			if(input6.equals(password)) {
				
			Alert alert4 = new Alert(AlertType.INFORMATION);
			alert4.setContentText("Invalid Username");
			alert4.showAndWait();
			String login5 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login5)) {
			String input7 = JOptionPane.showInputDialog("Enter password");
			if(input7.equals(password)) {
			Alert alert5 = new Alert(AlertType.INFORMATION);
			alert5.setContentText("Welcome Robert");
			alert5.showAndWait();
				
			}
				
		} else {
			String input8 = JOptionPane.showInputDialog("Enter password");
			if(input8.equals(password)) {
			Alert alert6 = new Alert(AlertType.INFORMATION);
			alert6.setContentText("Invalid Username");
			alert6.showAndWait();
			Alert alert7 = new Alert(AlertType.INFORMATION);
			alert7.setContentText("Contact Administrator");
			alert7.showAndWait();
			
			}}}}}
				
		} else {
			String input5 = JOptionPane.showInputDialog("Enter password");
			if(input5.equals(password)) {
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setContentText("Invalid Username");
			alert3.showAndWait();
					
			String login5 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login5)) {
			String input7 = JOptionPane.showInputDialog("Enter password");
			if(input7.equals(password)) {
			Alert alert5 = new Alert(AlertType.INFORMATION);
			alert5.setContentText("Welcome Robert");
			alert5.showAndWait();
				
			}
					
		} else {
			String input10 = JOptionPane.showInputDialog("Enter password");
			if(input10.equals(password)) {
			Alert alert9 = new Alert(AlertType.INFORMATION);
			alert9.setContentText("Invalid Username");
			alert9.showAndWait();
			Alert alert7 = new Alert(AlertType.INFORMATION);				
			alert7.setContentText("Contact Administrator");
			alert7.showAndWait();
					
			}}}}
			
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Invalid Username");
			alert.showAndWait();
			String login4 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login4)) {
			String input5 = JOptionPane.showInputDialog("Enter password");
			if(input5.equals(password)) {
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setContentText("Welcome Robert");
			alert3.showAndWait();
				
			}
				
		} else {
			String input11 = JOptionPane.showInputDialog("Enter password");
			if(input11.equals(password)) {
			Alert alert10 = new Alert(AlertType.INFORMATION);
			alert10.setContentText("Invalid Username");
			alert10.showAndWait();
					
		} else {
			Alert alert11 = new Alert(AlertType.INFORMATION);
			alert11.setContentText("Invalid Username");
			alert11.showAndWait();
			String login7 = JOptionPane.showInputDialog("Enter username");
			if(username.equals(login7)) {
			String input5 = JOptionPane.showInputDialog("Enter password");
			if(input5.equals(password)) {				
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setContentText("Welcome Robert");
			alert3.showAndWait();
				
			}
					
		} else {
			String input12 = JOptionPane.showInputDialog("Enter password");
			if(input12.equals(password)) {
			Alert alert12 = new Alert(AlertType.INFORMATION);
			alert12.setContentText("Invalid Username");
			alert12.showAndWait();
						
		} else {
			Alert alert13 = new Alert(AlertType.INFORMATION);
			alert13.setContentText("Invalid Username");
			alert13.showAndWait();
			Alert alert7 = new Alert(AlertType.INFORMATION);
			alert7.setContentText("Contact Administrator");
			alert7.showAndWait();
					
		}}}}}}}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
