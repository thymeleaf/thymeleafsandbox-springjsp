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
package thymeleafsandbox.springjsp.web.conversion;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.format.annotation.DateTimeFormat;
import org.thymeleaf.util.NumberUtils;

public class NumberFormatter implements Formatter<Number> {


    public NumberFormatter() {
        super();
    }

    public Number parse(final String text, final Locale locale) throws ParseException {
        final DecimalFormat numberFormat = (DecimalFormat) NumberFormat.getNumberInstance();
        final DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setGroupingSeparator('*');
        numberFormat.setDecimalFormatSymbols(symbols);
        return numberFormat.parse(text);
    }

    public String print(final Number object, final Locale locale) {
        final DecimalFormat numberFormat = (DecimalFormat) NumberFormat.getNumberInstance();
        final DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setGroupingSeparator('*');
        numberFormat.setDecimalFormatSymbols(symbols);
        return numberFormat.format(object);
    }
}

