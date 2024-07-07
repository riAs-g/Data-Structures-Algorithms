package GFG;

import static GFG.HistogramArea.greatestArea;

public class ArrayArea {
    public static void main(String[] args) {
        int[][] arr={{0,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        System.out.println(greatestAreas(arr));
    }

    private static int greatestAreas(int[][] arr) {
        int area=0;
        area = Math.max(area, greatestArea(arr[0]));
            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 1) {
                        arr[i][j] += arr[i - 1][j];
                    }else{
                        break;
                    }
                }
                area = Math.max(area, greatestArea(arr[i]));
            }
        return area;
    }
}