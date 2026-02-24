package com.heshant.giftshop.dto.request;

import jakarta.validation.constraints.*;

public record CategoryRequestDTO(

        @NotBlank(message = "Category name is required")
        @Size(min = 3, max = 100, message = "Category name must be between 3 and 100 characters")
        String name,

        @Positive(message = "Parent category ID must be a valid ID")
        @Null(message = "Use null if this category has no parent")
        Integer parentCategoryId

) {}