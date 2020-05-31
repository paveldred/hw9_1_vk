package ru.netology.domain;

public class PostInfo {

    private GroupInfo groupInfo;
    private String titelPost;
    private double timestampPost;
    private String textPost;
    private String picturePostUri;
    private int likePost;
    private int redirectPost;
    private boolean currentUserRedirected;
    private int viewPost;
    private CommentsInfo commentsInfo;

    public GroupInfo getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(GroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }

    public String getTitelPost() {
        return titelPost;
    }

    public void setTitelPost(String titelPost) {
        this.titelPost = titelPost;
    }

    public double getTimestampPost() {
        return timestampPost;
    }

    public void setTimestampPost(double timestampPost) {
        this.timestampPost = timestampPost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public String getPicturePostUri() {
        return picturePostUri;
    }

    public void setPicturePostUri(String picturePostUri) {
        this.picturePostUri = picturePostUri;
    }

    public int getLikePost() {
        return likePost;
    }

    public void setLikePost(int likePost) {
        this.likePost = likePost;
    }

    public int getRedirectPost() {
        return redirectPost;
    }

    public void setRedirectPost(int redirectPost) {
        this.redirectPost = redirectPost;
    }

    public boolean isCurrentUserRedirected() {
        return currentUserRedirected;
    }

    public void setCurrentUserRedirected(boolean currentUserRedirected) {
        this.currentUserRedirected = currentUserRedirected;
    }

    public int getViewPost() {
        return viewPost;
    }

    public void setViewPost(int viewPost) {
        this.viewPost = viewPost;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}
