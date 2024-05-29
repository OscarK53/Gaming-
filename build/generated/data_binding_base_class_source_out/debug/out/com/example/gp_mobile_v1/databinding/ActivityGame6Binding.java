// Generated by view binder compiler. Do not edit!
package com.example.gp_mobile_v1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.gp_mobile_v1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGame6Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final AppCompatButton buttonOption1;

  @NonNull
  public final AppCompatButton buttonOption2;

  @NonNull
  public final AppCompatButton buttonOption3;

  @NonNull
  public final TextView textQuestion;

  @NonNull
  public final TextView textQuestionNumber;

  @NonNull
  public final TextView textRightAnswered;

  private ActivityGame6Binding(@NonNull LinearLayout rootView, @NonNull Button btnHome,
      @NonNull AppCompatButton buttonOption1, @NonNull AppCompatButton buttonOption2,
      @NonNull AppCompatButton buttonOption3, @NonNull TextView textQuestion,
      @NonNull TextView textQuestionNumber, @NonNull TextView textRightAnswered) {
    this.rootView = rootView;
    this.btnHome = btnHome;
    this.buttonOption1 = buttonOption1;
    this.buttonOption2 = buttonOption2;
    this.buttonOption3 = buttonOption3;
    this.textQuestion = textQuestion;
    this.textQuestionNumber = textQuestionNumber;
    this.textRightAnswered = textRightAnswered;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGame6Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGame6Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_game6, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGame6Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.buttonOption1;
      AppCompatButton buttonOption1 = ViewBindings.findChildViewById(rootView, id);
      if (buttonOption1 == null) {
        break missingId;
      }

      id = R.id.buttonOption2;
      AppCompatButton buttonOption2 = ViewBindings.findChildViewById(rootView, id);
      if (buttonOption2 == null) {
        break missingId;
      }

      id = R.id.buttonOption3;
      AppCompatButton buttonOption3 = ViewBindings.findChildViewById(rootView, id);
      if (buttonOption3 == null) {
        break missingId;
      }

      id = R.id.textQuestion;
      TextView textQuestion = ViewBindings.findChildViewById(rootView, id);
      if (textQuestion == null) {
        break missingId;
      }

      id = R.id.textQuestionNumber;
      TextView textQuestionNumber = ViewBindings.findChildViewById(rootView, id);
      if (textQuestionNumber == null) {
        break missingId;
      }

      id = R.id.textRightAnswered;
      TextView textRightAnswered = ViewBindings.findChildViewById(rootView, id);
      if (textRightAnswered == null) {
        break missingId;
      }

      return new ActivityGame6Binding((LinearLayout) rootView, btnHome, buttonOption1,
          buttonOption2, buttonOption3, textQuestion, textQuestionNumber, textRightAnswered);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
