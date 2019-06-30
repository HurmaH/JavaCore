package SundayAssessment;

public class Stock {
	
	String tickerSymbol;
	String companyName;
	int price;
	double percentChange;
	int totalShares;
	long marketCap;
	
	
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
	
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.marketCap = (long) (totalShares*percentChange);
	}
	
	public void adjustPrice(int value) {
		
		percentChange =(double) value/price;
		price = price+value;
		marketCap =	(long) (totalShares*percentChange);	
	}

	@Override
	public String toString() {
		return "Ticker Symbol: " + tickerSymbol + "\nCompanyName: " + companyName 
				+ "\nCurrent Price: $" + price+" ("+percentChange+"%)"
				+ "\nMarket Cap: $" + marketCap;
	}
	

}
