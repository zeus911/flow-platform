/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.yml.parser.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import sun.invoke.empty.Empty;

/**
 * @author yh@firim
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface YmlSerializer {

    /**
     * field is required
     */
    boolean required() default true;

    /**
     * yml to field mapping name
     */
    String name() default "";

    /**
     * yml to field ignore
     */
    boolean ignore() default false;

    /**
     * this field will apply provided adaptor
     */
    Class<?> adaptor() default Empty.class;

    /**
     * this field will apply provided validator
     */
    Class<?> validator() default Empty.class;
}
