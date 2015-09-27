/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jklt.jukeboxjury;

/**
 *
 * @author Leandro
 */
public class Music {
    private String fileName;
    private String tid;

    public Music(String fileName, String tid){
        this.setFileName(fileName);
        this.setTid(tid);
    }
    
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
    
    
    
}
