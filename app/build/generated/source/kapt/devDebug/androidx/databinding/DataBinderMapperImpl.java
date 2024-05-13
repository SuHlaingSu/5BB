package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.fivebb.selfcare.DataBinderMapperImpl());
  }
}
