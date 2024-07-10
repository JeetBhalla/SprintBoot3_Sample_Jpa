package dev.Jeet.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PracticeApplication {

	private final RoleRepository roleRepository;
	private final UsersRepository userRepository;

    public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}
	public PracticeApplication(RoleRepository roleRepository, UsersRepository userRepository) {
		this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

	@GetMapping("/role/v1/roles")
	public List<Role> getRoles(){
		return roleRepository.findAll();
	}
	@GetMapping("/greet")
	public GreetUser greet() {
		return new GreetUser(
				"Hello",
				List.of("Java", "Python"),
				new Person("Jitender"));
	}
	record Person(String Name){};

	record GreetUser(String value,
					 List<String> favlanguage,
					 Person p	){};


	@GetMapping("/user/v1/corporateusers")
	public List<Users> corporateusers() {
		return userRepository.getUSers();
	}
}






