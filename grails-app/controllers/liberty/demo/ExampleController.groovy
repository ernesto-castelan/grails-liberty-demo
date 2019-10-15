package liberty.demo

import grails.plugin.springsecurity.annotation.Secured

class ExampleController {
    static allowedMethods = [hello:'GET', secure:'GET']

    def hello() {
        render "hello"
    }

    @Secured('ROLE_PARENT')
    def secure() {
        render "secure"
    }
}
