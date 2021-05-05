/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.wayang.plugin.hackit.core.sniffer.sniff;

import org.apache.wayang.plugin.hackit.core.tags.HackitTag;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class CollectionTagsToSniff implements Sniff {

    /**
     *
     */
    public Set<HackitTag> tags2sniff;

    /**
     * Default Construct
     */
    public CollectionTagsToSniff(){
        this.tags2sniff = new HashSet<>();
    }

    /**
     *
     * @param tag
     * @return
     */
    public boolean sniff(HackitTag tag){
        return this.tags2sniff.contains(tag);
    }

    /**
     *
     * @param tag
     */
    public void addTag2sniff(HackitTag tag) {
        this.tags2sniff.add(tag);
    }

    @Override
    public boolean sniff(Object input) {
        return false;
    }
}
