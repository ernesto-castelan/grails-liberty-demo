

grails.plugin.springsecurity.userLookup.userDomainClassName = 'liberty.demo.User'
grails.plugin.springsecurity.userLookup.usernameIgnoreCase = true
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'liberty.demo.UserRole'
grails.plugin.springsecurity.authority.className = 'liberty.demo.Role'
grails.plugin.springsecurity.rejectIfNoRule = false
grails.plugin.springsecurity.fii.rejectPublicInvocations = false

grails.plugin.springsecurity.rest.token.validation.enableAnonymousAccess = true
grails.plugin.springsecurity.rest.token.validation.useBearerToken = false
grails.plugin.springsecurity.rest.token.validation.headerName = 'X-Auth-Token'
grails.plugin.springsecurity.rest.token.storage.useGorm = true
grails.plugin.springsecurity.rest.token.storage.gorm.tokenDomainClassName = 'liberty.demo.AuthenticationToken'

grails.plugin.springsecurity.filterChain.chainMap = [
    // Stateless chain
    [pattern: '/**',
     filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'
    ]
]
