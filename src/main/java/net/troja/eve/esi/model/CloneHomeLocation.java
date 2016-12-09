/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.3.2.dev3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * home_location object
 */
@ApiModel(description = "home_location object")
public class CloneHomeLocation implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("location_id")
    private Long locationId = null;

    /**
     * location_type string
     */
    public enum LocationTypeEnum {
        STATION("station"),

        STRUCTURE("structure");

        private String value;

        LocationTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LocationTypeEnum fromValue(String text) {
            for (LocationTypeEnum b : LocationTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("location_type")
    private LocationTypeEnum locationType = null;

    public CloneHomeLocation locationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @ApiModelProperty(example = "null", value = "location_id integer")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CloneHomeLocation locationType(LocationTypeEnum locationType) {
        this.locationType = locationType;
        return this;
    }

    /**
     * location_type string
     * 
     * @return locationType
     **/
    @ApiModelProperty(example = "null", value = "location_type string")
    public LocationTypeEnum getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationTypeEnum locationType) {
        this.locationType = locationType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloneHomeLocation cloneHomeLocation = (CloneHomeLocation) o;
        return Objects.equals(this.locationId, cloneHomeLocation.locationId)
                && Objects.equals(this.locationType, cloneHomeLocation.locationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, locationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneHomeLocation {\n");

        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}