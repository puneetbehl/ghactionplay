package com.objectcomputing.example

import spock.lang.Specification

class CanarySpec extends Specification {

    void "test 1 == 2"() {
        expect:
        1 == 2
    }
}
