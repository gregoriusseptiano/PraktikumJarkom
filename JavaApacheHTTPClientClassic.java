// /** 
//  * 
//  * Blocking I/O 
//  */ 
 
// import java.io.BufferedReader; 
// import java.io.IOException; 
// import java.io.InputStreamReader; 
// import org.apache.hc.client5.http.classic.methods.HttpGet; 
// import org.apache.hc.client5.http.impl.classic.CloseableHttpClient; 
// import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse; 
// import org.apache.hc.client5.http.impl.classic.HttpClients; 
// import org.apache.hc.core5.http.HttpEntity; 
 
 
// public class JavaApacheHTTPClientClassic { 
//  public static void main(String[] args) throws IOException { 
//         try (CloseableHttpClient httpclient = HttpClients.createDefault()) { 
//             HttpGet httpget = new HttpGet("http://example.com"); 
//             try (CloseableHttpResponse response = httpclient.execute(httpget)) { 
//                 HttpEntity entity = response.getEntity(); 
 
//                 if (entity != null) { 
//                     BufferedReader rd = new BufferedReader(new 
// InputStreamReader(entity.getContent())); 
//                     String line; 
//                     while ((line = rd.readLine()) != null) { 
//                         System.out.println(line); 
//                     } 
//                     rd.close(); 
//                 } 
//             } 

// /** 
// * 
// * Non Blocking I/O 
// */ 
// import java.util.concurrent.Future; 
// import org.apache.hc.client5.http.async.methods.SimpleHttpRequest; 
// import org.apache.hc.client5.http.async.methods.SimpleHttpResponse; 
// import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient; 
// import org.apache.hc.client5.http.impl.async.HttpAsyncClients; 
// public class JavaApacheHTTPClientReactive{ 
// public static void main(String[] args) throws IOException { 
// // Membuat HTTP async client 
// try (CloseableHttpAsyncClient client = HttpAsyncClients.createDefault()) { 
// client.start(); 
// // Membuat permintaan GET ke example.com 
// SimpleHttpRequest request = SimpleHttpRequest.create("GET", 
// "http://example.com"); 
// // Mengeksekusi request secara asynchronous dan menunggu hasilnya 
// Future<SimpleHttpResponse> future = client.execute(request, null); 
// // Mendapatkan response 
// SimpleHttpResponse response = future.get(); 