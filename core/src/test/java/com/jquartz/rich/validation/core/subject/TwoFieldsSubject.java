package com.jquartz.rich.validation.core.subject;

/**
 * @author Dmitriy Kotov
 */
public class TwoFieldsSubject {

    public static final String FIRST_FIELD = "firstField";
    public static final String SECOND_FIELD = "secondField";
    private final Integer firstField;
    private final Integer secondField;

    public TwoFieldsSubject(Integer firstField, Integer secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }
}