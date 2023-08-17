package designpatterns;

import lombok.ToString;

@ToString
public class CarWithBuilder {
    private String name;
    private int noDoors;

    public CarWithBuilder(CarBuilder carBuilder) {
        this.name = carBuilder.name;
        this.noDoors = carBuilder.noDoors;
    }

    static class CarBuilder {
        private String name;
        private int noDoors;

        public CarBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder doors(int noDoors) {
            this.noDoors = noDoors;
            return this;
        }

        public CarWithBuilder build() {
            return new CarWithBuilder(this);
        }
    }
}
