package investor;

/**
 * @author: Leopoldo Medeiros_2017288
 */
import java.util.ArrayList;
import java.util.List;

public class InvestorCollection implements InvestorCollectionInterface {

	List<Investor> investors;
	
	public InvestorCollection() {
		investors = new ArrayList<>();
	}
	
	@Override
	public void addInvestor(Investor inv) {
		this.investors.add(inv);
	}

	@Override
	public void removeInvestor(Investor inv) {
		this.investors.remove(inv);
	}

	@Override
	public InvestorIterator iterator() {
		return new InvestorIterator(this.investors);
	}
	
	@Override
	public int size() {
		return investors.size();
	}

}
