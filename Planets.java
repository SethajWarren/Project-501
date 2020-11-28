/********************************************************
* This file holds Planet class and the attibutes and
* behavior of the planets in the game.
********************************************************/

class Planet
{
	/*
	Planet Biome Key:
		0 = forest
		1 = city/metropolitan
		2 = snow
		3 = desert
		4 = ocean
		5 = lava
		
	Planet Size Scale
		0 = moon
		1 = small
		2 = med
		3 = large
	*/
	
	private int size;
	private int biome;
	
	void Planet()
	{
		size = 0;
		biome = 0;
	}
	
	void setSize(int data)
	{
		size = data;
	}
	
	int getSize()
	{
		return size;
	}
	
	void setBiome(int data)
	{
		biome = data;
	}
	
	int getBiome()
	{
		return biome;
	}
}
		