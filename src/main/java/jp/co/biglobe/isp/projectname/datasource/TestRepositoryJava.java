package jp.co.biglobe.isp.projectname.datasource;

import jp.co.biglobe.isp.projectname.domain.TestRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryJava implements TestRepository {
    @Override
    public String getValue() {
        return "hoge";
    }
}
