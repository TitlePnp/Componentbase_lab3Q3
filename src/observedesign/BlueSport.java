/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observedesign;

/**
 *
 * @author tleku
 */
public class BlueSport implements MyObservers{
    @Override
    public void update(Source o) {
        System.out.println("(BlueSport) Score update : " + ((ScoreHeadQuater)o).getScore());
    }
}
