
public class Food implements Comparable {

	private String myManufacturer;
	private String myFoodName;
	private double myPrice;

	/**
	 * This constructor initializes the instance variables to the parameter values.
	 * The class has no default constructor.
	 * 
	 * @param manufacturerName
	 *            The manufacturer name.
	 * @param foodName
	 *            The food name.
	 * @param price
	 *            The price of the food.
	 */
	public Food(String manufacturerName, String foodName, double price) {

		myManufacturer = manufacturerName;
		myFoodName = foodName;
		myPrice = price;

	}

	/**
	 * This method accesses the manufacturer name.
	 * 
	 * @return The name of the manufacturer.
	 */
	public String getManufacturer() {

		return myManufacturer;

	}

	/**
	 * This method accesses the food name.
	 * 
	 * @return The name of the food.
	 */
	public String getFoodName() {

		return myFoodName;

	}

	/**
	 * This method accesses the price.
	 * 
	 * @return The price of the food.
	 */
	public double getPrice() {

		return myPrice;

	}

	/**
	 * This method returns a string representation of the food that contains the
	 * three instance variables.
	 */
	public String toString() {

		return myManufacturer + " " + myFoodName + " " + myPrice;

	}

	/**
	 * This method implements the Comparable interface using the food name as the
	 * point of comparison.
	 * 
	 * @return A positive integer if the food name comes after the parameter's
	 *         alphabetically, zero if they are the same, and a negative integer if
	 *         the food name comes first.
	 */
	public int compareTo(Object foodToCompare) {

		// Check that the parameter is an instance of Food before casting.
		if (foodToCompare instanceof Food) {

			// Return a negative integer if the food name comes first.
			if (myFoodName.compareTo(((Food) foodToCompare).getFoodName()) < 1) {
				return -1;
			}

			// Return a positive integer if the parameter's name comes first.
			if (myFoodName.compareTo(((Food) foodToCompare).getFoodName()) > 1) {
				return 1;
			}

			// Return zero if the food names are the same.
			else
				return 0;
		}

		// The method throws an exception if the parameter is not an instance of Food.
		else
			throw new ClassCastException();

	}



	/**
	 * This method implements the Comparable interface using the price of the food
	 * as the point of comparison.
	 * 
	 * public int compareTo(Object foodToCompare) {
	 * 
	 * //Check that the parameter is an instance of the Food class before
	 * casting it. 
	 * 	if (foodToCompare instanceof Food) { 
	 *
	 * //The method returns a negative integer if the price is smaller than that of
	 * the parameter. 
	 * 	if (getPrice() < ((Food) foodToCompare).getPrice()) { 
	 * 		return -1;
	 * 	}
	 * 
	 * //The method returns 0 if the prices are equal. 
	 * 	if (getPrice() == ((Food) * foodToCompare).getPrice()) { 
	 * 		return 0; 
	 * 	}
	 * 
	 * //If this Food has a greater price than the parameter, it returns a positive
	 * integer. 
	 * 	else { 
	 * 		return 1; 
	 *	}
	 * }
	 * 
	 * //The method throws an exception if the parameter cannot be cast to a Food.
	 * else {
	 * 
	 * throw new ClassCastException();
	 * 
	 * }
	 * 
	 * }
	 */
}
	