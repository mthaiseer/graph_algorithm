package com.graph.breadthfirstsearch;

import java.util.LinkedList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Vertex> neighbours;

	public Vertex(String name) {
		this.name = name;
		neighbours = new LinkedList<Vertex>();
	}

	public String getName() {
		return name;
	}

	public void addNeighbour(Vertex v) {
		neighbours.add(v);
		
	}

	public List<Vertex> getNeighbours() {
		return neighbours;
	}
	
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public void print() {
		System.out.println("Name : "+this.getName());
		List<Vertex> c =this.getNeighbours();
		
		System.out.println("Number of neighbours "+ neighbours.size());
		
		for(Vertex vneighbors : neighbours) {
			
			System.out.print(vneighbors.getName() + "->");
			
		}
		System.out.println();
	}
	
	
	

}
