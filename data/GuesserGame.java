import java.util.*;
class Guesser{
    int guessNum;

    int guessNum(){
        
        Scanner g = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("Guesser kindly guess a number between 1-10 : ");
            a = g.nextInt();
            if(a>0 & a<11){
                guessNum = a;
                break;
            }
            else{
                System.out.println("Invalid Number! Please enter between 1 - 10");
            }

    }
        return guessNum;
    }
}

class Player1{
    int guessNum;

    int guessNum(){
        
        Scanner p = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("player_1 kindly guess a number between 1-10 : ");
            a = p.nextInt();
            if(a>0 & a<11){
                guessNum = a;
                break;
            }
            else{
                System.out.println("Invalid Number! Please enter between 1 - 10");
            }
        }
        return guessNum;
    }
}

class Player2{
    int guessNum;

    int guessNum(){
        
        Scanner p = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("player_2 kindly guess a number between 1-10 : ");
            a = p.nextInt();
            if(a>0 & a<11){
                guessNum = a;
                break;
            }
            else{
                System.out.println("Invalid Number! Please enter between 1 - 10");
            }
        }
        return guessNum;
    }
}

class Player3{
    int guessNum;

    int guessNum(){
        
        Scanner p = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("player_3 kindly guess a number between 1-10 : ");
            a = p.nextInt();
            if(a>0 & a<11){
                guessNum = a;
                break;
            }
            else{
                System.out.println("Invalid Number! Please enter between 1 - 10");
            }
        }
        return guessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectFromGuesser(){
        Guesser guesser = new Guesser();
        numFromGuesser = guesser.guessNum(); 

    }

    void collectFromPlayer(){
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Player3 p3 = new Player3();

        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p2.guessNum();
        numFromPlayer3 = p3.guessNum();

    }

    void compare(int arr[]){
        Umpire u1 = new Umpire();
        while(true){
            //Umpire u1 = new Umpire();
            u1.collectFromGuesser();
            u1.collectFromPlayer();

            if(numFromGuesser == numFromPlayer1){
                if(numFromGuesser == numFromPlayer2 &&
                    numFromGuesser == numFromPlayer3){
                        System.out.println("All Three Playwer won!");
                    }
                else if(numFromGuesser == numFromPlayer2){
                    System.out.println("Player 1 & Player 2 won!");
                }
                else if(numFromGuesser == numFromPlayer3){
                    System.out.println("Player 1 & Player 3 won!");
                }
                else{
                    System.out.println("Player 1 won!");
                    arr[0]++;
                }

            }

            else if(numFromGuesser == numFromPlayer2){
                if(numFromGuesser==numFromPlayer3){
                    System.out.println("Player 2 & Player 3 won!");
                }
                else{
                    System.out.println("Player 2 won!");
                    arr[1]++;
                }
            }
            else if (numFromGuesser == numFromPlayer3){
                System.out.println("Player 3 Won!");
                arr[2]++;
            }
            else{
                System.out.println("Game lost! try again.");
            }
            
            if(arr[0]>0 && arr[1]>0){
                System.out.println("Player1 and player2 reach the semifinal!");
                break;
            }
            else if(arr[0]>0 && arr[2]>0){
                System.out.println("Player1 and player3 reach the semifinal!");
                break;
            }
            else if(arr[1]>0 && arr[2]>0){
                System.out.println("Player2 and player3 reach the semifinal!");
                break;
            }

        }
    }
}



class GuesserGame{
    static int point;
    public static void main(String[] args) {
        // int p1=0;
        // int p2=0;
        // int p3=0;
        Umpire u = new Umpire();
        int [] arr = new int[3];
        
        //while(true){
            // u.collectFromGuesser();
            // u.collectFromPlayer();
             u.compare(arr);
            // point++;
            // if(point == 1){
            //     System.out.println("You reached at semifinal!");
            // }
            // else if(point == 2){
            //     System.out.println("You reached at final!");
            // }
            // else{
            //     break;
            // }
        //}

        System.out.println("first Round is complete.");
    }
}
