package liberty.demo

class UrlMappings {

    static mappings = {
        "/hello"    (controller:'example', action:'hello')

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
