package dev.housesforsale.houses.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeHttpRequests().requestMatchers("/index").permitAll()
//                .and().authorizeHttpRequests().requestMatchers().authenticated().f
//
//    }

//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }

    //PasswordEncoder passwordEncoder

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails user=User.builder()
                .username("A")
                .password("{noop}A")
                .roles("USER")
                .build();

        UserDetails Anitya=User.builder()
                .username("Anitya")
                .password("{noop}Anitya")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user,Anitya);
    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("user")
//                        .password("password")
//                        .roles("USER")
//                        .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
    @Bean
    public SecurityFilterChain configure(HttpSecurity http)throws Exception{
        http
                .authorizeHttpRequests(configure->configure
                        .anyRequest().authenticated())
                .formLogin(form->form.loginPage("/login")
                        .loginProcessingUrl("/authenticateTheUser").permitAll());
        return http.build();
    }



}
