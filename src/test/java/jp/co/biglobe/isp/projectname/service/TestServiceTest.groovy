package jp.co.biglobe.isp.projectname.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
@WebAppConfiguration
@ContextConfiguration(locations = "classpath:context.xml")
class TestServiceTest extends Specification {

    @Autowired
    TestService sut;

    def "GetValue"() {
        expect:
        sut.getValue() == "hoge"
    }

    def "GetValue2"() {
        expect:
        sut.getValue2() == "hoge hoge"
    }


}
