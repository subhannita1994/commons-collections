/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections.functors;

import java.io.Serializable;

import org.apache.commons.collections.Predicate;

/**
 * Predicate implementation that always returns false.
 *
 * @since 3.0
 * @version $Id$
 */
public final class FalsePredicate<T> implements Predicate<T>, Serializable {

    /** Serial version UID */
    private static final long serialVersionUID = 7533784454832764388L;

    /** Singleton predicate instance */
    public static final Predicate<Object> INSTANCE = new FalsePredicate<Object>();

    /**
     * Get a typed instance.
     *
     * @param <T> the type that the predicate queries
     * @return the singleton instance
     * @since 4.0
     */
    @SuppressWarnings("unchecked")
    public static <T> Predicate<T> falsePredicate() {
        return (Predicate<T>) INSTANCE;
    }

    /**
     * Restricted constructor.
     */
    private FalsePredicate() {
        super();
    }

    /**
     * Evaluates the predicate returning false always.
     *
     * @param object  the input object
     * @return false always
     */
    public boolean evaluate(T object) {
        return false;
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
