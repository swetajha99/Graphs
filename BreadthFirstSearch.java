import java.io.*;
import java.util.*;

public class BreadthFirstSearch {
    public static ArrayList<Integer> bfsGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

      queue.add(0);
        vis[0] = true;

        while (!queue.isEmpty()) {
            Integer node  = queue.poll();
            bfs.add(node);

            for(Integer it : adj.get(node)){
                if(vis[it]==false){
                    vis[it] = true;
                    queue.add(it);
                }
            }
        }

        return bfs;

    }
    public static void printAns(ArrayList<Integer> ans){
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static void main(String [] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<5;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        ArrayList < Integer > ans = bfsGraph(5, adj);
        printAns(ans);
    }
}
