package com.example.hellorestmaven.user;

public class UserResponse{
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public UserResponse(int id, String name, String username, String email, Address address, String phone, String website, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public String getWebsite(){
        return website;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCompany(Company company){
        this.company = company;
    }

    public Company getCompany(){
        return company;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }
}

class Company{
    private String name;
    private String catchPhrase;
    private String bs;

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public void setBs(String bs){
        this.bs = bs;
    }

    public String getBs(){
        return bs;
    }

    public void setCatchPhrase(String catchPhrase){
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase(){
        return catchPhrase;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Geo{
    private String lat;
    private String lng;

    public Geo(String lat, String lng) {
        this.lng = lng;
        this.lat = lat;
    }

    public void setLng(String lng){
        this.lng = lng;
    }

    public String getLng(){
        return lng;
    }

    public void setLat(String lat){
        this.lat = lat;
    }

    public String getLat(){
        return lat;
    }
}

class Address{
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public void setZipcode(String zipcode){ this.zipcode = zipcode; }

    public String getZipcode(){ return zipcode; }

    public void setGeo(Geo geo){ this.geo = geo; }

    public Geo getGeo(){ return geo; }

    public void setSuite(String suite){ this.suite = suite; }

    public String getSuite(){ return suite; }

    public void setCity(String city){ this.city = city; }

    public String getCity(){ return city; }

    public void setStreet(String street){ this.street = street; }

    public String getStreet(){ return street; }
}