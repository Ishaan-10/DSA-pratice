package BackTracking;

public class Rat {

    static boolean solveMaze(int [][] maze){
        int n = maze.length;
        int path[][]=new int[n][n];
        return solveMazeHelper(maze,0,0,path);
    }
    static void printAllPossibilties(int [][] maze){
        int n = maze.length;
        int path[][]=new int[n][n];
        printAllPossibiltiesHelper(maze,0,0,path);
    }

    private static boolean solveMazeHelper(int maze[][],int i,int j, int path[][]){

        int n=maze.length;

        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            return false;

        }
        path[i][j]=1;

        if(i==n-1 && j==n-1){

            for(int k[]: path){
                for(int l:k){
                    System.out.print(l+" ");
                }
                System.out.println();
            }

            return true;
        }

        if(solveMazeHelper(maze, i, j+1, path)){
            return true; 
        }
        if(solveMazeHelper(maze, i+1, j, path)){
            return true; 
        }
        if(solveMazeHelper(maze, i, j-1, path)){
            return true; 
        }
        if(solveMazeHelper(maze, i-1, j, path)){
            return true; 
        }

        return false;

    }

    private static void printAllPossibiltiesHelper(int maze[][],int i,int j, int path[][]){

        int n=maze.length;

        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            return;
        }
        path[i][j]=1;

        if(i==n-1 && j==n-1){

            for(int k[]: path){
                for(int l:k){
                    System.out.print(l+" ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j]=0;
            return;
        }

        printAllPossibiltiesHelper(maze, i, j+1, path);
        printAllPossibiltiesHelper(maze, i+1, j, path);
        printAllPossibiltiesHelper(maze, i, j-1, path);
        printAllPossibiltiesHelper(maze, i-1, j, path);
        path[i][j]=0;
        return;

    }

    public static void main(String[] args) {
        
        int maze[][]={
            {1,1,1},
            {1,1,1},
            {0,0,1},
        };
        printAllPossibilties(maze);
    }
    
}
