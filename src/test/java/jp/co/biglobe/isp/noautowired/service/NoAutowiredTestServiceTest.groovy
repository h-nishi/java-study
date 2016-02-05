package jp.co.biglobe.isp.noautowired.service

import spock.lang.Specification
 
class NoAutowiredTestServiceTest extends Specification {

    NoAutowiredTestService sut = new NoAutowiredTestService();

    def "GetValue"() {
        expect:
        sut.getValue() == "hoge"
    }

    def "GetValue2"() {
        expect:
        sut.getValue2() == "hoge hoge"
    }

}
