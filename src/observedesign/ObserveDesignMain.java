/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observedesign;

import java.util.Scanner;
/**
 *
 * @author tleku
 */
public class ObserveDesignMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreHeadQuater shqObj = new ScoreHeadQuater();
        FootBallClub fbcObj = new FootBallClub();
        BlueSport bsObj = new BlueSport();
        LiveScoreWebsite lswObj = new LiveScoreWebsite();
        
        shqObj.register(fbcObj);
        shqObj.register(bsObj);
        shqObj.register(lswObj);
        
        while (true) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter score to update: ");
        String score = in.nextLine();
        if (score.equals("")) {
            System.out.println("Exit Program");
            break;
        }
        shqObj.setScore(score);
        
        }
        
        
       
        
    }
    
}
