package cicd.qe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import cicd.qe.models.FruitModel;

@Component
public interface FruitRepository extends MongoRepository<FruitModel ,String> {
}