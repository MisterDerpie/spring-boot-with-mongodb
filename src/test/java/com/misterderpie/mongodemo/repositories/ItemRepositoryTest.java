package com.misterderpie.mongodemo.repositories;

import com.misterderpie.mongodemo.converters.ConverterConfig;
import com.misterderpie.mongodemo.documents.Item;
import org.javamoney.moneta.FastMoney;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@Import(ConverterConfig.class)
public class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    public void shouldStoreItem() {
        Item item = new Item(UUID.randomUUID(), FastMoney.of(1, "EUR"), "Test Item");
        itemRepository.save(item);
        Item storedItem = itemRepository.findById(item.getId()).orElseThrow();
        assertThat(storedItem.getId()).isEqualTo(item.getId());
        assertThat(storedItem.getPrice()).isEqualTo(item.getPrice());
        assertThat(storedItem.getName()).isEqualTo(item.getName());
    }
}