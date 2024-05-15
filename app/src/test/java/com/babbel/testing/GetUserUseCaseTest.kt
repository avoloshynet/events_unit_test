package com.babbel.testing

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.mock

class GetUserUseCaseTest {

    private lateinit var getUser: GetUserUseCase

    @Before
    fun setUp() {
        getUser = GetUserUseCase()
    }


    @Test
    fun `track that getUserName returns John Doe`() {
        val user = getUser.getUserName()
        Assert.assertEquals(user, "John Doe")
    }
}