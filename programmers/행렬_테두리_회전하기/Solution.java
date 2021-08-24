package programmers.행렬_테두리_회전하기;

import java.util.*;

public class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        int[][] board = new int[rows][columns];
        int val = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = val + j + i * columns;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int leftY = queries[i][0], leftX = queries[i][1];
            int rightY = queries[i][2], rightX = queries[i][3];
            int token = board[leftY - 1][leftX - 1];
            int ans = rows * columns;
            board[leftY - 1][leftX - 1] = board[leftY][leftX - 1];
            ans = Math.min(ans, Math.min(token, board[leftY - 1][leftX - 1]));
            for (int j = leftX; j < rightX; j++) { //up
                int tmp = board[leftY - 1][j];
                board[leftY - 1][j] = token;
                token = tmp;
                ans = Math.min(ans, token);
            }
            for (int j = leftY; j < rightY; j++) { // right
                int tmp = board[j][rightX - 1];
                board[j][rightX - 1] = token;
                token = tmp;
                ans = Math.min(ans, token);
            }
            for (int j = rightX - 2; j >= leftX - 1; j--) { //down
                int tmp = board[rightY - 1][j];
                board[rightY - 1][j] = token;
                token = tmp;
                ans = Math.min(ans, token);
            }
            for (int j = rightY - 2; j >= leftY; j--) { // left
                int tmp = board[j][leftX - 1];
                board[j][leftX - 1] = token;
                token = tmp;
                ans = Math.min(ans, token);
            }
            answer.add(ans);
        }
        int[] res = new int[answer.size()];
        int count = 0;
        for (int value : answer) {
            res[count] = value;
            count++;
        }
        return res;
    }
}