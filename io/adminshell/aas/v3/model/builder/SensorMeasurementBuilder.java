/*Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */

package io.adminshell.aas.v3.model.builder;

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

public abstract class SensorMeasurementBuilder<T extends SensorMeasurement, B extends SensorMeasurementBuilder<T, B>> extends ExtendableBuilder<T, B> {


	/**
	* This function allows setting a value for wasGeneratedBies
	* @param wasGeneratedBies desired value to be set
	* @return Builder object with new value for wasGeneratedBies
	*/
	public B wasGeneratedBies(List<Agent> wasGeneratedBies) {
		getBuildingInstance().setWasGeneratedBies(wasGeneratedBies);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List wasGeneratedBies
	* @param wasGeneratedBy desired value to be added
	* @return Builder object with new value for wasGeneratedBies
	*/
	public B wasGeneratedBy(Agent wasGeneratedBy) {
		getBuildingInstance().getWasGeneratedBies().add(wasGeneratedBy);
		return getSelf();
	}


	/**
	* This function allows setting a value for contributes
	* @param contributes desired value to be set
	* @return Builder object with new value for contributes
	*/
	public B contributes(List<Agent> contributes) {
		getBuildingInstance().setContributes(contributes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List contributes
	* @param contributes desired value to be added
	* @return Builder object with new value for contributes
	*/
	public B contributes(Agent contributes) {
		getBuildingInstance().getContributes().add(contributes);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasDatatypes
	* @param hasDatatypes desired value to be set
	* @return Builder object with new value for hasDatatypes
	*/
	public B  {
		getBuildingInstance().setHasDatatypes(hasDatatypes);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasReferences
	* @param hasReferences desired value to be set
	* @return Builder object with new value for hasReferences
	*/
	public B  {
		getBuildingInstance().setHasReferences(hasReferences);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasSemanticExpressions
	* @param hasSemanticExpressions desired value to be set
	* @return Builder object with new value for hasSemanticExpressions
	*/
	public B hasSemanticExpressions(List<ExpressionSemantic> hasSemanticExpressions) {
		getBuildingInstance().setHasSemanticExpressions(hasSemanticExpressions);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List hasSemanticExpressions
	* @param hasSemanticExpression desired value to be added
	* @return Builder object with new value for hasSemanticExpressions
	*/
	public B hasSemanticExpression(ExpressionSemantic hasSemanticExpression) {
		getBuildingInstance().getHasSemanticExpressions().add(hasSemanticExpression);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasValues
	* @param hasValues desired value to be set
	* @return Builder object with new value for hasValues
	*/
	public B hasValues(List<Value> hasValues) {
		getBuildingInstance().setHasValues(hasValues);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List hasValues
	* @param hasValue desired value to be added
	* @return Builder object with new value for hasValues
	*/
	public B hasValue(Value hasValue) {
		getBuildingInstance().getHasValues().add(hasValue);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasViews
	* @param hasViews desired value to be set
	* @return Builder object with new value for hasViews
	*/
	public B hasViews(List<View> hasViews) {
		getBuildingInstance().setHasViews(hasViews);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List hasViews
	* @param hasView desired value to be added
	* @return Builder object with new value for hasViews
	*/
	public B hasView(View hasView) {
		getBuildingInstance().getHasViews().add(hasView);
		return getSelf();
	}


	/**
	* This function allows setting a value for inAccordanceWiths
	* @param inAccordanceWiths desired value to be set
	* @return Builder object with new value for inAccordanceWiths
	*/
	public B inAccordanceWiths(List<Standard> inAccordanceWiths) {
		getBuildingInstance().setInAccordanceWiths(inAccordanceWiths);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List inAccordanceWiths
	* @param inAccordanceWith desired value to be added
	* @return Builder object with new value for inAccordanceWiths
	*/
	public B inAccordanceWith(Standard inAccordanceWith) {
		getBuildingInstance().getInAccordanceWiths().add(inAccordanceWith);
		return getSelf();
	}


	/**
	* This function allows setting a value for creationDates
	* @param creationDates desired value to be set
	* @return Builder object with new value for creationDates
	*/
	public B creationDates(List<XMLGregorianCalendar> creationDates) {
		getBuildingInstance().setCreationDates(creationDates);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List creationDates
	* @param creationDate desired value to be added
	* @return Builder object with new value for creationDates
	*/
	public B creationDate(XMLGregorianCalendar creationDate) {
		getBuildingInstance().getCreationDates().add(creationDate);
		return getSelf();
	}


	/**
	* This function allows setting a value for subModelIDs
	* @param subModelIDs desired value to be set
	* @return Builder object with new value for subModelIDs
	*/
	public B subModelIDs(List<String> subModelIDs) {
		getBuildingInstance().setSubModelIDs(subModelIDs);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List subModelIDs
	* @param subModelID desired value to be added
	* @return Builder object with new value for subModelIDs
	*/
	public B subModelID(String subModelID) {
		getBuildingInstance().getSubModelIDs().add(subModelID);
		return getSelf();
	}
}
