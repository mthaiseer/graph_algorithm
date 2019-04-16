package com.algorithms.graph.adjecencylist;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private int numberOfVertex;
	private Vertex rootVertex;
	private List<Vertex> vertexList;

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public Vertex getRootVertex() {
		return rootVertex;
	}

	public void setRootVertex(Vertex root) {
		this.rootVertex = root;
	}

	public Graph(int numberOfVertex) {

		this.numberOfVertex = numberOfVertex;
		this.vertexList = new ArrayList<Vertex>(numberOfVertex);
	}

	public int getNumberOfVertex() {
		return numberOfVertex;
	}

	public void addVertex(Vertex v) {
		vertexList.add(v);
	}

	public void printAll() {
		
		for(Vertex v : vertexList) {
			v.print();
		}
		System.out.println("************");

	}

}
