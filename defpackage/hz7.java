package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* renamed from: hz7  reason: default package */
public final /* synthetic */ class hz7 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPermissionWidget b;

    public /* synthetic */ hz7(MediaBarPermissionWidget mediaBarPermissionWidget, int i) {
        this.a = i;
        this.b = mediaBarPermissionWidget;
    }

    public final Object invoke() {
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MediaBarPermissionWidget.Z;
                LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setVerticalGravity(16);
                linearLayout.setHorizontalGravity(1);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                float f = (float) 4;
                layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 24) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                linearLayout.setLayoutParams(layoutParams);
                Drawable b2 = gq3.b(linearLayout.getContext(), i2a.e);
                AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), (AttributeSet) null);
                appCompatImageView.setImageDrawable(b2);
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
                appCompatTextView.setText(k2a.M);
                appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), a24.X(((float) 10) * dh4.c().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                nge.d(nte.B, appCompatTextView);
                urd.B(new c3(b2, appCompatTextView, (Continuation) null, 16), linearLayout);
                linearLayout.addView(appCompatImageView);
                linearLayout.addView(appCompatTextView);
                a24.Z(linearLayout, 300, new iz7(mediaBarPermissionWidget, 0));
                return linearLayout;
            case 1:
                k77[] k77Arr2 = MediaBarPermissionWidget.Z;
                CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), (AttributeSet) null, 14);
                cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                cameraxCameraApiView.e();
                return cameraxCameraApiView;
            case 2:
                k77[] k77Arr3 = MediaBarPermissionWidget.Z;
                FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, a24.X(((float) 138) * dh4.c().getDisplayMetrics().density));
                float f2 = (float) 12;
                layoutParams2.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
                frameLayout.setLayoutParams(layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 12.0f);
                frameLayout.setBackground(gradientDrawable);
                frameLayout.setClipToOutline(true);
                urd.B(new z9(gradientDrawable, (Continuation) null, 20), frameLayout);
                e07.B(new ck5(((gz7) mediaBarPermissionWidget.b.getValue()).c, new jz7(mediaBarPermissionWidget, frameLayout, (Continuation) null), 5), mediaBarPermissionWidget.getViewLifecycleScope());
                return frameLayout;
            default:
                k77[] k77Arr4 = MediaBarPermissionWidget.Z;
                LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                linearLayout2.setOrientation(1);
                linearLayout2.setVerticalGravity(16);
                linearLayout2.setHorizontalGravity(1);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, a24.X(((float) 166) * dh4.c().getDisplayMetrics().density));
                float f3 = (float) 20;
                float f4 = (float) 0;
                layoutParams3.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(f4 * dh4.c().getDisplayMetrics().density));
                linearLayout2.setLayoutParams(layoutParams3);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), (AttributeSet) null);
                appCompatTextView2.setText(k2a.S);
                nge.d(nte.n, appCompatTextView2);
                appCompatTextView2.setGravity(17);
                AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), (AttributeSet) null);
                appCompatTextView3.setText(k2a.R);
                nge.d(nte.r, appCompatTextView3);
                appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
                appCompatTextView3.setGravity(17);
                OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), (AttributeSet) null);
                oneMeButton.setText(k2a.L);
                oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                a24.Z(oneMeButton, 300, new iz7(mediaBarPermissionWidget, 1));
                urd.B(new c3(appCompatTextView2, appCompatTextView3, (Continuation) null, 17), linearLayout2);
                linearLayout2.addView(appCompatTextView2);
                linearLayout2.addView(appCompatTextView3);
                linearLayout2.addView(oneMeButton);
                return linearLayout2;
        }
    }
}
