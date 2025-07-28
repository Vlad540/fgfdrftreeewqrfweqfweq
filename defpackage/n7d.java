package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: n7d  reason: default package */
public final class n7d extends ConstraintLayout implements mhe, gdc {
    public static final /* synthetic */ k77[] d1;
    public final t97 K0;
    public final TextView L0;
    public final t97 M0;
    public final ImageView N0;
    public final t97 O0;
    public final LinearLayout P0;
    public final LinearLayout Q0;
    public final t97 R0;
    public final t97 S0;
    public final t97 T0;
    public final t97 U0;
    public final t97 V0;
    public k7d W0;
    public final ShapeDrawable X0;
    public final RippleDrawable Y0;
    public d7d Z0 = d7d.b;
    public final m7d a1;
    public final m7d b1;
    public boolean c1;

    static {
        Class<n7d> cls = n7d.class;
        d1 = new k77[]{new hc9(cls, "modelItem", "getModelItem()Lone/me/sdk/sections/SettingsItem;"), c3d.g(m7c.a, cls, "themeDepended", "getThemeDepended()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent$Companion$ThemeDependedType;")};
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d, java.lang.Object, android.view.ViewGroup] */
    public n7d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K0 = ez3.O(3, new h7d(context, this, 1));
        TextView textView = new TextView(context);
        textView.setId(caa.g);
        textView.setLayoutParams(new re3(-2, -2));
        nte.i.b(textView, yq4.b);
        textView.setPadding(0, 0, 0, 0);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.L0 = textView;
        this.M0 = ez3.O(3, new h7d(context, this, 2));
        ImageView imageView = new ImageView(context);
        imageView.setId(caa.f);
        float f = (float) 36;
        imageView.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        me4.o((float) 6, dh4.c().getDisplayMetrics().density, imageView);
        this.N0 = imageView;
        this.O0 = ez3.O(3, new t2a(context, 28));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(caa.i);
        linearLayout.setLayoutParams(new re3(a24.X(((float) 0) * dh4.c().getDisplayMetrics().density), -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(8388627);
        this.P0 = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(caa.d);
        linearLayout2.setLayoutParams(new re3(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setOnTouchListener(new cg3(new GestureDetector(context, new tz(16, this)), 8));
        this.Q0 = linearLayout2;
        this.R0 = ez3.O(3, new h7d(context, this, 3));
        this.S0 = ez3.O(3, new h7d(context, this, 4));
        this.T0 = ez3.O(3, new h7d(context, this, 5));
        this.U0 = ez3.O(3, new h7d(context, this, 6));
        this.V0 = ez3.O(3, new h7d(context, this, 0));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.X0 = shapeDrawable;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(km4.y0.r(this).c().a.f), (Drawable) null, shapeDrawable);
        this.Y0 = rippleDrawable;
        e7d.U.getClass();
        this.a1 = new m7d(t6d.b, this);
        this.b1 = new m7d(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinHeight(a24.X(((float) 48) * dh4.c().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        addView(imageView);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout.addView(textView);
        G();
    }

    public static AppCompatImageView A(Context context, n7d n7d) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(caa.c);
        appCompatImageView.setImageDrawable(gq3.b(appCompatImageView.getContext(), phc.G0));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(n7d.getCurrentTheme().getIcon().i));
        n7d.Q0.addView(appCompatImageView);
        return appCompatImageView;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void C(defpackage.n7d r3, defpackage.e7d r4) {
        /*
            r3.getClass()
            mge r0 = r4.getTitle()
            r3.setTitle((defpackage.mge) r0)
            java.lang.Integer r0 = r4.b()
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r0.intValue()
            android.content.Context r2 = r3.getContext()
            android.graphics.drawable.Drawable r0 = gq3.b(r2, r0)
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r3.setStartIcon((android.graphics.drawable.Drawable) r0)
            mge r0 = r4.c()
            r3.setDescription((defpackage.mge) r0)
            v6d r0 = r4.d()
            r3.setCounter(r0)
            mge r0 = r4.e()
            if (r0 == 0) goto L_0x003e
            android.content.Context r1 = r3.getContext()
            java.lang.CharSequence r1 = r0.a(r1)
        L_0x003e:
            r3.setUpperText((java.lang.CharSequence) r1)
            b7d r0 = r4.f()
            r3.setEndView(r0)
            int r0 = r4.q()
            r3.setStartIconPadding(r0)
            r4.getItemId()
            e7d r0 = r3.getModelItem()
            d7d r0 = r0.getType()
            r3.setType(r0)
            r6d r4 = r4.s()
            r3.setAvatar(r4)
            r3.G()
            r3.requestLayout()
            r3.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7d.C(n7d, e7d):void");
    }

    public static void F(LinearLayout linearLayout, t97 t97) {
        if (!t97.a()) {
            return;
        }
        if (((View) t97.getValue()).getVisibility() == 0) {
            ek8.d(linearLayout, (View) t97.getValue(), -1);
        } else {
            linearLayout.removeView((View) t97.getValue());
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, n7d] */
    /* access modifiers changed from: private */
    public final pda getCurrentTheme() {
        int ordinal = getThemeDepended().ordinal();
        if (ordinal == 0) {
            return km4.y0.r(this);
        }
        if (ordinal == 1) {
            return qda.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [n7d, android.view.ViewGroup] */
    private final void setAvatar(r6d r6d) {
        mz9 mz9 = (mz9) this.O0.getValue();
        mz9.setVisibility(r6d != null ? 0 : 8);
        mz9.setAvatarUrl(r6d != null ? r6d.a : null);
        mz9.g(r6d != null ? r6d.b : null, true);
        ek8.d(this, mz9, (Integer) null);
    }

    private final void setupCounter(v6d v6d) {
        boolean f = hhd.f(v6d, u6d.a);
        t97 t97 = this.V0;
        if (f) {
            t3a t3a = (t3a) t97.getValue();
            t3a.setVisibility(0);
            t3a.setAppearance(o3a.o);
            t3a.h();
        } else if (v6d != null) {
            throw new NoWhenBranchMatchedException();
        } else if (t97.a()) {
            ((t3a) t97.getValue()).setVisibility(8);
        }
    }

    private final void setupDescription(CharSequence charSequence) {
        TextView textView = (TextView) this.M0.getValue();
        int i = 0;
        if (!(charSequence != null)) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
        textView.setPadding(textView.getPaddingLeft(), a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), textView.getPaddingRight(), textView.getPaddingBottom());
        ek8.d(this.P0, textView, (Integer) null);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View, b9a] */
    /* JADX WARNING: type inference failed for: r0v9, types: [eda, android.view.View] */
    private final void setupEndText(CharSequence charSequence) {
        t97 t97 = this.T0;
        if (t97.a()) {
            ((eda) t97.getValue()).setVisibility(8);
        }
        t97 t972 = this.S0;
        if (t972.a()) {
            ((AppCompatImageView) t972.getValue()).setVisibility(8);
        }
        t97 t973 = this.U0;
        if (t973.a()) {
            ((b9a) t973.getValue()).setVisibility(8);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.R0.getValue();
        appCompatTextView.setId(caa.n);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private final void setupUpperText(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.K0.getValue();
        appCompatTextView.setVisibility(charSequence != null ? 0 : 8);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), a24.X(((float) 2) * dh4.c().getDisplayMetrics().density));
        ek8.d(this.P0, appCompatTextView, 0);
    }

    public static AppCompatTextView w(Context context, n7d n7d) {
        int i;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(caa.b);
        appCompatTextView.setLayoutParams(new re3(-2, -2));
        nte.m.b(appCompatTextView, yq4.b);
        appCompatTextView.setMaxLines(2);
        int ordinal = n7d.Z0.ordinal();
        if (ordinal != 0) {
            i = ordinal != 3 ? n7d.getCurrentTheme().getText().f : n7d.getCurrentTheme().c().c.h;
        } else {
            n7d.getCurrentTheme().getText();
            i = -16745729;
        }
        appCompatTextView.setTextColor(i);
        appCompatTextView.setPadding(0, a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), 0, 0);
        n7d.P0.addView(appCompatTextView);
        return appCompatTextView;
    }

    public static AppCompatTextView x(Context context, n7d n7d) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(caa.h);
        appCompatTextView.setLayoutParams(new re3(-2, -2));
        nte.o.b(appCompatTextView, yq4.b);
        appCompatTextView.setTextColor(n7d.getCurrentTheme().getText().f);
        n7d.P0.addView(appCompatTextView, 0);
        return appCompatTextView;
    }

    public static AppCompatTextView y(Context context, n7d n7d) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(caa.e);
        nte.l.b(appCompatTextView, yq4.b);
        appCompatTextView.setTextColor(l7d.$EnumSwitchMapping$0[n7d.Z0.ordinal()] == 1 ? n7d.getCurrentTheme().c().c.h : n7d.getCurrentTheme().getText().f);
        LinearLayout linearLayout = n7d.Q0;
        re3 re3 = new re3(-2, -2);
        re3.setMarginEnd(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density));
        linearLayout.addView(appCompatTextView, re3);
        return appCompatTextView;
    }

    public final void G() {
        int i;
        bf3 p = a06.p(this);
        t97 t97 = this.O0;
        if (ek8.L(t97)) {
            i = ((mz9) t97.getValue()).getId();
            og0 og0 = new og0(((mz9) t97.getValue()).getId(), 4, p);
            og0.D(0).e(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
            og0.G(0);
            og0.e(0);
        } else {
            ImageView imageView = this.N0;
            i = imageView.getId();
            og0 og02 = new og0(imageView.getId(), 4, p);
            og02.D(0).e(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
            og02.G(0);
            og02.e(0);
        }
        og0 og03 = new og0(this.P0.getId(), 4, p);
        hw9 C = og03.C(i);
        float f = (float) 12;
        C.e(a24.X(dh4.c().getDisplayMetrics().density * f));
        float f2 = (float) 10;
        og03.G(0).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        hr1.q(f2, dh4.c().getDisplayMetrics().density, og03.e(0));
        LinearLayout linearLayout = this.Q0;
        og03.q(linearLayout.getId()).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        og0 og04 = new og0(linearLayout.getId(), 4, p);
        og04.p(0).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        og04.G(0);
        og04.e(0);
        p.a(this);
    }

    public final e7d getModelItem() {
        k77 k77 = d1[0];
        return (e7d) this.a1.b;
    }

    public final j7d getThemeDepended() {
        k77 k77 = d1[1];
        return (j7d) this.b1.b;
    }

    public final void onThemeChanged(pda pda) {
        pda currentTheme = getCurrentTheme();
        this.Y0.setColor(ColorStateList.valueOf(currentTheme.c().a.f));
        t97 t97 = this.T0;
        if (t97.a()) {
            ((eda) t97.getValue()).onThemeChanged(currentTheme);
        }
        t97 t972 = this.U0;
        if (t972.a()) {
            ((b9a) t972.getValue()).onThemeChanged(currentTheme);
        }
        t97 t973 = this.V0;
        if (t973.a()) {
            ((t3a) t973.getValue()).f(currentTheme);
        }
        t97 t974 = this.R0;
        if (t974.a()) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) t974.getValue();
            appCompatTextView.setTextColor(currentTheme.getText().f);
            qge.f(appCompatTextView, ColorStateList.valueOf(currentTheme.getIcon().i));
        }
        t97 t975 = this.S0;
        if (t975.a()) {
            ((AppCompatImageView) t975.getValue()).setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().i));
        }
        t97 t976 = this.K0;
        if (t976.a()) {
            ((AppCompatTextView) t976.getValue()).setTextColor(currentTheme.getText().f);
        }
        int ordinal = getModelItem().getType().ordinal();
        t97 t977 = this.M0;
        TextView textView = this.L0;
        ImageView imageView = this.N0;
        if (ordinal == 0) {
            textView.setTextColor(-16745729);
            if (t977.a()) {
                ((TextView) t977.getValue()).setTextColor(-16745729);
            }
            if (this.c1) {
                imageView.setImageTintList((ColorStateList) null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(-16745729));
            }
        } else if (ordinal == 1) {
            textView.setTextColor(currentTheme.getText().e);
            if (t977.a()) {
                ((TextView) t977.getValue()).setTextColor(currentTheme.getText().f);
            }
            if (this.c1) {
                imageView.setImageTintList((ColorStateList) null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().f));
            }
        } else if (ordinal == 2) {
            textView.setTextColor(currentTheme.getText().b);
            if (t977.a()) {
                ((TextView) t977.getValue()).setTextColor(currentTheme.getText().f);
            }
            if (this.c1) {
                imageView.setImageTintList((ColorStateList) null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().c));
            }
        } else if (ordinal == 3) {
            textView.setTextColor(currentTheme.c().c.h);
            if (t977.a()) {
                ((TextView) t977.getValue()).setTextColor(currentTheme.c().c.h);
            }
            if (this.c1) {
                imageView.setImageTintList((ColorStateList) null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.c().b.f));
            }
        } else if (ordinal == 4) {
            textView.setTextColor(currentTheme.getText().e);
            if (t977.a()) {
                ((TextView) t977.getValue()).setTextColor(currentTheme.getText().f);
            }
            imageView.setImageTintList((ColorStateList) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setCounter(v6d v6d) {
        setupCounter(v6d);
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setDescription(mge mge) {
        setupDescription(mge != null ? mge.a(getContext()) : null);
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setDisableStartIconText(boolean z) {
        this.c1 = z;
        ImageView imageView = this.N0;
        if (z) {
            imageView.setImageTintList((ColorStateList) null);
        } else {
            getCurrentTheme().getIcon();
            imageView.setImageTintList(ColorStateList.valueOf(-16745729));
        }
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [android.view.View, b9a] */
    /* JADX WARNING: type inference failed for: r11v13, types: [eda, android.view.View] */
    /* JADX WARNING: type inference failed for: r6v2, types: [android.widget.CompoundButton, android.view.View, b9a] */
    /* JADX WARNING: type inference failed for: r7v6, types: [eda, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v25, types: [android.view.View, b9a] */
    /* JADX WARNING: type inference failed for: r0v27, types: [eda, android.view.View] */
    /* JADX WARNING: type inference failed for: r11v34, types: [android.view.View, b9a] */
    /* JADX WARNING: type inference failed for: r11v38, types: [eda, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v25, types: [android.view.View, b9a] */
    public final void setEndView(b7d b7d) {
        Drawable drawable;
        boolean z = b7d instanceof z6d;
        t97 t97 = this.S0;
        t97 t972 = this.T0;
        t97 t973 = this.U0;
        t97 t974 = this.R0;
        if (z) {
            z6d z6d = (z6d) b7d;
            boolean z2 = z6d.a;
            boolean z3 = z6d.b;
            if (t974.a()) {
                ((AppCompatTextView) t974.getValue()).setVisibility(8);
            }
            if (t97.a()) {
                ((AppCompatImageView) t97.getValue()).setVisibility(8);
            }
            if (t973.a()) {
                ((b9a) t973.getValue()).setVisibility(8);
            }
            SwitchCompat switchCompat = (eda) t972.getValue();
            switchCompat.setId(caa.m);
            switchCompat.setVisibility(0);
            if (switchCompat.isChecked() != z2) {
                switchCompat.setChecked(z2);
            }
            switchCompat.setEnabled(z3);
            switchCompat.setClickable(z3);
        } else if (b7d instanceof w6d) {
            if (t972.a()) {
                ((eda) t972.getValue()).setVisibility(8);
            }
            if (t974.a()) {
                ((AppCompatTextView) t974.getValue()).setVisibility(8);
            }
            if (t973.a()) {
                ((b9a) t973.getValue()).setVisibility(8);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) t97.getValue();
            appCompatImageView.setId(caa.k);
            appCompatImageView.setVisibility(0);
        } else {
            CharSequence charSequence = "";
            if (b7d instanceof x6d) {
                x6d x6d = (x6d) b7d;
                CharSequence a = x6d.a.a(getContext());
                if (a != null) {
                    charSequence = a;
                }
                if (t972.a()) {
                    ((eda) t972.getValue()).setVisibility(8);
                }
                if (t973.a()) {
                    ((b9a) t973.getValue()).setVisibility(8);
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) t974.getValue();
                appCompatTextView.setId(caa.n);
                appCompatTextView.setText(charSequence);
                appCompatTextView.setVisibility(0);
                appCompatTextView.setCompoundDrawablePadding(6);
                qge.f(appCompatTextView, ColorStateList.valueOf(getCurrentTheme().getIcon().i));
                Integer num = x6d.b;
                if (num == null || (drawable = gq3.b(appCompatTextView.getContext(), num.intValue())) == null) {
                    drawable = null;
                } else {
                    float f = (float) 16;
                    drawable.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                }
                appCompatTextView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) t97.getValue();
                appCompatImageView2.setId(caa.k);
                appCompatImageView2.setVisibility(0);
            } else if (b7d instanceof a7d) {
                CharSequence a2 = ((a7d) b7d).a.a(getContext());
                if (a2 != null) {
                    charSequence = a2;
                }
                setupEndText(charSequence);
            } else if (b7d instanceof y6d) {
                y6d y6d = (y6d) b7d;
                boolean z4 = y6d.a;
                boolean z5 = y6d.b;
                if (t974.a()) {
                    ((AppCompatTextView) t974.getValue()).setVisibility(8);
                }
                if (t97.a()) {
                    ((AppCompatImageView) t97.getValue()).setVisibility(8);
                }
                if (t972.a()) {
                    ((eda) t972.getValue()).setVisibility(8);
                }
                ? r6 = (b9a) t973.getValue();
                r6.setId(caa.l);
                r6.setVisibility(0);
                r6.setChecked(z4);
                r6.setEnabled(z5);
                r6.setOnCheckedChangeListener(new nw2(4, this));
            } else {
                if (t972.a()) {
                    ((eda) t972.getValue()).setVisibility(8);
                }
                if (t974.a()) {
                    ((AppCompatTextView) t974.getValue()).setVisibility(8);
                }
                if (t97.a()) {
                    ((AppCompatImageView) t97.getValue()).setVisibility(8);
                }
                if (t973.a()) {
                    ((b9a) t973.getValue()).setVisibility(8);
                }
            }
        }
        t97 t975 = this.V0;
        boolean a3 = t975.a();
        LinearLayout linearLayout = this.Q0;
        if (a3) {
            linearLayout.removeView((t3a) t975.getValue());
        }
        if (t974.a()) {
            linearLayout.removeView((AppCompatTextView) t974.getValue());
        }
        if (t97.a()) {
            linearLayout.removeView((AppCompatImageView) t97.getValue());
        }
        F(linearLayout, t975);
        F(linearLayout, t974);
        F(linearLayout, t97);
        F(linearLayout, t972);
        F(linearLayout, t973);
        linearLayout.requestLayout();
        linearLayout.invalidate();
    }

    public final void setItemId(long j) {
    }

    public final void setModelItem(e7d e7d) {
        this.a1.o1(this, d1[0], e7d);
    }

    public final void setOnSwitchCheckedListener(i26 i26) {
        if (i26 != null) {
            setOnSwitchListener(new wwc(23, i26));
        } else {
            setOnSwitchListener((k7d) null);
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [eda, android.widget.CompoundButton] */
    /* JADX WARNING: type inference failed for: r2v1, types: [eda, android.widget.CompoundButton] */
    /* JADX WARNING: type inference failed for: r0v2, types: [eda, android.widget.CompoundButton] */
    public final void setOnSwitchListener(k7d k7d) {
        t97 t97 = this.T0;
        if (t97.a()) {
            this.W0 = k7d;
            if (k7d != null) {
                ((eda) t97.getValue()).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                ((eda) t97.getValue()).setOnCheckedChangeListener(new i7d(this, k7d));
                return;
            }
            ((eda) t97.getValue()).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
    }

    public void setRippleMask(Shape shape) {
        this.X0.setShape(shape);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setStartIcon(int i) {
        ImageView imageView = this.N0;
        imageView.setImageDrawable(gq3.b(getContext(), i));
        imageView.setVisibility(0);
        requestLayout();
        invalidate();
    }

    public final void setStartIconPadding(int i) {
        this.N0.setPadding(i, i, i, i);
    }

    public final void setThemeDepended(j7d j7d) {
        this.b1.o1(this, d1[1], j7d);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setTitle(mge mge) {
        this.L0.setText(mge != null ? mge.a(getContext()) : null);
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setType(d7d d7d) {
        if (this.Z0 != d7d) {
            this.Z0 = d7d;
            onThemeChanged(km4.y0.r(this));
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setUpperText(mge mge) {
        setupUpperText(mge != null ? mge.a(getContext()) : null);
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setDescription(CharSequence charSequence) {
        setupDescription(charSequence);
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setTitle(CharSequence charSequence) {
        this.L0.setText(charSequence);
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setUpperText(CharSequence charSequence) {
        setupUpperText(charSequence);
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n7d] */
    public final void setStartIcon(Drawable drawable) {
        ImageView imageView = this.N0;
        imageView.setImageDrawable(drawable);
        int i = 0;
        if (!(drawable != null)) {
            i = 8;
        }
        imageView.setVisibility(i);
        requestLayout();
        invalidate();
    }
}
