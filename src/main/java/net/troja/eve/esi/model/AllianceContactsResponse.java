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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class AllianceContactsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("contact_id")
    private Integer contactId = null;

    /**
     * contact_type string
     */
    public enum ContactTypeEnum {
        CHARACTER("character"),

        CORPORATION("corporation"),

        ALLIANCE("alliance"),

        FACTION("faction");

        private String value;

        ContactTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ContactTypeEnum fromValue(String text) {
            for (ContactTypeEnum b : ContactTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("contact_type")
    private ContactTypeEnum contactType = null;

    @JsonProperty("label_ids")
    private List<Long> labelIds = new ArrayList<Long>();

    @JsonProperty("standing")
    private Float standing = null;

    public AllianceContactsResponse contactId(Integer contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * contact_id integer
     * 
     * @return contactId
     **/
    @ApiModelProperty(example = "null", required = true, value = "contact_id integer")
    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public AllianceContactsResponse contactType(ContactTypeEnum contactType) {
        this.contactType = contactType;
        return this;
    }

    /**
     * contact_type string
     * 
     * @return contactType
     **/
    @ApiModelProperty(example = "null", required = true, value = "contact_type string")
    public ContactTypeEnum getContactType() {
        return contactType;
    }

    public void setContactType(ContactTypeEnum contactType) {
        this.contactType = contactType;
    }

    public AllianceContactsResponse labelIds(List<Long> labelIds) {
        this.labelIds = labelIds;
        return this;
    }

    public AllianceContactsResponse addLabelIdsItem(Long labelIdsItem) {
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
     * label_ids array
     * 
     * @return labelIds
     **/
    @ApiModelProperty(example = "null", value = "label_ids array")
    public List<Long> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<Long> labelIds) {
        this.labelIds = labelIds;
    }

    public AllianceContactsResponse standing(Float standing) {
        this.standing = standing;
        return this;
    }

    /**
     * Standing of the contact
     * 
     * @return standing
     **/
    @ApiModelProperty(example = "null", required = true, value = "Standing of the contact")
    public Float getStanding() {
        return standing;
    }

    public void setStanding(Float standing) {
        this.standing = standing;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllianceContactsResponse allianceContactsResponse = (AllianceContactsResponse) o;
        return Objects.equals(this.contactId, allianceContactsResponse.contactId)
                && Objects.equals(this.contactType, allianceContactsResponse.contactType)
                && Objects.equals(this.labelIds, allianceContactsResponse.labelIds)
                && Objects.equals(this.standing, allianceContactsResponse.standing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, contactType, labelIds, standing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllianceContactsResponse {\n");

        sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
        sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
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
