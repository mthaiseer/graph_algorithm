package com.graph.breadthfirstsearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DepthFirstSeachTest {

	/**
	 * 
	 *                      J        I
	 *                          B
	 *           D                                   G
	 *                          A              C
	 *   K        E                                   H
	 *                F
	 * 
	 * 
	 */
	@Test
	public void test_breadth_first_search_recursive_success() {
		
		Graph graph = new Graph();
		
		Vertex vA = new Vertex("A");
		Vertex vB = new Vertex("B");
		Vertex vC = new Vertex("C");
		Vertex vD = new Vertex("D");
		Vertex vE = new Vertex("E");
		Vertex vF = new Vertex("F");
		Vertex vG = new Vertex("G");
		Vertex vH = new Vertex("H");
		Vertex vI = new Vertex("I");
		Vertex vJ = new Vertex("J");
		Vertex vK = new Vertex("K");
		
		vA.addNeighbour(vB);
		vA.addNeighbour(vC);
		vA.addNeighbour(vD);
		vA.addNeighbour(vE);
		vA.addNeighbour(vF);
		
		
		vB.addNeighbour(vJ);
		vB.addNeighbour(vI);
		
		vC.addNeighbour(vG);
		vC.addNeighbour(vH);
		
		
		vE.addNeighbour(vK);
		graph.setRootVertex(vA);
		
		graph.addVertex(vA);
		graph.addVertex(vB);
		graph.addVertex(vC);
		graph.addVertex(vD);
		graph.addVertex(vE);
		graph.addVertex(vF);
		graph.addVertex(vG);
		graph.addVertex(vH);
		graph.addVertex(vI);
		graph.addVertex(vK);
		
		
		//[A, B, J, I, C, G, H, D, E, K, F]
		String[] expected = {"A", "B", "J", "I", "C", "G", "H","D", "E", "K", "F" };
		
		

	    List<String> result =  graph.dfsRecursive(graph.getRootVertex());
	    Object[] actual = result.toArray();
		
		assertNotNull(result);
		assertEquals(actual, expected);
		
	
	}
	
	
	@Test
	public void test_breadth_first_search_Iterative_success() {
		
		Graph graph = new Graph();
		
		Vertex vA = new Vertex("A");
		Vertex vB = new Vertex("B");
		Vertex vC = new Vertex("C");
		Vertex vD = new Vertex("D");
		Vertex vE = new Vertex("E");
		Vertex vF = new Vertex("F");
		Vertex vG = new Vertex("G");
		Vertex vH = new Vertex("H");
		Vertex vI = new Vertex("I");
		Vertex vJ = new Vertex("J");
		Vertex vK = new Vertex("K");
		
		vA.addNeighbour(vB);
		vA.addNeighbour(vC);
		vA.addNeighbour(vD);
		vA.addNeighbour(vE);
		vA.addNeighbour(vF);
		
		
		vB.addNeighbour(vJ);
		vB.addNeighbour(vI);
		
		vC.addNeighbour(vG);
		vC.addNeighbour(vH);
		
		
		vE.addNeighbour(vK);
		graph.setRootVertex(vA);
		
		graph.addVertex(vA);
		graph.addVertex(vB);
		graph.addVertex(vC);
		graph.addVertex(vD);
		graph.addVertex(vE);
		graph.addVertex(vF);
		graph.addVertex(vG);
		graph.addVertex(vH);
		graph.addVertex(vI);
		graph.addVertex(vK);
		
		
		//A, F, E, K, D, C, H, G, B, I, J
		String[] expected = {"A", "F", "E", "K", "D", "C", "H","G", "B", "I", "J" }; 
		
		

	    List<String> result =  graph.dfsIterative(graph.getRootVertex());
	    
	    Object[] actual = result.toArray();
		
		assertNotNull(result);
		assertEquals(actual, expected);
		
	
	}

}
