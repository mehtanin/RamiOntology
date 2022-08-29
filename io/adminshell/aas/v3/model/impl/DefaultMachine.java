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
	* Default implementation of package io.adminshell.aas.v3.model.Machine
	 
*/

@IRI("https://w3id.org/i40/rami#Machine")
public class DefaultMachine implements Machine {

	
	@IRI("http://www.loa-cnr.it/ontologies/DUL.owl#isPartOf")
	protected List<Asset> isPartOfs = new ArrayList<>();


	
	@IRI("http://www.w3.org/2003/01/geo/wgs84_pos#lat")
	protected List<java.math.BigDecimal> lats = new ArrayList<>();


	
	@IRI("http://www.w3.org/2003/01/geo/wgs84_pos#long")
	protected List<java.math.BigDecimal> longs = new ArrayList<>();


	
	@IRI("http://xmlns.com/foaf/spec/image")
	protected List<URI> images = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#description")
	protected List<String> descriptions = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#hasAssetId")
	protected List<String> hasAssetIds = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#inventoryNumber")
	protected List<String> inventoryNumbers = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#recordedTime")
	protected List<XMLGregorianCalendar> recordedTimes = new ArrayList<>();


	public DefaultMachine() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.lats,
			this.longs,
			this.recordedTimes,
			this.images,
			this.isPartOfs,
			this.descriptions,
			this.hasAssetIds,
			this.inventoryNumbers);
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
			DefaultMachine other = (DefaultMachine) obj;
			return Objects.equals(this.lats, other.lats) &&
				Objects.equals(this.longs, other.longs) &&
				Objects.equals(this.recordedTimes, other.recordedTimes) &&
				Objects.equals(this.images, other.images) &&
				Objects.equals(this.isPartOfs, other.isPartOfs) &&
				Objects.equals(this.descriptions, other.descriptions) &&
				Objects.equals(this.hasAssetIds, other.hasAssetIds) &&
				Objects.equals(this.inventoryNumbers, other.inventoryNumbers);
		}
	}


	
	@Override 
	public List<java.math.BigDecimal> getLats() {
		return lats;
	}
	
	@Override 
	 public void setLats (List<java.math.BigDecimal> lats) {
		this.lats = lats;
	}

	@Override 
	public List<java.math.BigDecimal> getLongs() {
		return longs;
	}
	
	@Override 
	 public void setLongs (List<java.math.BigDecimal> longs) {
		this.longs = longs;
	}

	@Override 
	public List<XMLGregorianCalendar> getRecordedTimes() {
		return recordedTimes;
	}
	
	@Override 
	 public void setRecordedTimes (List<XMLGregorianCalendar> recordedTimes) {
		this.recordedTimes = recordedTimes;
	}

	@Override 
	public List<URI> getImages() {
		return images;
	}
	
	@Override 
	 public void setImages (List<URI> images) {
		this.images = images;
	}

	@Override 
	public List<Asset> getIsPartOfs() {
		return isPartOfs;
	}
	
	@Override 
	 public void setIsPartOfs (List<Asset> isPartOfs) {
		this.isPartOfs = isPartOfs;
	}

	@Override 
	public List<String> getDescriptions() {
		return descriptions;
	}
	
	@Override 
	 public void setDescriptions (List<String> descriptions) {
		this.descriptions = descriptions;
	}

	@Override 
	public List<String> getHasAssetIds() {
		return hasAssetIds;
	}
	
	@Override 
	 public void setHasAssetIds (List<String> hasAssetIds) {
		this.hasAssetIds = hasAssetIds;
	}

	@Override 
	public List<String> getInventoryNumbers() {
		return inventoryNumbers;
	}
	
	@Override 
	 public void setInventoryNumbers (List<String> inventoryNumbers) {
		this.inventoryNumbers = inventoryNumbers;
	}
/**
	* This builder class can be used to construct a DefaultMachine bean.
*/
	public static class Builder extends MachineBuilder<DefaultMachine, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultMachine newBuildingInstance() {
			return new DefaultMachine();
		}
	}
}
