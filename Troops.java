/********************************************************
* This file holds Troop class and the attibutes and
* behavior of the planets in the game.
********************************************************/

class Troop
{
	/*
	Troop Type Key:
		0 = Untrained
		1 = Infantry
		2 = Officer
		3 = Small Vehicle
		4 = Large Vehicle
		
	Troop Weapon Key:
		0 = melee
		1 = small arms
		2 = heavy arms
		3 = explosive
	*/
	
	private int type;
	private int weap;
	
	void Troop()
	{
		type = 0;
		weap = 0;
	}
	
	void setType(int data)
	{
		type = data;
	}
	
	int getType()
	{
		return type;
	}
	
	void setWeap(int data)
	{
		weap = data;
	}
	
	int getType()
	{
		return weap;
	}
	