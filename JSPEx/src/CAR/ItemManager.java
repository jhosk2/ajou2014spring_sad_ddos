package CAR;

import java.util.ArrayList;

public class ItemManager {
	
	private static ItemManager instance = null;
	private ArrayList<ItemDescription> listItemDescription = new ArrayList<ItemDescription>();
	
	private ItemManager()
	{
		// temporary db data
		ItemDescription d1 = new ItemDescription();
		d1.setItemDescription(450, 15, "치킨, 새우, 파스타면", "치킨 & 쉬림프 카르보나라", 15000, "chicken_and_shrimp_carbonara.png");
		listItemDescription.add(d1);
		ItemDescription d2 = new ItemDescription();
		d2.setItemDescription(350, 10, "올리브, 바질, 파스타면", "바질 페스토 올리브 파스타", 14000, "basil_pesto_olive_pasta.png");
		listItemDescription.add(d2);
		ItemDescription d3 = new ItemDescription();
		d3.setItemDescription(400, 15, "치킨, 새우, 파스타면, 매운양념", "스파이시 치킨 & 쉬림프 스파게티", 13000, "spicy_chicken_and_shrimp_spaghetti.png");
		listItemDescription.add(d3);
	}
	
	public static ItemManager getInstance()
	{
		if ( instance == null )
		{
			instance = new ItemManager();
		}
		return instance;
	}
	
	public ArrayList<ItemDescription> getItemDescriptionList() {
		return listItemDescription;
	}
	
	public Item getItem()
	{
		Item item = new Item();
		return item;
	}

	public ItemDescription getItemDescription(int itemId) {
		
		for( ItemDescription desc : listItemDescription )
		{
			if ( desc.getId() == itemId )
			{
				return desc;
			}
		}
		
		return null;
	}
	
	public String accessManagerView( String id, String password )
	{
		return "";
	}
	
	public ItemDescription addNewItem( int calorie, int estimatedCookingtime, String ingredients, String name, int price, String imgPath )
	{
		ItemDescription itemDescription = new ItemDescription();
		
		int newId = 0;
		for( ItemDescription desc : listItemDescription )
		{
			if ( desc.getId() >= newId )
			{
				newId = desc.getId() + 1;
			}
		}
		itemDescription.setId( newId );
		itemDescription.setItemDescription( calorie, estimatedCookingtime, ingredients, name, price, imgPath );
		return itemDescription;
	}
	
	public ItemDescription modifyItem( int id, int calorie, int estimatedCookingtime, String ingredients, String name, int price, String imgPath  )
	{
		ItemDescription itemDescription = getItemDescription(id);
		itemDescription.setItemDescription( calorie, estimatedCookingtime, ingredients, name, price, imgPath );
		return itemDescription;
	}
}
