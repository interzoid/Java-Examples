import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;	
	
class GetCompanyMatchSimKey {
// Get API key at www.interzoid.com/register	

	public static void main(String[] args) {
		
		// create the request with the API end point and parameters
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://api.interzoid.com/getcompanymatchadvanced?company=IBM&algorithm=wide"))
				.header("content-type", "application/json")
				.header("x-api-key", "YOURAPIKEY")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		
		// initialize the response
		HttpResponse<String> response = null;
		
		// use the client to send the request
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// print the response to the console
		System.out.println(response.body());
	}

}
