  
package com.niit.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@SuppressWarnings("deprecation")
	@Bean
	public WebContentInterceptor webContentInterceptor() {
	    final WebContentInterceptor interceptor = new WebContentInterceptor();
	    interceptor.setCacheSeconds(0);
	    interceptor.setUseExpiresHeader(true);
	    interceptor.setUseCacheControlHeader(true);
	    interceptor.setUseCacheControlNoStore(true);
	    return interceptor;
	}

  @Autowired
  private UserDetailsService userDetailsService;
  
  @Bean
  public BCryptPasswordEncoder passwordEncoder()
  {
    return new BCryptPasswordEncoder();
  };
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception 
  {
	  http.authorizeRequests()
	  .antMatchers("/").permitAll()
	  .antMatchers("/book/add").hasAuthority("admin")
	  .antMatchers("/book/edit/**").hasAuthority("admin")
	  .antMatchers("/book/delete/**").hasAuthority("admin")
      .antMatchers("/book/**").permitAll()
      .antMatchers("/book/bookid/**").permitAll()
      .antMatchers("/user/add").permitAll()
      .antMatchers("/user/login").permitAll()
      
      .and().formLogin()
      
      .defaultSuccessUrl("/")
      .loginPage("/user/login").loginProcessingUrl("/loginaction").permitAll()
      .and()
      .logout().logoutUrl("/logout")
      .invalidateHttpSession(true)
      .clearAuthentication(true)
      .deleteCookies("JESSIONID")
      .logoutSuccessUrl("/home")
      .and().csrf().disable();
  }
}