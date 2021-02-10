package pkg;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Kiosk {

    Library lib = new Library();
    private int curBookNum = 10001;

    public void run(){
        System.out.println("Library Kiosk running.");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while(!input.equals("Q")){
            StringTokenizer stringTokenizer = new StringTokenizer(input,",");
            String [] tokens = input.split(",");

            if(input.equals("PA")){
                lib.print();
            }else if(input.equals("PD")){
                lib.printByDate();
            }else if(input.equals("PN")){
                lib.printByNumber();
            }else if( input.equals("Q")){
                System.out.print("Kiosk session ended.");
                break;
            } else if(input.charAt(0) == 'A'){
                if(stringTokenizer.countTokens() != 3){
                    printError();
                }
                String num = String.valueOf(curBookNum++);
                String name = tokens[1];
                Date datePublished = new Date(tokens[2]);
                lib.add(new Book(num, name, datePublished));

            }else if(input.charAt(0) == 'R'){
                if(stringTokenizer.countTokens() != 2){
                    printError();
                }

                Book cur = lib.findBook(tokens[1]);
                if(cur == null){
                    System.out.println("Unable to remove, the library does not have this book.");
                }else{
                    lib.remove(cur);
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

        System.out.println("Invalid command!");
    }
}
