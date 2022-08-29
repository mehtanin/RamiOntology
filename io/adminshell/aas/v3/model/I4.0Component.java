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
* Globally uniquely identifiable participant with communication capability consisting of administration shell and asset within an I4.0 system. nSource: Industrie 4.0 – Begriffe/Terms, VDI Statusreport Industrie 4.0 (April 2017)
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultI4.0Component.class)
})
public interface I4.0Component {

	/**
	* Unique Identification of the Industry 4.0 component.
	*
	* More information under https://w3id.org/i40/rami#hasI40ComponentId
	*
	* @return Returns the List of Strings for the property hasI40ComponentIds.
	*/
	@IRI("https://w3id.org/i40/rami#hasI40ComponentId")
	List<String> getHasI40ComponentIds();

	/**
	* Unique Identification of the Industry 4.0 component.
	*
	* More information under https://w3id.org/i40/rami#hasI40ComponentId
	*
	* @param hasI40ComponentIds desired value for the property hasI40ComponentIds.
	*/
	 void setHasI40ComponentIds (List<String> hasI40ComponentIds);

	/**
	* Points the I4.0 Component to the Administration Shell
	*
	* More information under https://w3id.org/i40/rami#containsAS
	*
	* @return Returns the List of AdminShells for the property containsASs.
	*/
	@IRI("https://w3id.org/i40/rami#containsAS")
	List<AdminShell> getContainsASs();

	/**
	* Points the I4.0 Component to the Administration Shell
	*
	* More information under https://w3id.org/i40/rami#containsAS
	*
	* @param containsASs desired value for the property containsASs.
	*/
	 void setContainsASs (List<AdminShell> containsASs);

}
