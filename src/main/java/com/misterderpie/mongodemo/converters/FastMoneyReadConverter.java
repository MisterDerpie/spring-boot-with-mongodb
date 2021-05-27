package com.misterderpie.mongodemo.converters;

import org.javamoney.moneta.FastMoney;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.math.BigDecimal;

@ReadingConverter
public class FastMoneyReadConverter implements Converter<String, FastMoney> {

    public FastMoney convert(String input) {
        String[] storedValue = input.split("###");
        return FastMoney.of(new BigDecimal(storedValue[0]), storedValue[1]);
    }

}