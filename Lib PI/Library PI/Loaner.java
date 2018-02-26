
public class Loaner {
	// attributes
	private String cardId;
	private boolean loanStatus;
	private int bookLoans;
	private int maxLoans;
	
	// constructors
	Loaner() {}
	
	//methods
	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId_) {
		this.cardId = cardId_;
	}
	public boolean getLoanStatus() {
		return this.loanStatus;
	}
	public void setLoanStatus(boolean loanStatus_) {
		this.loanStatus = loanStatus_;
	}
	
	
}
