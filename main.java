import java.net.*;
import java.io.*; 
public class Main{
    public static void main(String args[]) throws Exception {
            try{
            URL url = new URL("https://music.163.com/m/song?id=465921195&fromSimiSong=1");
            InputStream in =url.openStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader bufr = new BufferedReader(isr);
            String str;
            while ((str = bufr.readLine()) != null){
            System.out.println(str);
        }
            bufr.close();
            isr.close();
            in.close();
        }
            catch (Exception e)
            {e.printStackTrace();
        }
      }
   }
