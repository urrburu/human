package com.resource.service;

import com.resource.entity.Attendance;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service@RequiredArgsConstructor
public class AttendanceServiceImpl implements AttendanceService{

    @Override
    public List<Attendance> list(Integer page, Integer size) {
        return List.of();ß
    }
}
