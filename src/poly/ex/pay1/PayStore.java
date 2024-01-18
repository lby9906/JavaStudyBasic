package poly.ex.pay1;

public abstract class PayStore {

    //변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
                return new KakaoPay();
        } else if (option.equals("naver")) {
                return new Naverpay();
        }else if (option.equals("new")) {
            return new Newpay();
        }else {
                return new DefaultPay();
        }
    }
}
