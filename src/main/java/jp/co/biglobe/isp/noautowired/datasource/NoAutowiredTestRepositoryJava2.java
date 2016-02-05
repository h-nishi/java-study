package jp.co.biglobe.isp.noautowired.datasource;

import jp.co.biglobe.isp.noautowired.domain.NoAutowiredTestRepository2;

public class NoAutowiredTestRepositoryJava2 implements NoAutowiredTestRepository2 {

    @Override
    public String getValue() {
        return "hoge hoge";
    }
}
