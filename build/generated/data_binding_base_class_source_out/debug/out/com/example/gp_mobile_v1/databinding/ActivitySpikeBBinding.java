// Generated by view binder compiler. Do not edit!
package com.example.gp_mobile_v1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.gp_mobile_v1.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivitySpikeBBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout main;

  private ActivitySpikeBBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout main) {
    this.rootView = rootView;
    this.main = main;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySpikeBBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySpikeBBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_spike_b, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySpikeBBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ConstraintLayout main = (ConstraintLayout) rootView;

    return new ActivitySpikeBBinding((ConstraintLayout) rootView, main);
  }
}
