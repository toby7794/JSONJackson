package com.spartaglobal.tlg.JSONJackson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RatesDeserialiser ratesDeserialiser = new RatesDeserialiser("resources/rates.json");
        System.out.println(ratesDeserialiser.ratesMappedDTO.isSuccess());
        System.out.println(ratesDeserialiser.ratesMappedDTO.getRates("BOB"));
    }
}
