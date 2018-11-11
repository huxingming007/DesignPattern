package com.xavier.design.pattern.adapter.complex.demo2;

/**
 * @author huxingming
 * @date 2018/11/7-上午9:50
 * @Description TODO
 */
public class Client {


    public static void main(String[] args) {

        Power5VAdapter power5VAdapter = new Power5VAdapter(new AC220());

        int i = power5VAdapter.output5V();
        System.out.println(i);


//        DCOutput powerAdapter = () -> {
//            int ii = new AC220().output220v();
//            return ii / 44;
//        };


        PowerAdapter powerAdapter = new PowerAdapter(new AC220()) {
            @Override
            public int output5V() {
                return super.output5V()/44;
            }
        };

        int i1 = powerAdapter.output5V();
        System.out.println(i1);
    }
}
