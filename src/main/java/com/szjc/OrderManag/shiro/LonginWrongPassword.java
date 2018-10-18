package com.szjc.OrderManag.shiro;

import org.apache.shiro.authc.AuthenticationException;

public class LonginWrongPassword extends AuthenticationException {
    public LonginWrongPassword() {}
}