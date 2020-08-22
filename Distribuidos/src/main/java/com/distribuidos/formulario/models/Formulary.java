package com.distribuidos.formulario.models;

import com.fasterxml.jackson.annotation.JsonFormat;
//import org.jetbrains.annotations.NotNull;
import com.mongodb.lang.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Formulary {

    @Id
    private String id;

    private String name;

    private String address;

    private String rut;

    private String motive;

    private Boolean is_valid = true;

    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private LocalDateTime requestTime;

    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private LocalDateTime expirationTime;


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

    public LocalDateTime getRequestTime() { return requestTime;  }

    public void setRequestTime(LocalDateTime requestTime) {  this.requestTime = requestTime;  }

    public LocalDateTime getExpirationTime() {  return expirationTime; }

    public void setExpirationTime(LocalDateTime expirationTime) {  this.expirationTime = expirationTime;  }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public Boolean getIs_valid() { return is_valid; }

    public void setIs_valid(Boolean is_valid) { this.is_valid = is_valid; }
}
