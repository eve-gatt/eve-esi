/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class UniverseAncestriesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("bloodline_id")
    private Integer bloodlineId = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("icon_id")
    private Integer iconId = null;

    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("short_description")
    private String shortDescription = null;

    public UniverseAncestriesResponse bloodlineId(Integer bloodlineId) {
        this.bloodlineId = bloodlineId;
        return this;
    }

    /**
     * The bloodline associated with this ancestry
     * 
     * @return bloodlineId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The bloodline associated with this ancestry")
    public Integer getBloodlineId() {
        return bloodlineId;
    }

    public void setBloodlineId(Integer bloodlineId) {
        this.bloodlineId = bloodlineId;
    }

    public UniverseAncestriesResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(example = "null", required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UniverseAncestriesResponse iconId(Integer iconId) {
        this.iconId = iconId;
        return this;
    }

    /**
     * icon_id integer
     * 
     * @return iconId
     **/
    @ApiModelProperty(example = "null", value = "icon_id integer")
    public Integer getIconId() {
        return iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    public UniverseAncestriesResponse id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * id integer
     * 
     * @return id
     **/
    @ApiModelProperty(example = "null", required = true, value = "id integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UniverseAncestriesResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(example = "null", required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniverseAncestriesResponse shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * short_description string
     * 
     * @return shortDescription
     **/
    @ApiModelProperty(example = "null", value = "short_description string")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UniverseAncestriesResponse universeAncestriesResponse = (UniverseAncestriesResponse) o;
        return Objects.equals(this.bloodlineId, universeAncestriesResponse.bloodlineId)
                && Objects.equals(this.description, universeAncestriesResponse.description)
                && Objects.equals(this.iconId, universeAncestriesResponse.iconId)
                && Objects.equals(this.id, universeAncestriesResponse.id)
                && Objects.equals(this.name, universeAncestriesResponse.name)
                && Objects.equals(this.shortDescription, universeAncestriesResponse.shortDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bloodlineId, description, iconId, id, name, shortDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UniverseAncestriesResponse {\n");

        sb.append("    bloodlineId: ").append(toIndentedString(bloodlineId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
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
