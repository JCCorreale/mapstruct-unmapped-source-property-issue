package example2;

public class MyTarget {

    private String someOtherField;

    private MyNestedTarget nested;

    public String getSomeOtherField() {
        return someOtherField;
    }

    public void setSomeOtherField(String someOtherField) {
        this.someOtherField = someOtherField;
    }

    public MyNestedTarget getNested() {
        return nested;
    }

    public void setNested(MyNestedTarget nested) {
        this.nested = nested;
    }
}
