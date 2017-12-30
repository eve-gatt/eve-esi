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
 * travel object
 */
@ApiModel(description = "travel object")
public class CharacterStatsTravel implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("acceleration_gate_activations")
    private Long accelerationGateActivations = null;

    @JsonProperty("align_to")
    private Long alignTo = null;

    @JsonProperty("distance_warped_high_sec")
    private Long distanceWarpedHighSec = null;

    @JsonProperty("distance_warped_low_sec")
    private Long distanceWarpedLowSec = null;

    @JsonProperty("distance_warped_null_sec")
    private Long distanceWarpedNullSec = null;

    @JsonProperty("distance_warped_wormhole")
    private Long distanceWarpedWormhole = null;

    @JsonProperty("docks_high_sec")
    private Long docksHighSec = null;

    @JsonProperty("docks_low_sec")
    private Long docksLowSec = null;

    @JsonProperty("docks_null_sec")
    private Long docksNullSec = null;

    @JsonProperty("jumps_stargate_high_sec")
    private Long jumpsStargateHighSec = null;

    @JsonProperty("jumps_stargate_low_sec")
    private Long jumpsStargateLowSec = null;

    @JsonProperty("jumps_stargate_null_sec")
    private Long jumpsStargateNullSec = null;

    @JsonProperty("jumps_wormhole")
    private Long jumpsWormhole = null;

    @JsonProperty("warps_high_sec")
    private Long warpsHighSec = null;

    @JsonProperty("warps_low_sec")
    private Long warpsLowSec = null;

    @JsonProperty("warps_null_sec")
    private Long warpsNullSec = null;

    @JsonProperty("warps_to_bookmark")
    private Long warpsToBookmark = null;

    @JsonProperty("warps_to_celestial")
    private Long warpsToCelestial = null;

    @JsonProperty("warps_to_fleet_member")
    private Long warpsToFleetMember = null;

    @JsonProperty("warps_to_scan_result")
    private Long warpsToScanResult = null;

    @JsonProperty("warps_wormhole")
    private Long warpsWormhole = null;

    public CharacterStatsTravel accelerationGateActivations(Long accelerationGateActivations) {
        this.accelerationGateActivations = accelerationGateActivations;
        return this;
    }

    /**
     * acceleration_gate_activations integer
     * 
     * @return accelerationGateActivations
     **/
    @ApiModelProperty(example = "null", value = "acceleration_gate_activations integer")
    public Long getAccelerationGateActivations() {
        return accelerationGateActivations;
    }

    public void setAccelerationGateActivations(Long accelerationGateActivations) {
        this.accelerationGateActivations = accelerationGateActivations;
    }

    public CharacterStatsTravel alignTo(Long alignTo) {
        this.alignTo = alignTo;
        return this;
    }

    /**
     * align_to integer
     * 
     * @return alignTo
     **/
    @ApiModelProperty(example = "null", value = "align_to integer")
    public Long getAlignTo() {
        return alignTo;
    }

    public void setAlignTo(Long alignTo) {
        this.alignTo = alignTo;
    }

    public CharacterStatsTravel distanceWarpedHighSec(Long distanceWarpedHighSec) {
        this.distanceWarpedHighSec = distanceWarpedHighSec;
        return this;
    }

    /**
     * distance_warped_high_sec integer
     * 
     * @return distanceWarpedHighSec
     **/
    @ApiModelProperty(example = "null", value = "distance_warped_high_sec integer")
    public Long getDistanceWarpedHighSec() {
        return distanceWarpedHighSec;
    }

    public void setDistanceWarpedHighSec(Long distanceWarpedHighSec) {
        this.distanceWarpedHighSec = distanceWarpedHighSec;
    }

    public CharacterStatsTravel distanceWarpedLowSec(Long distanceWarpedLowSec) {
        this.distanceWarpedLowSec = distanceWarpedLowSec;
        return this;
    }

    /**
     * distance_warped_low_sec integer
     * 
     * @return distanceWarpedLowSec
     **/
    @ApiModelProperty(example = "null", value = "distance_warped_low_sec integer")
    public Long getDistanceWarpedLowSec() {
        return distanceWarpedLowSec;
    }

    public void setDistanceWarpedLowSec(Long distanceWarpedLowSec) {
        this.distanceWarpedLowSec = distanceWarpedLowSec;
    }

    public CharacterStatsTravel distanceWarpedNullSec(Long distanceWarpedNullSec) {
        this.distanceWarpedNullSec = distanceWarpedNullSec;
        return this;
    }

    /**
     * distance_warped_null_sec integer
     * 
     * @return distanceWarpedNullSec
     **/
    @ApiModelProperty(example = "null", value = "distance_warped_null_sec integer")
    public Long getDistanceWarpedNullSec() {
        return distanceWarpedNullSec;
    }

    public void setDistanceWarpedNullSec(Long distanceWarpedNullSec) {
        this.distanceWarpedNullSec = distanceWarpedNullSec;
    }

    public CharacterStatsTravel distanceWarpedWormhole(Long distanceWarpedWormhole) {
        this.distanceWarpedWormhole = distanceWarpedWormhole;
        return this;
    }

    /**
     * distance_warped_wormhole integer
     * 
     * @return distanceWarpedWormhole
     **/
    @ApiModelProperty(example = "null", value = "distance_warped_wormhole integer")
    public Long getDistanceWarpedWormhole() {
        return distanceWarpedWormhole;
    }

    public void setDistanceWarpedWormhole(Long distanceWarpedWormhole) {
        this.distanceWarpedWormhole = distanceWarpedWormhole;
    }

    public CharacterStatsTravel docksHighSec(Long docksHighSec) {
        this.docksHighSec = docksHighSec;
        return this;
    }

    /**
     * docks_high_sec integer
     * 
     * @return docksHighSec
     **/
    @ApiModelProperty(example = "null", value = "docks_high_sec integer")
    public Long getDocksHighSec() {
        return docksHighSec;
    }

    public void setDocksHighSec(Long docksHighSec) {
        this.docksHighSec = docksHighSec;
    }

    public CharacterStatsTravel docksLowSec(Long docksLowSec) {
        this.docksLowSec = docksLowSec;
        return this;
    }

    /**
     * docks_low_sec integer
     * 
     * @return docksLowSec
     **/
    @ApiModelProperty(example = "null", value = "docks_low_sec integer")
    public Long getDocksLowSec() {
        return docksLowSec;
    }

    public void setDocksLowSec(Long docksLowSec) {
        this.docksLowSec = docksLowSec;
    }

    public CharacterStatsTravel docksNullSec(Long docksNullSec) {
        this.docksNullSec = docksNullSec;
        return this;
    }

    /**
     * docks_null_sec integer
     * 
     * @return docksNullSec
     **/
    @ApiModelProperty(example = "null", value = "docks_null_sec integer")
    public Long getDocksNullSec() {
        return docksNullSec;
    }

    public void setDocksNullSec(Long docksNullSec) {
        this.docksNullSec = docksNullSec;
    }

    public CharacterStatsTravel jumpsStargateHighSec(Long jumpsStargateHighSec) {
        this.jumpsStargateHighSec = jumpsStargateHighSec;
        return this;
    }

    /**
     * jumps_stargate_high_sec integer
     * 
     * @return jumpsStargateHighSec
     **/
    @ApiModelProperty(example = "null", value = "jumps_stargate_high_sec integer")
    public Long getJumpsStargateHighSec() {
        return jumpsStargateHighSec;
    }

    public void setJumpsStargateHighSec(Long jumpsStargateHighSec) {
        this.jumpsStargateHighSec = jumpsStargateHighSec;
    }

    public CharacterStatsTravel jumpsStargateLowSec(Long jumpsStargateLowSec) {
        this.jumpsStargateLowSec = jumpsStargateLowSec;
        return this;
    }

    /**
     * jumps_stargate_low_sec integer
     * 
     * @return jumpsStargateLowSec
     **/
    @ApiModelProperty(example = "null", value = "jumps_stargate_low_sec integer")
    public Long getJumpsStargateLowSec() {
        return jumpsStargateLowSec;
    }

    public void setJumpsStargateLowSec(Long jumpsStargateLowSec) {
        this.jumpsStargateLowSec = jumpsStargateLowSec;
    }

    public CharacterStatsTravel jumpsStargateNullSec(Long jumpsStargateNullSec) {
        this.jumpsStargateNullSec = jumpsStargateNullSec;
        return this;
    }

    /**
     * jumps_stargate_null_sec integer
     * 
     * @return jumpsStargateNullSec
     **/
    @ApiModelProperty(example = "null", value = "jumps_stargate_null_sec integer")
    public Long getJumpsStargateNullSec() {
        return jumpsStargateNullSec;
    }

    public void setJumpsStargateNullSec(Long jumpsStargateNullSec) {
        this.jumpsStargateNullSec = jumpsStargateNullSec;
    }

    public CharacterStatsTravel jumpsWormhole(Long jumpsWormhole) {
        this.jumpsWormhole = jumpsWormhole;
        return this;
    }

    /**
     * jumps_wormhole integer
     * 
     * @return jumpsWormhole
     **/
    @ApiModelProperty(example = "null", value = "jumps_wormhole integer")
    public Long getJumpsWormhole() {
        return jumpsWormhole;
    }

    public void setJumpsWormhole(Long jumpsWormhole) {
        this.jumpsWormhole = jumpsWormhole;
    }

    public CharacterStatsTravel warpsHighSec(Long warpsHighSec) {
        this.warpsHighSec = warpsHighSec;
        return this;
    }

    /**
     * warps_high_sec integer
     * 
     * @return warpsHighSec
     **/
    @ApiModelProperty(example = "null", value = "warps_high_sec integer")
    public Long getWarpsHighSec() {
        return warpsHighSec;
    }

    public void setWarpsHighSec(Long warpsHighSec) {
        this.warpsHighSec = warpsHighSec;
    }

    public CharacterStatsTravel warpsLowSec(Long warpsLowSec) {
        this.warpsLowSec = warpsLowSec;
        return this;
    }

    /**
     * warps_low_sec integer
     * 
     * @return warpsLowSec
     **/
    @ApiModelProperty(example = "null", value = "warps_low_sec integer")
    public Long getWarpsLowSec() {
        return warpsLowSec;
    }

    public void setWarpsLowSec(Long warpsLowSec) {
        this.warpsLowSec = warpsLowSec;
    }

    public CharacterStatsTravel warpsNullSec(Long warpsNullSec) {
        this.warpsNullSec = warpsNullSec;
        return this;
    }

    /**
     * warps_null_sec integer
     * 
     * @return warpsNullSec
     **/
    @ApiModelProperty(example = "null", value = "warps_null_sec integer")
    public Long getWarpsNullSec() {
        return warpsNullSec;
    }

    public void setWarpsNullSec(Long warpsNullSec) {
        this.warpsNullSec = warpsNullSec;
    }

    public CharacterStatsTravel warpsToBookmark(Long warpsToBookmark) {
        this.warpsToBookmark = warpsToBookmark;
        return this;
    }

    /**
     * warps_to_bookmark integer
     * 
     * @return warpsToBookmark
     **/
    @ApiModelProperty(example = "null", value = "warps_to_bookmark integer")
    public Long getWarpsToBookmark() {
        return warpsToBookmark;
    }

    public void setWarpsToBookmark(Long warpsToBookmark) {
        this.warpsToBookmark = warpsToBookmark;
    }

    public CharacterStatsTravel warpsToCelestial(Long warpsToCelestial) {
        this.warpsToCelestial = warpsToCelestial;
        return this;
    }

    /**
     * warps_to_celestial integer
     * 
     * @return warpsToCelestial
     **/
    @ApiModelProperty(example = "null", value = "warps_to_celestial integer")
    public Long getWarpsToCelestial() {
        return warpsToCelestial;
    }

    public void setWarpsToCelestial(Long warpsToCelestial) {
        this.warpsToCelestial = warpsToCelestial;
    }

    public CharacterStatsTravel warpsToFleetMember(Long warpsToFleetMember) {
        this.warpsToFleetMember = warpsToFleetMember;
        return this;
    }

    /**
     * warps_to_fleet_member integer
     * 
     * @return warpsToFleetMember
     **/
    @ApiModelProperty(example = "null", value = "warps_to_fleet_member integer")
    public Long getWarpsToFleetMember() {
        return warpsToFleetMember;
    }

    public void setWarpsToFleetMember(Long warpsToFleetMember) {
        this.warpsToFleetMember = warpsToFleetMember;
    }

    public CharacterStatsTravel warpsToScanResult(Long warpsToScanResult) {
        this.warpsToScanResult = warpsToScanResult;
        return this;
    }

    /**
     * warps_to_scan_result integer
     * 
     * @return warpsToScanResult
     **/
    @ApiModelProperty(example = "null", value = "warps_to_scan_result integer")
    public Long getWarpsToScanResult() {
        return warpsToScanResult;
    }

    public void setWarpsToScanResult(Long warpsToScanResult) {
        this.warpsToScanResult = warpsToScanResult;
    }

    public CharacterStatsTravel warpsWormhole(Long warpsWormhole) {
        this.warpsWormhole = warpsWormhole;
        return this;
    }

    /**
     * warps_wormhole integer
     * 
     * @return warpsWormhole
     **/
    @ApiModelProperty(example = "null", value = "warps_wormhole integer")
    public Long getWarpsWormhole() {
        return warpsWormhole;
    }

    public void setWarpsWormhole(Long warpsWormhole) {
        this.warpsWormhole = warpsWormhole;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStatsTravel characterStatsTravel = (CharacterStatsTravel) o;
        return Objects.equals(this.accelerationGateActivations, characterStatsTravel.accelerationGateActivations)
                && Objects.equals(this.alignTo, characterStatsTravel.alignTo)
                && Objects.equals(this.distanceWarpedHighSec, characterStatsTravel.distanceWarpedHighSec)
                && Objects.equals(this.distanceWarpedLowSec, characterStatsTravel.distanceWarpedLowSec)
                && Objects.equals(this.distanceWarpedNullSec, characterStatsTravel.distanceWarpedNullSec)
                && Objects.equals(this.distanceWarpedWormhole, characterStatsTravel.distanceWarpedWormhole)
                && Objects.equals(this.docksHighSec, characterStatsTravel.docksHighSec)
                && Objects.equals(this.docksLowSec, characterStatsTravel.docksLowSec)
                && Objects.equals(this.docksNullSec, characterStatsTravel.docksNullSec)
                && Objects.equals(this.jumpsStargateHighSec, characterStatsTravel.jumpsStargateHighSec)
                && Objects.equals(this.jumpsStargateLowSec, characterStatsTravel.jumpsStargateLowSec)
                && Objects.equals(this.jumpsStargateNullSec, characterStatsTravel.jumpsStargateNullSec)
                && Objects.equals(this.jumpsWormhole, characterStatsTravel.jumpsWormhole)
                && Objects.equals(this.warpsHighSec, characterStatsTravel.warpsHighSec)
                && Objects.equals(this.warpsLowSec, characterStatsTravel.warpsLowSec)
                && Objects.equals(this.warpsNullSec, characterStatsTravel.warpsNullSec)
                && Objects.equals(this.warpsToBookmark, characterStatsTravel.warpsToBookmark)
                && Objects.equals(this.warpsToCelestial, characterStatsTravel.warpsToCelestial)
                && Objects.equals(this.warpsToFleetMember, characterStatsTravel.warpsToFleetMember)
                && Objects.equals(this.warpsToScanResult, characterStatsTravel.warpsToScanResult)
                && Objects.equals(this.warpsWormhole, characterStatsTravel.warpsWormhole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accelerationGateActivations, alignTo, distanceWarpedHighSec, distanceWarpedLowSec,
                distanceWarpedNullSec, distanceWarpedWormhole, docksHighSec, docksLowSec, docksNullSec,
                jumpsStargateHighSec, jumpsStargateLowSec, jumpsStargateNullSec, jumpsWormhole, warpsHighSec,
                warpsLowSec, warpsNullSec, warpsToBookmark, warpsToCelestial, warpsToFleetMember, warpsToScanResult,
                warpsWormhole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStatsTravel {\n");

        sb.append("    accelerationGateActivations: ").append(toIndentedString(accelerationGateActivations))
                .append("\n");
        sb.append("    alignTo: ").append(toIndentedString(alignTo)).append("\n");
        sb.append("    distanceWarpedHighSec: ").append(toIndentedString(distanceWarpedHighSec)).append("\n");
        sb.append("    distanceWarpedLowSec: ").append(toIndentedString(distanceWarpedLowSec)).append("\n");
        sb.append("    distanceWarpedNullSec: ").append(toIndentedString(distanceWarpedNullSec)).append("\n");
        sb.append("    distanceWarpedWormhole: ").append(toIndentedString(distanceWarpedWormhole)).append("\n");
        sb.append("    docksHighSec: ").append(toIndentedString(docksHighSec)).append("\n");
        sb.append("    docksLowSec: ").append(toIndentedString(docksLowSec)).append("\n");
        sb.append("    docksNullSec: ").append(toIndentedString(docksNullSec)).append("\n");
        sb.append("    jumpsStargateHighSec: ").append(toIndentedString(jumpsStargateHighSec)).append("\n");
        sb.append("    jumpsStargateLowSec: ").append(toIndentedString(jumpsStargateLowSec)).append("\n");
        sb.append("    jumpsStargateNullSec: ").append(toIndentedString(jumpsStargateNullSec)).append("\n");
        sb.append("    jumpsWormhole: ").append(toIndentedString(jumpsWormhole)).append("\n");
        sb.append("    warpsHighSec: ").append(toIndentedString(warpsHighSec)).append("\n");
        sb.append("    warpsLowSec: ").append(toIndentedString(warpsLowSec)).append("\n");
        sb.append("    warpsNullSec: ").append(toIndentedString(warpsNullSec)).append("\n");
        sb.append("    warpsToBookmark: ").append(toIndentedString(warpsToBookmark)).append("\n");
        sb.append("    warpsToCelestial: ").append(toIndentedString(warpsToCelestial)).append("\n");
        sb.append("    warpsToFleetMember: ").append(toIndentedString(warpsToFleetMember)).append("\n");
        sb.append("    warpsToScanResult: ").append(toIndentedString(warpsToScanResult)).append("\n");
        sb.append("    warpsWormhole: ").append(toIndentedString(warpsWormhole)).append("\n");
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