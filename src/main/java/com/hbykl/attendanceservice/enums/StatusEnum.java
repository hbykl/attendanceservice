package com.hbykl.attendanceservice.enums;

public enum StatusEnum {
    ABSENT(0),
    PRESENT(1);

    public final Integer value;

    private StatusEnum(Integer value) {
        this.value = value;
    }

}
