package HackerRank;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SquareArea {
    public static void main(String[] args) {
        List<Integer> x=new ArrayList<>(Arrays.asList(2,0,2));
        List<Integer> y=new ArrayList<>(Arrays.asList(2,0,4));
        System.out.println(findArea(x,y,2));
    }

    private static int findArea(List<Integer> x, List<Integer> y, int k) {
        List<List<Integer>> coor=new ArrayList<>();
        int min=Integer.MIN_VALUE;
        for (int i = 0; i < x.size(); i++) {
            coor.add(new ArrayList<>(Arrays.asList(x.get(i),y.get(i))));
        }
        System.out.println(coor);
        List<List<Integer>> limitcoor=new ArrayList<>();

        List<List<List<Integer>>> output = permute(coor);
        System.out.println(output);

        for (List<List<Integer>> lists : output) {
            for (int j = 0; j < k; j++) {
                limitcoor.add(new ArrayList<>(lists.get(j)));
            }
            System.out.println(limitcoor);
            min = Math.max(min, maxArea(limitcoor));
            limitcoor.removeAll(coor);
        }
        return min;
    }

    private static int maxArea(List<List<Integer>> limitcoor) {
        int maxy=Integer.MIN_VALUE;
        int maxx=Integer.MIN_VALUE;
        int miny=Integer.MAX_VALUE;
        int minx=Integer.MAX_VALUE;
        for (List<Integer> integers : limitcoor) {
            maxy = Math.max(maxy, integers.getLast());
            maxx = Math.max(maxx, integers.getFirst());
            miny = Math.min(miny, integers.getLast());
            minx = Math.min(minx, integers.getFirst());
        }
        int maxdiff =Math.max(Math.abs(maxy+1)+Math.abs(miny-1),Math.abs(maxx+1)+Math.abs(minx-1));
        return maxdiff * maxdiff;
    }

    public static List<List<List<Integer>>> permute(List<List<Integer>> input) {
        List<List<List<Integer>>> output = new ArrayList<>();
        if (input.isEmpty()) {
            output.add(new ArrayList<>(new ArrayList<>()));
            return output;
        }
        List<List<Integer>> list = new ArrayList<>(input);
        List<Integer> head = list.getFirst();
        List<List<Integer>> rest = list.subList(1, list.size());
        for (List<List<Integer>> permutations : permute(rest)) {
            List<List<List<Integer>>> subLists = new ArrayList<>();
            for (int i = 0; i <= permutations.size(); i++) {
                List<List<Integer>> subList = new ArrayList<>(permutations);
                subList.add(i, head);
                subLists.add(subList);
            }
            output.addAll(subLists);
        }
        return output;
    }
}
