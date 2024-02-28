package com.fivebb.selfcare.databinding;
import com.fivebb.selfcare.R;
import com.fivebb.selfcare.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityHelpBindingImpl extends ActivityHelpBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivBack, 1);
        sViewsWithIds.put(R.id.tvScreenTitle, 2);
        sViewsWithIds.put(R.id.view, 3);
        sViewsWithIds.put(R.id.lblOperationTime, 4);
        sViewsWithIds.put(R.id.ivYouTube, 5);
        sViewsWithIds.put(R.id.ivFaceBook, 6);
        sViewsWithIds.put(R.id.recShowroom, 7);
        sViewsWithIds.put(R.id.nestedScrollView, 8);
        sViewsWithIds.put(R.id.ly_showData, 9);
        sViewsWithIds.put(R.id.cvContactNumber, 10);
        sViewsWithIds.put(R.id.lblContactNumber, 11);
        sViewsWithIds.put(R.id.lblContactNumberOne, 12);
        sViewsWithIds.put(R.id.lblContactNumberTwo, 13);
        sViewsWithIds.put(R.id.cvContactEmail, 14);
        sViewsWithIds.put(R.id.lblContactEmail, 15);
        sViewsWithIds.put(R.id.lblEmail, 16);
        sViewsWithIds.put(R.id.cvLocation, 17);
        sViewsWithIds.put(R.id.lblLocation, 18);
        sViewsWithIds.put(R.id.mapView, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHelpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityHelpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[14]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (mm.technomation.mmtext.MMTextView) bindings[15]
            , (mm.technomation.mmtext.MMTextView) bindings[11]
            , (mm.technomation.mmtext.MMTextView) bindings[12]
            , (mm.technomation.mmtext.MMTextView) bindings[13]
            , (mm.technomation.mmtext.MMTextView) bindings[16]
            , (mm.technomation.mmtext.MMTextView) bindings[18]
            , (mm.technomation.mmtext.MMTextView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (com.fivebb.selfcare.components.CustomMapView) bindings[19]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (mm.technomation.mmtext.MMTextView) bindings[2]
            , (android.view.View) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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