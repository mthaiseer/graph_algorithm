package com.algorithms.graph.adjecencylist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GraphTest {
	
	@Test
	public void testGraphSuccess() {
		
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexE = new Vertex("E");
		Vertex vertexF = new Vertex("F");
		
		//set children of A 
		vertexA.addNeighbour(vertexB);
		vertexA.addNeighbour(vertexE);
		vertexA.addNeighbour(vertexF);
		
		
		Graph graph = new Graph(4);
		graph.addVertex(vertexA);
		
		graph.setRootVertex(vertexA);
		
		assertEquals(graph.getNumberOfVertex(), 4);
		assertEquals(graph.getRootVertex(), vertexA);
	}
	
	@Test
	public void testPrintAllGraphVertexSuccess() {

		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexE = new Vertex("E");
		Vertex vertexF = new Vertex("F");
		Vertex vertexC = new Vertex("C");
		Vertex vertexD = new Vertex("D");
		
		//set children of A 
		vertexA.addNeighbour(vertexB);
		vertexA.addNeighbour(vertexE);
		vertexA.addNeighbour(vertexF);
		
		//Set children of B 
		vertexB.addNeighbour(vertexC);
		vertexB.addNeighbour(vertexD);
		Graph graph = new Graph(4);
		
		//set graph
		graph.addVertex(vertexA);
		graph.addVertex(vertexB);
		
		assertNotNull(graph.getVertexList());
		assertEquals(graph.getVertexList().size(), 2);
		
		graph.printAll();
		
		
	}

}
