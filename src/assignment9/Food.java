package assignment9;

import java.awt.Color;
import java.util.Random;

import edu.princeton.cs.introcs.StdDraw;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	private double x, y;
	
	/**
	 * Creates a new Food at a random location
	 */
	public Food() {
		Random rand = new Random();
		this.x = rand.nextDouble() * (1.0 - FOOD_SIZE) + FOOD_SIZE / 2;
		this.y = rand.nextDouble() * (1.0 - FOOD_SIZE) + FOOD_SIZE / 2;
	}
	
	/**
	 * Draws the Food
	 */
	public void draw() {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(x, y, FOOD_SIZE / 2);
	}
	
	public double getX() { 
		return x;
	}
	
	public double getY() { 
		return y; 
	}	
}
