package PriorityQueue;

import java.util.PriorityQueue;

class PriorityEntry implements Comparable<PriorityEntry> {

	private int v;
	private double w;

	public PriorityEntry(int v, double w) {
		super();
		this.v = v;
		this.w = w;
	}

	@Override
	public int compareTo(PriorityEntry other) {
		return Double.compare(w, other.w);
	}

	@Override
	public String toString() {
		return "PriorityEntry [v=" + v + ", w=" + w + "]";
	}

	public int getV() {
		return v;
	}

	public double getW() {
		return w;
	}
}

public class PriorityMinQueue extends PriorityQueue {

	private PriorityEntry entry = null;

	public boolean put(int v, double w) {
		entry = new PriorityEntry(v, w);
		boolean offer = this.offer(entry);
		return offer;
	}

	public int delMin() {
		entry = (PriorityEntry) this.poll();
		return entry.getV();

	}

	public static void main(String[] args) {
		PriorityMinQueue minpq = new PriorityMinQueue();
		minpq.put(2, 2.5);
		minpq.put(1, 1.5);
		minpq.put(3, 4.5);
		minpq.put(5, 0.5);

		while(!minpq.isEmpty()) {
			System.out.println(minpq.delMin());
		}

	}
}