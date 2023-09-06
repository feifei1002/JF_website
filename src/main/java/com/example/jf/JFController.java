package com.example.jf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JFController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getHomePageEn(){
        return "en/index-en";
    }

    @RequestMapping(value="/home-en", method = RequestMethod.GET)
    public String getHomePageEn2(){
        return "en/index-en";
    }

    @RequestMapping(value="/about-en", method = RequestMethod.GET)
    public String getAboutPageEn(){
        return "en/about-en";
    }

    @RequestMapping(value="/contact-en", method = RequestMethod.GET)
    public String getContactPageEn(){
        return "en/contact-en";
    }

    @RequestMapping(value="/products-en", method = RequestMethod.GET)
    public String getProductsPageEn(){
        return "en/products-en";
    }

    @RequestMapping(value="/asrs", method = RequestMethod.GET)
    public String getASRSPageEn(){
        return "products/asrs";
    }

    @RequestMapping(value="/boltless", method = RequestMethod.GET)
    public String getBoltlessPageEn(){
        return "products/boltless";
    }

    @RequestMapping(value="/cantilever", method = RequestMethod.GET)
    public String getCantileverPageEn(){
        return "products/cantilever";
    }

    @RequestMapping(value="/doubledeep", method = RequestMethod.GET)
    public String getDoubleDeepPageEn(){
        return "products/doubledeep";
    }

    @RequestMapping(value="/drivein", method = RequestMethod.GET)
    public String getDriveinPageEn(){
        return "products/drivein";
    }

    @RequestMapping(value="/livestorage", method = RequestMethod.GET)
    public String getLiveStoragePageEn(){
        return "products/livestorage";
    }

    @RequestMapping(value="/mezzanine", method = RequestMethod.GET)
    public String getMezzaninePageEn(){
        return "products/mezzanine";
    }

    @RequestMapping(value="/mobile", method = RequestMethod.GET)
    public String getMobilePageEn(){
        return "products/mobile";
    }

    @RequestMapping(value="/mobileshelving", method = RequestMethod.GET)
    public String getMobileShelvingPageEn(){
        return "products/mobileshelving";
    }

    @RequestMapping(value="/narrowaisle", method = RequestMethod.GET)
    public String getNarrowAislePageEn(){
        return "products/narrowaisle";
    }

    @RequestMapping(value="/platform", method = RequestMethod.GET)
    public String getPlatformPageEn(){
        return "products/platform";
    }

    @RequestMapping(value="/pushback", method = RequestMethod.GET)
    public String getPushbackPageEn(){
        return "products/pushback";
    }

    @RequestMapping(value="/selective", method = RequestMethod.GET)
    public String getSelectivePageEn(){
        return "products/selective";
    }

    @RequestMapping(value="/shuttle", method = RequestMethod.GET)
    public String getShuttlePageEn(){
        return "products/shuttle";
    }

    @RequestMapping(value="/home-vn", method = RequestMethod.GET)
    public String getHomePageVn(){
        return "vn/index-vn";
    }

    @RequestMapping(value="/about-vn", method = RequestMethod.GET)
    public String getAboutPageVn(){
        return "vn/about-vn";
    }

    @RequestMapping(value="/contact-vn", method = RequestMethod.GET)
    public String getContactPageVn(){
        return "vn/contact-vn";
    }

    @RequestMapping(value="/products-vn", method = RequestMethod.GET)
    public String getProductsPageVn(){
        return "vn/products-vn";
    }

    @RequestMapping(value="/asrs-vn", method = RequestMethod.GET)
    public String getASRSPageVn(){
        return "products-vn/asrs-vn";
    }

    @RequestMapping(value="/boltless-vn", method = RequestMethod.GET)
    public String getBoltlessPageVn(){
        return "products-vn/boltless-vn";
    }

    @RequestMapping(value="/cantilever-vn", method = RequestMethod.GET)
    public String getCantileverPageVn(){
        return "products-vn/cantilever-vn";
    }

    @RequestMapping(value="/doubledeep-vn", method = RequestMethod.GET)
    public String getDoubleDeepPageVn(){
        return "products-vn/doubledeep-vn";
    }

    @RequestMapping(value="/drivein-vn", method = RequestMethod.GET)
    public String getDriveinPageVn(){
        return "products-vn/drivein-vn";
    }

    @RequestMapping(value="/livestorage-vn", method = RequestMethod.GET)
    public String getLiveStoragePageVn(){
        return "products-vn/livestorage-vn";
    }

    @RequestMapping(value="/mezzanine-vn", method = RequestMethod.GET)
    public String getMezzaninePageVn(){
        return "products-vn/mezzanine-vn";
    }

    @RequestMapping(value="/mobile-vn", method = RequestMethod.GET)
    public String getMobilePageVn(){
        return "products-vn/mobile-vn";
    }

    @RequestMapping(value="/mobileshelving-vn", method = RequestMethod.GET)
    public String getMobileShelvingPageVn(){
        return "products-vn/mobileshelving-vn";
    }

    @RequestMapping(value="/narrowaisle-vn", method = RequestMethod.GET)
    public String getNarrowAislePageVn(){
        return "products-vn/narrowaisle-vn";
    }

    @RequestMapping(value="/platform-vn", method = RequestMethod.GET)
    public String getPlatformPageVn(){
        return "products-vn/platform-vn";
    }

    @RequestMapping(value="/pushback-vn", method = RequestMethod.GET)
    public String getPushbackPageVn(){
        return "products-vn/pushback-vn";
    }

    @RequestMapping(value="/selective-vn", method = RequestMethod.GET)
    public String getSelectivePageVn(){
        return "products-vn/selective-vn";
    }

    @RequestMapping(value="/shuttle-vn", method = RequestMethod.GET)
    public String getShuttlePageVn(){
        return "products-vn/shuttle-vn";
    }

    @RequestMapping(value="/home-zh", method = RequestMethod.GET)
    public String getHomePageZh(){
        return "zh/index-zh";
    }

    @RequestMapping(value="/about-zh", method = RequestMethod.GET)
    public String getAboutPageZh(){
        return "zh/about-zh";
    }

    @RequestMapping(value="/contact-zh", method = RequestMethod.GET)
    public String getContactPageZh(){
        return "zh/contact-zh";
    }

    @RequestMapping(value="/products-zh", method = RequestMethod.GET)
    public String getProductsPageZh(){
        return "zh/products-zh";
    }
}
