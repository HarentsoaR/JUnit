package alov;

public interface IMoney {
	public IMoney add(IMoney aMoney);

	public IMoney addMoney(Money money) {
	    return (new MoneyBag(money, this)).simplify();
	}

	public IMoney addMoneyBag(MoneyBag moneyBag) {
	    return (new MoneyBag(moneyBag, this)).simplify();
	}

}
