# ProgrammingTest

## Test1
-Bread 객체 생성
```

public class BreadFactory {
    public static Bread create(String breadType, int flour, int water, int cream) {

        Bread bread;
        if(breadType.equals("butter")) {
            bread = new ButterBread(flour, water, cream);
        } else if (breadType.equals("cream")) {
            bread = new CreamBread(flour, water, cream);
        } else {
            bread =  new SugarBread(flour, water, cream);
        }

        return bread;
    }

```

-JSON I/O
```

public static String getResource(String fileName) throws Exception {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(fileName);
        StringBuilder builder = new StringBuilder();

        if (url == null) {
            System.out.println(String.format("The file does not exist in classpath. fileName : %s", fileName));
            System.exit(0);
        }

        File file = new File(url.getFile());

        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(file));

            String line = reader.readLine();

            while (line != null) {
                builder.append(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString().replaceAll(" ", "");
    }

```

## Test2

-계산 Logic
```

public class Calculation {

    private int value;

    public Calculation() {
        this.value = 0;
    }

    public Calculation add(int num) {
        this.value += num;
        return this;
    }

    public Calculation subtract(int num) {
        this.value -= num;
        return this;
    }

    public int out() {
        return this.value;
    }

```

## Test3



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


  
