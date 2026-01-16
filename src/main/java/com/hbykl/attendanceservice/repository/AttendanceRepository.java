package com.hbykl.attendanceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbykl.attendanceservice.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
