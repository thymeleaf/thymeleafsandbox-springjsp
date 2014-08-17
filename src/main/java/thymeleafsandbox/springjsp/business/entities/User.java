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
package thymeleafsandbox.springjsp.business.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

    private Integer id = null;
    private String name = null;
    private String surname = null;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Calendar registrationDate = null;

    private Boolean active = Boolean.FALSE;

    private List<String> multiValues = new ArrayList<String>();
    private final String[] multiValueOptions = new String[] { "ONE", "TWO", "THREE", "FOUR"};

    
    public User() {
        super();
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public Calendar getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(final Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }


    public List<String> getMultiValues() {
        return multiValues;
    }

    public void setMultiValues(final List<String> multiValues) {
        this.multiValues = multiValues;
    }


    public String[] getMultiValueOptions() {
        return multiValueOptions;
    }


    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    @Override
    public String toString() {
        return "User{" +
                "@=" + System.identityHashCode(this) +
                ", id=" + this.id +
                ", name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", multiValues=" + this.multiValues +
                ", active=" + this.active +
                ", registrationDate=" + this.registrationDate +
                '}';
    }

}

