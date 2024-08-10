package com.example;

import org.aeonbits.owner.Config;
import com.example.converter.StringToBrowserTypeConverter;
import com.example.enumber.BrowserType;

@Config.Sources({
    "system:properties",
    "system:env",
    "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}
