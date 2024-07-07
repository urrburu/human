package com.resource.service;

import com.resource.entity.Attendance;

import java.util.List;

public interface AttendanceService {
    public List<Attendance> list(Integer page, Integer size);
}
