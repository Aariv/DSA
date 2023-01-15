package com.ariv.dsa.graph;

import java.util.LinkedList;

public class DirectedGraph {

	int V;
	LinkedList<Integer>[] adj;

	public DirectedGraph() {
		this.V = V;
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++)
			adj[i] = new LinkedList<Integer>();
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}
}
