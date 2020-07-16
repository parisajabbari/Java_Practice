package com.mytube;

public class VideoProcessor {

    private VideoEncoder videoEncoder;
    private VideoDatabase database;
    private NotificationService Notification;

    public VideoProcessor(VideoEncoder videoEncoder, VideoDatabase database, NotificationService Notification) {
        this.videoEncoder = videoEncoder;
        this.database = database;
        this.Notification = Notification;
    }

    public void process(Video video) {
        videoEncoder.encode(video);
        database.store(video);
        Notification.notify(video.getUser());
    }
}

