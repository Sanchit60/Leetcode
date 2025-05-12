class Solution {
    public boolean isBipartite(int[][] graph) {
        int totalVtx = graph.length;
        Integer[] vis = new Integer[totalVtx];
        for(int i = 0; i < totalVtx; i++){
            if(vis[i] == null){
                boolean res = bfs(graph, vis, i);
                if(res == false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int[][] graph, Integer[] vis, int src){
        LinkedList<Integer> q = new LinkedList<>();
        q.addLast(src);
        int lColor = 0;
        while(q.size() != 0){
            int size = q.size();
            while(size-- != 0){
                int rem = q.removeFirst();
                if(vis[rem] != null){
                    if(vis[rem] != lColor){
                        return false;
                    } else{
                        continue;
                    }
                }else{
                    vis[rem] = lColor;
                }
                int [] nbrs = graph[rem];
                for(int nbr : nbrs){
                    if(vis[nbr] == null){
                        q.addLast(nbr);
                    } 
                }
            }
            lColor = lColor == 0 ? 1 : 0;
        }
        return true;
    }
}
