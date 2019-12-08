package com.example.demo.restaurant;

public class Data extends Restaurant{
    private String enName;
    private String arName;
    private String state;
    private String routingMethod;
    private String logo;
    private String coverPhoto;
    private String enDescription;
    private String arDescription;
    private String shortNumber;
    private String facebookLink;
    private String twitterLink;
    private String youtubeLink;
    private String website;
    private Boolean onlinePayment;
    private Boolean client;
    private Boolean pendingInfo;
    private Boolean pendingMenu;
    private Boolean closed;

    public Data(String uuid, String enName, String arName, String state, String routingMethod, String logo, String coverPhoto,
                String enDescription, String arDescription, String shortNumber, String facebookLink, String twitterLink,
                String youtubeLink, String website, Boolean onlinePayment, Boolean client, Boolean pendingInfo, Boolean pendingMenu, Boolean closed) {
        super(uuid);
        this.enName = enName;
        this.arName = arName;
        this.state = state;
        this.routingMethod = routingMethod;
        this.logo = logo;
        this.coverPhoto = coverPhoto;
        this.enDescription = enDescription;
        this.arDescription = arDescription;
        this.shortNumber = shortNumber;
        this.facebookLink = facebookLink;
        this.twitterLink = twitterLink;
        this.youtubeLink = youtubeLink;
        this.website = website;
        this.onlinePayment = onlinePayment;
        this.client = client;
        this.pendingInfo = pendingInfo;
        this.pendingMenu = pendingMenu;
        this.closed = closed;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRoutingMethod() {
        return routingMethod;
    }

    public void setRoutingMethod(String routingMethod) {
        this.routingMethod = routingMethod;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getEnDescription() {
        return enDescription;
    }

    public void setEnDescription(String enDescription) {
        this.enDescription = enDescription;
    }

    public String getArDescription() {
        return arDescription;
    }

    public void setArDescription(String arDescription) {
        this.arDescription = arDescription;
    }

    public String getShortNumber() {
        return shortNumber;
    }

    public void setShortNumber(String shortNumber) {
        this.shortNumber = shortNumber;
    }

    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }

    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getOnlinePayment() {
        return onlinePayment;
    }

    public void setOnlinePayment(Boolean onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public Boolean getClient() {
        return client;
    }

    public void setClient(Boolean client) {
        this.client = client;
    }

    public Boolean getPendingInfo() {
        return pendingInfo;
    }

    public void setPendingInfo(Boolean pendingInfo) {
        this.pendingInfo = pendingInfo;
    }

    public Boolean getPendingMenu() {
        return pendingMenu;
    }

    public void setPendingMenu(Boolean pendingMenu) {
        this.pendingMenu = pendingMenu;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }
}
