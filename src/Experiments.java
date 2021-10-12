import java.util.Locale;
import java.util.Scanner;
public class Experiments {
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
        int numPeople = 1;
        String[] names = new String[5];
        char[][][] dentalRecord = new char[5][2][10];
        String teeth;


        for(int i = 0; i < numPeople; i++) {
            System.out.print("Please enter the name for family member     : ");
            names[i] = keyboard.next();
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("Please enter the uppers for " + names[i] + ": ");
                    teeth = keyboard.next().toUpperCase(Locale.ROOT);
                    while(!validTeeth(teeth)){
                        System.out.print("Try again: ");
                        teeth = keyboard.next().toUpperCase(Locale.ROOT);
                    }
                    for (int k = 0; k < teeth.length(); k++) {
                        dentalRecord[i][j][k] = teeth.charAt(k);
                    }
                }
                else{
                    System.out.print("Please enter the lowers for " + names[i] + ": ");
                    teeth = keyboard.next();
                    for(int k = 0; k < teeth.length(); k++){
                        dentalRecord[i][j][k] = teeth.charAt(k);
                    }
                }
            }
        }
    }

    private static boolean validTeeth(String teeth) {

        if (teeth.length() > 10) {
            System.out.print("Too much teeth, ");
            return false;
        }
        else {
            for (int i = 0; i < teeth.length(); i++) {
                if (teeth.charAt(i) != 'B' && teeth.charAt(i) != 'C' && teeth.charAt(i) != 'M') {
                    System.out.print("Invalid Teeth, ");
                    return false;
                }
            }
            return true;
        }
    }
}

