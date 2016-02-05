package jp.co.biglobe.isp.noautowired.datasource;

import jp.co.biglobe.isp.noautowired.domain.NoAutowiredTestRepository;

public class NoAutowiredTestRepositoryJava implements NoAutowiredTestRepository {
    @Override
    public String getValue() {
        return "hoge";
    }
}
