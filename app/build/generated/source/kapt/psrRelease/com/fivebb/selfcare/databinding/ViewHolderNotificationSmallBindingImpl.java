package com.fivebb.selfcare.databinding;
import com.fivebb.selfcare.R;
import com.fivebb.selfcare.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ViewHolderNotificationSmallBindingImpl extends ViewHolderNotificationSmallBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.checkbox, 1);
        sViewsWithIds.put(R.id.card, 2);
        sViewsWithIds.put(R.id.container, 3);
        sViewsWithIds.put(R.id.ivLogo, 4);
        sViewsWithIds.put(R.id.tvNotificationTitle, 5);
        sViewsWithIds.put(R.id.tvNotificationDescription, 6);
        sViewsWithIds.put(R.id.tvTime, 7);
        sViewsWithIds.put(R.id.tvShowMore, 8);
        sViewsWithIds.put(R.id.vDivider, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewHolderNotificationSmallBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ViewHolderNotificationSmallBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.CheckBox) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[4]
            , (mm.technomation.mmtext.MMTextView) bindings[6]
            , (mm.technomation.mmtext.MMTextView) bindings[5]
            , (mm.technomation.mmtext.MMTextView) bindings[8]
            , (mm.technomation.mmtext.MMTextView) bindings[7]
            , (android.view.View) bindings[9]
            );
        this.itemBody.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}