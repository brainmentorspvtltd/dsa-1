package com.dit.dsa.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSTraversal {
	
	int v; 
	LinkedList<Integer> adj[]; // Adjacent List
	
	
	BFSTraversal(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		
		for(int i = 0; i < v; i++)
		{
			adj[i] = new LinkedList();
		}
	}
	
	//add edge
	void addEdge(int s, int d)
	{
		adj[s].add(d);
	}
	
	void BFS(int s)
	{
		boolean visited[] = new boolean[v];
		
		//create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;
		queue.add(s);
		
		while(queue.size() != 0)
		{
			//Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s+" ");
			
			Iterator<Integer> i = adj[s].listIterator();
			
			while(i.hasNext())
			{
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		BFSTraversal graph = new BFSTraversal(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		System.out.println("BFS Traversal is");
		
		graph.BFS(2);
		
	}

}
