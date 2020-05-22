package investor;


public class Investor {
    private String id;
    private String investName;
    private int shares;
    private double budget;

  
    protected Investor(InvestorBuilder builder) {
        this.id = builder.id;
        this.investName = builder.name;
        this.shares = builder.shares;
        this.budget = builder.budget;
    }


    ///// GETTERS //////
    public String getId() {
        return id;
    }

    public String getInvestorName() {
        return investName;
    }
    
    public int getShares() {
        return shares;
    }
    
    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
    	String text = "Investor: " + investName + " Budget: " + budget + " Shares: " + shares +"\n";
    	return text;
    }

	public void setBudget(double budget) {
		this.budget = budget;
		this.shares++;
	}
    
}
