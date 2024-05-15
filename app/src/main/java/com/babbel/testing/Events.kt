package com.babbel.testing

class Events(val tracker: Tracker) {
    fun trackEvent(name: String, user: String) {
        tracker.track(Tracker.TrackingEvent(name, user, "platform"))
    }
}