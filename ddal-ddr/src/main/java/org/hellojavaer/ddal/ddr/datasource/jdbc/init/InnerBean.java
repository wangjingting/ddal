/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hellojavaer.ddal.ddr.datasource.jdbc.init;

/**
 *
 * @author <a href="mailto:hellojavaer@gmail.com">Kaiming Zou</a>,created on 13/12/2016.
 */
class InnerBean {

    public InnerBean(Object val, boolean syncDefaultValue) {
        this.val = val;
        this.syncDefaultValue = syncDefaultValue;
    }

    private Object  val;
    private boolean syncDefaultValue;

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public boolean isSyncDefaultValue() {
        return syncDefaultValue;
    }

    public void setSyncDefaultValue(boolean syncDefaultValue) {
        this.syncDefaultValue = syncDefaultValue;
    }
}
