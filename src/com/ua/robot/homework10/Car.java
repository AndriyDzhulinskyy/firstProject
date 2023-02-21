package com.ua.robot.homework10;

    public class Car {

        protected String model;
        protected String color;
        protected int year;
        protected int horsepower;

        public Car() {
        }

        public Car(String model, String color, int year, int horsepower) {
            this.model = model;
            this.color = color;
            this.year = year;
            this.horsepower = horsepower;
        }


        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(int horsepower) {
            this.horsepower = horsepower;
        }

        public String typeOfCar() {
            return "Undefined";
        }

        @Override
        public String toString(){
            return "Car {" +
                    "model='" + model + "\'" +
                    ", color=" + color +
                    ", year=" + year +
                    ", horsepower=" + horsepower +
                    "}";
        }

    }
