package com.example.carlsonapp.controller;

import com.example.carlsonapp.dto.AddGroupRequestDto;
import com.example.carlsonapp.dto.FindGroupDto;
import com.example.carlsonapp.entity.Group;
import com.example.carlsonapp.service.GroupService;
import com.example.carlsonapp.service.GroupServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(path = "/groups")
@Tag(name = "Конторллер")
public class GroupController {

    @Autowired
    private GroupService groupService;
//----------------------------------------------------------------------------------------------------------------------
    @PostMapping
    @Operation(summary = "Добавление группы")
    public void addGroup(@RequestBody AddGroupRequestDto addGroupRequestDto){
        groupService.addGroup(addGroupRequestDto);
    }
//----------------------------------------------------------------------------------------------------------------------
    @GetMapping
    @Operation(summary = "Получение списка всех групп")
    public List<FindGroupDto> getAll(){
        return groupService.getAll();
    }
//----------------------------------------------------------------------------------------------------------------------
    @DeleteMapping("/{id}")
    @Operation(summary = "Удалеение группы по её id")
    protected void deleteGroup(@PathVariable int id){
        groupService.deleteGroupById(id);
    }
//----------------------------------------------------------------------------------------------------------------------
    @PutMapping
    @Operation(summary = "Исключение")
    public void putGroup(){
        throw new OwnException("error");
    }
//----------------------------------------------------------------------------------------------------------------------
}