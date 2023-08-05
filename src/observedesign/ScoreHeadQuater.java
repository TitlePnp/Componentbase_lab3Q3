/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observedesign;

import java.util.ArrayList;
/**
 *
 * @author tleku
 */
public class ScoreHeadQuater implements Source{
    private final ArrayList<MyObservers> registerList;
    private String score;
    
    public ScoreHeadQuater() { 
        this.registerList = new ArrayList<MyObservers>();
    }
    
    public void setScore(String updateScore) { 
       score = updateScore;
       notifyObservers();
    }
    
    public String getScore() {
        return score;
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < registerList.size(); i++) {
            registerList.get(i).update(this);
        }
    }

    @Override
    public void register(MyObservers observer) {
        registerList.add(observer);
    }
    
    
}
