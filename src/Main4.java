import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//import java.io.IOException;

public class Main4 {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello World!");
        int  i = 0 ;
        while(true){
            i++;
            String  strUrl="http://222.143.34.13:8088/omp/index?parentMenuId=8a929b3f5f4c98ca015f4c9f331d0001"  ;
            URL url = new URL(strUrl);
            URLConnection conn = url.openConnection();

            //使用代理服务器
          //  System.getProperties().setProperty("proxySet", "true");
            //代理服务器地址
          //  System.getProperties().setProperty("http.proxyHost", "117.21.191.151");
            //代理端口
           // System.getProperties().setProperty("http.proxyPort", "49862");
            // Document doc = Jsoup.connect("http://www.baidu.com").get();


         BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String  ss = null;
            while ((ss=rd.readLine())!=null)
            {
                System.out.println(ss);
            }
            rd.close();
            System.out.println("Hello World!"+i);
        }


    }
}
