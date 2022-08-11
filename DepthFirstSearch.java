import java.util.*;

public class DepthFirstSearch {
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>>adg, ArrayList<Integer>ans){

        ans.add(node);
        vis[node] = true;

        for(Integer n: adg.get(node)){
            if(vis[n]==false){
                dfs(n, vis, adg, ans);
            }
        }

    }
    public static ArrayList<Integer> dfsGraph(int V, ArrayList<ArrayList<Integer>> adg){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                    dfs(i, vis, adg, ans);
            }
        }

        return ans;
        }

        public static void printDfs(ArrayList<Integer> ans){
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i) + " ");
            }
        }
        public static void main(String args[]) {

            ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
    
            // adding new arraylists to 'adj' to add neighbour nodes
            for (int i = 0; i < 6; i++) {
                adj.add(new ArrayList < > ());
            }
    
            adj.get(1).add(2);
            adj.get(1).add(3);
            adj.get(1).add(4);
            adj.get(1).add(5);
            adj.get(2).add(4);
            adj.get(2).add(1);
            adj.get(3).add(1);
            adj.get(4).add(1);
            adj.get(4).add(2);
            adj.get(5).add(1);
    
    
            ArrayList < Integer > ans = dfsGraph(5, adj);
            printDfs(ans);
        }
}
