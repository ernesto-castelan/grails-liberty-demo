package liberty.demo

class UrlMappings {

    static mappings = {
        "/hello"    (controller:'example', action:'hello')
        "/secure"   (controller:'example', action:'secure')

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
