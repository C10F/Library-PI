
public class Book extends Inventory {
	//attributes
	private boolean home;
	private boolean reserved;
	
	//contructors
	Book(){}
	
	//methods
	public boolean getHome() {
		return this.home;
	}
	public void setHome(boolean home_) {
		this.home = home_;
	}
	public boolean getReserved() {
		return this.reserved;
	}
	public void setReserved(boolean reserved_) {
		this.reserved = reserved_;
	}
}
