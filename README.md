# Issue Description

The issue is easily reproducible with this simple mapping:

```
@Mapping(target = "nested", source = "mySource")
MyTarget map(MySource mySource);
```

Where `MyTarget.nested` is of type `MySource`

When `unmappedSourcePolicy` is set to `ReportingPolicy.ERROR`, the report produces `Unmapped source properties` error (or warning in the case of `ReportingPolicy.WARN`)

The mapping code is generated correctly. For `ReportingPolicy.ERROR` is set, the following workaround is necessary in order to get a successful build:

`@BeanMapping(ignoreUnmappedSourceProperties = { "field1", "field2" })`

Where `"field1", "field2"` are the fields of MySource

MapStruct version is `1.4.2.Final`

# Possibly related issues

https://github.com/mapstruct/mapstruct/issues/2253
