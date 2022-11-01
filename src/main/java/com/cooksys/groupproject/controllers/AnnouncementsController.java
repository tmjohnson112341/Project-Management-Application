package com.cooksys.groupproject.controllers;

import com.cooksys.groupproject.dtos.AnnouncementResponseDto;
import com.cooksys.groupproject.services.AnnouncementsService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/announcements")
@SpringBootApplication

public class AnnouncementsController {

	
    private AnnouncementsService announcementsService;

        @GetMapping
        public List<AnnouncementResponseDto> getAllAnnouncements () {
            return announcementsService.getAllAnnouncements();
        }

        @GetMapping("/{companyId}")
        public List<AnnouncementResponseDto> getAllCompanyAnnouncements (@PathVariable Long id){
            return announcementsService.getAllCompanyAnnouncements(id);
        }
    }

