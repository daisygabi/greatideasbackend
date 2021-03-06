package com.greatideas.demo.utils;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;

/**
 * Helper methods to transform domain objects into dtos and vice-versa
 */
public class EntityHelper {
    public static <TResult> TResult convertToEntity(Object dto, Class<TResult> classReference) {
        try {
            return new ModelMapper().map(dto, classReference);
        } catch (Exception e) {
            throw new ResourceNotFoundException("Error converting to entity." + e.getMessage(), e);
        }
    }

    public static <TResult> TResult convertToDto(Object obj, Class<TResult> classReference) {
        try {
            return new ModelMapper().map(obj, classReference);
        } catch (Exception e) {
            throw new ResourceNotFoundException("Error converting to entity." + e.getMessage(), e);
        }
    }
}
