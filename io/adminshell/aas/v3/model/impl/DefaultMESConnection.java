/*Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */

package io.adminshell.aas.v3.model.impl;

import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Collection;
import java.util.Set;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.InputStream;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** 
	* Default implementation of package io.adminshell.aas.v3.model.MESConnection
	 
*/

@IRI("https://w3id.org/i40/rami#MESConnection")
public class DefaultMESConnection implements MESConnection {

	
	@IRI("http://www.w3.org/ns/prov#wasGeneratedBy")
	protected List<Agent> wasGeneratedBies = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#contributes")
	protected List<Agent> contributes = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#creationDate")
	protected List<XMLGregorianCalendar> creationDates = new ArrayList<>();




	
	@IRI("https://w3id.org/i40/rami#hasSemanticExpression")
	protected List<ExpressionSemantic> hasSemanticExpressions = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#hasValue")
	protected List<Value> hasValues = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#hasView")
	protected List<View> hasViews = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#inAccordanceWith")
	protected List<Standard> inAccordanceWiths = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#subModelID")
	protected List<String> subModelIDs = new ArrayList<>();


	public DefaultMESConnection() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.wasGeneratedBies,
			this.contributes,
			this.hasDatatypes,
			this.hasReferences,
			this.hasSemanticExpressions,
			this.hasValues,
			this.hasViews,
			this.inAccordanceWiths,
			this.creationDates,
			this.subModelIDs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultMESConnection other = (DefaultMESConnection) obj;
			return Objects.equals(this.wasGeneratedBies, other.wasGeneratedBies) &&
				Objects.equals(this.contributes, other.contributes) &&
				Objects.equals(this.hasSemanticExpressions, other.hasSemanticExpressions) &&
				Objects.equals(this.hasValues, other.hasValues) &&
				Objects.equals(this.hasViews, other.hasViews) &&
				Objects.equals(this.inAccordanceWiths, other.inAccordanceWiths) &&
				Objects.equals(this.creationDates, other.creationDates) &&
				Objects.equals(this.subModelIDs, other.subModelIDs);
		}
	}


	

	@Override 
	public List<Agent> getWasGeneratedBies() {
		return wasGeneratedBies;
	}
	
	@Override 
	 public void setWasGeneratedBies (List<Agent> wasGeneratedBies) {
		this.wasGeneratedBies = wasGeneratedBies;
	}

	@Override 
	public List<Agent> getContributes() {
		return contributes;
	}
	
	@Override 
	 public void setContributes (List<Agent> contributes) {
		this.contributes = contributes;
	}

	@Override  {
		return hasDatatypes;
	}
	
	@Override 
	 public void  {
		this.hasDatatypes = hasDatatypes;
	}

	@Override  {
		return hasReferences;
	}
	
	@Override 
	 public void  {
		this.hasReferences = hasReferences;
	}

	@Override 
	public List<ExpressionSemantic> getHasSemanticExpressions() {
		return hasSemanticExpressions;
	}
	
	@Override 
	 public void setHasSemanticExpressions (List<ExpressionSemantic> hasSemanticExpressions) {
		this.hasSemanticExpressions = hasSemanticExpressions;
	}

	@Override 
	public List<Value> getHasValues() {
		return hasValues;
	}
	
	@Override 
	 public void setHasValues (List<Value> hasValues) {
		this.hasValues = hasValues;
	}

	@Override 
	public List<View> getHasViews() {
		return hasViews;
	}
	
	@Override 
	 public void setHasViews (List<View> hasViews) {
		this.hasViews = hasViews;
	}

	@Override 
	public List<Standard> getInAccordanceWiths() {
		return inAccordanceWiths;
	}
	
	@Override 
	 public void setInAccordanceWiths (List<Standard> inAccordanceWiths) {
		this.inAccordanceWiths = inAccordanceWiths;
	}

	@Override 
	public List<XMLGregorianCalendar> getCreationDates() {
		return creationDates;
	}
	
	@Override 
	 public void setCreationDates (List<XMLGregorianCalendar> creationDates) {
		this.creationDates = creationDates;
	}

	@Override 
	public List<String> getSubModelIDs() {
		return subModelIDs;
	}
	
	@Override 
	 public void setSubModelIDs (List<String> subModelIDs) {
		this.subModelIDs = subModelIDs;
	}
/**
	* This builder class can be used to construct a DefaultMESConnection bean.
*/
	public static class Builder extends MESConnectionBuilder<DefaultMESConnection, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultMESConnection newBuildingInstance() {
			return new DefaultMESConnection();
		}
	}
}
