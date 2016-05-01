package graph;

import java.util.ArrayList;

public class Dijkstra {

	
	//https://www.youtube.com/watch?v=8Ls1RqHCOPw
	public static int[] dist;

	public static int[] dijkstra(WeightedGraph g, int s) {
		dist = new int[g.size()];// shortest known distance from "s"
		int[] pred = new int[g.size()]; // preceeding node in path
		boolean[] visited = new boolean[g.size()]; // // all false
		// initially

		for (int i = 0; i < dist.length; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[s] = 0;

		for (int i = 0; i < g.size(); i++) {
			int nextMinVert = minVertex(dist, visited);
			visited[nextMinVert] = true;
			int[] neighbors = g.neighbors(nextMinVert);
			for (int j = 0; j < neighbors.length; j++) {
				int v = neighbors[j];
				int d = dist[nextMinVert] + g.getWeight(nextMinVert, v);
				if (dist[v] > d) {
					dist[v] = d;
					pred[v] = nextMinVert;
				}
			}
		}
		return pred;
	}

	public static int minVertex(int[] dist, boolean[] v) {
		int minValue = Integer.MAX_VALUE;
		int minVertex = -1;
		for (int i = 0; i < dist.length; i++) {
			if (v[i] == false && dist[i] < minValue) {
				minVertex = i;
				minValue = dist[i];
			}
		}
		return minVertex;
	}

	public static void printPath(WeightedGraph g, int[] pred, int s, int e) {
		ArrayList path = new ArrayList();

		int x = e;
		while (x != s) {
			path.add(0, g.getLabel(x));
			x = pred[x];
		}

		path.add(0, g.getLabel(s));
		System.out.println(path);

	}

}
