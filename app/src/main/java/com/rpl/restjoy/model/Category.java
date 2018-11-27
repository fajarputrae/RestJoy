package com.rpl.restjoy.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
    public static final String CATEGORY = "CATEGORY";
    public static final String CATEGORY_ID = "CATEGORY_ID";

    private String categoryId;
    private String categoryName;

    public Category(){}

    public Category(String categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
