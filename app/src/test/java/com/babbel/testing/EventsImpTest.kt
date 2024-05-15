package com.babbel.testing

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.times
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import kotlin.IllegalArgumentException

class EventsImpTest {
    // Create a mock of Tracker
    private lateinit var mockTracker: Tracker

    // Instance of Events which will use the mocked Tracker
    private lateinit var events: Events

    @Before
    fun setUp() {
        // Initialize the mock before each test
        mockTracker = mock()

        // Create an instance of Events with the mocked Tracker
        events = Events(mockTracker)
    }

    @Test
    fun `trackEvent sends correct data to tracker`() {
        // Given a name and a user
        val eventName = "login_success"
        val userName = "user123"

        // When trackEvent is called
        events.trackEvent(eventName, userName)

        // Then verify that the tracker's track method is called with the correct parameters
        verify(mockTracker,times(1)).track(Tracker.TrackingEvent(eventName, userName, "platform"))
    }

}