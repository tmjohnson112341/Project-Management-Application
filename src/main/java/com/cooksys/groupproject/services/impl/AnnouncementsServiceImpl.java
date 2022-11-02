package com.cooksys.groupproject.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.AnnouncementResponseDto;
import com.cooksys.groupproject.entities.Announcements;
import com.cooksys.groupproject.mappers.AnnouncementsMapper;
import com.cooksys.groupproject.repositories.AnnouncementsRepository;
import com.cooksys.groupproject.repositories.CompanyRepository;
import com.cooksys.groupproject.repositories.UserRepository;
import com.cooksys.groupproject.services.AnnouncementsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnnouncementsServiceImpl implements AnnouncementsService {

	private final AnnouncementsRepository announcementsRepository;
	private final AnnouncementsMapper announcementsMapper;
	private final UserRepository userRepository;
	private final CompanyRepository companyRepository;



	@Override
	public List<AnnouncementResponseDto> getAllAnnouncements() {
		return announcementsMapper.entitiesToResponseDtos(announcementsRepository.findAll());
	}

	@Override
	public List<AnnouncementResponseDto> getAllCompanyAnnouncements(Long id) {
		List<Announcements> companyAnnouncements = announcementsRepository.findAll();

		List<Announcements> tempAnnouncements = new ArrayList<>();
		for (Announcements announcements : companyAnnouncements) {
			if (announcements.getCompany().getId() == (id)){
				tempAnnouncements.add(announcements);
			}
		}
		return announcementsMapper.entitiesToResponseDtos(tempAnnouncements);
	}

}
