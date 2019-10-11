package com.example.loginid.ModelTwo;

import java.io.Serializable;

public class RequisitionModel implements Serializable {
    String requisitiondescription;

    public String getrequisitiondescription() {
        return requisitiondescription ;
    }

    public void setrequisitiondescription(String requisitiondescription) {
        this.requisitiondescription = requisitiondescription;
    }
}
