package programmers.게임맵최단거리;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[][] maps) {
        int row = maps.length;
        int col = maps[0].length;
        int[][] dp = new int[row][col];
        Queue<Point> q = new LinkedList<>();
        initArrayMinusOne(dp,row,col);
        q.add(new Point(0,0));
        bfs(dp,maps,q,row,col);
        return dp[row-1][col-1]!=-1?dp[row-1][col-1]+2:-1;
    }
    private void bfs(int[][] dp,int[][] maps, Queue<Point> q,int row,int col){
        Point p;
        int y,x;
        int[] dy = {1,-1,0,0};
        int[] dx = {0,0,1,-1};
        while (!q.isEmpty()){
            p = q.peek();
            y = p.y;
            x = p.x;
            q.remove();
            for (int i = 0; i < 4; i++) {
                int fy = y + dy[i];
                int fx = x + dx[i];
                if (is_possible(row,col,fy,fx) && maps[fy][fx]==1){
                    if (dp[fy][fx]==-1){
                        dp[fy][fx] = dp[y][x]+1;
                    }else{
                        dp[fy][fx] = Math.min(dp[y][x]+1,dp[fy][fx]);
                    }
                    maps[fy][fx]=0;
                    q.add(new Point(fx,fy));
                }
            }
        }
    }
    private boolean is_possible(int row,int col,int fy,int fx){
        if (fy>=0 && fy<row && fx>=0 && fx<col){
            return true;
        }else {
            return false;
        }
    }
    private void initArrayMinusOne(int[][] dp,int row,int col){
        for(int i = 0; i<row; i++){
            for(int j = 0; j< col; j++){
                dp[i][j]=-1;
            }
        }
    }
}
