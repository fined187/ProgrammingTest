# ProgrammingTest

## Test5

- 연못의 깊이
---
```
public static int getDepth(int[][] pondMap) {

        int result = 0;
        int size = pondMap.length;
        int[][] pondDepthMap = new int[size][size];

   
        for(int i=0; i<pondDepthMap.length; i++){
            System.arraycopy(pondMap[i], 0, pondDepthMap[i], 0, pondMap[0].length);
        }

        for (int i=0; i<size; i++) {    
            for (int j=0; j<size; j++) {
                int type = pondMap[i][j];
                int target = pondDepthMap[i][j];

                //      연못의 상, 하, 좌, 우를 비교하여 같거나 크면 깊이를 증가시키는 조건
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
```

---


  
