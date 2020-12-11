package com.objectcomputing.example

import spock.lang.Specification

class CanarySpec extends Specification {

    void "test 1 == 1"() {
        expect:
        1 == 1
    }
}
