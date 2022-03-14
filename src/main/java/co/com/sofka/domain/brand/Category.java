package co.com.sofka.domain.brand;

import co.com.sofka.domain.brand.value.CategoryId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;

public class Category extends Entity<CategoryId> {
    private CategoryId categoryId;

    public Category(CategoryId categoryId){
        super(categoryId);
    }

    public CategoryId categoryId() {
        return categoryId;
    }
}
