package ru.netology.domain;

public class CommentsInfo {
    private int countComments;
    private boolean canOpenMoreComments;
    private UserComment userComment;

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public boolean isCanOpenMoreComments() {
        return canOpenMoreComments;
    }

    public void setCanOpenMoreComments(boolean canOpenMoreComments) {
        this.canOpenMoreComments = canOpenMoreComments;
    }

    public UserComment getUserComment() {
        return userComment;
    }

    public void setUserComment(UserComment userComment) {
        this.userComment = userComment;
    }
}
