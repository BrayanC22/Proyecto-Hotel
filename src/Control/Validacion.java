package Control;

import javax.swing.JOptionPane;

public class Validacion {

    public int Read_Int(String msg) {
        String input = "";
        int output = 0;
        boolean flag = false;
        do {
            input = JOptionPane.showInputDialog(null, msg);
            input = input.trim();
            try {
                output = Integer.parseInt(input);
                flag = true;
            } catch (NumberFormatException x) {
                JOptionPane.showMessageDialog(null, "Erros: se esperaba un número entero.");
                flag = false;
            }
        } while (flag == false);
        return output;
    }

    public String Read_String(String msg) {
        String string = "";
        int c = 0;
        boolean flag = false;
        do {
            string = JOptionPane.showInputDialog(null, msg);
            string = string.trim();
            for (int i = 0; i < string.length(); i++) {
                if (Character.isLetter(string.charAt(i)) == true || string.charAt(i) == ' ') {
                    c++;
                }
            }
            if (c == string.length()) {
                flag = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error: se esperaban solo letras.");
                c = 0;
                flag = false;
            }
        } while (flag == false);
        return string;
    }

}
