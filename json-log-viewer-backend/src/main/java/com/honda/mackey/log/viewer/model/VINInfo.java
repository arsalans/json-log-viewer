
package com.honda.mackey.log.viewer.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class VINInfo {

    @SerializedName("Update_Info")
    private List<UpdateInfo> updateInfo;
    @SerializedName("VIN")
    private String vIN;

    public List<UpdateInfo> getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(List<UpdateInfo> updateInfo) {
        this.updateInfo = updateInfo;
    }

    public String getVIN() {
        return vIN;
    }

    public void setVIN(String vIN) {
        this.vIN = vIN;
    }

}
