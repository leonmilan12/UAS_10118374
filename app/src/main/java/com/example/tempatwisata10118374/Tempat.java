//11 Agustus 2021, 10118374, Leonardo D Y Korompis, IF-9
package com.example.tempatwisata10118374;

import android.os.Parcel;
import android.os.Parcelable;

public class Tempat implements Parcelable {
    private String name;
    private String address;
    private int photo;
    private double latitude;
    private double longitude;

    protected Tempat(Parcel in) {
        name = in.readString();
        address = in.readString();
        photo = in.readInt();
        latitude = in.readDouble();
        longitude = in.readDouble();
    }

    public static final Creator<Tempat> CREATOR = new Creator<Tempat>() {
        @Override
        public Tempat createFromParcel(Parcel in) {
            return new Tempat(in);
        }

        @Override
        public Tempat[] newArray(int size) {
            return new Tempat[size];
        }
    };

    public Tempat(int icon, String name, double lat, double lng, String address) {
        this.photo = icon;
        this.name = name;
        this.latitude = lat;
        this.longitude = lng;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAlamat(String address) {
        this.address = address;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeInt(photo);
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
    }

    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }
}
