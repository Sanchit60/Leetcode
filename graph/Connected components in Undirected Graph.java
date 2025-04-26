class Solution {
    public void dfs(ArrayList<Integer> [] graph, int src, boolean [] vis, ArrayList<Integer> cvlist){
        vis[src] = true;
        cvlist.add(src);
        ArrayList<Integer> nbrs = graph[src];
        for(int nbr : nbrs){
            if(vis[nbr] == false){
                dfs(graph, nbr, vis, cvlist);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        boolean[] vis = new boolean[V];
        ArrayList<Integer> [] graph = new ArrayList[V];
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < edges.length; i++){
            int [] edge = edges[i];
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                ArrayList<Integer> cvlist = new ArrayList<>();
                dfs(graph, i, vis, cvlist);
                ans.add(cvlist);
            }
        }
        return ans;
        
    }
}
