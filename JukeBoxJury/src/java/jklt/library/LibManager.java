package jklt.library;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import jklt.jukeboxjury.Music;
import jklt.jukeboxjury.Playlist;

/**
 *
 * @author Leandro
 */
public class LibManager {

    private static final String playlistFileName = "";
    private static final String musicListFileName = "";
    
    public Playlist importPlaylist() {
        
        Playlist playlist = new Playlist();
        try {
            FileReader fileReader = new FileReader(this.playlistFileName);
            BufferedReader br = new BufferedReader(fileReader);

            int len = new Integer(br.readLine());

            Music m;
            for (int i = 0; i < len; i++) {

                //Checks if there is something in the next line
                if ((m = createMusic(br.readLine())) != null) {
                    playlist.add(m);
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("IO exception reading " + this.playlistFileName);
        }
        return playlist;

    }

    public Music createMusic(String line) {

        String filePath;
        String tid;
        String cid;
        
        if(line!=null){
            String[] tokens = line.split("");
            return new Music(filePath,tid);
        }
        else
            return null;

    }
    
    public ArrayList<Music> importMusicList() {
        
        ArrayList<Music> musics = new ArrayList<Music>();
        try {
            FileReader fileReader = new FileReader(this.musicListFileName);
            BufferedReader br = new BufferedReader(fileReader);

            int len = new Integer(br.readLine());

            Music m;
            for (int i = 0; i < len; i++) {
                try{              
                    //Checks if there is something in the next line
                    if ((m = createMusic(br.readLine())) != null) {
                        musics.add(m);
                    }
                }catch(UnsupportedEncodingException exc){
                    System.out.println("Encoding format is not supported. \n" + exc);
                }  
            }

            br.close();
        } catch (IOException ex) {
            System.out.println("IO exception reading " + this.musicListFileName);
        }
        return musics;

    }
    
    public void createLibrary(String lib, String libType) {

        File file;
        try {
            if(libType.toLowerCase().equals("playlist"))
                file = new File(this.musicListFileName);
            else if(libType.toLowerCase().equals("music list"))
                file = new File(this.playlistFileName);
            else
                file = null;
            
            if(file!=null){
                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(lib);
                bw.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
