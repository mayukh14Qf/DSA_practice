package Strings;
 /*                     N
                      |
                      |
                      |
         W------------(0,0)-----------------E
                      |
                      |
                      |
                      S                                                      */

public class shortestPath {
    public static double shortPath(String path){
        int x=0;
        int y=0;
        char str;
        for (int i=0;i<path.length();i++){
            str=path.charAt(i);
            if(str=='N'){
                y++;
            }
            else if (str=='S') {
                y--;
            }
            else if (str=='W') {
                x--;
            }
            else {
                x++;
            }
        }
        double x2=x*x;
        double y2=y*y;
        return Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortPath(path));
    }
}
