package co.simplon.recall;

public class TestPerso2 {

	public static void main(String[] args) {
		System.out.println(convertToCelsius(55));
                }
	
	public static int convertToCelsius(int temperature) {
		//Il ne faut pas de , (donc ni 1,8 ni 9/5)
		/*int degresCelciusStep1 = (temperature - 32);
		int degresCelciusStep2 = 9;
		int degresCelciusStep3 = 5;
		int degresCelciusStep4 = degresCelciusStep1 / (degresCelciusStep2 / degresCelciusStep3);

		return degresCelciusStep4;*/
			//double t = (double) temperature;
		//System.out.println(t);
			//return (int) Math.round(((t - 32)* 5) / 9);
		double t = (double)temperature;
		double degresCelcius = ((t - 32)* 5) / 9;
		
		return (int)Math.round(degresCelcius);
		
	}
      
}