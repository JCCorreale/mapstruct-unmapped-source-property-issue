package example2;

import org.junit.Assert;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

public class MapStructUnmappedSourcePropertyIssueTest {

    @org.junit.Test
    public void test() {
        MyMapper mapper = Mappers.getMapper(MyMapper.class);

        MySource mySource = new MySource();

        mySource.setField1(UUID.randomUUID().toString());
        mySource.setField2(UUID.randomUUID().toString());

        String someValue = UUID.randomUUID().toString();

        MyTarget myTarget = mapper.map(mySource, someValue);

        Assert.assertEquals(mySource.getField1(), myTarget.getNested().getField1());
        Assert.assertEquals(mySource.getField2(), myTarget.getNested().getField2());
        Assert.assertEquals(someValue, myTarget.getSomeOtherField());
    }
}
