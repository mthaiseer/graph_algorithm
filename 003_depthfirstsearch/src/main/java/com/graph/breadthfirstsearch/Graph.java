package com.graph.breadthfirstsearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

	private Vertex rootVertex;
	private List<Vertex> vertexList;
	List<String> elements = new LinkedList<String>();
	ArrayDeque< Vertex> queue = new ArrayDeque<Vertex>();

	public Graph() {

		this.vertexList = new ArrayList<Vertex>();
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public Vertex getRootVertex() {
		return rootVertex;
	}

	public void setRootVertex(Vertex root) {
		this.rootVertex = root;
	}

	public void addVertex(Vertex v) {
		vertexList.add(v);
	}
	
	/**
	 * depth first search using recursive way 
	 * @param root
	 * @return
	 */
	public List<String> dfsRecursive(Vertex root) {
		
		root.setVisited(true);
		elements.add(root.getName());
		
		for(Vertex v : root.getNeighbours()) {
			if(v.isVisited()==false) {
				dfsRecursive(v);
			}
		}
		return elements;
		
	}
	
	public List<String> dfsIterative(Vertex root) {
		
		root.setVisited(true);
		queue.push(root);
		
		while(!queue.isEmpty()) {
			
			Vertex current = queue.pop();
			elements.add(current.getName());
			
			List<Vertex> neighbours = current.getNeighbours();
			for(Vertex v : neighbours) {
				
				if(v.isVisited() == false) {
					v.setVisited(true);
					queue.push(v);
				}
			}
		}
 		return elements;
		
	}
	
	public void printAll() {

		for (Vertex v : vertexList) {
			v.print();
		}
		System.out.println("************");

	}

}
