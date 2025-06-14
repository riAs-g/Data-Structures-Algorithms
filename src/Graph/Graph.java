package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public void addEdge(int num, int... args) {
        if (num > list.size() - 1)
            for (int i = list.size() - 1; i < num; i++) {
                list.add(new ArrayList<>());
            }
        for (int i : args) {
            if (i > list.size() - 1)
                for (int k = list.size() - 1; k < i; k++) {
                    list.add(new ArrayList<>());
                }
            list.get(num).add(i);
            list.get(i).add(num);
        }
    }

    public void BFS(int num) {
        boolean[] visit = new boolean[list.size() + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);
        visit[num] = true;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.println(u + " ");
            for (int v : list.get(u)) {
                if (!visit[v]) {
                    visit[v] = true;
                    queue.add(v);
                }
            }
        }
    }

    public void disjointBFS() {
        boolean[] visited = new boolean[list.size() + 1];
        for (int i = 0; i < list.size(); i++) {
            if (!visited[i])
                helpBFS(i, visited);
        }
    }

    private void helpBFS(int num, boolean[] visit) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);
        visit[num] = true;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.println(u + " ");
            for (int v : list.get(u)) {
                if (!visit[v]) {
                    visit[v] = true;
                    queue.add(v);
                }
            }
        }
    }

    public int DFS(int num) {
        int islands = 0;
        boolean[] visit = new boolean[list.size() + 1];
        for (int i = 0; i < list.size(); i++) {
            if (!visit[i]) {
                recDFS(i, visit);
                islands++;
            }
        }
        System.out.println();
        return islands;
    }

    private void recDFS(int num, boolean[] visit) {
        visit[num] = true;
        System.out.print(num + " ");
        for (int u : list.get(num)) {
            if (!visit[u]) {
                recDFS(u, visit);
            }
        }
    }

    public void shortestPathUG(int num) {
        boolean[] visited = new boolean[list.size() + 1];
        for (int i = 0; i < list.size(); i++) {
            if (!visited[i]) {
                helpShortestPathUG(i, visited);
            }
        }
    }

    public void helpShortestPathUG(int num, boolean[] visit) {
        int res = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);
        visit[num] = true;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            res++;
            for (int v : list.get(u)) {
                if (!visit[v]) {
                    visit[v] = true;
                    queue.add(v);
                    System.out.println(u + "-" + v + "=" + res);
                }
            }
        }
    }

    public void detectCyclesUG() {

    }

    public void displayGraph() {
        System.out.println(list);
    }
}