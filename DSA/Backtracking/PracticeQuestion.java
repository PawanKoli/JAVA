public class PracticeQuestion {
    //Question 1 : Rat in a Maze You are given a starting position for a rat which is stuck in a maze at an initial point(0,0)(the maze can be thought of as a 2-dimensional plane).The maze would be given in the form of a square matrix of order N*N where the cell swith value 0 represent the maze’s blocked locations while value1 is the open/available path that the rat can take to reach its destination.The rat's destination is at (N - 1, N - 1).Your task is to find all the possible paths that the rat can take tor each from source to destination in the maze.The possible directions that it can take to move in the maze are'U'(up)i.e.(x,y-1),'D'(down)i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).(This problem is similar to Grid ways
    
    public static int count = 0 ;
    
    public static boolean solveMaze(int maze[][], int x, int y, int sol[][],String str){
        //base case
        if(x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1 ){
            sol[x][y] = 1;
            count++;
            printMaze(sol,str);
            str = "";
            return true;
        }

        if(ifSafe(maze,x,y,sol)){
            //down
            solveMaze(maze,x+1,y,sol,str + 'D');
            //left
            solveMaze(maze,x,y-1,sol,str + 'L');
            //right
            solveMaze(maze,x,y+1,sol, str + 'R');
            //up
            solveMaze(maze,x-1,y,sol, str + 'U');

            sol[x][y] = 0;
        }
        return false;
    }

    public static boolean ifSafe(int maze[][], int x, int y, int sol[][]){
        if((x>=0 && x<maze.length) && (y>=0 && y<maze.length) && maze[x][y] == 1 && sol[x][y] == 0){
            sol[x][y] =1;
            return true;
        }
        return false;
    }
    
    public static void printMaze(int sol[][],String str){
        System.out.println("\t--------");
        System.out.println("Path is : "+str);
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int maze[][] = { 
        { 1, 0, 0, 1 },
        { 1, 1, 1, 1 },
        { 1, 1, 0, 1 },
        { 1, 1, 1, 1 }};
        
        int maze1[][] = {
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,1,0,1,0},
            {1,1,1,1,1}};
        int n = maze.length;
        int sol[][] = new int[n][n];

        solveMaze(maze,0,0,sol,"");
        if(count == 0)
            System.out.println("Solution doesn't exists");
        System.out.println("\nTotal solutions : " + count);
    }

}