package ch.heigvd.gen2019;

public abstract class Size {
    public abstract String toString();
}

class XS extends Size {
    @Override
    public String toString() {
        return "XS";
    }
}

class S extends Size {
    @Override
    public String toString() {
        return "S";
    }
}

class M extends Size {
    @Override
    public String toString() {
        return "M";
    }
}

class L extends Size {
    @Override
    public String toString() {
        return "L";
    }
}

class XL extends Size {
    @Override
    public String toString() {
        return "XL";
    }
}

class XXL extends Size {
    @Override
    public String toString() {
        return "XXL";
    }
}

class InvalidSize extends Size {
    @Override
    public String toString() {
        return "Invalid Size";
    }
}
