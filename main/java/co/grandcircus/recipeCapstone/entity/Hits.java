package co.grandcircus.recipeCapstone.entity;

public class Hits {

	private Recipe recipe;
	
	public Hits() {}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "Hits [recipe=" + recipe + "]";
	}
	
	
}
