// Generated by view binder compiler. Do not edit!
package com.example.kalkulator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kalkulator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btn0;

  @NonNull
  public final Button btn1;

  @NonNull
  public final Button btn2;

  @NonNull
  public final Button btn3;

  @NonNull
  public final Button btn4;

  @NonNull
  public final Button btn5;

  @NonNull
  public final Button btn6;

  @NonNull
  public final Button btn7;

  @NonNull
  public final Button btn8;

  @NonNull
  public final Button btn9;

  @NonNull
  public final Button btnAc;

  @NonNull
  public final Button btnBagi;

  @NonNull
  public final Button btnDel;

  @NonNull
  public final Button btnHasil;

  @NonNull
  public final Button btnKali;

  @NonNull
  public final Button btnKurang;

  @NonNull
  public final Button btnTambah;

  @NonNull
  public final EditText operasi;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button btn0,
      @NonNull Button btn1, @NonNull Button btn2, @NonNull Button btn3, @NonNull Button btn4,
      @NonNull Button btn5, @NonNull Button btn6, @NonNull Button btn7, @NonNull Button btn8,
      @NonNull Button btn9, @NonNull Button btnAc, @NonNull Button btnBagi, @NonNull Button btnDel,
      @NonNull Button btnHasil, @NonNull Button btnKali, @NonNull Button btnKurang,
      @NonNull Button btnTambah, @NonNull EditText operasi) {
    this.rootView = rootView;
    this.btn0 = btn0;
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.btn3 = btn3;
    this.btn4 = btn4;
    this.btn5 = btn5;
    this.btn6 = btn6;
    this.btn7 = btn7;
    this.btn8 = btn8;
    this.btn9 = btn9;
    this.btnAc = btnAc;
    this.btnBagi = btnBagi;
    this.btnDel = btnDel;
    this.btnHasil = btnHasil;
    this.btnKali = btnKali;
    this.btnKurang = btnKurang;
    this.btnTambah = btnTambah;
    this.operasi = operasi;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn0;
      Button btn0 = ViewBindings.findChildViewById(rootView, id);
      if (btn0 == null) {
        break missingId;
      }

      id = R.id.btn1;
      Button btn1 = ViewBindings.findChildViewById(rootView, id);
      if (btn1 == null) {
        break missingId;
      }

      id = R.id.btn2;
      Button btn2 = ViewBindings.findChildViewById(rootView, id);
      if (btn2 == null) {
        break missingId;
      }

      id = R.id.btn3;
      Button btn3 = ViewBindings.findChildViewById(rootView, id);
      if (btn3 == null) {
        break missingId;
      }

      id = R.id.btn4;
      Button btn4 = ViewBindings.findChildViewById(rootView, id);
      if (btn4 == null) {
        break missingId;
      }

      id = R.id.btn5;
      Button btn5 = ViewBindings.findChildViewById(rootView, id);
      if (btn5 == null) {
        break missingId;
      }

      id = R.id.btn6;
      Button btn6 = ViewBindings.findChildViewById(rootView, id);
      if (btn6 == null) {
        break missingId;
      }

      id = R.id.btn7;
      Button btn7 = ViewBindings.findChildViewById(rootView, id);
      if (btn7 == null) {
        break missingId;
      }

      id = R.id.btn8;
      Button btn8 = ViewBindings.findChildViewById(rootView, id);
      if (btn8 == null) {
        break missingId;
      }

      id = R.id.btn9;
      Button btn9 = ViewBindings.findChildViewById(rootView, id);
      if (btn9 == null) {
        break missingId;
      }

      id = R.id.btnAc;
      Button btnAc = ViewBindings.findChildViewById(rootView, id);
      if (btnAc == null) {
        break missingId;
      }

      id = R.id.btnBagi;
      Button btnBagi = ViewBindings.findChildViewById(rootView, id);
      if (btnBagi == null) {
        break missingId;
      }

      id = R.id.btnDel;
      Button btnDel = ViewBindings.findChildViewById(rootView, id);
      if (btnDel == null) {
        break missingId;
      }

      id = R.id.btnHasil;
      Button btnHasil = ViewBindings.findChildViewById(rootView, id);
      if (btnHasil == null) {
        break missingId;
      }

      id = R.id.btnKali;
      Button btnKali = ViewBindings.findChildViewById(rootView, id);
      if (btnKali == null) {
        break missingId;
      }

      id = R.id.btnKurang;
      Button btnKurang = ViewBindings.findChildViewById(rootView, id);
      if (btnKurang == null) {
        break missingId;
      }

      id = R.id.btnTambah;
      Button btnTambah = ViewBindings.findChildViewById(rootView, id);
      if (btnTambah == null) {
        break missingId;
      }

      id = R.id.operasi;
      EditText operasi = ViewBindings.findChildViewById(rootView, id);
      if (operasi == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, btn0, btn1, btn2, btn3, btn4, btn5,
          btn6, btn7, btn8, btn9, btnAc, btnBagi, btnDel, btnHasil, btnKali, btnKurang, btnTambah,
          operasi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
