/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
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
package thymeleafsandbox.springjsp.web.controller.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleafsandbox.springjsp.business.entities.User;


@Controller
public class ThymeleafForm2 {


    public ThymeleafForm2() {
        super();
    }


    @RequestMapping("/thymeleaf/form2")
    public String showForm(final ModelMap map) {
        final User user = new User();
        user.setName("\r\nThis is the name\r\n");
        map.addAttribute("user", user);
        return "thymeleaf/form2";
    }

    @RequestMapping("/thymeleaf/form2do")
    public String doForm(User user, final BindingResult bindingResult) {
        System.out.println("<<" + user.getName() + ">>");
        return "thymeleaf/form2";
    }

}
