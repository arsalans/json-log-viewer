
package com.honda.mackey.log.viewer.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class MacKeyLogFile {

    @SerializedName("VIN_Info")
    private List<VINInfo> vINInfo;

    public List<VINInfo> getVINInfo() {
        return vINInfo;
    }

    public void setVINInfo(List<VINInfo> vINInfo) {
        this.vINInfo = vINInfo;
    }

}
