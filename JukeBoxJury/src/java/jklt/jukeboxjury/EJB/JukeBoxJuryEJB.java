/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jklt.jukeboxjury.EJB;


import javax.ejb.Stateless;
import jklt.jukeboxjury.JukeBoxJury;

/**
 *
 * @author Leandro
 */
@Stateless
public class JukeBoxJuryEJB implements JukeBoxJuryEJBLocal {
    
    JukeBoxJury jukeBoxJury;
    
    //Called by client only on the first time of contact
    @Override
    public String getAvailableSongs() {
        
        return null;
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
