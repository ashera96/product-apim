/*
 * WSO2 API Manager - Governance
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Governance. 
 *
 * The version of the OpenAPI document: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.governance.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonCreator;
/**
* Detailed information about an artifact.
*/
    @ApiModel(description = "Detailed information about an artifact.")

public class ArtifactInfoDTO {
        public static final String SERIALIZED_NAME_NAME = "name";
        @SerializedName(SERIALIZED_NAME_NAME)
            private String name;

            /**
* Type of the artifact.
*/
    @JsonAdapter(TypeEnum.Adapter.class)
public enum TypeEnum {
        API("API");

private String value;

TypeEnum(String value) {
this.value = value;
}

public String getValue() {
return value;
}

@Override
public String toString() {
return String.valueOf(value);
}

public static TypeEnum fromValue(String value) {
    for (TypeEnum b : TypeEnum.values()) {
    if (b.name().equals(value)) {
        return b;
    }
}
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
}

    public static class Adapter extends TypeAdapter<TypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
    jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TypeEnum read(final JsonReader jsonReader) throws IOException {
    String value =  jsonReader.nextString();
    return TypeEnum.fromValue(value);
    }
    }
}

        public static final String SERIALIZED_NAME_TYPE = "type";
        @SerializedName(SERIALIZED_NAME_TYPE)
            private TypeEnum type;

        public static final String SERIALIZED_NAME_VERSION = "version";
        @SerializedName(SERIALIZED_NAME_VERSION)
            private String version;

        public static final String SERIALIZED_NAME_OWNER = "owner";
        @SerializedName(SERIALIZED_NAME_OWNER)
            private String owner;


        public ArtifactInfoDTO name(String name) {
        
        this.name = name;
        return this;
        }

    /**
        * Name of the artifact.
    * @return name
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "Test API", value = "Name of the artifact.")
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


        public ArtifactInfoDTO type(TypeEnum type) {
        
        this.type = type;
        return this;
        }

    /**
        * Type of the artifact.
    * @return type
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "API", value = "Type of the artifact.")
    
    public TypeEnum getType() {
        return type;
    }


    public void setType(TypeEnum type) {
        this.type = type;
    }


        public ArtifactInfoDTO version(String version) {
        
        this.version = version;
        return this;
        }

    /**
        * Version of the artifact.
    * @return version
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "1.0.0", value = "Version of the artifact.")
    
    public String getVersion() {
        return version;
    }


    public void setVersion(String version) {
        this.version = version;
    }


        public ArtifactInfoDTO owner(String owner) {
        
        this.owner = owner;
        return this;
        }

    /**
        * Owner of the artifact.
    * @return owner
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "admin", value = "Owner of the artifact.")
    
    public String getOwner() {
        return owner;
    }


    public void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            ArtifactInfoDTO artifactInfo = (ArtifactInfoDTO) o;
            return Objects.equals(this.name, artifactInfo.name) &&
            Objects.equals(this.type, artifactInfo.type) &&
            Objects.equals(this.version, artifactInfo.version) &&
            Objects.equals(this.owner, artifactInfo.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, version, owner);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class ArtifactInfoDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
sb.append("}");
return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(Object o) {
if (o == null) {
return "null";
}
return o.toString().replace("\n", "\n    ");
}

}

