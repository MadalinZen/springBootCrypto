package com.sda.springbootexample.Components;


import com.sda.springbootexample.Exception.UnknownRateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtmService {

    @Autowired
            private ExchangeCalculator exchangeCalculator ;

    // Atm fee

    double atmFee = 1.1 ;

    /**
     *Return the atm amount conversion in USD
     *
     * @param coinType
     * @param amount
     * @return
     * @throws UnknownRateException
     */

    public double exchangeCoin(String coinType,Double amount) throws UnknownRateException {

        double baseAmount = exchangeCalculator.getUsdAmount(coinType,amount);
        return baseAmount * atmFee ;
    }
}
