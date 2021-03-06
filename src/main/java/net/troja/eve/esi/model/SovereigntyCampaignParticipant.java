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
 * participant object
 */
@ApiModel(description = "participant object")
public class SovereigntyCampaignParticipant implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("alliance_id")
    private Integer allianceId = null;

    @JsonProperty("score")
    private Float score = null;

    public SovereigntyCampaignParticipant allianceId(Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * alliance_id integer
     * 
     * @return allianceId
     **/
    @ApiModelProperty(example = "null", required = true, value = "alliance_id integer")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public SovereigntyCampaignParticipant score(Float score) {
        this.score = score;
        return this;
    }

    /**
     * score number
     * 
     * @return score
     **/
    @ApiModelProperty(example = "null", required = true, value = "score number")
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SovereigntyCampaignParticipant sovereigntyCampaignParticipant = (SovereigntyCampaignParticipant) o;
        return Objects.equals(this.allianceId, sovereigntyCampaignParticipant.allianceId)
                && Objects.equals(this.score, sovereigntyCampaignParticipant.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceId, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SovereigntyCampaignParticipant {\n");

        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
