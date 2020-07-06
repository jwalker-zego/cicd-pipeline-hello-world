package cicd.qe.requests;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import cicd.qe.models.FruitModel;

@Data
public class FruitRequest {
    private String name;
    private String color;
    
    public FruitModel toFruitModel()
    {
       return new FruitModel(this.color,this.name);
    }
}