/*
 *  Copyright 2010 Christopher Pheby
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jadira.usertype.dateandtime.jsr310;

import java.sql.Date;

import javax.time.calendar.LocalDate;

import org.jadira.usertype.dateandtime.jsr310.columnmapper.DateColumnLocalDateMapper;
import org.jadira.usertype.dateandtime.shared.spi.AbstractUserType;


/**
 * Persist {@link LocalDate} via Hibernate. This type shares database
 * representation with {@link org.joda.time.contrib.hibernate.PersistentLocalDate}
 */
public class PersistentLocalDate extends AbstractUserType<LocalDate, Date, DateColumnLocalDateMapper> {
}

