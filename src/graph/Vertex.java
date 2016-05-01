package graph;

public class Vertex {
	private char label;
	private int index;
	private boolean visited;

	public Vertex(char label, int index) {
		super();
		this.label = label;
		this.index = index;
		this.visited = false;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

}
