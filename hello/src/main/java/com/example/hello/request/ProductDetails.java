package com.example.hello.request;

public class ProductDetails {

    private String id;

    private String cpu;

    private String ram;

    private String rom;

    private String screen;

    private String port;

    private String camera;

    private String pin;

    private String os;

    private String connect;

    private String size;

    private String color;

    private String image;

    private float weight;

    private String other;

    public ProductDetails() {
    }

    public ProductDetails(String id, String cpu, String ram, String rom, String screen, String port, String camera, String pin, String os, String connect, String size, String color, String image, float weight, String other) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.screen = screen;
        this.port = port;
        this.camera = camera;
        this.pin = pin;
        this.os = os;
        this.connect = connect;
        this.size = size;
        this.color = color;
        this.image = image;
        this.weight = weight;
        this.other = other;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
