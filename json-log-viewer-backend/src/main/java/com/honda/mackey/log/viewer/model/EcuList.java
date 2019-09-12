
package com.honda.mackey.log.viewer.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class EcuList {

    @Expose
    private String canId;
    @Expose
    private String cmac;
    @Expose
    private String ecuType;
    @Expose
    private String hwPartsNo;
    @Expose
    private String keyAttr;
    @Expose
    private String sreg;
    @Expose
    private String supId;
    @Expose
    private String swPartsNo;
    @Expose
    private String uid;

    public String getCanId() {
        return canId;
    }

    public void setCanId(String canId) {
        this.canId = canId;
    }

    public String getCmac() {
        return cmac;
    }

    public void setCmac(String cmac) {
        this.cmac = cmac;
    }

    public String getEcuType() {
        return ecuType;
    }

    public void setEcuType(String ecuType) {
        this.ecuType = ecuType;
    }

    public String getHwPartsNo() {
        return hwPartsNo;
    }

    public void setHwPartsNo(String hwPartsNo) {
        this.hwPartsNo = hwPartsNo;
    }

    public String getKeyAttr() {
        return keyAttr;
    }

    public void setKeyAttr(String keyAttr) {
        this.keyAttr = keyAttr;
    }

    public String getSreg() {
        return sreg;
    }

    public void setSreg(String sreg) {
        this.sreg = sreg;
    }

    public String getSupId() {
        return supId;
    }

    public void setSupId(String supId) {
        this.supId = supId;
    }

    public String getSwPartsNo() {
        return swPartsNo;
    }

    public void setSwPartsNo(String swPartsNo) {
        this.swPartsNo = swPartsNo;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
