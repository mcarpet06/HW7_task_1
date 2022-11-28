// visits the Household items
package de.uni.koeln.sse.se;


public interface MovingCalculatorVisitor {

	double getPrice(Glass glass);
	double getPrice(Furniture furniture);
	double getPrice(Electronic electronic);

	string getInstructions(Glass glass);
	string getInstructions(Furniture furniture);
	string getInstructions(Electronic electronic);

}