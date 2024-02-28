// Generated by data binding compiler. Do not edit!
package com.fivebb.selfcare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.fivebb.selfcare.R;
import com.fivebb.selfcare.components.CustomMapView;
import java.lang.Deprecated;
import java.lang.Object;
import mm.technomation.mmtext.MMTextView;

public abstract class ActivityHelpBinding extends ViewDataBinding {
  @NonNull
  public final CardView cvContactEmail;

  @NonNull
  public final CardView cvContactNumber;

  @NonNull
  public final CardView cvLocation;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final ImageView ivFaceBook;

  @NonNull
  public final ImageView ivYouTube;

  @NonNull
  public final MMTextView lblContactEmail;

  @NonNull
  public final MMTextView lblContactNumber;

  @NonNull
  public final MMTextView lblContactNumberOne;

  @NonNull
  public final MMTextView lblContactNumberTwo;

  @NonNull
  public final MMTextView lblEmail;

  @NonNull
  public final MMTextView lblLocation;

  @NonNull
  public final MMTextView lblOperationTime;

  @NonNull
  public final ConstraintLayout lyShowData;

  @NonNull
  public final CustomMapView mapView;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final RecyclerView recShowroom;

  @NonNull
  public final MMTextView tvScreenTitle;

  @NonNull
  public final View view;

  protected ActivityHelpBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cvContactEmail, CardView cvContactNumber, CardView cvLocation, ImageView ivBack,
      ImageView ivFaceBook, ImageView ivYouTube, MMTextView lblContactEmail,
      MMTextView lblContactNumber, MMTextView lblContactNumberOne, MMTextView lblContactNumberTwo,
      MMTextView lblEmail, MMTextView lblLocation, MMTextView lblOperationTime,
      ConstraintLayout lyShowData, CustomMapView mapView, NestedScrollView nestedScrollView,
      RecyclerView recShowroom, MMTextView tvScreenTitle, View view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvContactEmail = cvContactEmail;
    this.cvContactNumber = cvContactNumber;
    this.cvLocation = cvLocation;
    this.ivBack = ivBack;
    this.ivFaceBook = ivFaceBook;
    this.ivYouTube = ivYouTube;
    this.lblContactEmail = lblContactEmail;
    this.lblContactNumber = lblContactNumber;
    this.lblContactNumberOne = lblContactNumberOne;
    this.lblContactNumberTwo = lblContactNumberTwo;
    this.lblEmail = lblEmail;
    this.lblLocation = lblLocation;
    this.lblOperationTime = lblOperationTime;
    this.lyShowData = lyShowData;
    this.mapView = mapView;
    this.nestedScrollView = nestedScrollView;
    this.recShowroom = recShowroom;
    this.tvScreenTitle = tvScreenTitle;
    this.view = view;
  }

  @NonNull
  public static ActivityHelpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_help, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHelpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityHelpBinding>inflateInternal(inflater, R.layout.activity_help, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityHelpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_help, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHelpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityHelpBinding>inflateInternal(inflater, R.layout.activity_help, null, false, component);
  }

  public static ActivityHelpBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityHelpBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityHelpBinding)bind(component, view, R.layout.activity_help);
  }
}
