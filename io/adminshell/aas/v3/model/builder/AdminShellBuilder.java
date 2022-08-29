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

public abstract class AdminShellBuilder<T extends AdminShell, B extends AdminShellBuilder<T, B>> extends ExtendableBuilder<T, B> {

	/**
	* This function allows setting a value for hasComponentManagers
	* @param hasComponentManagers desired value to be set
	* @return Builder object with new value for hasComponentManagers
	*/
	public B hasComponentManagers(List<ComponentManager> hasComponentManagers) {
		getBuildingInstance().setHasComponentManagers(hasComponentManagers);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List hasComponentManagers
	* @param hasComponentManager desired value to be added
	* @return Builder object with new value for hasComponentManagers
	*/
	public B hasComponentManager(ComponentManager hasComponentManager) {
		getBuildingInstance().getHasComponentManagers().add(hasComponentManager);
		return getSelf();
	}


	/**
	* This function allows setting a value for isConnectedTos
	* @param isConnectedTos desired value to be set
	* @return Builder object with new value for isConnectedTos
	*/
	public B isConnectedTos(List<Dimension> isConnectedTos) {
		getBuildingInstance().setIsConnectedTos(isConnectedTos);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List isConnectedTos
	* @param isConnectedTo desired value to be added
	* @return Builder object with new value for isConnectedTos
	*/
	public B isConnectedTo(Dimension isConnectedTo) {
		getBuildingInstance().getIsConnectedTos().add(isConnectedTo);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasSubmodels
	* @param hasSubmodels desired value to be set
	* @return Builder object with new value for hasSubmodels
	*/
	public B hasSubmodels(List<Submodel> hasSubmodels) {
		getBuildingInstance().setHasSubmodels(hasSubmodels);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List hasSubmodels
	* @param hasSubmodel desired value to be added
	* @return Builder object with new value for hasSubmodels
	*/
	public B hasSubmodel(Submodel hasSubmodel) {
		getBuildingInstance().getHasSubmodels().add(hasSubmodel);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasDatas
	* @param hasDatas desired value to be set
	* @return Builder object with new value for hasDatas
	*/
	public B hasDatas(List<Submodel> hasDatas) {
		getBuildingInstance().setHasDatas(hasDatas);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List hasDatas
	* @param hasData desired value to be added
	* @return Builder object with new value for hasDatas
	*/
	public B hasData(Submodel hasData) {
		getBuildingInstance().getHasDatas().add(hasData);
		return getSelf();
	}


	/**
	* This function allows setting a value for describes
	* @param describes desired value to be set
	* @return Builder object with new value for describes
	*/
	public B describes(List<Asset> describes) {
		getBuildingInstance().setDescribes(describes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List describes
	* @param describes desired value to be added
	* @return Builder object with new value for describes
	*/
	public B describes(Asset describes) {
		getBuildingInstance().getDescribes().add(describes);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasManifests
	* @param hasManifests desired value to be set
	* @return Builder object with new value for hasManifests
	*/
	public B hasManifests(List<Manifest> hasManifests) {
		getBuildingInstance().setHasManifests(hasManifests);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List hasManifests
	* @param hasManifest desired value to be added
	* @return Builder object with new value for hasManifests
	*/
	public B hasManifest(Manifest hasManifest) {
		getBuildingInstance().getHasManifests().add(hasManifest);
		return getSelf();
	}


	/**
	* This function allows setting a value for receivedAtTimes
	* @param receivedAtTimes desired value to be set
	* @return Builder object with new value for receivedAtTimes
	*/
	public B receivedAtTimes(List<XMLGregorianCalendar> receivedAtTimes) {
		getBuildingInstance().setReceivedAtTimes(receivedAtTimes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List receivedAtTimes
	* @param receivedAtTime desired value to be added
	* @return Builder object with new value for receivedAtTimes
	*/
	public B receivedAtTime(XMLGregorianCalendar receivedAtTime) {
		getBuildingInstance().getReceivedAtTimes().add(receivedAtTime);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasAdminShellIds
	* @param hasAdminShellIds desired value to be set
	* @return Builder object with new value for hasAdminShellIds
	*/
	public B hasAdminShellIds(List<String> hasAdminShellIds) {
		getBuildingInstance().setHasAdminShellIds(hasAdminShellIds);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List hasAdminShellIds
	* @param hasAdminShellId desired value to be added
	* @return Builder object with new value for hasAdminShellIds
	*/
	public B hasAdminShellId(String hasAdminShellId) {
		getBuildingInstance().getHasAdminShellIds().add(hasAdminShellId);
		return getSelf();
	}
}
