package com.distribuidos.formulario.models;

import com.fasterxml.jackson.annotation.JsonFormat;
//import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Formulary {

    @Id
    private String id;

    private String name;

    private String rut;

    private String motive;

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
}
