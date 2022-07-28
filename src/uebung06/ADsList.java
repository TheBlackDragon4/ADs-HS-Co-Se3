package uebung06;

public interface ADsList {
	public int size();

	public void insert(int pos, Object element);
	public void remove(int pos);

	public Object elementAt(int pos);
	public int find(Object element);

	public boolean isEmpty();
}
