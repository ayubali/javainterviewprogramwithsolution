package graph;

public class FloyedWarshall {
	public int N;
	public int[][] dist;
	public int[][] path;

	public FloyedWarshall(int N) {
		this.N = N;
		dist = new int[N][N];
		path = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					dist[i][j] = 10000;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					path[i][j] = j;
				}
			}
		}

	}

	public void floydWarshall() {
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (dist[i][j] > dist[i][k] + dist[k][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
						path[i][j] = k;
					}
				}
			}

		}

	}

	public void displayPath(int i, int j) {
		if (path[i][j] == j) {
			return;
		} else {
			displayPath(i, path[i][j]);
			System.out.print(path[i][j] + "->");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FloyedWarshall warshall = new FloyedWarshall(4);
		warshall.addEdge(0, 1, 2);
		warshall.addEdge(0, 2, 4);

		warshall.addEdge(1, 2, 1);
		warshall.addEdge(1, 3, 5);

		warshall.addEdge(2, 3, 3);

		System.out.println("path mat: \n");
		for (int i = 0; i < warshall.N; i++) {

			for (int j = 0; j < warshall.N; j++) {
				System.out.print(" " + warshall.path[i][j]);
			}
			System.out.println();
		}

		warshall.floydWarshall();

		System.out.println("\n cost: \n");
		for (int i = 0; i < warshall.N; i++) {

			for (int j = 0; j < warshall.N; j++) {
				System.out.print(" " + warshall.dist[i][j]);
			}
			System.out.println();
		}

		System.out.println("path mat: \n");
		for (int i = 0; i < warshall.N; i++) {

			for (int j = 0; j < warshall.N; j++) {
				System.out.print(" " + warshall.path[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n cost of 0--3: " + warshall.dist[0][3]);
		System.out.print("0->");
		warshall.displayPath(0, 3);
		System.out.print("3");

	}

	private void addEdge(int i, int j, int weight) {
		dist[i][j] = weight;
		dist[j][i] = weight;

	}

}
