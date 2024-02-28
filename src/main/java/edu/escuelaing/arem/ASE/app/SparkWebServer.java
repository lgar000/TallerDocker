package edu.escuelaing.arem.ASE.app;


import java.io.File;
import java.io.FileInputStream;

import static spark.Spark.*;

public class SparkWebServer {

    public static void main(String... args){



        port(getPort());
        staticFileLocation("/public");


        // matches "GET /hello/foo" and "GET /hello/bar"
        // request.params(":name") is 'foo' or 'bar'
        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });

       get("/cos/:number", (request, response) -> {
            String number= request.params(":number");
            double numberDouble= Double.valueOf(number);
            double operation= Math.cos(Math.toRadians(numberDouble));
            return "The cos is: " + operation;

        });



        get("/sin/:number", (request, response) -> {
            String number= request.params(":number");
            double numberDouble= Double.valueOf(number);
            double operation= Math.sin(Math.toRadians(numberDouble));
            return "The sin is: " + operation;

        });


        get("/palindrome/:palabra", (request, response) -> {
            boolean isPalindrome=false;
            String word= request.params(":palabra");
            String invertedWord = "";
            for (int x = word.length() - 1; x >= 0; x--)
                invertedWord= invertedWord+ word.charAt(x);
            if(invertedWord.equals(word)){
                isPalindrome=true;
            }
            return "The word is palindrome: " + isPalindrome;

        });

        get("/vector/:numberOne/:numberTwo", (request, response) -> {
            double sum= Math.pow(Double.valueOf(request.params(":numberOne")), 2)+Math.pow( Double.valueOf(request.params("numberTwo")),2);
            double sumRoot= Math.sqrt(sum);
            return "the magnitude of the vector is: "+ sumRoot;

        });



    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}