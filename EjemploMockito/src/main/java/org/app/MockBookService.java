package org.app;

public class MockBookService implements BookService {


    @Override
    public String search(int isbn) {
        if (isbn==1234) {
            return BookConst.ESM;
        }
        return BookConst.NULLBOOK;
    }
}
