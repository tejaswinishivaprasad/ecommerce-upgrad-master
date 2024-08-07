package com.upgrad.ecommerce;

import com.upgrad.ecommerce.models.ERole;
import com.upgrad.ecommerce.models.Role;
import com.upgrad.ecommerce.models.User;
import com.upgrad.ecommerce.repositories.RoleRepository;
import com.upgrad.ecommerce.repositories.UserRepository;
import com.upgrad.ecommerce.services.RoleService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class SetupRoles implements ApplicationListener<ApplicationReadyEvent> {
	private final List<ERole> roles = List.of(ERole.ADMIN, ERole.USER);

	private final RoleService roleService;

	private final PasswordEncoder encoder;

	private final UserRepository userRepository;

	private final RoleRepository roleRepository;

	public SetupRoles(RoleService roleService, PasswordEncoder encoder, UserRepository userRepository,
			RoleRepository roleRepository) {
		this.roleService = roleService;
		this.encoder = encoder;
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// TODO Auto-generated method stub

	}

//    @Override
//    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
//    	System.out.println("onapplication event");
//        for (ERole role : roles) {
//            try {
//                roleService.create(role);
//                System.out.println("Role Created " + role.name());
//            } catch (Exception e) {
//                System.out.println("Skipping Role Creation");
//            }
//        }
//
//        //create admin user, after creating all roles
//        try {
//            User user = new User();
//			user.setFirstName("Teju");
//            user.setLastName("Arun");
//            user.setEmail("teju@gmail.com");
//            user.setPassword(encoder.encode("Arun@123"));
//            Set<Role> roles = new HashSet<>();
//            Role userRole = roleRepository.findByName(ERole.ADMIN).orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//            roles.add(userRole);
//            user.setRoles(roles);
//            user.setContactNumber("9911223344");
//            userRepository.save(user);
//            System.out.println("Admin User Created " + user.getEmail());
//        } catch (Exception e) {
//            System.out.println("Skipping Admin User Creation");
//        }
//    }
}