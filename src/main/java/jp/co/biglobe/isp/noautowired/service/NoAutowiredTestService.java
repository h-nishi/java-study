package jp.co.biglobe.isp.noautowired.service;

import jp.co.biglobe.isp.noautowired.datasource.NoAutowiredTestRepositoryJava;
import jp.co.biglobe.isp.noautowired.datasource.NoAutowiredTestRepositoryJava2;
import jp.co.biglobe.isp.noautowired.domain.NoAutowiredTestRepository;
import jp.co.biglobe.isp.noautowired.domain.NoAutowiredTestRepository2;

public class NoAutowiredTestService {

    NoAutowiredTestRepository testRepository = new NoAutowiredTestRepositoryJava();

    NoAutowiredTestRepository2 testRepository2 = new NoAutowiredTestRepositoryJava2();

    public String getValue() {
        return testRepository.getValue();
    }
    
    public String getValue2() {
        return testRepository2.getValue();
    }

}
