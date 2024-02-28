package com.fivebb.selfcare;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fivebb.selfcare.databinding.ActivityHelpBindingImpl;
import com.fivebb.selfcare.databinding.AtyChooseAdvMonth2BindingImpl;
import com.fivebb.selfcare.databinding.AtyChooseAdvMonthBindingImpl;
import com.fivebb.selfcare.databinding.AtyChooseAdvMonthScrollBindingImpl;
import com.fivebb.selfcare.databinding.ItemRechargeBindingImpl;
import com.fivebb.selfcare.databinding.ListItemShowroomBindingImpl;
import com.fivebb.selfcare.databinding.PxPlanPriceListItemBindingImpl;
import com.fivebb.selfcare.databinding.RdoItemBindingImpl;
import com.fivebb.selfcare.databinding.ShowListEmailBindingImpl;
import com.fivebb.selfcare.databinding.ViewHolderNotificationSmallBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHELP = 1;

  private static final int LAYOUT_ATYCHOOSEADVMONTH = 2;

  private static final int LAYOUT_ATYCHOOSEADVMONTH2 = 3;

  private static final int LAYOUT_ATYCHOOSEADVMONTHSCROLL = 4;

  private static final int LAYOUT_ITEMRECHARGE = 5;

  private static final int LAYOUT_LISTITEMSHOWROOM = 6;

  private static final int LAYOUT_PXPLANPRICELISTITEM = 7;

  private static final int LAYOUT_RDOITEM = 8;

  private static final int LAYOUT_SHOWLISTEMAIL = 9;

  private static final int LAYOUT_VIEWHOLDERNOTIFICATIONSMALL = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.activity_help, LAYOUT_ACTIVITYHELP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.aty_choose_adv_month, LAYOUT_ATYCHOOSEADVMONTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.aty_choose_adv_month_2, LAYOUT_ATYCHOOSEADVMONTH2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.aty_choose_adv_month_scroll, LAYOUT_ATYCHOOSEADVMONTHSCROLL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.item_recharge, LAYOUT_ITEMRECHARGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.list_item_showroom, LAYOUT_LISTITEMSHOWROOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.px_plan_price_list_item, LAYOUT_PXPLANPRICELISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.rdo_item, LAYOUT_RDOITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.show_list_email, LAYOUT_SHOWLISTEMAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fivebb.selfcare.R.layout.view_holder_notification_small, LAYOUT_VIEWHOLDERNOTIFICATIONSMALL);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHELP: {
          if ("layout/activity_help_0".equals(tag)) {
            return new ActivityHelpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_help is invalid. Received: " + tag);
        }
        case  LAYOUT_ATYCHOOSEADVMONTH: {
          if ("layout/aty_choose_adv_month_0".equals(tag)) {
            return new AtyChooseAdvMonthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for aty_choose_adv_month is invalid. Received: " + tag);
        }
        case  LAYOUT_ATYCHOOSEADVMONTH2: {
          if ("layout/aty_choose_adv_month_2_0".equals(tag)) {
            return new AtyChooseAdvMonth2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for aty_choose_adv_month_2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ATYCHOOSEADVMONTHSCROLL: {
          if ("layout/aty_choose_adv_month_scroll_0".equals(tag)) {
            return new AtyChooseAdvMonthScrollBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for aty_choose_adv_month_scroll is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRECHARGE: {
          if ("layout/item_recharge_0".equals(tag)) {
            return new ItemRechargeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_recharge is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSHOWROOM: {
          if ("layout/list_item_showroom_0".equals(tag)) {
            return new ListItemShowroomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_showroom is invalid. Received: " + tag);
        }
        case  LAYOUT_PXPLANPRICELISTITEM: {
          if ("layout/px_plan_price_list_item_0".equals(tag)) {
            return new PxPlanPriceListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for px_plan_price_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RDOITEM: {
          if ("layout/rdo_item_0".equals(tag)) {
            return new RdoItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rdo_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SHOWLISTEMAIL: {
          if ("layout/show_list_email_0".equals(tag)) {
            return new ShowListEmailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for show_list_email is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWHOLDERNOTIFICATIONSMALL: {
          if ("layout/view_holder_notification_small_0".equals(tag)) {
            return new ViewHolderNotificationSmallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_holder_notification_small is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_help_0", com.fivebb.selfcare.R.layout.activity_help);
      sKeys.put("layout/aty_choose_adv_month_0", com.fivebb.selfcare.R.layout.aty_choose_adv_month);
      sKeys.put("layout/aty_choose_adv_month_2_0", com.fivebb.selfcare.R.layout.aty_choose_adv_month_2);
      sKeys.put("layout/aty_choose_adv_month_scroll_0", com.fivebb.selfcare.R.layout.aty_choose_adv_month_scroll);
      sKeys.put("layout/item_recharge_0", com.fivebb.selfcare.R.layout.item_recharge);
      sKeys.put("layout/list_item_showroom_0", com.fivebb.selfcare.R.layout.list_item_showroom);
      sKeys.put("layout/px_plan_price_list_item_0", com.fivebb.selfcare.R.layout.px_plan_price_list_item);
      sKeys.put("layout/rdo_item_0", com.fivebb.selfcare.R.layout.rdo_item);
      sKeys.put("layout/show_list_email_0", com.fivebb.selfcare.R.layout.show_list_email);
      sKeys.put("layout/view_holder_notification_small_0", com.fivebb.selfcare.R.layout.view_holder_notification_small);
    }
  }
}
