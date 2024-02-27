package edu.escuelaing.arem.ASE.app;


import static spark.Spark.get;
import static spark.Spark.port;

public class SparkWebServer {

    public static void main(String... args){
        port(getPort());
        get("hello", (req,res) -> "Hello Docker!");

        // matches "GET /hello/foo" and "GET /hello/bar"
        // request.params(":name") is 'foo' or 'bar'
        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });

        get("/cos/:number", (request, response) -> {
            String number= request.params(":number");
            double numberDouble= Double.valueOf(number);
            System.out.println(numberDouble);
            double operation= Math.cos(Math.toRadians(numberDouble));

            return "The cos is: " + operation;

        });

        get("/sin/:number", (request, response) -> {
            String number= request.params(":number");
            double numberDouble= Double.valueOf(number);
            System.out.println(numberDouble);
            double operation= Math.sin(Math.toRadians(numberDouble));
            return "The sin is: " + operation;

        });


        get("/palindromo/:palabra", (request, response) -> {
            boolean esPalindromo=false;
            String palabraR= request.params(":palabra");
            String cadenaInvertida = "";
            for (int x = palabraR.length() - 1; x >= 0; x--)
                cadenaInvertida = cadenaInvertida + palabraR.charAt(x);
            if(cadenaInvertida.equals(palabraR)){
                esPalindromo=true;
            }
            return "La palabra es palindromo: " + esPalindromo;

        });

        get("/palindromo/:palabra", (request, response) -> {

            return "La palabra es palindromo: ";

        });



    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}