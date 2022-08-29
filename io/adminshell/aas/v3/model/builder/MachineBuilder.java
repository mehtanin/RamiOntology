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

public abstract class MachineBuilder<T extends Machine, B extends MachineBuilder<T, B>> extends ExtendableBuilder<T, B> {

	/**
	* This function allows setting a value for lats
	* @param lats desired value to be set
	* @return Builder object with new value for lats
	*/
	public B lats(List<java.math.BigDecimal> lats) {
		getBuildingInstance().setLats(lats);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List lats
	* @param lat desired value to be added
	* @return Builder object with new value for lats
	*/
	public B lat(java.math.BigDecimal lat) {
		getBuildingInstance().getLats().add(lat);
		return getSelf();
	}


	/**
	* This function allows setting a value for longs
	* @param longs desired value to be set
	* @return Builder object with new value for longs
	*/
	public B longs(List<java.math.BigDecimal> longs) {
		getBuildingInstance().setLongs(longs);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List longs
	* @param long desired value to be added
	* @return Builder object with new value for longs
	*/
	public B long(java.math.BigDecimal long) {
		getBuildingInstance().getLongs().add(long);
		return getSelf();
	}


	/**
	* This function allows setting a value for recordedTimes
	* @param recordedTimes desired value to be set
	* @return Builder object with new value for recordedTimes
	*/
	public B recordedTimes(List<XMLGregorianCalendar> recordedTimes) {
		getBuildingInstance().setRecordedTimes(recordedTimes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List recordedTimes
	* @param recordedTime desired value to be added
	* @return Builder object with new value for recordedTimes
	*/
	public B recordedTime(XMLGregorianCalendar recordedTime) {
		getBuildingInstance().getRecordedTimes().add(recordedTime);
		return getSelf();
	}


	/**
	* This function allows setting a value for images
	* @param images desired value to be set
	* @return Builder object with new value for images
	*/
	public B images(List<URI> images) {
		getBuildingInstance().setImages(images);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List images
	* @param image desired value to be added
	* @return Builder object with new value for images
	*/
	public B image(URI image) {
		getBuildingInstance().getImages().add(image);
		return getSelf();
	}


	/**
	* This function allows setting a value for isPartOfs
	* @param isPartOfs desired value to be set
	* @return Builder object with new value for isPartOfs
	*/
	public B isPartOfs(List<Asset> isPartOfs) {
		getBuildingInstance().setIsPartOfs(isPartOfs);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List isPartOfs
	* @param isPartOf desired value to be added
	* @return Builder object with new value for isPartOfs
	*/
	public B isPartOf(Asset isPartOf) {
		getBuildingInstance().getIsPartOfs().add(isPartOf);
		return getSelf();
	}


	/**
	* This function allows setting a value for descriptions
	* @param descriptions desired value to be set
	* @return Builder object with new value for descriptions
	*/
	public B descriptions(List<String> descriptions) {
		getBuildingInstance().setDescriptions(descriptions);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List descriptions
	* @param description desired value to be added
	* @return Builder object with new value for descriptions
	*/
	public B description(String description) {
		getBuildingInstance().getDescriptions().add(description);
		return getSelf();
	}


	/**
	* This function allows setting a value for hasAssetIds
	* @param hasAssetIds desired value to be set
	* @return Builder object with new value for hasAssetIds
	*/
	public B hasAssetIds(List<String> hasAssetIds) {
		getBuildingInstance().setHasAssetIds(hasAssetIds);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List hasAssetIds
	* @param hasAssetId desired value to be added
	* @return Builder object with new value for hasAssetIds
	*/
	public B hasAssetId(String hasAssetId) {
		getBuildingInstance().getHasAssetIds().add(hasAssetId);
		return getSelf();
	}


	/**
	* This function allows setting a value for inventoryNumbers
	* @param inventoryNumbers desired value to be set
	* @return Builder object with new value for inventoryNumbers
	*/
	public B inventoryNumbers(List<String> inventoryNumbers) {
		getBuildingInstance().setInventoryNumbers(inventoryNumbers);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List inventoryNumbers
	* @param inventoryNumber desired value to be added
	* @return Builder object with new value for inventoryNumbers
	*/
	public B inventoryNumber(String inventoryNumber) {
		getBuildingInstance().getInventoryNumbers().add(inventoryNumber);
		return getSelf();
	}
}
