/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;
import java.util.Scanner;
/**
 *
 * @author user 
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        
        int player1 , player2;
        boolean play = true;
        int roc
        k = 1, paper = 2, scissors = 3, quit = 4;
        String playerOne = "Player One: Choose your weapon!";
        String playerTwo = "Player Two: Choose your weapon!";
        String choice = "Good choice!";
        int scr1 = 0, scr2 = 0;
        
        System.out.println();
        while(play){
            System.out.println(playerOne);
            player1 = sn.nextInt();
            if(player1 != quit){
                System.out.println(choice);
            
            System.out.println(playerTwo);
            player2 = sn.nextInt();
            System.out.println(choice);
            
            
            if(player1 == player2){
            
                switch(player1){
                    case 1:
                        System.out.println("Player One chose: rock");
                        System.out.println("Player Two chose: rock");
                        break;
                        
                    case 2:
                        System.out.println("Player One chose: paper");
                        System.out.println("Player Two chose: paper");
                        break;
                        
                    case 3:
                        System.out.println("Player One chose: scissors");
                        System.out.println("Player Two chose: scissors");
                        break;
                }
                
                System.out.println("It’s a draw!");
                System.out.println("The score is now: " +scr1 +" - "+ scr2);
            }
            else if(player1 != player2){
                    if(player1 == rock && player2 == scissors){
                        System.out.println("Player One chose: rock");
                        System.out.println("Player Two chose: scissors");
                
                        System.out.println("Player One Wins!");
                        scr1++;
                        System.out.println("The score is now: " +scr1 +" - "+ scr2);
                    }
                    else if(player2 == rock && player1 == scissors){
                        System.out.println("Player One chose: scissors");
                        System.out.println("Player Two chose: rock");
                
                        System.out.println("Player Two Wins!");
                        scr2++;
                        System.out.println("The score is now: " +scr1 +" - "+ scr2);
                    }
                    else if(player1 == paper && player2 == rock){
                        System.out.println("Player One chose: paper");
                        System.out.println("Player Two chose: rock");
                
                        System.out.println("Player One Wins!");
                        scr1++;
                        System.out.println("The score is now: " +scr1 +" - "+ scr2);
                    }
                    else if(player2 == paper && player1 == rock){
                        System.out.println("Player One chose: rock");
                        System.out.println("Player Two chose: paper");
                
                        System.out.println("Player Two Wins!");
                        scr2++;
                        System.out.println("The score is now: " +scr1 +" - "+ scr2);
                    }
                    else if(player1 == scissors && player2 == paper){
                        System.out.println("Player One chose: scossors");
                        System.out.println("Player Two chose: paper");
                
                        System.out.println("Player One Wins!");
                        scr1++;
                        System.out.println("The score is now: " +scr1 +" - "+ scr2);
                    }
                    else if(player2 == scissors && player1 == paper){
                        System.out.println("Player One chose: paper");
                        System.out.println("Player Two chose: scissors");
                
                        System.out.println("Player Two Wins!");
                        scr2++;
                        System.out.println("The score is now: " +scr1 +" - "+ scr2);
                    }
                    
                }
                
            }
            else if(player1 == quit){
                        if (scr1 == scr2){
                            System.out.println("Player One and Player Two are tied with "+scr1+" points.");
                        }
                        else if(scr1> scr2){
                            System.out.println("The winner is Player One with "+scr1+" points.");
                        }
                        else{
                            System.out.println("The winner is Player Two with "+scr2+" points.");
                        }
                        System.out.println("Quitting");
                        play = false;
                    }
            
            }
                        
        }
        
}
