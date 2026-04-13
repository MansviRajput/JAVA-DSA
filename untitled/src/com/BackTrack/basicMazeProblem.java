package com.BackTrack;

import java.util.ArrayList;
import java.util.Arrays;

public class basicMazeProblem {
    public static void main(String[] args) {
//        System.out.println(countWay(3,3));

//        path("",3,3);

//        path2("",3,3);

//        boolean[][] board = {
//                {true,true,true},
//                {true,false,true},
//                {true,true,true},
//        };
//        path3(board,"",0,0);

//        boolean[][] board = {
//                {true,true,true},
//                {true,true,true},
//                {true,true,true},
//        };
//        path4(board,"",0,0);

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
//        pathByBackTrack(board,"",0,0);

        int[][] path = new int[board.length][board[0].length];
        pathAllWithImage(board,path,1,"",0,0);


    }

//    1.Maze with right and down direction,
//    How many ways we achieve the target
    static int countWay(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right = countWay(r,c-1);
        int down =  countWay(r-1,c);
        return right+down;
    }


//    2.Print the path
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    static ArrayList<String> pathArray(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(pathArray(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathArray(p+'R',r,c-1));
        }
        return list;
    }

//    3.print the path with diagonal(D) right(H) and down(V) direction
    static void path2(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            path2(p+'D',r-1,c-1);
        }
        if(r>1){
            path2(p+'V',r-1,c);
        }
        if(c>1){
            path2(p+'H',r,c-1);
        }
    }

//    4.Maze with obstacles -> where some point or board you cant enter
    static void path3(boolean[][] board,String p,int r,int c){
        if(r== board.length-1 && c== board.length-1){
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }
        if(r < board.length-1 ){
            path3(board,p+'D',r+1,c);
        }
        if(c < board.length-1 ){
            path3(board,p+'R',r,c+1);
        }
    }

//    5.Maze with all dimension but that cause stackoverflow
//    left(L),right(R),up(U),down(D)
    static void path4(boolean[][] board,String p,int r,int c){
        if(r== board.length-1 && c== board[0].length-1){
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }
        if(r < board.length-1 ){
            path4(board,p+'D',r+1,c);
        }
        if(c < board.length-1 ){
            path4(board,p+'R',r,c+1);
        }
        if(r > 0){
            path4(board,p+'U',r-1,c);
        }
        if(c > 0){
            path4(board,p+'L',r,c-1);
        }
    }

//    6.To solve this we use BackTrack
    static void pathByBackTrack(boolean[][] board,String p,int r,int c){
        if(r== board.length-1 && c== board[0].length-1){
            System.out.println(p);
            return;
        }
        if(!board[r][c]){
            return;
        }
        board[r][c] = false;
        if(r < board.length-1 ){
            pathByBackTrack(board,p+'D',r+1,c);
        }
        if(c < board.length-1 ){
            pathByBackTrack(board,p+'R',r,c+1);
        }
        if(r > 0){
            pathByBackTrack(board,p+'U',r-1,c);
        }
        if(c > 0){
            pathByBackTrack(board,p+'L',r,c-1);
        }
        board[r][c] = true;
    }

//    6.Print matrix and path
    static void pathAllWithImage(boolean[][] board,int[][] path,int step,String p,int r,int c){
        if(r== board.length-1 && c== board[0].length-1){
            path[r][c] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!board[r][c]){
            return;
        }
        board[r][c] = false;
        path[r][c] = step;
        if(r < board.length-1 ){
            pathAllWithImage(board,path,step+1,p+'D',r+1,c);
        }
        if(c < board[0].length-1 ){
            pathAllWithImage(board,path,step+1,p+'R',r,c+1);
        }
        if(r > 0){
            pathAllWithImage(board,path,step+1,p+'U',r-1,c);
        }
        if(c > 0){
            pathAllWithImage(board,path,step+1,p+'L',r,c-1);
        }
        board[r][c] = true;
        path[r][c] = 0;
    }
}
