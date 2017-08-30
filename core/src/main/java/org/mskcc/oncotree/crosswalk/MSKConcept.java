/*
 * Copyright (c) 2017 Memorial Sloan-Kettering Cancer Center.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 * documentation provided hereunder is on an "as is" basis, and
 * Memorial Sloan-Kettering Cancer Center
 * has no obligations to provide maintenance, support,
 * updates, enhancements or modifications.  In no event shall
 * Memorial Sloan-Kettering Cancer Center
 * be liable to any party for direct, indirect, special,
 * incidental or consequential damages, including lost profits, arising
 * out of the use of this software and its documentation, even if
 * Memorial Sloan-Kettering Cancer Center
 * has been advised of the possibility of such damage.
*/

package org.mskcc.oncotree.crosswalk;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;
import javax.annotation.Generated;

/**
 *
 * @author Manda Wilson
 **/
public class MSKConcept {

    @JsonProperty("conceptId")
    private List<String> conceptIds;
    @JsonProperty("crosswalks")
    private HashMap<String, List<String>> crosswalks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private Set<String> history = new HashSet<String>();

    /**
    * No args constructor for use in serialization
    *
    */
    public MSKConcept() {
    }

    /**
    *
    * @return conceptIds
    */
    @JsonProperty("conceptId")
    public List<String> getConceptIds() {
        return conceptIds;
    }

    /**
    *
    * @param conceptIds
    */
    @JsonProperty("conceptIds")
    public void setConceptIds(List<String> conceptIds) {
        this.conceptIds = conceptIds;
    }

    /**
    *
    * @return crosswalks
    */
    @JsonProperty("crosswalks")
    public HashMap<String, List<String>> getCrosswalks() {
        return crosswalks;
    }

    /**
    *
    * @param crosswalks
    */
    @JsonProperty("crosswalks")
    public void setCrosswalks(HashMap<String, List<String>> crosswalks) {
        this.crosswalks = crosswalks;
    }

    /**
    *
    * @return history
    */
    public Set<String> getHistory() {
        return history;
    }

    /**
    *
    * @param oncotreeCode
    */
    public void addHistory(String oncotreeCode) {
        this.history.add(oncotreeCode);
    }

    /**
    *
    * @param oncotreeCodes
    */
    public void addHistory(Set<String> oncotreeCodes) {
        this.history.addAll(oncotreeCodes);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
