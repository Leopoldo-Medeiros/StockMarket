package company;

import java.util.Random;

public class CompanyBuilder {

    /**
     * Attributes
     */
    private Random rand = new Random();
    protected String id;
    protected String compName;
    protected double price;
    protected int shares;

    
    public CompanyBuilder(String compName) {
        this.compName = compName;
       
    }

    public CompanyBuilder setId(String id) {
         this.id = id;
         return this;
    }

    public Company build() {
        this.price = 10 + (rand.nextDouble() * 90);
        this.shares = rand.nextInt(1000-500) + 500;
        return new Company(this);
    }
}
