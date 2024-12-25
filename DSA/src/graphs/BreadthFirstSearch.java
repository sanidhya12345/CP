package graphs;


import java.util.*;
public class BreadthFirstSearch {
	
	public static ArrayList<Integer> bfs(int start,int n,List<List<Integer>> adj){
		ArrayList<Integer> ans=new ArrayList<Integer>();
		boolean [] vis=new boolean[n];
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(start);
		vis[start]=true;
		while(!q.isEmpty()) {
			int curr=q.poll();
			ans.add(curr);
			for(int u:adj.get(curr)) {
				if(!vis[u]) {
					q.add(u);
					vis[u]=true;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    //take the number of edges of the graph
	    int n=sc.nextInt();
	    //create a graph using adjacency list.
	    List<List<Integer>> adj=new ArrayList();
	    for(int i=0;i<n;i++) {
	    	adj.add(new ArrayList<Integer>());
	    }
	    for(int i=0;i<n;i++) {
	    	int u=sc.nextInt();
	    	int v=sc.nextInt();
	    	adj.get(u).add(v);
	    	adj.get(v).add(u);
	    }
	    System.out.println(bfs(0,n,adj));
	}

}
