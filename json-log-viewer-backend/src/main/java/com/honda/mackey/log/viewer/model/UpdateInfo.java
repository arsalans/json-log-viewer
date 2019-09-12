
package com.honda.mackey.log.viewer.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class UpdateInfo {

    @SerializedName("Log_Info")
    private List<LogInfo> logInfo;
    @SerializedName("UpdateStartTime")
    private String updateStartTime;

    public List<LogInfo> getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(List<LogInfo> logInfo) {
        this.logInfo = logInfo;
    }

    public String getUpdateStartTime() {
        return updateStartTime;
    }

    public void setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

}
