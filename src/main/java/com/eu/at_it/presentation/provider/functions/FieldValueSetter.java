package com.eu.at_it.presentation.provider.functions;

import java.lang.reflect.Field;
import java.util.function.BiConsumer;

public class FieldValueSetter<T> implements BiConsumer<T, Object> {
    private final Field field;

    public FieldValueSetter(Field field) {
        this.field = field;
    }

    @Override
    public void accept(T setOn, Object value) {
        try {
            field.set(setOn, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
