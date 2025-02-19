package com.everstage.juiceshop.pojo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public class ReqBodyForCardCreationBuilder {
    private String fullName;
    private long cardNum;
    private int expMonth;
    private int expYear;
}
