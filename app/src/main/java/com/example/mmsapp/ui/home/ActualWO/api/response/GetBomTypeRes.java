package com.example.mmsapp.ui.home.ActualWO.api.response;

import com.google.gson.annotations.SerializedName;

public class GetBomTypeRes {
    @SerializedName("dt_cd")
    private String dt_cd;

    @SerializedName("dt_nm")
    private String dt_nm;

    public GetBomTypeRes(String dt_cd, String dt_nm) {
        this.dt_cd = dt_cd;
        this.dt_nm = dt_nm;
    }

    public String getDt_cd() {
        return dt_cd;
    }

    public void setDt_cd(String dt_cd) {
        this.dt_cd = dt_cd;
    }

    public String getDt_nm() {
        return dt_nm;
    }

    public void setDt_nm(String dt_nm) {
        this.dt_nm = dt_nm;
    }

    @Override
    public String toString() {
        return dt_nm;
    }
}
