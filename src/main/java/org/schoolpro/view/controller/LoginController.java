/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schoolpro.view.controller;

import java.io.Serializable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author niyazahamed
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(value = "/doLogin",method= RequestMethod.POST)
    public @ResponseBody
    JsonResponse doLogin(
            @RequestParam("userName") String userName,
            @RequestParam("userPassword") String password) {

        JsonResponse jsonResponse = new JsonResponse();
        if (userName == null || "".equals(userName)) {
            jsonResponse.setMessage("User name is required.");
            return jsonResponse;
        }
        if (password == null || "".equals(password)) {
            jsonResponse.setMessage("Password is required.");
            return jsonResponse;
        }
        jsonResponse.setMessage("Login Success!");
        return jsonResponse;
    }

    static class JsonResponse implements Serializable {

        String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
