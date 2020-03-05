package com.fuchuang.race.model;


public class AppUser{
    private String userId;

    private String nickName;

    private String phoneNum;

    private String imgUrl;

    private String cityName;

    private String passWord;

    private Integer carbonCoin;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public Integer getCarbonCoin() {
        return carbonCoin;
    }

    public void setCarbonCoin(Integer carbonCoin) {
        this.carbonCoin = carbonCoin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", nickName=").append(nickName);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", cityName=").append(cityName);
        sb.append(", passWord=").append(passWord);
        sb.append(", carbonCoin=").append(carbonCoin);
        sb.append("]");
        return sb.toString();
    }
}