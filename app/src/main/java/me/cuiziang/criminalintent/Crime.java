package me.cuiziang.criminalintent;

import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

}
