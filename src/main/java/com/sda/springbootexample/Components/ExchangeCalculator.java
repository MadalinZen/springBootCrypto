package com.sda.springbootexample.Components;

import com.sda.springbootexample.Exception.UnknownRateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExchangeCalculator {

    @Autowired private CryptoData cryptoData ;

    public double getUsdAmount(String coinType,Double amount) throws UnknownRateException {

        double rate = cryptoData.getRate(coinType);

        return rate * amount ;
    }

}
