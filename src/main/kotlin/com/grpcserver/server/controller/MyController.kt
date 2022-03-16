package com.grpcserver.server.controller

import com.grpcserver.server.DTO.UserRepository
import com.grpcserver.server.entity.User
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import poc.grpc.proto.*


@GrpcService
@RestController
class MyController(
        @Autowired
        var userRepository: UserRepository
)
    :UserServiceGrpc.UserServiceImplBase()
{


    @PostMapping("/user")
    fun hi(@RequestBody user:User) : User
    {
        return userRepository.save(user)
    }

    @GetMapping("/user")
    fun hi() : MutableIterable<User>
    {
        return userRepository.findAll()
    }


    override fun user(request: UserRequest?, responseObserver: StreamObserver<UserResponse>?)
    {
        if (request != null) {
            userRepository.save(User(request.firstName , request.lastName , request.age , request.rollNo))
        }
        val ans: UserResponse? = UserResponse.newBuilder().setRes1("User ").setRes2("saved").build()
        if (responseObserver != null) {
            responseObserver.onNext(ans)
            responseObserver.onCompleted()
        }
    }



    }