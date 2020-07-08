package com.distribuidos.formulario.models;

import com.mongodb.lang.NonNull;
import com.sun.istack.internal.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Formulary {

    @Id
    private String id;

    @NonNull
    private String name;

    @NotNull
    private String rut;

    @NotNull
    private String motive;

    @NotNull
    private Date requestTime;

    @NotNull
    private Date expirationTime;

    //public Formulary(){ }


    public String getId(){
        return id;
    }

    public void setName(String name){ this.name = name; }

    public String getName() {
        return name;
    }

    public String getRut() { return rut;   }

    public void setRut(String rut) { this.rut = rut;  }

    public String getMotive() { return motive; }

    public void setMotive(String motive) { this.motive = motive;  }

    public Date getRequestTime() { return requestTime;  }

    public void setRequestTime(Date requestTime) {  this.requestTime = requestTime;  }

    public Date getExpirationTime() {  return expirationTime; }

    public void setExpirationTime(Date expirationTime) {  this.expirationTime = expirationTime;  }
}
