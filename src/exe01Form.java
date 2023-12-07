import javax.swing.JOptionPane;

public class exe01Form {
    public static void main(String[] args) {

        String nameRead = JOptionPane.showInputDialog("What's your name? ");
        int ageRead = Integer.parseInt(JOptionPane.showInputDialog("What's your age? "));

        JOptionPane.showMessageDialog(null, "Congratulations "+nameRead+" on your "+ageRead+" years!");
    }
}
