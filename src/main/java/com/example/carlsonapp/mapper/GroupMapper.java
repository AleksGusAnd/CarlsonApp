package com.example.carlsonapp.mapper;

import com.example.carlsonapp.dto.FindGroupDto;
import com.example.carlsonapp.entity.Group;
import org.mapstruct.Mapper;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Mapper
public interface GroupMapper {
    FindGroupDto toDto(Group group);
    Group toEntity(FindGroupDto findGroupDto);

    List<FindGroupDto> toDtoList(List<Group> groups);
    List<Group> toEntityList(List<FindGroupDto> findGroupDtos);
}
