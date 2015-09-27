/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jklt.jukeboxjury.EJB;

import javax.ejb.Local;

/**
 *
 * @author Leandro
 */
@Local
public interface JukeBoxJuryEJBLocal {

    String getAvailableSongs();
    
}
