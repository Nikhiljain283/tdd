package tddApproach;

public class Quantity {

	public boolean checkEqual(int foot) {
		int inch = foot * 12;
		if (foot == inch / 12) {
			return true;
		} else
			return false;
	}

	public int convertFootToInch(int foot) {
		int inch = foot * 12;
		return inch;

	}

	public int convertYardToFeet(int yard) {
		int feet = yard * 3;
		return feet;

	}

	public int convertYardToInch(int yard) {
		int inch = yard * 36;
		return inch;

	}

}
