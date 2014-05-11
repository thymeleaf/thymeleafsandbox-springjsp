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
package thymeleafsandbox.springjsp.business.entities;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class DatesSummary {

    @DateTimeFormat(pattern = "yyyy_MMM_dd")
    private Calendar dateOne = null;
    @DateTimeFormat(pattern = "yyyy-MMM-dd")
    private Calendar dateTwo = null;


    public DatesSummary() {
        super();
    }

    public Calendar getDateOne() {
        return dateOne;
    }

    public void setDateOne(final Calendar dateOne) {
        this.dateOne = dateOne;
    }

    public Calendar getDateTwo() {
        return dateTwo;
    }

    public void setDateTwo(final Calendar dateTwo) {
        this.dateTwo = dateTwo;
    }

    @Override
    public String toString() {
        return "DatesSummary{" +
                "dateOne=" + dateOne +
                ", dateTwo=" + dateTwo +
                '}';
    }
}

