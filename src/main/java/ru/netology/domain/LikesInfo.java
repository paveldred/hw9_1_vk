package ru.netology.domain;

public class LikesInfo {
    private boolean currentUserLike;
    private int countLikes;

    public boolean isCurrentUserLike() {
        return currentUserLike;
    }

    public void setCurrentUserLike(boolean currentUserLike) {
        this.currentUserLike = currentUserLike;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }
}
