package com.fivebb.selfcare.databinding;
import com.fivebb.selfcare.R;
import com.fivebb.selfcare.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class AtyChooseAdvMonthBindingImpl extends AtyChooseAdvMonthBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivBack, 1);
        sViewsWithIds.put(R.id.tvScreenTitle, 2);
        sViewsWithIds.put(R.id.cvChooseMonth, 3);
        sViewsWithIds.put(R.id.lblChooseMonth, 4);
        sViewsWithIds.put(R.id.container, 5);
        sViewsWithIds.put(R.id.rec_choose_month, 6);
        sViewsWithIds.put(R.id.txtOne, 7);
        sViewsWithIds.put(R.id.lyAmount, 8);
        sViewsWithIds.put(R.id.txtAmt, 9);
        sViewsWithIds.put(R.id.txtAmount, 10);
        sViewsWithIds.put(R.id.txtNote, 11);
        sViewsWithIds.put(R.id.cvBank, 12);
        sViewsWithIds.put(R.id.lblChooseBank, 13);
        sViewsWithIds.put(R.id.rvBank, 14);
        sViewsWithIds.put(R.id.terms, 15);
        sViewsWithIds.put(R.id.btnContinue, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AtyChooseAdvMonthBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private AtyChooseAdvMonthBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (mm.technomation.mmtext.MMButtonView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (mm.technomation.mmtext.MMTextView) bindings[13]
            , (mm.technomation.mmtext.MMTextView) bindings[4]
            , (android.widget.LinearLayout) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (mm.technomation.mmtext.MMTextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[7]
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