package com.cooksys.groupproject.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.AnnouncementResponseDto;
import com.cooksys.groupproject.services.AnnouncementsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnnouncementsServiceImpl implements AnnouncementsService {@Override
	public List<AnnouncementResponseDto> getAllAnnouncements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AnnouncementResponseDto> getAllCompanyAnnouncements(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
