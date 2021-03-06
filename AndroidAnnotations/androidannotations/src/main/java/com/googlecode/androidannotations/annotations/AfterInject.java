/**
 * Copyright (C) 2010-2012 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.androidannotations.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Methods annotated with @{@link AfterInject} will be called after the
 * constructor is called in an enhanced class.
 * 
 * Any code depending on injected fields should be done in an
 * {@link AfterInject} annotated method.
 * 
 * The method must have zero parameters.
 * 
 * There may be several methods annotated with @{@link AfterInject} in the same
 * class.
 * 
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface AfterInject {
}
