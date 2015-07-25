package service.demo;

/**
 * Created by mi on 7/24/15.
 */

import org.apache.thrift.TException;

public class HelloServiceImpl implements Hello.Iface {
    @Override
    public boolean helloBoolean(boolean para) throws TException {
        System.out.printf("hello true/false");
        return para;
    }

    @Override
    public int helloInt(int para) throws TException {
        System.out.println("hello times: " + para);
        return para;
    }

    @Override
    public String helloNull() throws TException {
        System.out.println("hello null");
        return null;
    }

    @Override
    public String helloString(String para) throws TException {
        System.out.println("hello " + para);
        return para;
    }

    @Override
    public void helloVoid() throws TException {
        System.out.println("Hello World");
    }
}
