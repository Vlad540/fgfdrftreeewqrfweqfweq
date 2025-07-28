package one.me.sdk.permissionhost;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B=\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/sdk/permissionhost/PermissionBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "", "", "permissions", "", "requestCode", "titleId", "rationaleId", "positiveButtonId", "([Ljava/lang/String;IIII)V", "(II)V", "permission-host_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PermissionBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] L0;
    public final t97 C0;
    public final jr D0;
    public final jr E0;
    public final jr F0;
    public final jr G0;
    public final jr H0;
    public final jr I0;
    public final jr J0;
    public boolean K0;

    static {
        Class<PermissionBottomSheet> cls = PermissionBottomSheet.class;
        L0 = new k77[]{new hc9(cls, "settingsMode", "getSettingsMode()Z"), c3d.g(m7c.a, cls, "titleId", "getTitleId()I"), new hc9(cls, "rationaleId", "getRationaleId()I"), new hc9(cls, "positiveButtonId", "getPositiveButtonId()I"), new hc9(cls, "requestedPermissions", "getRequestedPermissions()[Ljava/lang/String;"), new hc9(cls, "requestCode", "getRequestCode()I"), new hc9(cls, "isCallbackSent", "isCallbackSent()Z")};
    }

    public PermissionBottomSheet() {
        super((Bundle) null, 1, (x54) null);
        this.C0 = rna.a.b();
        Class<Boolean> cls = Boolean.class;
        this.D0 = new jr(cls, Boolean.TRUE, "PermissionBottomSheet.settings_mode");
        Class<Integer> cls2 = Integer.class;
        this.E0 = new jr(cls2, "PermissionBottomSheet.title_res");
        this.F0 = new jr(cls2, "PermissionBottomSheet.rationale_res");
        this.G0 = new jr(cls2, "PermissionBottomSheet.positive_button_res");
        this.H0 = new jr(String[].class, "PermissionBottomSheet.permissions");
        this.I0 = new jr(cls2, "PermissionBottomSheet.request_code");
        this.J0 = new jr(cls, Boolean.FALSE, "callback_sent");
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        hq0 hq0 = new hq0((rr3) this, (s16) new qk8(21, this));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 9));
        }
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView.setId(aaa.e);
        k77[] k77Arr = L0;
        k77 k77 = k77Arr[1];
        appCompatTextView.setText(((Number) this.E0.a(this)).intValue());
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextAlignment(4);
        nte.c.b(appCompatTextView, yq4.b);
        s59 s59 = km4.y0;
        appCompatTextView.setTextColor(s59.r(appCompatTextView).getText().e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        linearLayout.addView(appCompatTextView, layoutParams);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView2.setId(aaa.d);
        k77 k772 = k77Arr[2];
        appCompatTextView2.setText(((Number) this.F0.a(this)).intValue());
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setTextAlignment(4);
        nte.m.b(appCompatTextView2, yq4.b);
        appCompatTextView2.setTextColor(s59.r(appCompatTextView2).getText().g);
        float f = (float) 12;
        appCompatTextView2.setPadding(appCompatTextView2.getPaddingLeft(), a24.X(dh4.c().getDisplayMetrics().density * f), appCompatTextView2.getPaddingRight(), a24.X(f * dh4.c().getDisplayMetrics().density));
        linearLayout.addView(appCompatTextView2, new LinearLayout.LayoutParams(-1, -2));
        k77 k773 = k77Arr[0];
        boolean booleanValue = ((Boolean) this.D0.a(this)).booleanValue();
        s0a s0a = s0a.o;
        v0a v0a = v0a.c;
        u0a u0a = u0a.o;
        if (booleanValue) {
            OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
            oneMeButton.setId(aaa.b);
            oneMeButton.setMode(u0a);
            oneMeButton.setSize(v0a);
            oneMeButton.setAppearance(s0a);
            oneMeButton.setText(baa.f);
            oneMeButton.setOnClickListener(new fq(linearLayout, 2, this));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 1;
            linearLayout.addView(oneMeButton, layoutParams2);
        } else {
            OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
            oneMeButton2.setId(aaa.c);
            oneMeButton2.setMode(u0a);
            oneMeButton2.setSize(v0a);
            oneMeButton2.setAppearance(s0a);
            k77 k774 = k77Arr[3];
            oneMeButton2.setText(((Number) this.G0.a(this)).intValue());
            oneMeButton2.setOnClickListener(new fq(this, 3, this));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            linearLayout.addView(oneMeButton2, layoutParams3);
            OneMeButton oneMeButton3 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
            oneMeButton3.setId(aaa.a);
            oneMeButton3.setMode(u0a);
            oneMeButton3.setSize(v0a);
            oneMeButton3.setAppearance(s0a);
            oneMeButton3.setText(baa.e);
            oneMeButton3.setOnClickListener(new jsc(10, this));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            linearLayout.addView(oneMeButton3, layoutParams4);
        }
        return linearLayout;
    }

    public PermissionBottomSheet(String[] strArr, int i, int i2, int i3, int i4) {
        this(i2, i3);
        k77[] k77Arr = L0;
        k77 k77 = k77Arr[4];
        this.H0.b(this, strArr);
        k77 k772 = k77Arr[5];
        this.I0.b(this, Integer.valueOf(i));
        k77 k773 = k77Arr[3];
        this.G0.b(this, Integer.valueOf(i4));
        k77 k774 = k77Arr[0];
        this.D0.b(this, Boolean.FALSE);
    }

    public PermissionBottomSheet(int i, int i2) {
        this();
        k77[] k77Arr = L0;
        k77 k77 = k77Arr[1];
        this.E0.b(this, Integer.valueOf(i));
        k77 k772 = k77Arr[2];
        this.F0.b(this, Integer.valueOf(i2));
    }
}
