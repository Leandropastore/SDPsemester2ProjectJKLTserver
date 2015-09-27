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
    
    private String filePath;
    private String fileName;
    private String tid;
    private String cid;

    public Music(String filePath, String tid){
        this.setFilePath(filePath);
        this.setTid(tid);
        String[] path = filePath.split("\\");
        this.setFileName(path[path.length-1]);
        cid = null;
    }
    
    public Music(String filePath, String tid, String cid){
        this.setFilePath(filePath);
        this.setTid(tid);
        this.setCid(cid);
        String[] path = filePath.split("\\");
        this.setFileName(path[path.length-1]);
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
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
    
    public String libLine(){
        return filePath+";"+fileName+";"+tid+";"+cid;
    }
    
    public String xmlLine(){
        
        String xmlLine = "<media src=\""+filePath;
        
        if(cid!=null)
            xmlLine += "\" cid=\""+cid;
        
        xmlLine += "\" tid=\""+tid+"\"/>";
        
        return xmlLine;
        
    }
    
    public boolean isTheSameAs(Music m){
    
        if(m.getFilePath().equals(filePath)||m.getFileName().equals(fileName))
                return true;
        return false;
        
    }
}
