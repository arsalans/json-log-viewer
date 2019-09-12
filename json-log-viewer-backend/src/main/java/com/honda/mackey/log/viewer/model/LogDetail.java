
package com.honda.mackey.log.viewer.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class LogDetail {

    @Expose
    private String accountType;
    @Expose
    private String countryCode;
    @Expose
    private String dealerNumber;
    @Expose
    private String ecuCount;
    @Expose
    private List<EcuList> ecuList;
    @Expose
    private String langCode;
    @Expose
    private String osVersion;
    @Expose
    private String pcSerial;
    @Expose
    private String ptVersion;
    @Expose
    private String result;
    @Expose
    private String updateLogPassThroughTimestamp;
    @Expose
    private String updateLogTimezone;
    @Expose
    private String userFamilyName;
    @Expose
    private String userFirstName;
    @Expose
    private String userGroup;
    @Expose
    private String userId;
    @Expose
    private String vciApi;
    @Expose
    private String vciDll;
    @Expose
    private String vciFirmware;
    @Expose
    private String vciName;
    @Expose
    private String vin;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDealerNumber() {
        return dealerNumber;
    }

    public void setDealerNumber(String dealerNumber) {
        this.dealerNumber = dealerNumber;
    }

    public String getEcuCount() {
        return ecuCount;
    }

    public void setEcuCount(String ecuCount) {
        this.ecuCount = ecuCount;
    }

    public List<EcuList> getEcuList() {
        return ecuList;
    }

    public void setEcuList(List<EcuList> ecuList) {
        this.ecuList = ecuList;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getPcSerial() {
        return pcSerial;
    }

    public void setPcSerial(String pcSerial) {
        this.pcSerial = pcSerial;
    }

    public String getPtVersion() {
        return ptVersion;
    }

    public void setPtVersion(String ptVersion) {
        this.ptVersion = ptVersion;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getUpdateLogPassThroughTimestamp() {
        return updateLogPassThroughTimestamp;
    }

    public void setUpdateLogPassThroughTimestamp(String updateLogPassThroughTimestamp) {
        this.updateLogPassThroughTimestamp = updateLogPassThroughTimestamp;
    }

    public String getUpdateLogTimezone() {
        return updateLogTimezone;
    }

    public void setUpdateLogTimezone(String updateLogTimezone) {
        this.updateLogTimezone = updateLogTimezone;
    }

    public String getUserFamilyName() {
        return userFamilyName;
    }

    public void setUserFamilyName(String userFamilyName) {
        this.userFamilyName = userFamilyName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVciApi() {
        return vciApi;
    }

    public void setVciApi(String vciApi) {
        this.vciApi = vciApi;
    }

    public String getVciDll() {
        return vciDll;
    }

    public void setVciDll(String vciDll) {
        this.vciDll = vciDll;
    }

    public String getVciFirmware() {
        return vciFirmware;
    }

    public void setVciFirmware(String vciFirmware) {
        this.vciFirmware = vciFirmware;
    }

    public String getVciName() {
        return vciName;
    }

    public void setVciName(String vciName) {
        this.vciName = vciName;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

}
