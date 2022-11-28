package de.uni.koeln.sse.se;

public interface HouseholdItem {

	public double acceptPrice(MovingCalculatorVisitor visitor);
	public string acceptPackaging(MovingCalculatorVisitor visitor);

}
