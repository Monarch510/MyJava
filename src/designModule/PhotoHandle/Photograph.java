package designModule.PhotoHandle;

public class Photograph {
	private Filter filter;
	
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	
	public void display() {
		filter.beatify();
	}
	
}
