package TestNG;


import org.testng.annotations.Factory;

public class Factory_Object_ {
    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new Factory_(),
                new Factory_(),
                new Factory_(),
                new Factory_(),
        };
    }
}
