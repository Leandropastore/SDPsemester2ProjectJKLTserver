/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jklt.jukeboxjury;

import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class Playlist {
    
    private ArrayList<Music> musics;
    private String beginning;
    private String end;
    
    public Playlist(String beginning, String end){
    
        this.setBeginning(beginning);
        musics = new ArrayList<Music>();
        this.setEnd(end);
    
    }
    
    public Playlist(String beginning, String end, ArrayList<Music> musics){
    
        this.setBeginning(beginning);
        this.musics = musics;
        this.setEnd(end);
    
    }

    public String getBeginning() {
        return beginning;
    }

    public void setBeginning(String beginning) {
        this.beginning = beginning;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    
    public String generateXML(){
    
        String xml = beginning;
        
        for(Music m : musics)
            xml += "\r\n"+m.xmlLine();
        
        xml += "\r\n"+end;
        return xml;
    
    }
    
    public boolean addMusic(Music m){
    
        musics.add(m);
        return true;
    
    }
    
    public boolean alreadyExists(Music m){
    
        for(Music mu:musics)
            if(mu.isTheSameAs(m))
                return true;
        
        return false;
    
    }
}
