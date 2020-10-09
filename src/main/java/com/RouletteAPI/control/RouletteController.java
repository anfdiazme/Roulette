package com.RouletteAPI.control;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.RouletteAPI.models.Roulette;
public interface RouletteController extends MongoRepository <Roulette, Integer> {
	
}