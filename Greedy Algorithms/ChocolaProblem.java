// Chocola problem also known as min. cost to cut board into square

import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2,1,3,1,4}; // m-1
        Integer costHor[] = {4,1,2}; // n-1
    
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        
        int cost = 0;
        int h = 0, v = 0; // pointer for costVer and costHor
        int hp = 1 , vp = 1;

        while(v < costVer.length && h < costHor.length){
            //vertically cuy
            if(costVer[v] >= costHor[h]){
                cost += costVer[v] * hp;
                vp++;
                v++;
            }else{ // horizontally cuts
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
        }

        while(h != costHor.length){
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        while(v != costVer.length){
            cost += costVer[v] * hp;
            vp++;
            v++;
        }
        
        System.out.println("Min. cost of cuts : " + cost);
    }
}
