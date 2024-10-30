package com.workintech.fswebs18challengemaven.repository;

import com.workintech.fswebs18challengemaven.entity.Card;
import java.util.List;

public interface CardRepository {

    Card save(Card card);

    List<Card> findByColor(String color);

    List<Card> findAll();

    List<Card> findByType(String type);

    List<Card> findByValue(Integer value);

    Card update(Card card);

    Card remove(long id);
}