// Do the calculations of pricing/packaging
package de.uni.koeln.sse.se;


public class MovingCalculatorVisitorImpl implements MovingCalculatorVisitor {

	@Override
	public double getPrice(Glass glass)
	{
		double price = 0;
		// Check thickness
		if(glass.getTickness()==1) { price = 2*glass.getLenght(); }
		else if(glass.getTickness()==2) { price = 1.2*glass.getLenght(); }
		else if(glass.getTickness()==3) { price = 0.7*glass.getLenght(); }
		
		return price;
	}
	

	@Override
	public double getPrice(Furniture furniture){
		double price = 0;
		// Check weight
		if(furniture.getWeight() < 20) { price = 5; }
		else{
			price = (furniture.getWeight()/20)*5;
		}
		return price;
	}

	@Override
	public double getPrice(Electronic electronic){
		double price = 0;
		// fragility
		if(electronic.getFragile() == true)
		{
			if(electronic.getWeight() < 10) { price = 5; }
			else{
				price = (electronic.getWeight()/10)*5;
			}
		}else{
			if(electronic.getWeight() < 15) { price = 5; }
			else{
				price = (electronic.getWeight()/15)*5;
			}
		}
		return price;
	}


	@Override
	public string getInstructions(Glass glass){
		return ">should be wrapped in Bubble wraps and packed in a box with dimension: "+ (glass.getLenght()+1).ToString() +"x"+(glass.getWidth()+1).ToString()+"x"+(glass.getHeight()+1).ToString();
	}

	@Override
	public string getInstructions(Furniture furniture){
		return ">should be covered with waterproof covers with area of: "+ (electronic.getLenght()).ToString() +"x"+(electronic.getHeight()).ToString();
	}
	
	@Override
	public string getInstructions(Electronic electronic){
		return ">should be covered with Polyethylene foam film and packed in a box with dimension: "+ (electronic.getLenght()+1).ToString() +"x"+(electronic.getWidth()+1).ToString()+"x"+(electronic.getHeight()+1).ToString();
	}


}