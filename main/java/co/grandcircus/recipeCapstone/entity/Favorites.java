package co.grandcircus.recipeCapstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="favorites")
public class Favorites {
	
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="favorites_id")
	private Long id;
	private String label;
	private String image;
	private String url;
	
	public Favorites(Long id, String label, String image, String url) {
		super();
		this.id = id;
		this.label = label;
		this.image = image;
		this.url = url;
	}

	public Favorites() {
	}

	public Favorites(String label, String image, String url) {
		this.label = label;
		this.image = image;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Favorites [id=" + id + ", label=" + label + ", image=" + image + ", url=" + url + "]";
	}
	
	
	
	
	

}
