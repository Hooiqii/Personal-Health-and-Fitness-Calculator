/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.basicCalc;

import java.time.LocalDate;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.soap.SOAPException;
import javax.xml.ws.soap.SOAPFaultException;

/**
 *
 * @author Asus
 */
@WebService(serviceName = "WS_ProjectServer")
public class WS_ProjectServer {

    /**
     * Web service operation
     * @param weight
     * @param height
     * @return 
     */
    @WebMethod(operationName = "calc_bmi")
    public String calc_bmi(@WebParam(name = "weight") float weight, @WebParam(name = "height") float height) throws SOAPFaultException {
        //TODO write your implementation code here:
        if (weight <= 0 || height <= 0) {
            throw createSOAPFaultException("Invalid weight or height. Please provide positive values.");
        }
        height = height/100;
        float bmi = weight/(height*height);
        String formattedBmi = String.format("%.2f", bmi);
        return formattedBmi;
    }
    private SOAPFaultException createSOAPFaultException(String message) {
        try {
            javax.xml.soap.SOAPFault soapFault = javax.xml.soap.SOAPFactory.newInstance().createFault();
            soapFault.setFaultString(message);
            return new SOAPFaultException(soapFault);
        } catch (SOAPException ex) {
            throw new RuntimeException("Failed to create SOAPFaultException.", ex);
        }
    }

    /**
     * Web service operation
     * @param ic
     * @return 
     * @throws com.basicCalc.NotValidIcNumberException 
     */
    @WebMethod(operationName = "age")
    public int age(String ic)throws NotValidIcNumberException {
        //TODO write your implementation code here:
        if(ic.length() == 12) {
       
            int currrentYear = LocalDate.now().getYear();
            int birthYear = 0;

            if (ic.substring(0, 1).compareTo("3") >= 0 && ic.substring(0, 1).compareTo("9") <= 0) {
                birthYear = Integer.parseInt("19" + ic.substring(0, 2));
            } 
            else if (ic.substring(0, 1).compareTo("0")>=0 && ic.substring(0,1).compareTo("2")<=0) {
                birthYear = Integer.parseInt("20" + ic.substring(0, 2));
            }
            int currentAge = currrentYear - birthYear;
            return currentAge;
        } 
        else 
        {
            throw new NotValidIcNumberException();
        }
    }
    
    @WebMethod(operationName = "cbr")
    public String cbr(@WebParam(name = "ic") String ic, @WebParam(name = "weight") float weight, @WebParam(name = "height") float height, @WebParam(name = "gender") String gender, @WebParam(name = "activity") String activity) throws SOAPFaultException, NotValidIcNumberException {
    float BMR, rate = 0;
    
    if (weight <= 0 || height <= 0) {
        throw createSOAPFaultException("Invalid weight or height. Please provide positive values.");
    }
    
    if (gender.equals("Male")) {
        int age = this.age(ic);

        BMR = (float) (66 + (6.2 * weight * 2.2) + (12.7 * height / 2.54) - (6.76 * age));

        if (activity.equals("Little or no exercise")) {
            rate = (float) (BMR * 1.2);
        } else if (activity.equals("Light exercise 1-3 days a week")) {
            rate = (float) (BMR * 1.37);
        } else if (activity.equals("Moderate exercise 3-5 days a week")) {
            rate = (float) (BMR * 1.55);
        } else if (activity.equals("Hard exercise 6-7 days a week")) {
            rate = (float) (BMR * 1.725);
        } else if (activity.equals("Intense exercise or physical job")) {
            rate = (float) (BMR * 1.9);
        } else {
            return "Please select activity level";
        }

    } else if (gender.equals("Female")) {
        int age = this.age(ic);

        BMR = (float) (655.1 + (4.35 * weight * 2.2) + (4.7 * height / 2.54) - (4.7 * age));

        if (activity.equals("Little or no exercise")) {
            rate = (float) (BMR * 1.2);
        } else if (activity.equals("Light exercise 1-3 days a week")) {
            rate = (float) (BMR * 1.37);
        } else if (activity.equals("Moderate exercise 3-5 days a week")) {
            rate = (float) (BMR * 1.55);
        } else if (activity.equals("Hard exercise 6-7 days a week")) {
            rate = (float) (BMR * 1.725);
        } else if (activity.equals("Intense exercise or physical job")) {
            rate = (float) (BMR * 1.9);
        } else {
            return ("Please select activity level");
        }
    } else {
        return ("Please select gender");
    }
    
    String formattedCbr = String.format("Calorie Burn Rate = %.2f", rate);
    return formattedCbr;
}

  /**
     * Web service operation
     * @param weight
     * @param height
     * @param waist
     * @return 
     */
    @WebMethod(operationName = "absi")
    public String absi(@WebParam(name = "weight") float weight, @WebParam(name = "height") float height, @WebParam(name = "waist") float waist) throws SOAPFaultException{
        //TODO write your implementation code here:
         if (weight <= 0 || height <= 0 || waist <= 0) {
            throw createSOAPFaultException("Invalid weight, height or waist. Please provide positive values.");
        }
        height = height/100;
        waist = waist/100;
        float bmi = weight/(height*height);
        float res;
        res =  (float) (waist /  (Math.pow(bmi, 2.0 / 3.0) * Math.pow(height, 1.0 / 2.0)));
        String formattedAbsi = String.format("%.2f", res);
        return formattedAbsi;
    }
    
    /**
 * Web service operation
     * @param height
     * @param waist
     * @param neck
     * @param hip
     * @param gender
     * @return 
 */
@WebMethod(operationName = "getBFPCalc")
public String getBFPCalc(@WebParam(name = "height") float height, @WebParam(name = "waist") float waist, 
        @WebParam(name = "neck") float neck, @WebParam(name = "hip") float hip, java.lang.String gender)throws SOAPFaultException {
    //TODO write your implementation code here:
    if (waist <= 0 || neck <= 0 ||  hip <= 0 || height <= 0) {
        throw createSOAPFaultException("Invalid waist, neck, hip or height. Please provide positive values.");
    }
        
    else if(gender.equals("Male"))
    {
        float bfp;
        bfp=(float) (495/(1.0324-0.19077*Math.log10(waist-neck)+0.15456*Math.log10(height)))-450;
        
        String formattedBfp = String.format("%.2f", bfp);
        return formattedBfp;
    }
    
    else if (gender.equals("Female"))
    {
        float bfp;
        bfp=(float) (495/(1.29579-0.35004*Math.log10(waist+hip-neck)+0.22100*Math.log10(height)))-450; 
        String formattedBfp = String.format("%.2f", bfp);
        return formattedBfp;
    }
    else{
        return ("Please select gender");
    }
}
}

