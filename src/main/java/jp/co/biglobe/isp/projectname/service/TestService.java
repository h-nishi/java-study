package jp.co.biglobe.isp.projectname.service;

import jp.co.biglobe.isp.projectname.domain.TestRepository;
import jp.co.biglobe.isp.projectname.domain.TestRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    //    @Qualifier("testRepositoryJava")
    @Autowired
    TestRepository testRepository;

    @Autowired
    TestRepository2 testRepository2;

//    @Autowired
//    public TestService(    
//            TestRepository testRepository,
//            TestRepository2 testRepository2
//    ){
//        this.testRepository = testRepository;
//        this.testRepository2 = testRepository2;
//    }

    public String getValue() {
        return testRepository.getValue();
    }

    public String getValue2() {
        return testRepository2.getValue();
    }

}
