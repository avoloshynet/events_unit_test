package com.babbel.testing

class ViewModel(
    private val events: Events,
    private val getUserUseCase: GetUserUseCase
) {
    var someCondition = true

    fun onSomeButtonClicked() {
        if (someCondition) {
            events.trackEvent(EVENT_1, getUserUseCase.getUserName())
        }
    }
    
    fun onSomeOtherButtonClicked(){
        events.trackEvent(EVENT_2, getUserUseCase.getUserName())
    }
    
    companion object{
        const val EVENT_1 =  "event_1"
        const val EVENT_2 =  "event_2"
        const val EVENT_3 =  "event_3"
    }
}