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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.thymeleaf.util.DateUtils;
import sun.util.calendar.CalendarUtils;
import thymeleafsandbox.springjsp.business.entities.DatesSummary;
import thymeleafsandbox.springjsp.business.entities.User;


@Controller
public class JspIterConversion {


    public JspIterConversion() {
        super();
    }



    @ModelAttribute("dates")
    public List<DatesSummary> populateDatesSummary() {

        final List<DatesSummary> datesSummaries = new ArrayList<DatesSummary>();

        final DatesSummary ds1 = new DatesSummary();
        ds1.setDateOne(DateUtils.create(Integer.valueOf(2011), Integer.valueOf(01), Integer.valueOf(01)));
        ds1.setDateTwo(DateUtils.create(Integer.valueOf(2011), Integer.valueOf(01), Integer.valueOf(01)));
        datesSummaries.add(ds1);

        final DatesSummary ds2 = new DatesSummary();
        ds2.setDateOne(DateUtils.create(Integer.valueOf(2010), Integer.valueOf(12), Integer.valueOf(31)));
        ds2.setDateTwo(DateUtils.create(Integer.valueOf(2010), Integer.valueOf(12), Integer.valueOf(31)));
        datesSummaries.add(ds2);

        final DatesSummary ds3 = new DatesSummary();
        ds3.setDateOne(DateUtils.create(Integer.valueOf(2013), Integer.valueOf(7), Integer.valueOf(4)));
        ds3.setDateTwo(DateUtils.create(Integer.valueOf(2013), Integer.valueOf(7), Integer.valueOf(4)));
        datesSummaries.add(ds3);

        final DatesSummary ds4 = new DatesSummary();
        ds4.setDateOne(null);
        ds4.setDateTwo(DateUtils.create(Integer.valueOf(2013), Integer.valueOf(7), Integer.valueOf(4)));
        datesSummaries.add(ds4);

        return datesSummaries;
    }


    @RequestMapping("/jsp/iterconversion")
    public String showPage() {
        return "jsp/iterconversion";
    }


}
