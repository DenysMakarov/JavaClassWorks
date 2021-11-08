package telran.range.model;

import telran.range.exceptions.RangeLessException;
import telran.range.exceptions.RangeMoreException;

public class RangeCheck {
	int min;
	int max;

	public RangeCheck(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public void check(int number) throws RangeMoreException, RangeLessException {
		if(number < min) {
			throw new RangeLessException(number);
		}
		if(number > max) {
			throw new RangeMoreException(number);
		}
	}

}
