package com.sda.springbootexample.Exception;

import java.util.Arrays;
import java.util.Set;

public class UnknownRateException extends Exception {

    public UnknownRateException(Set<String> values ) {

    super(" Unknown coin ! Please provide one of the following : " + Arrays.toString(values.toArray()));
    }


}
