package com.RouletteAPI.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Roulette {
	@Id
	private int idRoulette;
	private String status;
	private Integer number;
	public Roulette() {
		this.idRoulette=1;
		this.status="close";
		this.number=null;
	}
	public Roulette( int idRoulette , String status) {
		super();
		this.idRoulette=idRoulette;
		this.status=status;
		this.number=null;
	}
	public Integer getIdRoulette() {
		return idRoulette;
	}
	public void setIdRoulette(Integer idRoulette) {
		this.idRoulette = idRoulette;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public int generatorNumber(){
		number= (int) (Math.random()*35+1);
		return number;
	}
}

