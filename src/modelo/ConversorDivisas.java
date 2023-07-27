package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

import org.json.JSONException;
import org.json.JSONObject;

public class ConversorDivisas {
	
	public static String mensajeDivisa = "";
	public static double obtenerMoneda(String divOrigen, String divDestino, String cantidad) throws IOException {
				
		
		String apiUrl = "https://v6.exchangerate-api.com/v6/6f31fd77a1478468039bd7a1/pair/"+divOrigen+"/"+divDestino+"/"+cantidad;
		
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parsear la respuesta JSON
            JSONObject jsonResponse = null;
            double exchangeRate = 0;
			try {
				jsonResponse = new JSONObject(response.toString());
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Ingresa alguna cantidad");
				System.out.println("Error: "+ e.getMessage());
				
				
			}
			try {
				exchangeRate = jsonResponse.getDouble("conversion_result");
			} catch (JSONException e) {
				JOptionPane.showMessageDialog(null, "Ingresa alguna cantidad");
				System.out.println("Error: "+ e.getMessage());
			}
           
			
            return exchangeRate;
        } else {
        	JOptionPane.showMessageDialog(null, "No se puede realizar la conversión solicitada");
            throw new IOException("Error al obtener la tasa de cambio. Código de respuesta: " + responseCode);
            
        }
 }
//public static void main(String[] args) {
//	 try {
//         
//         double exchangeRate = obtenerMoneda("MXN","USD","3");
//         System.out.println("Tasa de cambio: " + exchangeRate);
//     } catch (IOException e) {
//         System.out.println("Error: " + e.getMessage());
//     }
//}
}
