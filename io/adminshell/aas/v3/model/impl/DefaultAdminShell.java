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
	* Default implementation of package io.adminshell.aas.v3.model.AdminShell
	 
*/

@IRI("https://w3id.org/i40/rami#AdminShell")
public class DefaultAdminShell implements AdminShell {

	
	@IRI("https://w3id.org/i40/rami#describes")
	protected List<Asset> describes = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#hasAdminShellId")
	protected List<String> hasAdminShellIds = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#hasComponentManager")
	protected List<ComponentManager> hasComponentManagers = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#hasData")
	protected List<Submodel> hasDatas = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#hasManifest")
	protected List<Manifest> hasManifests = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#hasSubmodel")
	protected List<Submodel> hasSubmodels = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#isConnectedTo")
	protected List<Dimension> isConnectedTos = new ArrayList<>();


	
	@IRI("https://w3id.org/i40/rami#receivedAtTime")
	protected List<XMLGregorianCalendar> receivedAtTimes = new ArrayList<>();


	public DefaultAdminShell() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.hasComponentManagers,
			this.isConnectedTos,
			this.hasSubmodels,
			this.hasDatas,
			this.describes,
			this.hasManifests,
			this.receivedAtTimes,
			this.hasAdminShellIds);
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
			DefaultAdminShell other = (DefaultAdminShell) obj;
			return Objects.equals(this.hasComponentManagers, other.hasComponentManagers) &&
				Objects.equals(this.isConnectedTos, other.isConnectedTos) &&
				Objects.equals(this.hasSubmodels, other.hasSubmodels) &&
				Objects.equals(this.hasDatas, other.hasDatas) &&
				Objects.equals(this.describes, other.describes) &&
				Objects.equals(this.hasManifests, other.hasManifests) &&
				Objects.equals(this.receivedAtTimes, other.receivedAtTimes) &&
				Objects.equals(this.hasAdminShellIds, other.hasAdminShellIds);
		}
	}


	
	@Override 
	public List<ComponentManager> getHasComponentManagers() {
		return hasComponentManagers;
	}
	
	@Override 
	 public void setHasComponentManagers (List<ComponentManager> hasComponentManagers) {
		this.hasComponentManagers = hasComponentManagers;
	}

	@Override 
	public List<Dimension> getIsConnectedTos() {
		return isConnectedTos;
	}
	
	@Override 
	 public void setIsConnectedTos (List<Dimension> isConnectedTos) {
		this.isConnectedTos = isConnectedTos;
	}

	@Override 
	public List<Submodel> getHasSubmodels() {
		return hasSubmodels;
	}
	
	@Override 
	 public void setHasSubmodels (List<Submodel> hasSubmodels) {
		this.hasSubmodels = hasSubmodels;
	}

	@Override 
	public List<Submodel> getHasDatas() {
		return hasDatas;
	}
	
	@Override 
	 public void setHasDatas (List<Submodel> hasDatas) {
		this.hasDatas = hasDatas;
	}

	@Override 
	public List<Asset> getDescribes() {
		return describes;
	}
	
	@Override 
	 public void setDescribes (List<Asset> describes) {
		this.describes = describes;
	}

	@Override 
	public List<Manifest> getHasManifests() {
		return hasManifests;
	}
	
	@Override 
	 public void setHasManifests (List<Manifest> hasManifests) {
		this.hasManifests = hasManifests;
	}

	@Override 
	public List<XMLGregorianCalendar> getReceivedAtTimes() {
		return receivedAtTimes;
	}
	
	@Override 
	 public void setReceivedAtTimes (List<XMLGregorianCalendar> receivedAtTimes) {
		this.receivedAtTimes = receivedAtTimes;
	}

	@Override 
	public List<String> getHasAdminShellIds() {
		return hasAdminShellIds;
	}
	
	@Override 
	 public void setHasAdminShellIds (List<String> hasAdminShellIds) {
		this.hasAdminShellIds = hasAdminShellIds;
	}
/**
	* This builder class can be used to construct a DefaultAdminShell bean.
*/
	public static class Builder extends AdminShellBuilder<DefaultAdminShell, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultAdminShell newBuildingInstance() {
			return new DefaultAdminShell();
		}
	}
}
