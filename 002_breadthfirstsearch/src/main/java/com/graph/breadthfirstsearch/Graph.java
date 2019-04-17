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
	 * breadth first search in iterative method O(V+E)
	 * @param root
	 * @return
	 */
	public List<String> bfs(Vertex root) {
		
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Vertex current = queue.remove();
			elements.add(current.getName());
			
			List<Vertex> neighbours = current.getNeighbours();
			for(Vertex v : neighbours) {
				
				if(v.isVisited() == false) {
					v.setVisited(true);
					queue.addLast(v);
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
