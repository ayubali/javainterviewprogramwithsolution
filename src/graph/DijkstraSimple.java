package graph;

import java.util.HashSet;
import java.util.Set;

import PriorityQueue.PriorityMinQueue;

class Edge implements Comparable<Edge> {

	private final int v, w;;
	private final double weight;

	public Edge(int v, int w, double weight) {
		super();
		this.v = v;
		this.w = w;
		this.weight = weight;
	}

	public int from() {
		return v;
	}

	public int to() {
		return w;
	}

	public double weight() {
		return weight;
	}

	@Override
	public int compareTo(Edge e) {
		if (this.weight < e.weight) {
			return -1;
		} else if (this.weight > e.weight) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Edge [v=" + v + ", w=" + w + ", weight=" + weight + "]";
	}
	
}

class WeightedDigraph {

	private int v;
	private Set<Edge>[] adj;

	public WeightedDigraph(int v) {
		super();
		this.v = v;
		this.adj = (Set<Edge>[]) new Set[v];

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new HashSet<Edge>();
		}
	}

	public void addEdge(Edge e) {
		int v = e.from();
		adj[v].add(e);
	}

	public int V() {
		return v;
	}

	public Iterable<Edge> adj(int v) {
		return adj[v];
	}

}

public class DijkstraSimple {
	public double[] dist = null;
	public Edge[] pared = null;
	public boolean[] marked = null;

	public void DijstraShortedPath(WeightedDigraph G, int s) {
		dist = new double[G.V()];
		pared = new Edge[G.V()];
		marked = new boolean[G.V()];
		boolean[] marked = new boolean[G.V()];
		for (int i = 0; i < G.V(); i++) {
			dist[i] = Double.POSITIVE_INFINITY;
		}
		PriorityMinQueue minQueue = new PriorityMinQueue();
		dist[s] = 0.0f;
		minQueue.put(s, dist[s]);
		while (!minQueue.isEmpty()) {
			int v = minQueue.delMin();
			if (marked[v]) {
				continue;
			}
			marked[v] = true;

			for (Edge e : G.adj(v)) {
				int w = e.to();
				if (dist[w] > dist[v] + e.weight()) {
					dist[w] = dist[v] + e.weight();
					pared[w] = e;
					minQueue.put(w, dist[w]);
				}
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WeightedDigraph digraph = new WeightedDigraph(6);
		digraph.addEdge(new Edge(0, 1, 0.41));
		digraph.addEdge(new Edge(0, 5, 0.29));
		digraph.addEdge(new Edge(1, 2, 0.51));
		digraph.addEdge(new Edge(1, 4, 0.32));
		digraph.addEdge(new Edge(2, 3, 0.50));
		digraph.addEdge(new Edge(3, 0, 0.45));
		digraph.addEdge(new Edge(3, 5, 0.38));
		digraph.addEdge(new Edge(4, 2, 0.32));
		digraph.addEdge(new Edge(4, 3, 0.36));
		digraph.addEdge(new Edge(5, 1, 0.29));
		digraph.addEdge(new Edge(5, 4, 0.21));
		DijkstraSimple dijkstra = new DijkstraSimple();
		dijkstra.DijstraShortedPath(digraph, 0);
		System.out.print("\n Dist: ");
		for (int i = 0; i < dijkstra.dist.length; i++) {
			System.out.print(" " + dijkstra.dist[i]);
		}

		System.out.print("\n paired: ");
		for (int i = 0; i < dijkstra.pared.length; i++) {
			System.out.print(" " + dijkstra.pared[i]);
		}

	}
}
