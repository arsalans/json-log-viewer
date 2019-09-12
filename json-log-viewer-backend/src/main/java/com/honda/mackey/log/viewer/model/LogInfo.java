
package com.honda.mackey.log.viewer.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class LogInfo {

    @SerializedName("InterfaceID")
    private String interfaceID;
    @SerializedName("Log_Detail")
    private LogDetail logDetail;
    @SerializedName("Process")
    private String process;
    @SerializedName("ProcessIndex")
    private String processIndex;
    @SerializedName("ProcessStartTime")
    private String processStartTime;

    public String getInterfaceID() {
        return interfaceID;
    }

    public void setInterfaceID(String interfaceID) {
        this.interfaceID = interfaceID;
    }

    public LogDetail getLogDetail() {
        return logDetail;
    }

    public void setLogDetail(LogDetail logDetail) {
        this.logDetail = logDetail;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getProcessIndex() {
        return processIndex;
    }

    public void setProcessIndex(String processIndex) {
        this.processIndex = processIndex;
    }

    public String getProcessStartTime() {
        return processStartTime;
    }

    public void setProcessStartTime(String processStartTime) {
        this.processStartTime = processStartTime;
    }

}
