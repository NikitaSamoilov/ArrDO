package org.arriva.core;

import java.math.BigInteger;

class ArrObject<T extends ArrObject> {
    protected BigInteger id;
    protected String name;
    protected T parent;

    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public T getParent() {
        return parent;
    }
}
