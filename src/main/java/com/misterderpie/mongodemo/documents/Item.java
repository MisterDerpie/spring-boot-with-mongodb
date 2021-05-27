package com.misterderpie.mongodemo.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.javamoney.moneta.FastMoney;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
@AllArgsConstructor
@Data
public class Item {

    @Id
    public UUID id;
    public FastMoney price;
    public String name;

}