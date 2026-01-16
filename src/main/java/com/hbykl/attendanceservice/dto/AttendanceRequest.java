package com.hbykl.attendanceservice.dto;

import java.sql.Date;

import com.hbykl.attendanceservice.enums.StatusEnum;

public class AttendanceRequest {
    private Long studentId;
    private Date date;
    private StatusEnum status;
    private String note;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
