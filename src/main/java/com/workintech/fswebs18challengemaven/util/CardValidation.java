package com.workintech.fswebs18challengemaven.util;

import com.workintech.fswebs18challengemaven.entity.Card;
import com.workintech.fswebs18challengemaven.entity.Type;
import com.workintech.fswebs18challengemaven.exceptions.CardException;
import org.springframework.http.HttpStatus;

public class CardValidation {

    public static void validateCard(Card card) {
        boolean hasValue = card.getValue() != null;
        boolean hasType = card.getType() != null;


        if (hasValue && hasType) {
            throw new CardException("A card cannot have both value and type at the same time.", HttpStatus.BAD_REQUEST);
        } else if (!hasValue && !hasType) {
            throw new CardException("A card must have either a value or a type.", HttpStatus.BAD_REQUEST);
        }


        if (card.getType() == Type.JOKER) {
            card.setValue(null);
            card.setColor(null);
        }
    }
}