package investor;

import java.util.Random;

public class InvestorBuilder {

    Random rand = new Random();
    int low = 1000;
    int high = 10000;

    /**
     * ATTRIBUTES
     */
    protected String id;
    protected int shares;
    protected String name;
    protected double budget;

    /**
     * CONSTRUCTOR
     * @param name
     */
    public InvestorBuilder(String name) {
        this.name = name;
    }
    
    public InvestorBuilder setInvestorId(String id) {
    	this.id = id;
    	return this;
    }
    
public Investor build() {
    	this.shares = 0;
    	this.budget = low + (rand.nextDouble() * (high-low));
    	return new Investor(this);
    }
    
}
