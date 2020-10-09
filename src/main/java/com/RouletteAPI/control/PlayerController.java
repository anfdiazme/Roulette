package com.RouletteAPI.control;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.RouletteAPI.models.Player;
public interface PlayerController  extends MongoRepository <Player, Integer>{

}
