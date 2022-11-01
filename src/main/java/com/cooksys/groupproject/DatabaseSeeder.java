package com.cooksys.groupproject;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cooksys.groupproject.entities.Announcements;
import com.cooksys.groupproject.entities.Company;
import com.cooksys.groupproject.entities.Credentials;
import com.cooksys.groupproject.entities.Project;
import com.cooksys.groupproject.entities.Team;
import com.cooksys.groupproject.entities.User;
import com.cooksys.groupproject.repositories.AnnouncementsRepository;
import com.cooksys.groupproject.repositories.CompanyRepository;
import com.cooksys.groupproject.repositories.ProjectRepository;
import com.cooksys.groupproject.repositories.TeamRepository;
import com.cooksys.groupproject.repositories.UserRepository;


import lombok.RequiredArgsConstructor;
@Component
@RequiredArgsConstructor
public class DatabaseSeeder implements CommandLineRunner{
	
    private final UserRepository userRepository;
    private final TeamRepository teamRepository;
    private final CompanyRepository companyRepository;
    private final ProjectRepository projectRepository;
    private final AnnouncementsRepository announcementsRepository;
    
    
	@Override
	public void run(String... args) throws Exception {
		
		//USERS
	        //Credentials
        Credentials user1Cred = new Credentials();
        user1Cred.setUsername("therealmc");
        user1Cred.setPassword("Password");

        User user1 = new User();
        user1.setCredentials(user1Cred);
        user1.setFirstName("Master");
        user1.setLastName("Chief");
        user1.setEmail("sierra117@email.com");
        user1.setPhone("123-456-7890");
        user1.setActive(true);
        user1.setAdmin(false);
        user1.setStatus("Joined");
        
        

        
        // --- User 2 ---
        // Credentials
        Credentials user2Cred = new Credentials();
        user2Cred.setUsername("mario");
        user2Cred.setPassword("password");
        
        User user2 = new User();
        user2.setCredentials(user2Cred);
        user2.setFirstName("Mario");
        user2.setLastName("Mario");
        user2.setEmail("mario@email.com");
        user2.setPhone("234-567-8901");
        user2.setActive(true);
        user2.setAdmin(false);
        user2.setStatus("Joined");

        
        // --- User 3 ---
        Credentials user3Cred = new Credentials();
        // Credentials
        user3Cred.setUsername("Luigi");
        user3Cred.setPassword("Password");

        User user3 = new User();
        user3.setCredentials(user3Cred);
        user3.setFirstName("Luigi");
        user3.setLastName("Mario");
        user3.setEmail("luigi@email.com");
        user3.setPhone("345-678-9012");
        user3.setActive(true);
        user3.setAdmin(false);
        user3.setStatus("Pending");


  

        // --- User 4 ---
        // Credentials
        Credentials user4Cred = new Credentials();
        user4Cred.setUsername("Nathan");
        user4Cred.setPassword("Password");

        User user4 = new User();
        user4.setCredentials(user4Cred);
        user4.setFirstName("Nathan");
        user4.setLastName("Drake");
        user4.setEmail("nathan@email.com");
        user4.setPhone("456-789-0023");
        user4.setActive(true);
        user4.setAdmin(false);
        user4.setStatus("Joined");

        // --- User 5 ---
        // Credentials
        Credentials user5Cred = new Credentials();
        user5Cred.setUsername("Tarnished");
        user5Cred.setPassword("Password");

        User user5 = new User();
        user5.setCredentials(user5Cred);
        user5.setFirstName("The");
        user5.setLastName("Tarnished");
        user5.setEmail("willibecometheeldenlord@email.com");
        user5.setPhone("567-890-0034");
        user5.setActive(false);
        user5.setAdmin(false);
        user5.setStatus("Pending");

        userRepository.saveAllAndFlush(Arrays.asList(user1, user2, user3, user4, user5));
        
        
        //COMPANIES
        
        
        Company company1 = new Company();
        company1.setName("FedEx");
        company1.setDescription("Your friendly neighborhood package delivery");
        
        Company company2 = new Company();
        company2.setName("Cook Systems");
        company2.setDescription("The Origin of FastTrack");
        
        Company company3 = new Company();
        company3.setName("Google");
        company3.setDescription("The answer to life");
        
        companyRepository.saveAllAndFlush(Arrays.asList(company1, company2, company3));
        

        //TEAMS
        Team team1 = new Team();
        team1.setName("Team One");
        team1.setDescription("The awesome team");
        team1.setCompany(company1);
        
        Team team2 = new Team();
        team2.setName("Team Two");
        team2.setDescription("The smart team");
        team2.setCompany(company2);
        
        Team team3 = new Team();
        team3.setName("Team Three");
        team3.setDescription("The cool team");
        team3.setCompany(company3);
        
        teamRepository.saveAllAndFlush(Arrays.asList(team1, team2, team3));
        
        
        //PROJECTS
        Project project1= new Project();
        project1.setName("Project One");
        project1.setDescription("World Domination");
        project1.setActive(true);
        project1.setTeam(team1);
        
        Project project2= new Project();
        project2.setName("Project Two");
        project2.setDescription("Top Secret");
        project2.setActive(true);
        project2.setTeam(team2);
        
        Project project3= new Project();
        project3.setName("Project Three");
        project3.setDescription("Y2k");
        project3.setActive(false);
        project3.setTeam(team3);
        
        projectRepository.saveAllAndFlush(Arrays.asList(project1, project2, project3));
        
        
        //ANNOUNCEMENTS
        Announcements a1 = new Announcements();
        a1.setTitle("Announcement 1");
        a1.setMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
		a1.setCompany(company1);
		a1.setUser(user4);
		
        Announcements a2 = new Announcements();
        a2.setTitle("Announcement 2");
        a2.setMessage("consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
		a2.setCompany(company2);
		a2.setUser(user1);
		
        Announcements a3 = new Announcements();
        a3.setTitle("Announcement 3");
        a3.setMessage("sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
		a3.setCompany(company3);
		a3.setUser(user2);
		
        Announcements a4 = new Announcements();
        a4.setTitle("Announcement 4");
        a4.setMessage("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
		a4.setCompany(company3);
		a4.setUser(user5);
		
        Announcements a5 = new Announcements();
        a5.setTitle("Announcement 5");
        a5.setMessage("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, ");
		a5.setCompany(company1);
		a5.setUser(user2);

		
		announcementsRepository.saveAllAndFlush(Arrays.asList(a1, a2, a3, a4, a5));
	}

}
