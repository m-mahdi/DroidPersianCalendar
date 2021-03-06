package com.byagowi.persiancalendar.reminder.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReminderModel extends ViewModel {
    public final MutableLiveData<Boolean> updateHandler = new MutableLiveData<>();

    public void update(boolean isNew) {
        updateHandler.postValue(isNew);
    }
}
