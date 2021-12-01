package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.UserTable;
import Repository.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public List<UserTable> getmany() {
	return	userRepository.findAll();
		}

}
