package com.cooksys.groupproject.controllers;

import com.cooksys.groupproject.dtos.AnnouncementResponseDto;
import com.cooksys.groupproject.services.AnnouncementsService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;



import java.util.List;


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

