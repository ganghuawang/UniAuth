package com.dianrong.uniauth.ssclient.config;

import com.dianrong.common.uniauth.client.config.UniauthSecurityConfig;

import javax.servlet.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.web.authentication.logout.LogoutFilter;

/**
 * 自定义springSecurity 配置.
 *
 * @author wanglin
 */
@Configuration
public class WebSecurityConfiguration extends UniauthSecurityConfig {
  public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("/js/**", "/favicon.ico", "/static-content","/**/ajax-content.jsp");
  }

  protected void configure(HttpSecurity http) throws Exception {
   super.configure(http);
  }
}
