/* Maytal Twig - 01.11.18
 * Maman 11 B
 * The program will calculate the score of the football team according to certain rules
*/
import java.util.Scanner;
public class Football
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);//creating a scannerobject
        System.out.println("Please enter results for 3 games:");//getting data from user the scores for each team,
        System.out.println("The first game: ");
        int us1=scan.nextInt();//for each game The first input is the number of goals the has scored.
        int them1=scan.nextInt();// The second input is the number of goals of the rival
        System.out.println("The second game: ");
        int us2=scan.nextInt();
        int them2=scan.nextInt();
        System.out.println("The third game: ");
        int us3=scan.nextInt();
        int them3=scan.nextInt();
                  
        int finalScore=0;//create final score
        int winning=0; // create number of winning
        int tie=0; // creat number of tie
        //calculation of the games
        int game1=us1-them1;
        int game2=us2-them2;
        int game3=us3-them3;
        
        //calculation first game to the final score
        if(game1>0){
            finalScore+=3;
            ++winning;//Plus one to total winning
        }
        if(game1<0){
                finalScore-=4;
        }
        if(game1==0){
                finalScore+=2;
                ++tie;//Plus one to total tie
        }
        
        //calculation second game to the final score
        if(game2>0){
            finalScore+=3;
            ++winning;
        }
        if(game2<0){
                finalScore-=4;
        }
        if(game2==0){
                finalScore+=2;
                ++tie;
        }
        
        //calculation third game to the final score
        if(game3>0){
            finalScore=finalScore+3+2*us3;//the importnats game get double for each score that he put
            ++winning;
        }
        if(game3<0){
                finalScore-=4;
        }
        if(game3==0){
                finalScore+=2;
                ++tie;
        }
        
        //the bonus score
        boolean con1=game3>3;
        boolean con2=game2>2&&game1>2;
        boolean con3=game1==0&&game2==0&&game3==0;
        if(con1||con2||con3){ //calculation of the condition
            finalScore+=5;
        }
        
        
        System.out.println("Number of games which the university team won: "+winning);         
        System.out.println("Number of games with tie result: "+tie);         
        System.out.println("final score of the university team: "+finalScore);         
   }//end of method main
}//end of class Football
