package cicd.qe.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class FruitModel {

    @Id
    //private String id;
    private String name;
    private String color;
    
    public FruitModel(String color, String name)
    {
    	this.color = color;
    	this.name = name;
    }
}
