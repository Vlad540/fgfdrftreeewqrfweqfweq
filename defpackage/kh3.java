package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: kh3  reason: default package */
public final class kh3 extends ConstraintLayout implements mhe {
    public static final /* synthetic */ k77[] l1;
    public final mz9 K0;
    public final AppCompatTextView L0;
    public final t97 M0;
    public final t97 N0;
    public final t97 O0;
    public final t97 P0;
    public final t97 Q0;
    public final t97 R0;
    public final t97 S0;
    public final t97 T0;
    public final t97 U0 = ez3.O(3, new nl1(19, this));
    public final jh3 V0 = new jh3(this, 0);
    public final jh3 W0 = new jh3(this, 1);
    public final jh3 X0 = new jh3(this, 2);
    public final jh3 Y0 = new jh3(this, 3);
    public final t97 Z0 = ez3.O(3, new vz0(0, this, kh3.class, "linesWithCallButtons", "linesWithCallButtons()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 15));
    public final t97 a1 = ez3.O(3, new vz0(0, this, kh3.class, "lineWithCallButtons", "lineWithCallButtons()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 11));
    public final ebc b1 = bm3.C(new vz0(0, this, kh3.class, "singleLineWithoutButton", "singleLineWithoutButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 13));
    public final t97 c1 = ez3.O(3, new vz0(0, this, kh3.class, "singleLineWithButton", "singleLineWithButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 10));
    public final t97 d1 = ez3.O(3, new vz0(0, this, kh3.class, "singleLineWithoutAvatar", "singleLineWithoutAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 12));
    public final ebc e1 = bm3.C(new vz0(0, this, kh3.class, "twoLineWithoutButton", "twoLineWithoutButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 17));
    public final ebc f1 = bm3.C(new vz0(0, this, kh3.class, "twoLineWithoutButtonWithBigAvatar", "twoLineWithoutButtonWithBigAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 18));
    public final t97 g1 = ez3.O(3, new vz0(0, this, kh3.class, "twoLineWithButton", "twoLineWithButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 14));
    public final t97 h1 = ez3.O(3, new vz0(0, this, kh3.class, "twoLineWithoutAvatar", "twoLineWithoutAvatar()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 16));
    public final t97 i1 = ez3.O(3, new vz0(0, this, kh3.class, "allWithRadioButton", "allWithRadioButton()Landroidx/constraintlayout/widget/ConstraintSet;", 0, 19));
    public final int j1;
    public int k1;

    static {
        Class<kh3> cls = kh3.class;
        l1 = new k77[]{new hc9(cls, "isSelectionEnabled", "isSelectionEnabled()Z"), c3d.g(m7c.a, cls, "isContactSelected", "isContactSelected()Z"), new hc9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), new hc9(cls, "callButtonMode", "getCallButtonMode()Lone/me/common/contact/ContactCellView$Companion$CallButtonMode;")};
    }

    public kh3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mz9 mz9 = new mz9(context);
        mz9.setId(qhc.z);
        mz9.setAvatarShape(dz9.a);
        this.K0 = mz9;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(qhc.E);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(km4.y0.r(appCompatTextView).getText().e);
        nge.d(nte.i, appCompatTextView);
        appCompatTextView.setSingleLine();
        this.L0 = appCompatTextView;
        this.M0 = ez3.O(3, new hh3(context, this, 0));
        this.N0 = ez3.O(3, new hh3(context, this, 1));
        this.O0 = ez3.O(3, new hh3(context, this, 2));
        this.P0 = ez3.O(3, new hh3(context, this, 3));
        this.Q0 = ez3.O(3, new hh3(context, this, 4));
        this.R0 = ez3.O(3, new hh3(context, this, 5));
        this.S0 = ez3.O(3, new cc3(context, 1));
        this.T0 = ez3.O(3, new hh3(context, this, 6));
        int X = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
        this.j1 = X;
        int X2 = a24.X(((float) 60) * dh4.c().getDisplayMetrics().density);
        this.k1 = X;
        float f = (float) 12;
        float f2 = (float) 6;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        addView(mz9, new re3(X, X));
        re3 re3 = new re3(-2, a24.X(((float) 20) * dh4.c().getDisplayMetrics().density));
        re3.E = 0.0f;
        addView(appCompatTextView, re3);
        setLayoutParams(new re3(-1, X2));
        K();
    }

    public static final bf3 A(kh3 kh3) {
        kh3.getClass();
        bf3 bf3 = new bf3();
        bf3.c(kh3);
        mz9 mz9 = kh3.K0;
        int id = mz9.getId();
        bf3.d(id, 3, 0, 3);
        bf3.d(id, 4, 0, 4);
        bf3.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = kh3.L0;
        int id2 = appCompatTextView.getId();
        bf3.d(id2, 3, 0, 3);
        bf3.d(id2, 4, kh3.getMessageView().getId(), 3);
        bf3.d(id2, 6, mz9.getId(), 7);
        float f = (float) 12;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id2, 4));
        bf3.d(id2, 7, kh3.getButtonAudioCallView().getId(), 6);
        new hw9(bf3, 7, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        bf3.g(id2).d.l0 = true;
        int id3 = kh3.getMessageView().getId();
        bf3.d(id3, 3, appCompatTextView.getId(), 4);
        hr1.q((float) 2, dh4.c().getDisplayMetrics().density, new hw9(bf3, 3, id3, 4));
        bf3.d(id3, 4, 0, 4);
        bf3.d(id3, 6, mz9.getId(), 7);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id3, 4));
        bf3.d(id3, 7, kh3.getButtonAudioCallView().getId(), 6);
        new hw9(bf3, 7, id3, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        bf3.g(id3).d.l0 = true;
        int id4 = kh3.getButtonAudioCallView().getId();
        bf3.d(id4, 3, 0, 3);
        bf3.d(id4, 4, 0, 4);
        bf3.d(id4, 7, kh3.getButtonVideoCallView().getId(), 6);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 7, id4, 4));
        int id5 = kh3.getButtonVideoCallView().getId();
        bf3.d(id5, 3, 0, 3);
        bf3.d(id5, 4, 0, 4);
        bf3.d(id5, 7, 0, 7);
        return bf3;
    }

    public static final bf3 B(kh3 kh3) {
        kh3.getClass();
        bf3 bf3 = new bf3();
        bf3.c(kh3);
        mz9 mz9 = kh3.K0;
        int id = mz9.getId();
        bf3.d(id, 3, 0, 3);
        bf3.d(id, 4, 0, 4);
        bf3.d(id, 6, 0, 6);
        int id2 = kh3.L0.getId();
        bf3.d(id2, 3, 0, 3);
        bf3.d(id2, 4, 0, 4);
        bf3.d(id2, 6, mz9.getId(), 7);
        float f = (float) 12;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id2, 4));
        bf3.d(id2, 7, kh3.getIconInfoView().getId(), 6);
        new hw9(bf3, 7, id2, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        bf3.g(id2).d.l0 = true;
        int id3 = kh3.getIconInfoView().getId();
        bf3.d(id3, 3, 0, 3);
        bf3.d(id3, 4, 0, 4);
        bf3.d(id3, 7, kh3.getButtonView().getId(), 6);
        int id4 = kh3.getButtonView().getId();
        bf3.d(id4, 3, 0, 3);
        bf3.d(id4, 4, 0, 4);
        bf3.d(id4, 7, 0, 7);
        return bf3;
    }

    public static final bf3 C(kh3 kh3) {
        kh3.getClass();
        bf3 bf3 = new bf3();
        bf3.c(kh3);
        mz9 mz9 = kh3.K0;
        int id = mz9.getId();
        bf3.d(id, 3, 0, 3);
        bf3.d(id, 4, 0, 4);
        bf3.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = kh3.L0;
        int id2 = appCompatTextView.getId();
        bf3.d(id2, 3, 0, 3);
        bf3.d(id2, 4, 0, 4);
        bf3.d(id2, 6, mz9.getId(), 7);
        float f = (float) 12;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id2, 4));
        t97 t97 = kh3.N0;
        if (ek8.L(t97)) {
            bf3.d(id2, 7, kh3.getAliasView().getId(), 6);
            hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 7, id2, 4));
        } else {
            bf3.d(id2, 7, 0, 7);
            new hw9(bf3, 7, id2, 4).e(0);
        }
        bf3.g(id2).d.l0 = true;
        if (ek8.L(t97)) {
            int id3 = kh3.getAliasView().getId();
            bf3.d(id3, 3, appCompatTextView.getId(), 3);
            bf3.d(id3, 4, appCompatTextView.getId(), 4);
            bf3.d(id3, 7, 0, 7);
            new hw9(bf3, 7, id3, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
            bf3.g(id3).d.l0 = true;
        }
        return bf3;
    }

    public static final bf3 F(kh3 kh3) {
        kh3.getClass();
        bf3 bf3 = new bf3();
        bf3.c(kh3);
        mz9 mz9 = kh3.K0;
        int id = mz9.getId();
        bf3.d(id, 3, 0, 3);
        bf3.d(id, 4, 0, 4);
        bf3.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = kh3.L0;
        int id2 = appCompatTextView.getId();
        bf3.d(id2, 3, 0, 3);
        bf3.d(id2, 4, kh3.getMessageView().getId(), 3);
        bf3.d(id2, 6, mz9.getId(), 7);
        float f = (float) 12;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id2, 4));
        bf3.d(id2, 7, kh3.getIconInfoView().getId(), 6);
        new hw9(bf3, 7, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        bf3.g(id2).d.l0 = true;
        int id3 = kh3.getMessageView().getId();
        bf3.d(id3, 3, appCompatTextView.getId(), 4);
        hr1.q((float) 2, dh4.c().getDisplayMetrics().density, new hw9(bf3, 3, id3, 4));
        bf3.d(id3, 4, 0, 4);
        bf3.d(id3, 6, mz9.getId(), 7);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id3, 4));
        bf3.d(id3, 7, kh3.getIconInfoView().getId(), 6);
        new hw9(bf3, 7, id3, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        bf3.g(id3).d.l0 = true;
        int id4 = kh3.getIconInfoView().getId();
        bf3.d(id4, 3, 0, 3);
        bf3.d(id4, 4, 0, 4);
        bf3.d(id4, 7, kh3.getButtonView().getId(), 6);
        int id5 = kh3.getButtonView().getId();
        bf3.d(id5, 3, 0, 3);
        bf3.d(id5, 4, 0, 4);
        bf3.d(id5, 7, 0, 7);
        return bf3;
    }

    public static final bf3 G(kh3 kh3) {
        kh3.getClass();
        bf3 bf3 = new bf3();
        bf3.c(kh3);
        AppCompatTextView appCompatTextView = kh3.L0;
        int id = appCompatTextView.getId();
        bf3.d(id, 3, 0, 3);
        bf3.d(id, 4, kh3.getMessageView().getId(), 3);
        bf3.d(id, 6, 0, 6);
        new hw9(bf3, 6, id, 4).e(0);
        bf3.d(id, 7, 0, 7);
        new hw9(bf3, 7, id, 4).e(0);
        bf3.g(id).d.l0 = true;
        int id2 = kh3.getMessageView().getId();
        bf3.d(id2, 3, appCompatTextView.getId(), 4);
        hr1.q((float) 2, dh4.c().getDisplayMetrics().density, new hw9(bf3, 3, id2, 4));
        bf3.d(id2, 4, 0, 4);
        bf3.d(id2, 6, 0, 6);
        new hw9(bf3, 6, id2, 4).e(0);
        bf3.d(id2, 7, 0, 7);
        new hw9(bf3, 7, id2, 4).e(0);
        bf3.g(id2).d.l0 = true;
        return bf3;
    }

    public static final bf3 I(kh3 kh3) {
        kh3.getClass();
        bf3 bf3 = new bf3();
        bf3.c(kh3);
        mz9 mz9 = kh3.K0;
        int id = mz9.getId();
        bf3.d(id, 3, 0, 3);
        bf3.d(id, 4, 0, 4);
        bf3.d(id, 6, 0, 6);
        AppCompatTextView appCompatTextView = kh3.L0;
        int id2 = appCompatTextView.getId();
        bf3.d(id2, 3, 0, 3);
        bf3.d(id2, 4, kh3.getMessageView().getId(), 3);
        bf3.d(id2, 6, mz9.getId(), 7);
        float f = (float) 12;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id2, 4));
        t97 t97 = kh3.N0;
        if (ek8.L(t97)) {
            bf3.d(id2, 7, kh3.getAliasView().getId(), 6);
            hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 7, id2, 4));
        } else {
            bf3.d(id2, 7, 0, 7);
            new hw9(bf3, 7, id2, 4).e(0);
        }
        bf3.g(id2).d.l0 = true;
        int id3 = kh3.getMessageView().getId();
        bf3.d(id3, 3, appCompatTextView.getId(), 4);
        hr1.q((float) 2, dh4.c().getDisplayMetrics().density, new hw9(bf3, 3, id3, 4));
        bf3.d(id3, 4, 0, 4);
        bf3.d(id3, 6, mz9.getId(), 7);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id3, 4));
        bf3.d(id3, 7, 0, 7);
        new hw9(bf3, 7, id3, 4).e(0);
        bf3.g(id3).d.l0 = true;
        if (ek8.L(t97)) {
            int id4 = kh3.getAliasView().getId();
            bf3.d(id4, 3, appCompatTextView.getId(), 3);
            bf3.d(id4, 4, kh3.getMessageView().getId(), 4);
            bf3.d(id4, 7, 0, 7);
            new hw9(bf3, 7, id4, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
            bf3.g(id4).d.l0 = true;
        }
        return bf3;
    }

    public static final bf3 J(kh3 kh3) {
        kh3.getClass();
        bf3 bf3 = new bf3();
        bf3.c(kh3);
        mz9 mz9 = kh3.K0;
        int id = mz9.getId();
        bf3.d(id, 3, 0, 3);
        bf3.d(id, 4, 0, 4);
        bf3.d(id, 6, 0, 6);
        bf3.g(id).d.b = kh3.k1;
        bf3.g(id).d.c = kh3.k1;
        AppCompatTextView appCompatTextView = kh3.L0;
        og0 og0 = new og0(appCompatTextView.getId(), 4, (Object) bf3);
        og0.G(0);
        og0.f(kh3.getMessageView().getId());
        float f = (float) 12;
        hr1.q(f, dh4.c().getDisplayMetrics().density, og0.C(mz9.getId()));
        t97 t97 = kh3.N0;
        if (ek8.L(t97)) {
            hr1.q(f, dh4.c().getDisplayMetrics().density, og0.q(kh3.getAliasView().getId()));
        } else {
            og0.p(0).e(0);
        }
        og0.h();
        og0.I();
        int id2 = kh3.getMessageView().getId();
        bf3.d(id2, 3, appCompatTextView.getId(), 4);
        hr1.q((float) 2, dh4.c().getDisplayMetrics().density, new hw9(bf3, 3, id2, 4));
        bf3.d(id2, 4, 0, 4);
        bf3.d(id2, 6, mz9.getId(), 7);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id2, 4));
        bf3.d(id2, 7, 0, 7);
        new hw9(bf3, 7, id2, 4).e(0);
        bf3.g(id2).d.l0 = true;
        if (ek8.L(t97)) {
            int id3 = kh3.getAliasView().getId();
            bf3.d(id3, 3, appCompatTextView.getId(), 3);
            bf3.d(id3, 4, kh3.getMessageView().getId(), 4);
            bf3.d(id3, 7, 0, 7);
            new hw9(bf3, 7, id3, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
            bf3.g(id3).d.l0 = true;
        }
        return bf3;
    }

    public static /* synthetic */ void S(kh3 kh3, Integer num, u0a u0a, s16 s16, int i) {
        if ((i & 2) != 0) {
            u0a = u0a.b;
        }
        kh3.R(num, u0a, s0a.c, s16);
    }

    private final TextView getAliasView() {
        return (TextView) this.N0.getValue();
    }

    private final AppCompatImageView getButtonAudioCallView() {
        return (AppCompatImageView) this.R0.getValue();
    }

    private final AppCompatImageView getButtonVideoCallView() {
        return (AppCompatImageView) this.Q0.getValue();
    }

    private final OneMeButton getButtonView() {
        return (OneMeButton) this.P0.getValue();
    }

    private final StateListDrawable getCheckboxDrawable() {
        return (StateListDrawable) this.S0.getValue();
    }

    private final ImageView getIconInfoView() {
        return (ImageView) this.O0.getValue();
    }

    private final TextView getMessageView() {
        return (TextView) this.M0.getValue();
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.U0.getValue();
    }

    private final bf3 getSingleLineWithButtonConstraint() {
        return (bf3) this.c1.getValue();
    }

    private final bf3 getSingleLineWithCallButtonConstraint() {
        return (bf3) this.a1.getValue();
    }

    private final bf3 getSingleLineWithoutAvatarConstraint() {
        return (bf3) this.d1.getValue();
    }

    private final bf3 getTwoLineWithButtonConstraint() {
        return (bf3) this.g1.getValue();
    }

    private final bf3 getTwoLineWithCallButtonConstraint() {
        return (bf3) this.Z0.getValue();
    }

    private final bf3 getTwoLineWithoutAvatarConstraint() {
        return (bf3) this.h1.getValue();
    }

    private final bf3 getWithRadioButtonConstraint() {
        return (bf3) this.i1.getValue();
    }

    public static AppCompatCheckBox w(Context context, kh3 kh3) {
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, (AttributeSet) null);
        appCompatCheckBox.setId(qhc.B);
        appCompatCheckBox.setPadding(0, 0, 0, 0);
        appCompatCheckBox.setButtonDrawable((Drawable) null);
        appCompatCheckBox.setBackground(kh3.getCheckboxDrawable());
        appCompatCheckBox.setClickable(false);
        float f = (float) 24;
        kh3.addView(appCompatCheckBox, new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        return appCompatCheckBox;
    }

    public static final void x(kh3 kh3) {
        if (ek8.L(kh3.T0)) {
            kh3.getWithRadioButtonConstraint().a(kh3);
        } else {
            kh3.K();
        }
    }

    public static final bf3 y(kh3 kh3) {
        kh3.getClass();
        bf3 bf3 = new bf3();
        bf3.c(kh3);
        mz9 mz9 = kh3.K0;
        int id = mz9.getId();
        bf3.d(id, 3, 0, 3);
        bf3.d(id, 4, 0, 4);
        bf3.d(id, 6, 0, 6);
        int id2 = kh3.L0.getId();
        bf3.d(id2, 3, 0, 3);
        bf3.d(id2, 4, 0, 4);
        bf3.d(id2, 6, mz9.getId(), 7);
        float f = (float) 12;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 6, id2, 4));
        bf3.d(id2, 7, kh3.getButtonAudioCallView().getId(), 6);
        new hw9(bf3, 7, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        bf3.g(id2).d.l0 = true;
        int id3 = kh3.getButtonAudioCallView().getId();
        bf3.d(id3, 3, 0, 3);
        bf3.d(id3, 4, 0, 4);
        bf3.d(id3, 7, kh3.getButtonVideoCallView().getId(), 6);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(bf3, 7, id3, 4));
        int id4 = kh3.getButtonVideoCallView().getId();
        bf3.d(id4, 3, 0, 3);
        bf3.d(id4, 4, 0, 4);
        bf3.d(id4, 7, 0, 7);
        return bf3;
    }

    public final void K() {
        CharSequence text;
        boolean z = false;
        boolean z2 = this.K0.getVisibility() == 0;
        boolean z3 = ek8.L(this.M0) && (text = getMessageView().getText()) != null && !h0e.c0(text);
        boolean L = ek8.L(this.P0);
        if (ek8.L(this.Q0) || ek8.L(this.R0)) {
            z = true;
        }
        ((z3 || !z) ? z ? getTwoLineWithCallButtonConstraint() : (z2 || z3) ? !z2 ? getTwoLineWithoutAvatarConstraint() : (z3 || L) ? (z3 || !L) ? (!z3 || L || this.k1 == this.j1) ? (!z3 || L) ? getTwoLineWithButtonConstraint() : (bf3) this.e1.getValue() : (bf3) this.f1.getValue() : getSingleLineWithButtonConstraint() : (bf3) this.b1.getValue() : getSingleLineWithoutAvatarConstraint() : getSingleLineWithCallButtonConstraint()).a(this);
    }

    public final boolean L(String str) {
        return (str == null || str.length() == 0 || getMessageView().getPaint().measureText(str) <= ((float) getMessageView().getMeasuredWidth())) ? false : true;
    }

    public final boolean M(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        AppCompatTextView appCompatTextView = this.L0;
        return appCompatTextView.getPaint().measureText(str) > ((float) appCompatTextView.getMeasuredWidth());
    }

    public final void N() {
        if (ek8.L(this.P0)) {
            getButtonView().setOnClickListener((View.OnClickListener) null);
            getButtonView().setVisibility(8);
        }
        if (ek8.L(this.R0)) {
            getButtonAudioCallView().setOnClickListener((View.OnClickListener) null);
            getButtonAudioCallView().setVisibility(8);
        }
        if (ek8.L(this.Q0)) {
            getButtonVideoCallView().setOnClickListener((View.OnClickListener) null);
            getButtonVideoCallView().setVisibility(8);
        }
        K();
    }

    public final void O(long j, CharSequence charSequence, String str) {
        ub0 ub0 = new ub0(charSequence, j);
        mz9 mz9 = this.K0;
        mz9.g(ub0, true);
        mz9.setAvatarUrl(str);
    }

    public final void P(CharSequence charSequence, s16 s16) {
        OneMeButton buttonView = getButtonView();
        buttonView.setText(charSequence);
        a24.Z(buttonView, 300, new q6(6, s16));
        buttonView.setVisibility(0);
        buttonView.setMode(u0a.o);
        buttonView.setAppearance(s0a.a);
        buttonView.setSize(v0a.b);
        K();
    }

    public final void Q(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, ka kaVar) {
        AppCompatImageView buttonAudioCallView = getButtonAudioCallView();
        a24.Z(buttonAudioCallView, 300, new gh3(1, kaVar));
        buttonAudioCallView.setImageDrawable(layerDrawable);
        float f = (float) 0;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        buttonAudioCallView.setPadding(X, X, X, X);
        buttonAudioCallView.setVisibility(0);
        AppCompatImageView buttonVideoCallView = getButtonVideoCallView();
        a24.Z(buttonVideoCallView, 300, new gh3(2, kaVar));
        buttonVideoCallView.setImageDrawable(layerDrawable2);
        int X2 = a24.X(f * dh4.c().getDisplayMetrics().density);
        buttonVideoCallView.setPadding(X2, X2, X2, X2);
        buttonVideoCallView.setVisibility(0);
        T();
        K();
    }

    public final void R(Integer num, u0a u0a, s0a s0a, s16 s16) {
        if (num == null) {
            t97 t97 = this.P0;
            if (t97.a()) {
                ((OneMeButton) t97.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        OneMeButton buttonView = getButtonView();
        k77[] k77Arr = OneMeButton.F0;
        buttonView.d(num, true);
        a24.Z(buttonView, 300, new q6(5, s16));
        buttonView.setVisibility(0);
        buttonView.setMode(u0a);
        buttonView.setAppearance(s0a);
        buttonView.setSize(v0a.b);
        K();
    }

    public final void T() {
        int i;
        int i2;
        pda customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = km4.y0.r(this);
        }
        t97 t97 = this.R0;
        if (t97.a()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) t97.getValue();
            int ordinal = getCallButtonMode().ordinal();
            if (ordinal == 0) {
                i2 = customTheme.getIcon().f;
            } else if (ordinal == 1) {
                i2 = customTheme.getIcon().e;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            appCompatImageView.setImageTintList(ColorStateList.valueOf(i2));
        }
        t97 t972 = this.Q0;
        if (t972.a()) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) t972.getValue();
            int ordinal2 = getCallButtonMode().ordinal();
            if (ordinal2 == 0) {
                i = customTheme.getIcon().f;
            } else if (ordinal2 == 1) {
                i = customTheme.getIcon().c;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final View getAnchorButton() {
        return getButtonView();
    }

    public final ih3 getCallButtonMode() {
        k77 k77 = l1[3];
        return (ih3) this.Y0.b;
    }

    public final pda getCustomTheme() {
        k77 k77 = l1[2];
        return (pda) this.X0.b;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(km4.y0.r(this));
    }

    public final void onMeasure(int i, int i2) {
        if (tge.c(this.L0)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    public final void onThemeChanged(pda pda) {
        pda customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = pda;
        }
        this.K0.onThemeChanged(customTheme);
        getIconInfoView().setImageTintList(ColorStateList.valueOf(-1));
        this.L0.setTextColor(customTheme.getText().e);
        t97 t97 = this.M0;
        if (t97.a()) {
            ((TextView) t97.getValue()).setTextColor(customTheme.getText().f);
        }
        t97 t972 = this.N0;
        if (t972.a()) {
            ((TextView) t972.getValue()).setTextColor(customTheme.getText().f);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(customTheme.c().a.f));
        T();
        t97 t973 = this.T0;
        if (t973.a()) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) t973.getValue();
            xy6.g(getCheckboxDrawable(), pda);
        }
    }

    public final void setAlias(CharSequence charSequence) {
        CharSequence text;
        if ((charSequence != null && !h0e.c0(charSequence)) || getAliasView().getVisibility() == 0) {
            boolean L = ek8.L(this.M0);
            smc smc = smc.Y;
            if (!L || (text = getMessageView().getText()) == null || h0e.c0(text)) {
                this.b1.b = smc;
            } else {
                this.e1.b = smc;
            }
            getAliasView().setText(charSequence);
            TextView aliasView = getAliasView();
            int i = 0;
            if (!(!(charSequence == null || h0e.c0(charSequence)))) {
                i = 8;
            }
            aliasView.setVisibility(i);
            K();
        }
    }

    public final void setCallButtonMode(ih3 ih3) {
        this.Y0.o1(this, l1[3], ih3);
    }

    public final void setCallButtons(u16 u16) {
        a24.Z(getButtonAudioCallView(), 300, new gh3(0, u16));
        a24.Z(getButtonVideoCallView(), 300, new gh3(3, u16));
        getButtonAudioCallView().setVisibility(0);
        getButtonAudioCallView().setVisibility(0);
        K();
    }

    public final void setContactSelected(boolean z) {
        this.W0.o1(this, l1[1], Boolean.valueOf(z));
    }

    public final void setCustomTheme(pda pda) {
        this.X0.o1(this, l1[2], pda);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setIconInfo(Integer num) {
        if (num == null) {
            t97 t97 = this.O0;
            if (t97.a()) {
                ((ImageView) t97.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ImageView iconInfoView = getIconInfoView();
        iconInfoView.setImageResource(num.intValue());
        iconInfoView.setVisibility(0);
        K();
    }

    public final void setMessage(CharSequence charSequence) {
        if ((charSequence != null && !h0e.c0(charSequence)) || ek8.L(this.M0)) {
            getMessageView().setText(charSequence);
            TextView messageView = getMessageView();
            int i = 0;
            if (!(!(charSequence == null || h0e.c0(charSequence)))) {
                i = 8;
            }
            messageView.setVisibility(i);
            K();
        }
    }

    public final void setName(CharSequence charSequence) {
        this.L0.setText(charSequence);
        K();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setBackground(onClickListener != null ? getRippleDrawable() : null);
    }

    public final void setOnline(boolean z) {
        this.K0.setOnlineBadgeVisibility(z);
    }

    public final void setSelectionEnabled(boolean z) {
        this.V0.o1(this, l1[0], Boolean.valueOf(z));
    }

    public final void setVerified(boolean z) {
        b1f b1f;
        AppCompatTextView appCompatTextView = this.L0;
        int C = xy6.C(tge.e(appCompatTextView));
        int i = 0;
        if (z) {
            b1f a = tge.a(appCompatTextView);
            if ((a != null ? a.a : 0) == C) {
                return;
            }
        }
        if (z) {
            b1f a2 = tge.a(appCompatTextView);
            if (a2 != null) {
                i = a2.a;
            }
            if (i != C) {
                b1f = new b1f(getContext(), C, new t13(5));
                tge.d(appCompatTextView, b1f);
            }
        }
        b1f = null;
        tge.d(appCompatTextView, b1f);
    }

    public final void setName(int i) {
        this.L0.setText(i);
        K();
    }
}
