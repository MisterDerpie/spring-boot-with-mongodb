package com.misterderpie.mongodemo.repositories;

import com.misterderpie.mongodemo.documents.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ItemRepository extends MongoRepository<Item, UUID> {

}