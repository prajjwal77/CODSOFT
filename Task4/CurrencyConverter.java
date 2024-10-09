package Task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CurrencyConverter {

	private static final String API_URL ="https://api.exchangerate-api.com/v4/latest/";
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Base Currency (e.g.,USD): ");
		String baseCurrency =scanner.nextLine().toUpperCase();
		
		System.out.println("Enter Target Currency (e.g., INR): ");
		String targetCurrency =scanner.nextLine().toUpperCase();
		
		System.out.println("Enter the amount to convert : ");
		double amount = scanner.nextDouble();
		
		try {
			double rate = getExchangeRate(baseCurrency ,targetCurrency);
			double convertedAmount =amount*rate;
			System.out.printf("Converted Amount :%.2f %s\n",convertedAmount,targetCurrency);
			
		}catch(Exception e) {
			 System.out.println("Error fetching exchange rate.");
			 
		}
		scanner.close();
	}
	private static double getExchangeRate(String baseCurrency, String targetCurrency)throws Exception {
		URL url =new URL(API_URL + baseCurrency);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        String json = response.toString();
        int index = json.indexOf(targetCurrency);
        if (index == -1) throw new Exception("Currency not found.");
        int start = json.indexOf(":", index) + 1;
        int end = json.indexOf(",", start);
        return Double.parseDouble(json.substring(start, end));
	}
}