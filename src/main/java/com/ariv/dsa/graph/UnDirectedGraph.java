package com.ariv.dsa.graph;

/**
 * Directed Graph Implementation.
 */
public class UnDirectedGraph {

	private int[][] adjMatrix;
	private int vertices;
	private int edges;
	
	public UnDirectedGraph(int n) {
		this.vertices = n;
		this.edges = 0;
		
		this.adjMatrix = new int[n][n];
	}
	
	public void addEdge(int u, int v) {
		this.adjMatrix[u][v] = 1;
		this.adjMatrix[v][u] = 1;
		edges++;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(vertices + " Vertices, " + edges + " edges \n");
		for(int i = 0; i < vertices; i++) {
			sb.append(i + ": ");
			for(int w: adjMatrix[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		UnDirectedGraph udg = new UnDirectedGraph(4);
		
		udg.addEdge(0, 1);
		udg.addEdge(1, 2);
		udg.addEdge(2, 3);
		udg.addEdge(3, 0);
		
		System.out.println(udg);
	}
}
