package himalayantimes;

import java.util.Objects;

public class Category {
/*
        CategoryId - int
        Category Name - String
        Is Disabled - boolean
        order - int
        Is Deleted - boolean
        Created At - String
        Updated At - String
    */

    private int categoryId;
    private  String categoryName;
    private boolean isDisabled;
    private int order;
    private  boolean isDeleted;
    private String createdAt;
    private String updatedAt;

    public Category(int categoryId, String categoryName, boolean isDisabled, int order, boolean isDeleted, String createdAt, String updatedAt) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.isDisabled = isDisabled;
        this.order = order;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Category() {

    }


    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", isDisabled=" + isDisabled +
                ", order=" + order +
                ", isDeleted=" + isDeleted +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

   public int getCategoryId() {
        return categoryId;
    }

   public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName()
    {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getCreatedAt() {

        return Objects.requireNonNullElse(createdAt,"2024-01-29");
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {

        return updatedAt;
    }

    public void setUpdated(String updatedAt) {
        this.updatedAt = updatedAt;
    }


}
