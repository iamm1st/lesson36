package by.homework.dto;

public class UserService {

    private final UserRepository userRepository = new UserRepository();
    private final UserMapper userMapper = new UserMapper();

    public UserDto getUserDtoById(int id) {
        User user = userRepository.findById(id);

        if (user == null) {
            return null;
        }

        return userMapper.toDto(user);
    }
}