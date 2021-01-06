package com.seleniummaster.classconcept;

public class CubeCartCategoryContent {
    private String categoryName;
    private String status;
    private String visible;
    private String parentCategory;

    public CubeCartCategoryContent() {
    }

    public CubeCartCategoryContent(String categoryName, String status, String visible, String parentCategory) {
        this.categoryName = categoryName;
        this.status = status;
        this.visible = visible;
        this.parentCategory = parentCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
    }
}
