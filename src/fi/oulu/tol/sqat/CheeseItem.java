package fi.oulu.tol.sqat;

public class CheeseItem extends Item {

	public CheeseItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}


	public void updateQuality(){
		if (this.quality < 50){
			if(this.sellIn < 0){
				this.quality = this.quality + 2;
				this.sellIn = 0;
			}else{
				this.quality = this.quality + 1;
				this.sellIn = this.sellIn - 1;
			}
		}
	}
}
