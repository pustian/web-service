package pustian;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;
import cn.com.webxml.ArrayOfString;
import java.util.Scanner;
import java.util.List;

public class PhoneAddressClient {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        boolean isPhoneNo = true;

//        System.out.println("Phone Database Info");
//        List<String> arrayOfString = getDataBaseInfo();
//        for(int i=0; i<arrayOfString.size(); ++i) {
//            System.out.println("i="+i+"  " + arrayOfString.get(i));
//        }
//
        System.out.print("Input PhoneNo=");
        String phoneNo = sc.next();
        if(isPhoneNo) {
            String phoenAddr = getPhoneAddress(phoneNo);
            System.out.println("PhoneNo="+phoneNo+" Address=" + phoenAddr);
        }
    }

    public static String getPhoneAddress(String phoneNo) {
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();
        return mobileCodeWSSoap.getMobileCodeInfo(phoneNo, "");
    }

//    public static List<String> getDataBaseInfo() {
//        MobileCodeWS mobileCodeWS = new MobileCodeWS();
//        MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();
//        ArrayOfString arrayOfString = mobileCodeWSSoap.getDatabaseInfo();
//        return arrayOfString.getString();
//        
//    }
}
