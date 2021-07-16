package com.dit.dsa.graph;

public class AdjacentMatrix {
	
	boolean adjMatrix[][];
	int numVertices;
	
	AdjacentMatrix(int numVertices)
	{
		this.numVertices = numVertices;
		adjMatrix = new boolean[numVertices][numVertices];
	}
	
	//Add edges
	
	public void addEdge(int i, int j)
	{
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
	}
	
	//remove edges
	public void removeEdge(int i, int j)
	{
		adjMatrix[i][j] = false;
		adjMatrix[j][i] = false;
	}
	
	//print the matrix of a graph
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < numVertices; i++)
		{
			sb.append(i+"-");
			for(boolean j : adjMatrix[i])
			{
				sb.append((j ? 1 : 0) + " ");
			}
			
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		AdjacentMatrix graph = new AdjacentMatrix(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		
		System.out.println(graph.toString());
		
	}

}
