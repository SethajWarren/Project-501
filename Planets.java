/********************************************************
* This file holds the Planet class and the differnt
* planet classes along with the attibutes and behavior 
* of the planets in the game.
********************************************************/

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

Planet weather key:
	0 = clear
	1 = rain
	2 = fog
	3 = snow
*/

class Planet
{
	
	private int size;
	private int biome;
	private int weather;
	
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

	void setWeather (int data)
	{
		weather = data;
	}
	
	int getWeather()
	{
		return weather;
	}
}

class System
{
	private char control;
	private int temp;
	private Planet planet;
	
	void Tattoine()
	{
		control = 'N'
		temp = 50;
		planet = new Planet();
	}
	
	void setCont(char data)
	{
		control = data;
	}
	
	char getCont()
	{
		return control;
	}
	
	void setTemp(int data)
	{
		temp = data;
	}
}
		