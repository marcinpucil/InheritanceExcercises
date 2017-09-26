package Excercise4;

public enum Colours {
    RED {
    public Colours getRed() {
        return Colours.RED;
    }
},
    BLUE {
        public Colours getBlue() {
            return Colours.BLUE;
        }
    },
    GREEN {
        public Colours getGreen() {
            return Colours.GREEN;
        }
    },
    CYAN {
        public Colours getCyan() {
            return Colours.CYAN;
        }
    },
    MAGENTA {
        public Colours getMagenta() {
            return Colours.MAGENTA;
        }
    },
    YELLOW {
        public Colours getYellow() {
            return Colours.YELLOW;
        }
    },
    WHITE {
        public Colours getWhite() {
            return Colours.WHITE;
        }
    }
}
