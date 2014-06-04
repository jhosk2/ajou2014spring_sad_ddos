package CAR;

import java.util.ArrayList;

public class ItemManager {
	
	private static ItemManager instance;
	private ArrayList<ItemDescription> listItemDescription = new ArrayList<ItemDescription>();
	
	private ItemManager()
	{
		// temporary db data
		ItemDescription d1 = new ItemDescription();
		//d1.setItemDescription(calorie, estimatedCookingtime, ingredients, name, price);

	}
	
	public static ItemManager getInstance()
	{
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
	
	public ItemDescription addNewItem( int calorie, int estimatedCookingtime, String ingredients, String name, int price)
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
		itemDescription.setItemDescription( calorie, estimatedCookingtime, ingredients, name, price );
		return itemDescription;
	}
	
	public ItemDescription modifyItem( int id, int calorie, int estimatedCookingtime, String ingredients, String name, int price )
	{
		ItemDescription itemDescription = getItemDescription(id);
		itemDescription.setItemDescription( calorie, estimatedCookingtime, ingredients, name, price );
		return itemDescription;
	}
}
