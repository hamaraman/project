package com.example.demo.controller;

public class UploadResponse {

    private boolean success;
    private String message;
    private Long id;
    private String videoUrl;
    private String thumbnailUrl;
    private String title;
    private String description;
    private String channel;
    private String duration;
    private String visibility;
    private String category;
    private String avatar;
    private String embedUrl;
    private String date;

    public UploadResponse() {
    }

    public UploadResponse(
            boolean success,
            String message,
            String videoUrl,
            String thumbnailUrl,
            String title,
            String description,
            String channel,
            String duration,
            String visibility
    ) {
        this.success = success;
        this.message = message;
        this.videoUrl = videoUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
        this.description = description;
        this.channel = channel;
        this.duration = duration;
        this.visibility = visibility;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Long getId() {
        return id;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getChannel() {
        return channel;
    }

    public String getDuration() {
        return duration;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getCategory() {
        return category;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public String getDate() {
        return date;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public void setDate(String date) {
        this.date = date;
    }
}