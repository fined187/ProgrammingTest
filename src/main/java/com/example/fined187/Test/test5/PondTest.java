package com.example.fined187.Test.test5;

public class PondTest {
    public static void main(String[] args) {
        int[][] pondMap = {
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,0,0,0,0,0},
                {0,0,0,1,1,1,0,0,0,0},
                {0,1,1,1,1,1,1,0,0,0},
                {0,1,1,1,1,1,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,0},
                {0,0,1,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,0,0,0},
                {0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0}
        };

        System.out.println(getDepth(pondMap));
    }

    public static int getDepth(int[][] pondMap) {

        int result = 0;
        int size = pondMap.length;
        int[][] pondDepthMap = new int[size][size];

        // 깊은 복사
        for(int i=0; i<pondDepthMap.length; i++){
            System.arraycopy(pondMap[i], 0, pondDepthMap[i], 0, pondMap[0].length);
        }

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                int type = pondMap[i][j];
                int target = pondDepthMap[i][j];

                if ((j-1>=0 && i-1>=0 && j+1<pondDepthMap.length && i+1<pondDepthMap[i].length)
                        && (target<=pondDepthMap[i][j-1] && target<=pondDepthMap[i][j+1] &&  target<=pondDepthMap[i-1][j] && target<=pondDepthMap[i+1][j])) {
                    target++;
                    pondDepthMap[i][j] = target;
                }

                if (type == 1) {
                    result += target;
                }
            }
        }

        return result;
    }
}
