
import java.io.*;
import java.net.*;

public class urlFetch {

	public static void getHTML(String urlToRead) throws Exception {
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		String result = "";
		while ((line = rd.readLine()) != null) {
			//System.out.println(line);
			result += line;
		}
		rd.close();
		System.out.println(result);
		//JSONObject obj = new JSONObject(str);
		
		return;
	}

	public static void main(String[] args) {
		String urlStr = "https://jsonmock.hackerrank.com/api/movies/search/?Title=spider&page=1";
		urlFetch uf = new urlFetch();
		try {
			uf.getHTML(urlStr);
		} catch (Exception e) {

		}
	}
}