
import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0011"}, d2 = {"LLinearLayoutPagerAdapter;", "T", "Landroidx/viewpager/widget/PagerAdapter;", "items", "", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "setItems", "getCount", "", "isViewFromObject", "", "view", "Landroid/view/View;", "object", "", "shared_release"})
public final class LinearLayoutPagerAdapter<T extends java.lang.Object> extends androidx.viewpager.widget.PagerAdapter {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends T> items;
    
    public LinearLayoutPagerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> p0) {
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return false;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
}