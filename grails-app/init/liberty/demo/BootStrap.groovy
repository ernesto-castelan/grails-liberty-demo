package liberty.demo

class BootStrap {

    def init = { servletContext ->
        if (Role.count() == 0) {
            new Role(authority:'ROLE_PARENT').save(flush:true, failOnError:true)
            new Role(authority:'ROLE_CHILD').save(flush:true, failOnError:true)
        }

        if (User.count() == 0) {
            new User(username:'parent', password:'demopassword').save(flush:true, failOnError:true)
            UserRole.create(User.first(), Role.first(), true)
        }
    }

    def destroy = { }
}
