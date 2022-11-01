package com.cooksys.groupproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.cooksys.groupproject.dtos.AnnouncementRequestDto;
import com.cooksys.groupproject.dtos.AnnouncementResponseDto;
import com.cooksys.groupproject.entities.Announcements;

@Mapper(componentModel = "spring")
public interface AnnouncementsMapper {
	
	Announcements requestDtoToEntity(AnnouncementRequestDto announcementRequestDto);
	
	AnnouncementResponseDto entityToResponseDto(Announcements announcement);
	
	List<AnnouncementResponseDto> entitiesToResponseDtos(List<Announcements> announcements);

}
