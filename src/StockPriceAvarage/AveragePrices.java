/**
 * AveragePrices.java
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * Created on 8:06:36 PM
 */
package StockPriceAvarage;

import java.util.ArrayDeque;
import java.util.Queue;

public class AveragePrices {

	
	
	
	public static double getRandomNumber() {
	    return  (double)((Math.random() * (5-1)) + 1);
	}
	static double average = 0.0;
	static double sum = 0.0;
	static Queue<Double> queue = new ArrayDeque<Double>();
	public static double calculateAverage(double price) {
		
			queue.add(price);
			sum+=price;
			return average=sum/queue.size();
			
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
	
		Long currentTime = System.currentTimeMillis(); 
		Long getAverageForMinutes=currentTime+(1*60);
		
		while(currentTime<=getAverageForMinutes){
			System.out.println("Average at "+System.currentTimeMillis() +":"+calculateAverage(getRandomNumber()));
			Thread.sleep(1000);	
	}
		
		

	}

}
