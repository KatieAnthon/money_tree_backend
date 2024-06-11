//package com.makers.moneytree.services.Jwt;


//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authorize) -> authorize
//                        .anyRequest().authenticated()
//                )
//                .oauth2ResourceServer((oauth2) -> oauth2
//                        .opaqueToken(Customizer.withDefaults())
//                );
//        return http.build();
//    }
//
//    @Bean
//    public OpaqueTokenIntrospector opaqueTokenIntrospector() {
//        return new SpringOpaqueTokenIntrospector(
//                "https://my-auth-server.com/oauth2/introspect", "my-client-id", "my-client-secret");
//    }
//
//}
