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

public final class ActivityGame02Binding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnDown;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final Button btnUp;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView stage1;

  @NonNull
  public final TextView timer20s;

  @NonNull
  public final TextView tvCount;

  @NonNull
  public final TextView tvTimer;

  private ActivityGame02Binding(@NonNull RelativeLayout rootView, @NonNull Button btnDown,
      @NonNull Button btnHome, @NonNull Button btnSubmit, @NonNull Button btnUp,
      @NonNull ImageView imageView, @NonNull ImageView stage1, @NonNull TextView timer20s,
      @NonNull TextView tvCount, @NonNull TextView tvTimer) {
    this.rootView = rootView;
    this.btnDown = btnDown;
    this.btnHome = btnHome;
    this.btnSubmit = btnSubmit;
    this.btnUp = btnUp;
    this.imageView = imageView;
    this.stage1 = stage1;
    this.timer20s = timer20s;
    this.tvCount = tvCount;
    this.tvTimer = tvTimer;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGame02Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGame02Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_game02, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGame02Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_down;
      Button btnDown = ViewBindings.findChildViewById(rootView, id);
      if (btnDown == null) {
        break missingId;
      }

      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btn_submit;
      Button btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.btn_up;
      Button btnUp = ViewBindings.findChildViewById(rootView, id);
      if (btnUp == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.stage1;
      ImageView stage1 = ViewBindings.findChildViewById(rootView, id);
      if (stage1 == null) {
        break missingId;
      }

      id = R.id.timer_20s;
      TextView timer20s = ViewBindings.findChildViewById(rootView, id);
      if (timer20s == null) {
        break missingId;
      }

      id = R.id.tv_count;
      TextView tvCount = ViewBindings.findChildViewById(rootView, id);
      if (tvCount == null) {
        break missingId;
      }

      id = R.id.tv_timer;
      TextView tvTimer = ViewBindings.findChildViewById(rootView, id);
      if (tvTimer == null) {
        break missingId;
      }

      return new ActivityGame02Binding((RelativeLayout) rootView, btnDown, btnHome, btnSubmit,
          btnUp, imageView, stage1, timer20s, tvCount, tvTimer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
