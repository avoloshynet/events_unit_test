package com.babbel.testing

class Tracker {
    fun track(trackingEvent: TrackingEvent) {
    }
    
    data class TrackingEvent(val name: String, val user: String, val platform : String)
}