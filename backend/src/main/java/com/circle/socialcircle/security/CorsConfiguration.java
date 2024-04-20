package com.circle.socialcircle.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    // return new WebMvcConfigurer() {
    //   @Override
    //   public void addCorsMappings(CorsRegistry registry) {
    //     registry.addMapping("/**")
    //       .allowedOrigins("http://localhost:3000")
    //       .allowedMethods(
    //         HttpMethod.GET.name(),
    //         HttpMethod.POST.name(),
    //         HttpMethod.DELETE.name(),
    //         HttpMethod.PUT.name(),
    //         HttpMethod.PATCH.name()
    //       )
    //       .allowedHeaders(
    //         HttpHeaders.CONTENT_TYPE,
    //         HttpHeaders.AUTHORIZATION
    //       );
    //   }
    // };
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry
          .addMapping("/**")
          .allowedOrigins("http://localhost:3000")
          .allowedMethods("*")
          .allowedHeaders("*")
          .maxAge(-1)
          .allowCredentials(false);
      }
    };
  }
}
