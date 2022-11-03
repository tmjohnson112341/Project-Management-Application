package com.cooksys.groupproject.services;

import com.cooksys.groupproject.dtos.AnnouncementResponseDto;

import java.util.List;

public interface AnnouncementsService {

    List<AnnouncementResponseDto> getAllAnnouncements();

    List<AnnouncementResponseDto> getAllCompanyAnnouncements(Long id);
}
