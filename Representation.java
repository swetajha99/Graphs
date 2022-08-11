//  adjacency matrix

 import java.io.*;
 import java.util.*;


 class GFG{
    public static void main(String[] args){
        int n = 3, m= 3; 
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<>());
        }

        // edge 1----2
        arr.get(1).add(2);
        arr.get(2).add(1);
        // edge 2----3
        arr.get(2).add(3);
        arr.get(3).add(2);
        // edge 3----1 
        arr.get(3).add(1);
        arr.get(1).add(3);

        for(int i=0;i<n;i++){
            for(int j = 0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
 }
