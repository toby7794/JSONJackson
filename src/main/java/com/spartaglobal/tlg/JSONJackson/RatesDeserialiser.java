package com.spartaglobal.tlg.JSONJackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class RatesDeserialiser {

    public RatesDTO ratesMappedDTO;

    public RatesDeserialiser(String FilePath){
        ObjectMapper ratesObject = new ObjectMapper();

        try{
            ratesMappedDTO = ratesObject.readValue(new File(FilePath), RatesDTO.class);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
