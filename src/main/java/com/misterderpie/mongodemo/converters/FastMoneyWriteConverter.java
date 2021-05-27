package com.misterderpie.mongodemo.converters;

import org.javamoney.moneta.FastMoney;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class FastMoneyWriteConverter implements Converter<FastMoney, String> {

    public String convert(FastMoney input) {
        return input.getNumber() + "###" + input.getCurrency();
    }

}