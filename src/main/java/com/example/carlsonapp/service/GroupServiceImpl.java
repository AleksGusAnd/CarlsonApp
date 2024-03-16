package com.example.carlsonapp.service;

import com.example.carlsonapp.dto.AddGroupRequestDto;
import com.example.carlsonapp.dto.FindGroupDto;
import com.example.carlsonapp.entity.Group;
import com.example.carlsonapp.mapper.GroupMapper;
import com.example.carlsonapp.mapper.GroupMapperImpl;
import com.example.carlsonapp.repository.GroupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Slf4j
public class GroupServiceImpl implements GroupService{
    @Autowired
    private GroupRepository groupRepository;
//----------------------------------------------------------------------------------------------------------------------
    @Override
    @Transactional
    public void addGroup(AddGroupRequestDto addGroupRequestDto) {
        log.info("start adding group with number {}", addGroupRequestDto.getGroupNumber());

        Group group = new Group();
        group.setGroupNumber(addGroupRequestDto.getGroupNumber());
        groupRepository.save(group);

        log.info("finish adding group with number {}", addGroupRequestDto.getGroupNumber());
    }
//----------------------------------------------------------------------------------------------------------------------
    @Override
    @Transactional
    public List<FindGroupDto> getAll() {
        log.info("start finding all group");

        Iterable<Group> groups = groupRepository.findAll();
        GroupMapper groupMapper = new GroupMapperImpl();
        List<FindGroupDto> groupDtos = groupMapper.toDtoList((List<Group>) groups);

        log.info("finish finding all group");
        return groupDtos;
    }
//----------------------------------------------------------------------------------------------------------------------
    @Override
    @Transactional
    public void deleteGroupById(int id) {
        log.info("start deleting group with number");

        groupRepository.deleteById(id);

        log.info("finish deleting group with number");

    }
//----------------------------------------------------------------------------------------------------------------------
}
