package com.example.carlsonapp.service;

import com.example.carlsonapp.dto.AddGroupRequestDto;
import com.example.carlsonapp.dto.FindGroupDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GroupService {
    void addGroup(AddGroupRequestDto addGroupRequestDto);
    List<FindGroupDto> getAll();
    void deleteGroupById(int id);
}
