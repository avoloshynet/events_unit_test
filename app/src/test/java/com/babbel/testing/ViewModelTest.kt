package com.babbel.testing

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.times
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify

class ViewModelTest
{
    lateinit var mockEvents: Events
    private val mockgetUserUseCase: GetUserUseCase = mock { on { getUserName() } doReturn "John Doe"}
    lateinit var viewmodel: ViewModel

    @Before
    fun setUp() {
        // Initialize the mock before each test
        mockEvents = mock()


        // Create an instance of Events with the mocked Tracker
        viewmodel = ViewModel(mockEvents, mockgetUserUseCase)
    }

    @Test
    fun `track that onSomeOtherButtonClicked called trackEvent with correct data`() {
        viewmodel.onSomeOtherButtonClicked()
        Assert.assertTrue(viewmodel.someCondition)
        verify(mockEvents, times(1)).trackEvent("event_2","John Doe")
    }

    @Test
    fun `track that onSomeButtonClicked called trackEvent with correct data`() {
        viewmodel.onSomeButtonClicked()
        Assert.assertTrue(viewmodel.someCondition)
        verify(mockEvents, times(1)).trackEvent("event_1","John Doe")
    }

}