package investor;

/**
 * @author: Leopoldo Medeiros_2017288
 */
import java.util.ArrayList;
import java.util.List;

public class InvestorIterator implements InvestorIteratorInterface {

	ArrayList<Investor> investors;
	private int pos = 0;

	public InvestorIterator(List<Investor> investors) {
		this.investors = (ArrayList<Investor>) investors;
	}

	@Override
	public boolean hasNext() {
		
		while (pos < investors.size()) {
			
			if (pos >= investors.size()) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
	

	@Override
	public Investor next() {
		Investor investor = investors.get(pos);
		pos = pos + 1;
		return investor;
	}

	@Override
	public Investor restart() {
		this.pos = 0;
		return null;
	}

	public Investor get(int position) {
		Investor investor = investors.get(position);	
		return investor;
	}
	
	public void clear() {
		investors.clear();
	}

}
