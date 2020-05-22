package model;

/**
 * @author: Leopoldo Medeiros_2017288
 */

import java.util.ArrayList;

import company.Company;
import investor.Investor;
import investor.InvestorCollection;
import investor.InvestorCollectionInterface;

public class FacadeReport {

	public static enum Type {
		COMPANY, INVESTOR;
	}

	/**
	 * Levels High and Low assigned to identify results
	 */
	public static enum Result {
		HIGH, LOW;
	}

	/**
	 *
	 * @param type
	 * @param result
	 * @param view
	 */
	public static void generateReport(Type type, Result result, View view) {

		if (type == Type.COMPANY && result == Result.HIGH) {
			ArrayList<Company> high = new ArrayList<Company>();
			high.add(view.companies.get(0));
			for (int i = 0; i < view.companies.size(); i++) {
				double capital = view.companies.get(i).getPrice() * view.companies.get(i).getShares();
				double highestCapital = high.get(0).getPrice() * high.get(0).getShares();
				if (capital > highestCapital) {
					high.clear();
					high.add(view.companies.get(i));
				} else if (capital == highestCapital) {
					high.add(view.companies.get(i));
				}
			}
			System.out.println(high);
		}

		if (type == Type.COMPANY && result == Result.LOW) {
			ArrayList<Company> low = new ArrayList<Company>();
			low.add(view.companies.get(0));
			for (int i = 0; i < view.companies.size(); i++) {
				double capital = view.companies.get(i).getPrice() * view.companies.get(i).getShares();
				double lowestCapital = low.get(0).getPrice() * low.get(0).getShares();
				if (capital < lowestCapital) {
					low.clear();
					low.add(view.companies.get(i));
				} else if (capital == lowestCapital) {
					low.add(view.companies.get(i));
				}
			}
			System.out.println(low);
		}
		if (type == Type.INVESTOR && result == Result.HIGH) {
			ArrayList<Investor> high = new ArrayList<Investor>();
			high.add(view.investors.iterator().get(0));
			for (int i = 0; i < view.investors.size(); i++) {
				double sharesNumb = view.investors.iterator().get(i).getShares();
				double highestNumber = high.get(0).getShares();
				if (sharesNumb > highestNumber) {
					high.clear();
					high.add(view.investors.iterator().get(i));
				} else if (sharesNumb == highestNumber) {
					high.add(view.investors.iterator().get(i));

				}
			}
			System.out.println(high);
		}
		if (type == Type.INVESTOR && result == Result.LOW) {
			ArrayList<Investor> low = new ArrayList<Investor>();
			low.add(view.investors.iterator().get(0));
			for (int i = 0; i < view.investors.size(); i++) {
				double sharesNumb = view.investors.iterator().get(i).getShares();
				double highestNumber = low.get(0).getShares();
				if (sharesNumb < highestNumber) {
					low.clear();
					low.add(view.investors.iterator().get(i));
				} else if (sharesNumb == highestNumber) {
					low.add(view.investors.iterator().get(i));

				}
			}
			System.out.println(low);
		}

	}
}
