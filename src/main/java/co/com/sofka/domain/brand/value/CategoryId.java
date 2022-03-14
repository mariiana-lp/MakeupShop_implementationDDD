package co.com.sofka.domain.brand.value;

import co.com.sofka.domain.generic.Identity;

public class CategoryId extends Identity {
    public CategoryId (){
    }
    private CategoryId (String id){
        super(id);
    }
    public static CategoryId of(String id){
        return new CategoryId(id);
    }
}
