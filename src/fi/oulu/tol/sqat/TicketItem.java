package fi.oulu.tol.sqat;

public class TicketItem extends Item {

	public TicketItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	public void updateQuality(){
		if (this.quality < 50){
			if(this.sellIn < 0){
				this.quality = 0;
				this.sellIn = 0;
			}else if (this.sellIn < 11){
				this.quality = this.quality + 2;
				this.sellIn = this.sellIn - 1;
			}else if (this.sellIn < 6){
				this.quality = this.quality + 3;
				this.sellIn = this.sellIn - 1;
			}else{
				this.quality = this.quality + 1;
				this.sellIn = this.sellIn - 1;
			}
		}
	}

}
