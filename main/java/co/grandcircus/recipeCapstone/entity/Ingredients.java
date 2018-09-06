package co.grandcircus.recipeCapstone.entity;



public class Ingredients {

	private Float quantity;
	private Measure measure;
	private Food food;
	
	public Ingredients() {
	}

	public Ingredients(Float quantity, Measure measure, Food food) {
		super();
		this.quantity = quantity;
		this.measure = measure;
		this.food = food;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public Measure getMeasure() {
		return measure;
	}

	public void setMeasure(Measure measure) {
		this.measure = measure;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	
	
}
