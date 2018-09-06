package co.grandcircus.recipeCapstone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import co.grandcircus.recipeCapstone.entity.Favorites;

@Repository
@Transactional
public class RecipeDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Favorites> findAll() {
		return em.createQuery("FROM Favorites", Favorites.class)
				.getResultList();
	}
	
	public void create(Favorites favorites) {
		em.persist(favorites);
	}
	
	public void delete(Favorites favorites) {
		Favorites favoritesToDelete = em.getReference(Favorites.class, favorites);
		em.remove(favoritesToDelete);
	}
}
