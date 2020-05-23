package UpcastingAndDownCasting;

public class Runner
{
	public static void main(String[] args)
	{
		Cat cat = new BabyCat();
		cat.catFun();
		Animal an = (Animal) cat;
		an.aniFun();
		Cat ca = cat;
		BabyCat b = (BabyCat) new Cat();		
	}
}
