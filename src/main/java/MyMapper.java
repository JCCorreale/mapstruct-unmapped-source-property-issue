import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR) // ReportingPolicy.WARN
public interface MyMapper {

    @Mapping(target = "nested", source = "mySource")
    // Without this line build would fail with error: Unmapped source properties: "field1, field2"
    @BeanMapping(ignoreUnmappedSourceProperties = { "field1", "field2" })
    MyTarget map(MySource mySource);
}
