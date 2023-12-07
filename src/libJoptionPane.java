import javax.swing.JOptionPane;

public class libJoptionPane {
    public static void main(String[] args) {

        //Show the message
        JOptionPane.showMessageDialog(null, "This is a message!");

        //Show dialog box
        String name = JOptionPane.showInputDialog("What's your name?");

        //Show confirm dialog box
        int choice = JOptionPane.showConfirmDialog(null, "Do you agree?");
        System.out.println(choice);

        String[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(null, "What's your choice?", "Options", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }
}
