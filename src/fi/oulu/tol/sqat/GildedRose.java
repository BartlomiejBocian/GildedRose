package fi.oulu.tol.sqat;

import java.util.ArrayList;
import java.util.List;


public class GildedRose {

	private static List<Item> items = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        System.out.println("OMGHAI!");
		
        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new CheeseItem("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new RareItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new TicketItem("Backstage passes to a TAFKAL80ETC concert", 10, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality();
        
        for (Item item : items) {
			System.out.println(item.getName() + " " + item.getSellIn() + " " + item.getQuality());
		}
	}
	
    public static void updateQuality()
    {
    	for (Item item : items) {
    		if (item.getClass().equals(Item.class)) {
    			updateNormalItem(item);
    		}
    		if (item.getClass().equals(TicketItem.class)){
    			TicketItem ticketItem = (TicketItem) item;
    			ticketItem.updateQuality();
    		}
    		if(item.getClass().equals(CheeseItem.class)){
    			CheeseItem cheeseItem = (CheeseItem) item;
    			cheeseItem.updateQuality();
    		}
    		if (item.getClass().equals(RareItem.class)){
			}
		}
    }

    private static void updateNormalItem(Item item) {
		item.setQuality(item.getQuality() - 1);
		decreaseSellIn(item);
	}

	private static void decreaseSellIn(Item item) {
		item.setSellIn(item.getSellIn() - 1);
	}
}
