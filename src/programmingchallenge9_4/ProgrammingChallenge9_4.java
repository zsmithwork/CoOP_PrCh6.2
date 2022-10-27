package programmingchallenge9_4;
import javax.swing.JOptionPane;

public class ProgrammingChallenge9_4 {

    public static void main(String[] args) {
        char exit = 'x';
        String strExit;
        String str = "default.";
        VowCons vcCheck = new VowCons(str);

        do {
            str = JOptionPane.showInputDialog("Please enter a string: ");

            vcCheck.setStr(str);
            System.out.println("String input: " + str);
            System.out.println("Number of vowels: " + vcCheck.vCount());
            System.out.println("Number of consonants: " + vcCheck.cCount());

            strExit = JOptionPane.showInputDialog("x to close, any other letter to repeat: ");
            exit = Character.toLowerCase(strExit.charAt(0));
        } while (exit != 'x');
    }

}

