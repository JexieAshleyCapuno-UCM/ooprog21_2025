import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        
        while (true) {
            
            String name = JOptionPane.showInputDialog(null, "Please enter your name:");

            
            if (name == null || name.trim().isEmpty()) {
                break;  
            }

            
            int response = JOptionPane.showConfirmDialog(null, 
                    "Do you want to display your name: " + name + "?", 
                    "Confirm Name", 
                    JOptionPane.YES_NO_CANCEL_OPTION);  

            
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break; 
            } else if (response == JOptionPane.NO_OPTION) {
                continue; 
            } else if (response == JOptionPane.CANCEL_OPTION) {
                break; 
            }
        }
    }
}
