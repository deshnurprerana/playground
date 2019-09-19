package com.example.loginid.Model;

import com.example.loginid.Global.RequestStatus;

import java.io.Serializable;

public class RequestModel implements Serializable {
    String requestnumber;
    RequestStatus requestStatus;
    String Description;


    public String getRequestnumber() {
        return requestnumber;
    }

    public void setRequestnumber(String requestnumber) {
        this.requestnumber = requestnumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
