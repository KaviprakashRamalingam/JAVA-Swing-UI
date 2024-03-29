/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kaviprakashramalingam
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> history;
    public VitalSignHistory(){
        history = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVital(){
       
        VitalSigns newVital = new VitalSigns();
        history.add(newVital); 
        return newVital;
    }
    
    public void deleteVitals(VitalSigns vs){
        history.remove(vs);
    }
}
