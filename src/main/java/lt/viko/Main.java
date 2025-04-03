package lt.viko;



public class Main {
    public static void main(String[] args) {

        JettyServer jettyServer = new JettyServer();
        try{
            jettyServer.start();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}