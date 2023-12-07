import javax.swing.JOptionPane;

public class Oi {
    public static void main(String[] args) {
        //System.out.print("oi");
        //System.out.println(" Geni");
        //System.out.println(2);

        //variables
        String name = "Geni";
        int age = 22;
        System.out.println(name + " " + age);

        //OBS: (String) não é considerada apenas uma variável, é um objeto...
        String nameRead = JOptionPane.showInputDialog("What is your name? ");
        System.out.println("hello, "+ nameRead);

        //OBS: (System, main, args, out, println) - são funções reservadas e para cada ou (quase todas), possuiem classes ou metódos que são usadas ao serem executadas.
        //OBS: a classe main é considerado o método de uma classe sendo o mais importante, pois é o que executa as instruções do programa, e nem todas as classes são executadas.

        String ageRead = JOptionPane.showInputDialog("What is your age? ");
        System.out.println("Your age is: , "+ ageRead);
        //convert ageRead to int
        int ageConverted = Integer.parseInt(ageRead);

        //check if ageRead is converted
        if(ageConverted >= 18) {
            System.out.println("You ARE of legal age!");
        } else {
            System.out.println("You ARE NOT of legal age!");
        }
    }
}
