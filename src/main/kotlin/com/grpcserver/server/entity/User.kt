package com.grpcserver.server.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "users")
data class User
(
        @Id
        var firstName: String = "",
        var lastName: String = "",
        var age: Int  = 0,
        var rollNo: Int = 0
)
{
}