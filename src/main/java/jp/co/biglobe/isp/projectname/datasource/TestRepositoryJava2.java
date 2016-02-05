package jp.co.biglobe.isp.projectname.datasource;

import jp.co.biglobe.isp.projectname.domain.TestRepository2;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryJava2 implements TestRepository2 {

    @Override
    public String getValue() {
        return "hoge hoge";
    }
}
