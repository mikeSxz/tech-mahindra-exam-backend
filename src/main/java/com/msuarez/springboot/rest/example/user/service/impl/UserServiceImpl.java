package com.msuarez.springboot.rest.example.user.service.impl;

import com.msuarez.springboot.rest.example.user.entity.UserEntity;
import com.msuarez.springboot.rest.example.user.model.User;
import com.msuarez.springboot.rest.example.user.repository.UserRepository;
import com.msuarez.springboot.rest.example.user.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Page<User> getAllUsers(Pageable pageable) {
        Page<UserEntity> userEntities = userRepository.findAll(pageable);
        return userEntities.map(userEntity -> modelMapper.map(userEntity, User.class));
    }

    @Override
    public User getUserById(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElse(null);
        return (userEntity != null) ? modelMapper.map(userEntity, User.class) : null;
    }

    @Override
    public User createUser(User userModel) {
        UserEntity userEntity = modelMapper.map(userModel, UserEntity.class);
        userEntity = userRepository.save(userEntity);
        return modelMapper.map(userEntity, User.class);
    }

    @Override
    public User updateUser(Long id, User userModel) {
        userModel.setId(id);
        UserEntity existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            modelMapper.map(userModel, existingUser);
            existingUser = userRepository.save(existingUser);
            return modelMapper.map(existingUser, User.class);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
