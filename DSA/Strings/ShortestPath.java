import java.util.*;


public class ShortestPath {
    public static float Path(String str){
        int x2=0,y2=0,y1=0,x1=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            //for North
            if(dir == 'N')
                y2++;
            //for South
            else if(dir == 'S')
                y2--;
            //for East
            else if(dir == 'E')
                x2++;
            //for West
            else if(dir == 'W')
                x2--;
        }
        
        int x=x2-x1, y=y2-y1;
        return (float)Math.sqrt((x*x)+(y*y));
    }
    
    public static void main(String arg[]){
        String str = "WNEENESENNN";
        System.out.println(Path(str));
    }
}
