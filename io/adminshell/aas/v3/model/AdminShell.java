/*Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */

package io.adminshell.aas.v3.model;


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
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultAdminShell.class)
})
public interface AdminShell {

	/**
	*
	* More information under https://w3id.org/i40/rami#hasComponentManager
	*
	* @return Returns the List of ComponentManagers for the property hasComponentManagers.
	*/
	@IRI("https://w3id.org/i40/rami#hasComponentManager")
	List<ComponentManager> getHasComponentManagers();

	/**
	*
	* More information under https://w3id.org/i40/rami#hasComponentManager
	*
	* @param hasComponentManagers desired value for the property hasComponentManagers.
	*/
	 void setHasComponentManagers (List<ComponentManager> hasComponentManagers);

	/**
	* Connects the Admin Shell with the different RAMI4.0 Dimensions
	*
	* More information under https://w3id.org/i40/rami#isConnectedTo
	*
	* @return Returns the List of Dimensions for the property isConnectedTos.
	*/
	@IRI("https://w3id.org/i40/rami#isConnectedTo")
	List<Dimension> getIsConnectedTos();

	/**
	* Connects the Admin Shell with the different RAMI4.0 Dimensions
	*
	* More information under https://w3id.org/i40/rami#isConnectedTo
	*
	* @param isConnectedTos desired value for the property isConnectedTos.
	*/
	 void setIsConnectedTos (List<Dimension> isConnectedTos);

	/**
	* Points to the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
	*
	* More information under https://w3id.org/i40/rami#hasSubmodel
	*
	* @return Returns the List of Submodels for the property hasSubmodels.
	*/
	@IRI("https://w3id.org/i40/rami#hasSubmodel")
	List<Submodel> getHasSubmodels();

	/**
	* Points to the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
	*
	* More information under https://w3id.org/i40/rami#hasSubmodel
	*
	* @param hasSubmodels desired value for the property hasSubmodels.
	*/
	 void setHasSubmodels (List<Submodel> hasSubmodels);

	/**
	*
	* More information under https://w3id.org/i40/rami#hasData
	*
	* @return Returns the List of Submodels for the property hasDatas.
	*/
	@IRI("https://w3id.org/i40/rami#hasData")
	List<Submodel> getHasDatas();

	/**
	*
	* More information under https://w3id.org/i40/rami#hasData
	*
	* @param hasDatas desired value for the property hasDatas.
	*/
	 void setHasDatas (List<Submodel> hasDatas);

	/**
	* Connect the Asset with the Administration Shell
	*
	* More information under https://w3id.org/i40/rami#describes
	*
	* @return Returns the List of Assets for the property describes.
	*/
	@IRI("https://w3id.org/i40/rami#describes")
	List<Asset> getDescribes();

	/**
	* Connect the Asset with the Administration Shell
	*
	* More information under https://w3id.org/i40/rami#describes
	*
	* @param describes desired value for the property describes.
	*/
	 void setDescribes (List<Asset> describes);

	/**
	*
	* More information under https://w3id.org/i40/rami#hasManifest
	*
	* @return Returns the List of Manifests for the property hasManifests.
	*/
	@IRI("https://w3id.org/i40/rami#hasManifest")
	List<Manifest> getHasManifests();

	/**
	*
	* More information under https://w3id.org/i40/rami#hasManifest
	*
	* @param hasManifests desired value for the property hasManifests.
	*/
	 void setHasManifests (List<Manifest> hasManifests);

	/**
	*
	* More information under https://w3id.org/i40/rami#receivedAtTime
	*
	* @return Returns the List of XMLGregorianCalendars for the property receivedAtTimes.
	*/
	@IRI("https://w3id.org/i40/rami#receivedAtTime")
	List<XMLGregorianCalendar> getReceivedAtTimes();

	/**
	*
	* More information under https://w3id.org/i40/rami#receivedAtTime
	*
	* @param receivedAtTimes desired value for the property receivedAtTimes.
	*/
	 void setReceivedAtTimes (List<XMLGregorianCalendar> receivedAtTimes);

	/**
	*
	* More information under https://w3id.org/i40/rami#hasAdminShellId
	*
	* @return Returns the List of Strings for the property hasAdminShellIds.
	*/
	@IRI("https://w3id.org/i40/rami#hasAdminShellId")
	List<String> getHasAdminShellIds();

	/**
	*
	* More information under https://w3id.org/i40/rami#hasAdminShellId
	*
	* @param hasAdminShellIds desired value for the property hasAdminShellIds.
	*/
	 void setHasAdminShellIds (List<String> hasAdminShellIds);

}
