package pkg;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Kiosk {

    private int curBookNum = 10001;

    public void run(){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while(!input.equals("Q")){
            StringTokenizer stringTokenizer = new StringTokenizer(input,",");
            if(input.equals("PA")){

            }else if(input.equals("PD")){

            }else if(input.equals("PN")){

            }else if(input.charAt(0) == 'A'){
                if(stringTokenizer.countTokens() != 3){
                    printError();
                }
                String name = stringTokenizer.nextToken();

            }else if(input.charAt(0) == 'R'){
                if(stringTokenizer.countTokens() != 2){
                    printError();
                }
            }else if(input.charAt(0) == 'O'){
                if(stringTokenizer.countTokens() != 2){
                    printError();
                }

            }else if(input.charAt(0) == 'I'){
                if(stringTokenizer.countTokens() != 2){
                    printError();
                }

            }else{
                printError();
            }

            input = scanner.nextLine();
        }
    }

    private void printError(){
        System.out.println("ERROR: Invalid Input");
    }
}
