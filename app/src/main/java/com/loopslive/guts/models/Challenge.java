package com.loopslive.guts.models;

public class Challenge {
    int id;
    String title;
    String description;
    String cover;
    int point;
    int expireTime;
    String level;
    int status;

    public Challenge(int id, String title, String description, String cover, int point, int expireTime, String level, int status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.cover = cover;
        this.point = point;
        this.expireTime = expireTime;
        this.level = level;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCover() {
        return cover;
    }

    public int getPoint() {
        return point;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public String getLevel() {
        return level;
    }

    public int getStatus() {
        return status;
    }
}
