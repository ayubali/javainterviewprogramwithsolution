package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

	private final int MAX_VERT = 20;
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nVerts;
	private Queue<Vertex> queue;

	public BFS() {
		vertexList = new Vertex[MAX_VERT];
		adjMat = new int[MAX_VERT][MAX_VERT];
		nVerts = 0;
		queue = new LinkedList<Vertex>();
	}

	public void addVertex(Vertex vertex) {
		vertexList[nVerts++] = vertex;
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	private List<Vertex> findAdjcentVertices(Vertex rootVertex) {
		List<Vertex> vertices = new ArrayList<Vertex>();
		for (int j = 0; j < nVerts; j++) {
			if (adjMat[rootVertex.getIndex()][j] == 1
					&& vertexList[j].isVisited() == false) {
				vertices.add(vertexList[j]);
			}
		}
		return vertices;

	}

	private void display(Vertex vertex) {
		System.out.print(vertex.getLabel() + " ");
	}

	public void bfs(Vertex startVertex) {
		startVertex.setVisited(true);
		display(startVertex);
		queue.add(startVertex);
		while (!queue.isEmpty()) {
			Vertex rootVertex = queue.remove();
			for (Vertex vertex : findAdjcentVertices(rootVertex)) {
				vertex.setVisited(true);
				display(vertex);
				queue.add(vertex);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BFS theGraph = new BFS();

		Vertex v1 = new Vertex('A', 0);
		Vertex v2 = new Vertex('B', 1);
		Vertex v3 = new Vertex('C', 2);
		Vertex v4 = new Vertex('D', 3);
		Vertex v5 = new Vertex('E', 4);

		theGraph.addVertex(v1); // 0 (start for dfs)
		theGraph.addVertex(v2); // 1
		theGraph.addVertex(v3); // 2
		theGraph.addVertex(v4); // 3
		theGraph.addVertex(v5); // 4

		theGraph.addEdge(0, 1); // AB
		theGraph.addEdge(1, 2); // BC
		theGraph.addEdge(0, 3); // AD
		theGraph.addEdge(3, 4); // DE

		System.out.print("bfs Visits: ");
		theGraph.bfs(v1); // breadth-first search
		System.out.println();
	}

}
