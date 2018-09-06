package co.grandcircus.recipeCapstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.recipeCapstone.dao.RecipeDao;
import co.grandcircus.recipeCapstone.entity.Favorites;
import co.grandcircus.recipeCapstone.entity.Recipe;
import co.grandcircus.recipeCapstone.entity.RecipeResults;

@Controller
public class RecipeController {
		
		@Autowired
		RecipeDao recipeDao;
		
		@RequestMapping("/")
		public ModelAndView homePage() {
			ModelAndView mav = new ModelAndView("index");
		
			return mav;
		}
		
		@RequestMapping("/results/ingredientSearch")
		public ModelAndView showStuff(@RequestParam("ingredients")String ingredients 
				
				) {
			ModelAndView mav =  new ModelAndView("results");
			
			RestTemplate restTemplate = new RestTemplate();
			
			//HttpHeaders headers = new HttpHeaders();
			//headers.add(HttpHeaders.USER_AGENT, "Let me in!");
			
			String url = "https://api.edamam.com/search?q=" + ingredients + 
					"&app_id=0ee06737&app_key=34f8cb48323421013bcdd6b51926290e&from=0&to=10";
			
			ResponseEntity<RecipeResults> response = restTemplate.exchange
					(url, HttpMethod.GET, new HttpEntity<>(null),
					RecipeResults.class);
			
			RecipeResults result = response.getBody();
			
			mav.addObject("recipes", result.getHits());
			return mav;	
		}
		
		@RequestMapping("/favorites")
		public ModelAndView viewFavorites() {
			List<Favorites> favorites = recipeDao.findAll();
			return new ModelAndView("favorites", "favorites", favorites);		
		}
		
		@RequestMapping("/add-favorites")
		public ModelAndView addFavorites(Favorites fav) {
				//@RequestParam("label")String label, 
//				@RequestParam("image")String image, 
//				@RequestParam("url")String url) {
			ModelAndView mav =  new ModelAndView("favorites");
//			Favorites fav = new Favorites(label, image, url);
			recipeDao.create(fav);
			return mav;		
		}
		
}
