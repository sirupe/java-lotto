package lotto.domain;

public class OwnPrize {
    private final WinNumbersCount winNumbersCount;
    private final EarningsRate earningsRate;
    
    OwnPrize(final WinNumbersCount winNumbersCount, final CashPayments cashPayments) {
        this.winNumbersCount = winNumbersCount;
        earningsRate = new EarningsRate(cashPayments.getEarningsRate(winNumbersCount.getTotalPrizeMoney()));
    }
    
    public EarningsRate getEarningsRate() {
        return earningsRate;
    }
    
    public WinNumbersCount getWinNumbersCount() {
        return winNumbersCount;
    }
    
    public boolean isEqualsEarningRate(EarningsRate earningsRate) {
        return this.earningsRate.equalsTo(earningsRate);
    }
}
