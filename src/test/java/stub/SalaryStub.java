package stub;

import java.util.ArrayList;

import service.Salary;

public class SalaryStub implements Salary {

	public ArrayList<Integer> returnSalaries() {
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		salaries.add(51000);
		salaries.add(50000);
		salaries.add(49000);
		salaries.add(-1);
		salaries.add(0);
		return salaries;
	}

}
