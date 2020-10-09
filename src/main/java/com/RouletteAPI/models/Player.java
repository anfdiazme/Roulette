package com.RouletteAPI.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Player {
	@Id
	private Integer idRoulette ; 
	private Integer Idplayer;
	private Integer money;
	private String Bet;
	private String status = "Open" ; 
	public Integer getIdRoulette() {
		return this.idRoulette;
	}
	public void setIdRoulette(Integer idRoulette) {
		this.idRoulette = idRoulette;
	}
	public Integer getIdplayer() {
		return Idplayer;
	}
	public void setIdplayer(Integer idplayer) {
		Idplayer = idplayer;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public String getBet() {
		return Bet;
	}
	public void setBet(String bet) {
		Bet = bet;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void calculatorPrice ( int number ) {
		String numbers = String.valueOf(number);
		if(numbers.equals(this.Bet))  {
			this.money = this.money * 5 ; 
		}
		else if ( this.Bet.equals(( "red" ) )  && number % 2==0 ) {
			this.money = (int) (this.money * 1.8) ; 
		}
		else if ( this.Bet.equals(( "black" ) ) && number % 2 == 1 ) {
			this.money = (int) (this.money * 1.8) ;
		}
		else this.money = 0 ;	
	}
}
