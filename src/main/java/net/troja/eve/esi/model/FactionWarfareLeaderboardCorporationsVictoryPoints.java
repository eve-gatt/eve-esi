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
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationLastWeekVictoryPoints;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationYesterdayVictoryPoints;
import java.io.Serializable;

/**
 * Top 10 rankings of corporations by victory points from yesterday, last week
 * and in total
 */
@ApiModel(description = "Top 10 rankings of corporations by victory points from yesterday, last week and in total")
public class FactionWarfareLeaderboardCorporationsVictoryPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("active_total")
    private List<FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints> activeTotal = new ArrayList<FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints>();

    @JsonProperty("last_week")
    private List<FactionWarfareLeaderboardCorporationLastWeekVictoryPoints> lastWeek = new ArrayList<FactionWarfareLeaderboardCorporationLastWeekVictoryPoints>();

    @JsonProperty("yesterday")
    private List<FactionWarfareLeaderboardCorporationYesterdayVictoryPoints> yesterday = new ArrayList<FactionWarfareLeaderboardCorporationYesterdayVictoryPoints>();

    public FactionWarfareLeaderboardCorporationsVictoryPoints activeTotal(
            List<FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints> activeTotal) {
        this.activeTotal = activeTotal;
        return this;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints addActiveTotalItem(
            FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints activeTotalItem) {
        this.activeTotal.add(activeTotalItem);
        return this;
    }

    /**
     * Top 10 ranking of corporations active in faction warfare by total victory
     * points. A corporation is considered \"active\" if they have participated
     * in faction warfare in the past 14 days
     * 
     * @return activeTotal
     **/
    @ApiModelProperty(example = "null", required = true, value = "Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days")
    public List<FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints> getActiveTotal() {
        return activeTotal;
    }

    public void setActiveTotal(List<FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints> activeTotal) {
        this.activeTotal = activeTotal;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints lastWeek(
            List<FactionWarfareLeaderboardCorporationLastWeekVictoryPoints> lastWeek) {
        this.lastWeek = lastWeek;
        return this;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints addLastWeekItem(
            FactionWarfareLeaderboardCorporationLastWeekVictoryPoints lastWeekItem) {
        this.lastWeek.add(lastWeekItem);
        return this;
    }

    /**
     * Top 10 ranking of corporations by victory points in the past week
     * 
     * @return lastWeek
     **/
    @ApiModelProperty(example = "null", required = true, value = "Top 10 ranking of corporations by victory points in the past week")
    public List<FactionWarfareLeaderboardCorporationLastWeekVictoryPoints> getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(List<FactionWarfareLeaderboardCorporationLastWeekVictoryPoints> lastWeek) {
        this.lastWeek = lastWeek;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints yesterday(
            List<FactionWarfareLeaderboardCorporationYesterdayVictoryPoints> yesterday) {
        this.yesterday = yesterday;
        return this;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints addYesterdayItem(
            FactionWarfareLeaderboardCorporationYesterdayVictoryPoints yesterdayItem) {
        this.yesterday.add(yesterdayItem);
        return this;
    }

    /**
     * Top 10 ranking of corporations by victory points in the past day
     * 
     * @return yesterday
     **/
    @ApiModelProperty(example = "null", required = true, value = "Top 10 ranking of corporations by victory points in the past day")
    public List<FactionWarfareLeaderboardCorporationYesterdayVictoryPoints> getYesterday() {
        return yesterday;
    }

    public void setYesterday(List<FactionWarfareLeaderboardCorporationYesterdayVictoryPoints> yesterday) {
        this.yesterday = yesterday;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCorporationsVictoryPoints factionWarfareLeaderboardCorporationsVictoryPoints = (FactionWarfareLeaderboardCorporationsVictoryPoints) o;
        return Objects.equals(this.activeTotal, factionWarfareLeaderboardCorporationsVictoryPoints.activeTotal)
                && Objects.equals(this.lastWeek, factionWarfareLeaderboardCorporationsVictoryPoints.lastWeek)
                && Objects.equals(this.yesterday, factionWarfareLeaderboardCorporationsVictoryPoints.yesterday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeTotal, lastWeek, yesterday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCorporationsVictoryPoints {\n");

        sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
        sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
        sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
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
