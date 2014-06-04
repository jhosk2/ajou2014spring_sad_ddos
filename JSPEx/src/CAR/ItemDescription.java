package CAR;

public class ItemDescription {
	private int id;
	private int price;
	private String name;
	private int calorie;
	private String ingredients;
	private int estimatedCookingTime;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPrice() {
		return price;
	}
	
	private void setPrice(int price) {
		this.price = price;
	}
	
	public int getEstimatedCookingTime() {
		return estimatedCookingTime;
	}
	
	private void setEstimatedCookingTime(int estimatedCookingTime) {
		this.estimatedCookingTime = estimatedCookingTime;
	}
	
	public String getIngredients() {
		return ingredients;
	}
	
	private void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	public int getCalorie() {
		return calorie;
	}
	
	private void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public void setItemDescription(int calorie, int estimatedCookingtime,
			String ingredients, String name, int price) {
		
		setCalorie(calorie);
		setEstimatedCookingTime(estimatedCookingTime);
		setIngredients(ingredients);
		setIngredients(ingredients);
		setName(name);
		setPrice(price);
		
	}
}
