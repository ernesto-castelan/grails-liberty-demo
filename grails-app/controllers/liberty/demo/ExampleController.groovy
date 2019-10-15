package liberty.demo

class ExampleController {
    static allowedMethods = [hello:'GET']

    def hello() {
        render "hello"
    }
}
