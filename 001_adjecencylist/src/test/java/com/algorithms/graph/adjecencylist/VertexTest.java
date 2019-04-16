package com.algorithms.graph.adjecencylist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VertexTest {
	
	@Test
	public void test_vertex_success() {
		
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexE = new Vertex("E");
		Vertex vertexF = new Vertex("F");
		vertexA.addNeighbour(vertexB);
		vertexA.addNeighbour(vertexE);
		vertexA.addNeighbour(vertexF);
		
		assertNotNull(vertexA.getName());
		assertEquals(vertexA.getName(), "A");
		assertNotNull(vertexA.getNeighbours());
		assertEquals(vertexA.getNeighbours().size(), 3);
		
		assertTrue(vertexA.getNeighbours().contains(vertexB));
		
		vertexA.print();
		
		
	}

}
