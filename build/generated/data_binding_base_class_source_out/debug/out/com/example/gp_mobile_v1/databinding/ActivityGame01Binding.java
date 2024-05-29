// Generated by view binder compiler. Do not edit!
package com.example.gp_mobile_v1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.gp_mobile_v1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGame01Binding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView ans11;

  @NonNull
  public final ImageView ans21;

  @NonNull
  public final ImageView ans31;

  @NonNull
  public final ImageView ans41;

  @NonNull
  public final ImageView ans51;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final TextView scoreTextView;

  @NonNull
  public final TextView scoreTextViewNoChange;

  @NonNull
  public final ImageView stage1;

  private ActivityGame01Binding(@NonNull RelativeLayout rootView, @NonNull ImageView ans11,
      @NonNull ImageView ans21, @NonNull ImageView ans31, @NonNull ImageView ans41,
      @NonNull ImageView ans51, @NonNull Button btnHome, @NonNull TextView scoreTextView,
      @NonNull TextView scoreTextViewNoChange, @NonNull ImageView stage1) {
    this.rootView = rootView;
    this.ans11 = ans11;
    this.ans21 = ans21;
    this.ans31 = ans31;
    this.ans41 = ans41;
    this.ans51 = ans51;
    this.btnHome = btnHome;
    this.scoreTextView = scoreTextView;
    this.scoreTextViewNoChange = scoreTextViewNoChange;
    this.stage1 = stage1;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGame01Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGame01Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_game01, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGame01Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ans11;
      ImageView ans11 = ViewBindings.findChildViewById(rootView, id);
      if (ans11 == null) {
        break missingId;
      }

      id = R.id.ans21;
      ImageView ans21 = ViewBindings.findChildViewById(rootView, id);
      if (ans21 == null) {
        break missingId;
      }

      id = R.id.ans31;
      ImageView ans31 = ViewBindings.findChildViewById(rootView, id);
      if (ans31 == null) {
        break missingId;
      }

      id = R.id.ans41;
      ImageView ans41 = ViewBindings.findChildViewById(rootView, id);
      if (ans41 == null) {
        break missingId;
      }

      id = R.id.ans51;
      ImageView ans51 = ViewBindings.findChildViewById(rootView, id);
      if (ans51 == null) {
        break missingId;
      }

      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.scoreTextView;
      TextView scoreTextView = ViewBindings.findChildViewById(rootView, id);
      if (scoreTextView == null) {
        break missingId;
      }

      id = R.id.scoreTextView_no_change;
      TextView scoreTextViewNoChange = ViewBindings.findChildViewById(rootView, id);
      if (scoreTextViewNoChange == null) {
        break missingId;
      }

      id = R.id.stage1;
      ImageView stage1 = ViewBindings.findChildViewById(rootView, id);
      if (stage1 == null) {
        break missingId;
      }

      return new ActivityGame01Binding((RelativeLayout) rootView, ans11, ans21, ans31, ans41, ans51,
          btnHome, scoreTextView, scoreTextViewNoChange, stage1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}