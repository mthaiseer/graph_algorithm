package com.graph.breadthfirstsearch;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Graph graph = new Graph();

		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexE = new Vertex("E");
		Vertex vertexF = new Vertex("F");
		Vertex vertexC = new Vertex("C");
		Vertex vertexD = new Vertex("D");
		Vertex vertexG = new Vertex("G");
		Vertex vertexH = new Vertex("H");

		// set children of A
		vertexA.addNeighbour(vertexB);
		vertexA.addNeighbour(vertexE);
		vertexA.addNeighbour(vertexG);

		// Set children of B
		vertexB.addNeighbour(vertexC);
		vertexB.addNeighbour(vertexD);

		// Set child E
		vertexE.addNeighbour(vertexF);

		// Set child E
		vertexG.addNeighbour(vertexH);

		// set graph
		graph.addVertex(vertexA);
		graph.addVertex(vertexB);
		graph.addVertex(vertexE);
		graph.addVertex(vertexG);
		
		graph.printAll();

	}
}
