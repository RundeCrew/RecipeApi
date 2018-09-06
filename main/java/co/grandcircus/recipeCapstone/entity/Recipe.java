package co.grandcircus.recipeCapstone.entity;

import java.util.List;

public class Recipe {
	
	
	private Long resultsId;
	private String url;
	private String label;
	private String image;
	private Integer yield;
	private List<Ingredients> ingredients;
	
	public Recipe() {
		
	}
	
	public Recipe(Long resultsId, String url, String label, String image, Integer yield, List<Ingredients> ingredients) {
		super();
		this.resultsId = resultsId;
		this.url = url;
		this.label = label;
		this.image = image;
		this.yield = yield;
		this.ingredients = ingredients;
		
	}

	public Long getResultsId() {
		return resultsId;
	}

	public void setResultsId(Long resultsId) {
		this.resultsId = resultsId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getYield() {
		return yield;
	}

	public void setYield(Integer yield) {
		this.yield = yield;
	}

	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}



	@Override
	public String toString() {
		return "Recipe [resultsId=" + resultsId + ", url=" + url + ", label=" + label + ", image=" + image + ", yield="
				+ yield + ", ingredients=" + ingredients;
	}

}
