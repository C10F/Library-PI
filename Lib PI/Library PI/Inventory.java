public abstract class Inventory {
		//attributes
		private int id;
		private boolean loaned;
		private Loaner l1;
		
		//constructors
		Inventory() {}
		
		//methods
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public boolean getLoaned() {
			return this.loaned;
		}
		public void setLoaned(boolean loaned_) {
			this.loaned = loaned_;
		}
		public Loaner getLoaner() {
			return this.l1;
		}
		public void setLoaner(Loaner l1_) {
			this.l1 = l1_;
		}
	}

