/*
 * =============================================================================
 * 
 *   Copyright (c) 2011, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package thymeleafsandbox.springjsp.web.controller.jsp;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleafsandbox.springjsp.business.entities.User;


@Controller
public class JspForm {


    public JspForm() {
        super();
    }
    
    
    
    
    @RequestMapping("/jsp/form")
    public String showForm(final User user, final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("IN ERROR: " + user);
            return "jsp/form";
        }
        System.out.println("No errors: " + user);
        if (user != null && user.getId() == null) {
            final Calendar registrationDate = Calendar.getInstance();
            registrationDate.set(Calendar.MILLISECOND, 0);
            registrationDate.set(Calendar.SECOND, 0);
            registrationDate.set(Calendar.MINUTE, 0);
            registrationDate.set(Calendar.HOUR, 0);
            user.setId(Integer.valueOf(12345));
            user.setRegistrationDate(registrationDate);
        }
        return "jsp/form";
    }

}
