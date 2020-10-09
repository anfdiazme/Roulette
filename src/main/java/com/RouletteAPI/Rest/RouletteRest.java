package com.RouletteAPI.Rest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.RouletteAPI.models.*;
import com.RouletteAPI.control.PlayerController;
import com.RouletteAPI.control.RouletteController;
@RestController
public class RouletteRest {
	@Autowired
	private RouletteController rouletteControl;
	@Autowired
	private PlayerController playerControl ;
	@PostMapping("/addroulette")
	public Integer saveroulette() {
		Roulette roulette= new Roulette();
		int id = (int) (rouletteControl.count()+1);
		roulette.setIdRoulette(id);
		rouletteControl.save(roulette);
		return  roulette.getIdRoulette();
	}
	@GetMapping("/findAllroulette")
	public List<Roulette> getRoulette() {
	return rouletteControl.findAll();
	}
	@PutMapping("/update/{id}")
	public String Openroulette1(@PathVariable int id) {
		if ( rouletteControl.count() < id || id <= 0  ) {
			return "Denied" ; 
		}
		rouletteControl.deleteById(id);
		rouletteControl.save( new Roulette ( id , "open" ) ) ;
		return "Successful";
	}
}
