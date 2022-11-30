package GeeksForGeeks;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<4; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(3).add(2);
        adj.get(2).add(3);
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        boolean visited[]=new boolean[v];

        for(int u=0;u<v;u++){
            if(visited[u]==false){
                if(util(v,adj,visited,u,-1)){
                    return true;
                }
            }
        }
        return false;

    }

    boolean util(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s, int par){

        visited[s]=true;
        for(int u : adj.get(s)){
            if(!visited[u] && util(v,adj,visited,u,s)){
                return true;
            }

            else if(u!=par){
                return true;
            }
        }

        return false;

    }

}