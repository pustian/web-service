package service;

import javax.jws.WebService;

@WebService
public class PhoneAddressImpl implements PhoneAddress {
    @Override
    public String getMobileCodeInfo(String phoneNo, String userId) {
        return "北级茨村";
    }
}
