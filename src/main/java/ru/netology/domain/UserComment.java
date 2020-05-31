package ru.netology.domain;

public class UserComment {
    private int idUser;
    private String logoUserUri;
    private boolean haveResponse;
    private int countResponse;
    private double timestampUserComment;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLogoUserUri() {
        return logoUserUri;
    }

    public void setLogoUserUri(String logoUserUri) {
        this.logoUserUri = logoUserUri;
    }

    public boolean isHaveResponse() {
        return haveResponse;
    }

    public void setHaveResponse(boolean haveResponse) {
        this.haveResponse = haveResponse;
    }

    public int getCountResponse() {
        return countResponse;
    }

    public void setCountResponse(int countResponse) {
        this.countResponse = countResponse;
    }

    public double getTimestampUserComment() {
        return timestampUserComment;
    }

    public void setTimestampUserComment(double timestampUserComment) {
        this.timestampUserComment = timestampUserComment;
    }
}
