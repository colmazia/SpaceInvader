package model;

public class GreenShip extends SHIP {

	public GreenShip() {
		super("view/resources/shipchooser/green_ship.png", "view/resources/shipchooser/playerLife1_green.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getShipSpeedFactor() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String getShipInfo() {
		// TODO Auto-generated method stub
		return "Fast but\nLow HP";
	}

}