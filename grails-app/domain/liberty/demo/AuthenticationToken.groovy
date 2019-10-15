package liberty.demo

class AuthenticationToken {

    String tokenValue
    String username
    Date dateCreated

    static constraints = {
        tokenValue  blank:false, maxSize:255, unique:true
        username    blank:false, maxSize:255
    }

    static mapping = {
        username    index:'authUsernameIdx'
    }
}
