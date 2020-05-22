package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import company.Company;
import investor.InvestorCollectionInterface;
import model.FacadeReport.Result;
import model.FacadeReport.Type;
/**
 * @author: Leopoldo Medeiros_2017288
 */

public class View {
	private BufferedReader br;
	
	protected ArrayList<Company> companies;
	protected InvestorCollectionInterface investors;


	/**
	 * CONSTRUCTOR
	 * @param companies
	 * @param investors
	 */
		public View(ArrayList<Company> companies, InvestorCollectionInterface investors) {
			this.companies = companies;
			this.investors = investors;
			br = new BufferedReader(new InputStreamReader(System.in));
			menu_view();
		}

	/**
	 * 	Print out CLI for the user -> * MENU *
	 */
		private void menu_view() {
			/**
			 *The program asks user to select an option
			 */
			System.out.println("---Select one option---");
			System.out.println("1 - Best  Companies");
			System.out.println("2 - Worst Companies");
			System.out.println("3 - Best  Investors");
			System.out.println("4 - Worst Investors");
			String input = input();
			
			if(input.equals("1")){
				FacadeReport.generateReport(Type.COMPANY, Result.HIGH, this);
				menu_view();
			}
			else if(input.equals("2")){
				FacadeReport.generateReport(Type.COMPANY, Result.LOW, this);
				menu_view();
			}
			else if(input.equals("3")){
				FacadeReport.generateReport(Type.INVESTOR, Result.HIGH, this);
				menu_view();
			}
			else if(input.equals("4")){
				FacadeReport.generateReport(Type.INVESTOR, Result.LOW, this);
				menu_view();
			}
			else {
				System.out.println("Not valid");
				menu_view();
			}
			
		}
		
		private String input() {
			String input;
			try {
				input = br.readLine();
				return input;
			} catch (IOException e) {
				e.printStackTrace();
				return input();
			}

		}
		
		
}
