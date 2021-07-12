/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.spring.boot.autoconfigure.properties.client;

import io.seata.rm.tcc.constant.TCCFenceCleanMode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static io.seata.spring.boot.autoconfigure.StarterConstants.TCC_FENCE_CONFIG_PREFIX_KEBAB_STYLE;

/**
 * TCC Fence properties
 *
 * @author kaka2code
 */
@Component
@ConfigurationProperties(prefix = TCC_FENCE_CONFIG_PREFIX_KEBAB_STYLE)
public class TCCFenceProperties {

    /**
     * TCC fence clean mode
     */
    private TCCFenceCleanMode cleanMode;

    /**
     * TCC fence clean period
     */
    private int cleanPeriod;

    /**
     * TCC fence log table name
     */
    private String logTableName;

    public TCCFenceCleanMode getCleanMode() {
        return cleanMode;
    }

    public TCCFenceProperties setCleanMode(TCCFenceCleanMode cleanMode) {
        this.cleanMode = cleanMode;
        return this;
    }

    public int getCleanPeriod() {
        return cleanPeriod;
    }

    public TCCFenceProperties setCleanPeriod(int cleanPeriod) {
        this.cleanPeriod = cleanPeriod;
        return this;
    }

    public String getLogTableName() {
        return logTableName;
    }

    public TCCFenceProperties setLogTableName(String logTableName) {
        this.logTableName = logTableName;
        return this;
    }
}