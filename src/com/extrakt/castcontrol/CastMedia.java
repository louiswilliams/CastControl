package com.extrakt.castcontrol;

public class CastMedia {
    private String mTitle;
    private String mVideoUrl;

    /**
     * Creates a new CastMedia object for the media with the given title and URL.
     */
    public CastMedia(String title, String videoUrl) {
        mTitle = title;
        mVideoUrl = videoUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mVideoUrl;
    }
}
