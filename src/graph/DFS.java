package graph;

import java.util.Stack;

public class DFS {
	private final int MAX_VERT = 20;
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nVerts;
	private Stack<Vertex> stack;

	public DFS() {
		vertexList = new Vertex[MAX_VERT];
		adjMat = new int[MAX_VERT][MAX_VERT];
		nVerts = 0;
		stack = new Stack<Vertex>();
	}

	public void addVertex(Vertex vertex) {
		vertexList[nVerts++] = vertex;
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	private Vertex findAdjcentVertex(Vertex rootVertex) {
		Vertex vertex  = null;
		for (int j = 0; j < nVerts; j++) {
			if (adjMat[rootVertex.getIndex()][j] == 1
					&& vertexList[j].isVisited() == false) {
				vertex = vertexList[j];
			}
		}
		return vertex;

	}

	private void display(Vertex vertex) {
		System.out.print(vertex.getLabel() + " ");
	}

	public void dfs(Vertex startVertex) {
		startVertex.setVisited(true);
		display(startVertex);
		stack.push(startVertex);
		while (!stack.isEmpty()) {
			Vertex rootVertex = stack.peek();
			Vertex adjVertex=findAdjcentVertex(rootVertex);
			if(adjVertex!= null){		
				adjVertex.setVisited(true);
				display(adjVertex);
				stack.add(adjVertex);
			}
			else{
			  stack.pop();	
			}
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DFS theGraph = new DFS();

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
		theGraph.dfs(v1); // breadth-first search
		System.out.println();
	}

}
