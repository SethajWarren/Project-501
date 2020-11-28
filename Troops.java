/********************************************************
* This file holds Troop class and the attibutes and
* behavior of the planets in the game.
********************************************************/

/*
Unit Type Key:
	0 = Untrained
	1 = Infantry
	2 = Officer
	3 = Small Vehicle
	4 = Large Vehicle
		
Unit Weapon Key:
	0 = melee
	1 = small arms
	2 = heavy arms
	3 = artillery
	4 = explosive
	
Unit training key:
	0 = untrained
	1 = trained
	2 = skilled
	3 = specialist
*/

class Unit
{
	
	private int type;
	private int weap;
	private int train;
	
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

	void setTrain(int data)
	{
		train = data;
	}
	
	int getTrain()
	{
		return train;
	}
}

class Trooper
{
	private Unit trooper;
	
	void Trooper()
	{
		trooper = new Unit();
		
		trooper.setTrain(0);
		trooper.setType(1);
		trooper.setWeap(1);
	}
}

class Tank
{
	private Unit tank;
	
	void Tank()
	{
		tank = new Unit();
		
		tank.setTrain(0);
		tank.setType(3);
		tank.setWeap(4);
	}
}

class Walker
{
	
	private Unit walker;
	
	
	void Walker()
	{
		walker = new Walker();
		
		walker.setTrain(0);
		walker.setType(4);
		walker.setWeap(3);
	}
}

