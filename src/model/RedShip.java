package model;

public class RedShip extends SHIP {

	public RedShip() {
		super("view/resources/shipchooser/red_ship.png", "view/resources/shipchooser/playerLife1_red.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getShipSpeedFactor() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getShipInfo() {
		// TODO Auto-generated method stub
		return "High HP\nbut slow";
	}

}