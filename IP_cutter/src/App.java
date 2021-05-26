public class App {
    public static void main(String[] args) throws Exception {
        String ip = "192.168.1.11";
        String[] x = ip.split("\\.");
        for (String i : x){
            System.out.println(i);
        }
    }
}
