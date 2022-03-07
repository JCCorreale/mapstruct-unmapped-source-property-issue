import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

// ReportingPolicy.WARN produces warning Unmapped source properties: "field1, field2" if ignoreUnmappedSourceProperties is not specified
@Mapper(unmappedSourcePolicy = ReportingPolicy.ERROR)
public interface MyMapper {

    @Mapping(target = "nested", source = "mySource")
    // Without this line build would fail with error: Unmapped source properties: "field1, field2"
    @BeanMapping(ignoreUnmappedSourceProperties = { "field1", "field2" })
    MyTarget map(MySource mySource);
}
