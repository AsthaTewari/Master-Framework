package com.example.converter;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.example.enumber.BrowserType;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {

    @Override       
    public BrowserType convert(Method method, String browserName) {
       
        Map<String, BrowserType> stringBrowserTypeMap =  Map.of("CHROME", BrowserType.CHROME, "Edge", BrowserType.EDGE);
       
        // return BrowserType.valueOf(browserName.toUpperCase());
    
        return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
    }

}
