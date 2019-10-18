package liberty.demo

class BootStrap {

    def init = { servletContext ->
        if (Role.count() == 0) {
            new Role(authority:'ROLE_PARENT').save(flush:true, failOnError:true)
            new Role(authority:'ROLE_CHILD').save(flush:true, failOnError:true)
        }

        if (User.count() == 0) {
            new User(username:'parent', password:'demopassword').save(flush:true, failOnError:true)
            new UserRole(user:User.first(), role:Role.first()).save(flush:true, failOnError:true)
            new AuthenticationToken(username:'parent',
                                    tokenValue:'tglss3t0u1lbn1ccuslj0lmtof65gi9l').save(flush:true, failOnError:true)
        }
    }

    def destroy = { }
}
