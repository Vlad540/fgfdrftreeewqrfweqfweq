package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004 )0\u001dB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0010\u001a\u00020\u000b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u000b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR+\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 8F@FX\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010/\u001a\u00020)2\u0006\u0010!\u001a\u00020)8F@FX\u0002¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00106\u001a\u0002002\u0006\u0010!\u001a\u0002008F@FX\u0002¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u00103\"\u0004\b4\u00105R/\u0010=\u001a\u0004\u0018\u0001072\b\u0010!\u001a\u0004\u0018\u0001078F@FX\u0002¢\u0006\u0012\n\u0004\b8\u0010#\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010?\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t8F@FX\u0002¢\u0006\u0012\n\u0004\b>\u0010#\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\rR\u0011\u0010\u0016\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010F\u001a\u0002078BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010:¨\u0006G"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeButton;", "Landroid/widget/LinearLayout;", "Lmhe;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Ljue;", "setEnabled", "(Z)V", "Landroid/graphics/drawable/Drawable;", "icon", "setEndIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "resId", "(Ljava/lang/Integer;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "(I)V", "Landroid/widget/TextView;", "setupTextViewParams", "(Landroid/widget/TextView;)V", "Lt0a;", "getInternalType", "()Lt0a;", "Lv0a;", "<set-?>", "a", "Lp0c;", "getSize", "()Lv0a;", "setSize", "(Lv0a;)V", "size", "Lu0a;", "b", "getMode", "()Lu0a;", "setMode", "(Lu0a;)V", "mode", "Ls0a;", "c", "getAppearance", "()Ls0a;", "setAppearance", "(Ls0a;)V", "appearance", "Lpda;", "o", "getCustomTheme", "()Lpda;", "setCustomTheme", "(Lpda;)V", "customTheme", "w0", "isProgressEnabled", "()Z", "setProgressEnabled", "", "getText", "()Ljava/lang/String;", "getCurrentTheme", "currentTheme", "common_release"}, k = 1, mv = {2, 0, 0})
public final class OneMeButton extends LinearLayout implements mhe {
    public static final /* synthetic */ k77[] F0;
    public final t97 A0;
    public final t97 B0;
    public final ShapeDrawable C0;
    public final RippleDrawable D0;
    public boolean E0;
    public final w0a a = new w0a(this, 0);
    public final w0a b = new w0a(this, 1);
    public final w0a c = new w0a(this, 2);
    public final w0a o = new w0a(this, 3);
    public final w0a w0 = new w0a(this, 4);
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<OneMeButton> cls = OneMeButton.class;
        F0 = new k77[]{new hc9(cls, "size", "getSize()Lone/me/sdk/uikit/common/button/OneMeButton$Size;"), c3d.g(m7c.a, cls, "mode", "getMode()Lone/me/sdk/uikit/common/button/OneMeButton$Mode;"), new hc9(cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/button/OneMeButton$Appearance;"), new hc9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), new hc9(cls, "isProgressEnabled", "isProgressEnabled()Z")};
    }

    public OneMeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x0 = ez3.O(3, new r0a(context, this, 0));
        this.y0 = ez3.O(3, new cc3(context, 22));
        this.z0 = ez3.O(3, new cc3(context, 23));
        this.A0 = ez3.O(3, new cc3(context, 24));
        this.B0 = ez3.O(3, new r0a(context, this, 1));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.C0 = shapeDrawable;
        int i = km4.y0.r(this).c().a.c;
        this.D0 = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        this.E0 = true;
        setOrientation(0);
        setGravity(17);
        setClipToOutline(true);
        e();
        k();
    }

    public static final void a(OneMeButton oneMeButton, int i, boolean z) {
        oneMeButton.getClass();
        rg5 rg5 = new rg5(myc.L(new es(8, oneMeButton), new su6(i, 2)));
        while (rg5.hasNext()) {
            ((View) rg5.next()).setVisibility(z ? 0 : 8);
        }
    }

    private final pda getCurrentTheme() {
        pda customTheme = getCustomTheme();
        return customTheme == null ? km4.y0.r(this) : customTheme;
    }

    private final t0a getInternalType() {
        k77 k77 = F0[4];
        return ((Boolean) this.w0.b).booleanValue() ? t0a.c : (ek8.L(this.y0) == ek8.L(this.z0) || ek8.L(this.A0)) ? t0a.a : t0a.b;
    }

    private final void setupTextViewParams(TextView textView) {
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(((float) 0) * dh4.c().getDisplayMetrics().density), -2);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
    }

    public final int b(int i) {
        int J;
        if (i == qhc.i) {
            return 0;
        }
        if (i == qhc.j) {
            J = myc.J(pfa.o(this)) / 2;
        } else if (i == qhc.f) {
            return myc.J(pfa.o(this)) / 2;
        } else {
            if (i != qhc.g) {
                return -1;
            }
            J = myc.J(pfa.o(this));
        }
        return J - 1;
    }

    public final void c(Integer num, boolean z) {
        t97 t97 = this.B0;
        if (t97.a() || num != null) {
            t3a t3a = (t3a) t97.getValue();
            int i = 0;
            t3a.setVisibility(num != null ? 0 : 8);
            if (num != null) {
                i = num.intValue();
            }
            t3a.g(i, z);
            g();
            i();
        }
    }

    public final void d(Integer num, boolean z) {
        ImageView imageView = (ImageView) this.y0.getValue();
        imageView.setId(qhc.i);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setVisibility(num == null ? 8 : 0);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.E0 = z;
        ek8.d(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        k();
        i();
    }

    public final void e() {
        h();
        l();
        g();
        j();
        f();
        invalidate();
    }

    public final void f() {
        au0 g = kjd.g(getCurrentTheme(), getMode(), getAppearance(), isEnabled());
        Paint paint = this.C0.getPaint();
        Integer num = g.a;
        paint.setColor(num != null ? num.intValue() : 0);
        ColorStateList valueOf = ColorStateList.valueOf(g.b);
        RippleDrawable rippleDrawable = this.D0;
        rippleDrawable.setColor(valueOf);
        setBackground(rippleDrawable);
    }

    public final void g() {
        t97 t97 = this.B0;
        if (t97.a()) {
            t3a t3a = (t3a) t97.getValue();
            u0a mode = getMode();
            s0a appearance = getAppearance();
            int i = cu0.$EnumSwitchMapping$3[mode.ordinal()];
            o3a o3a = o3a.b;
            if (i != 1) {
                int ordinal = appearance.ordinal();
                if (ordinal == 0) {
                    o3a = o3a.a;
                } else if (ordinal == 1) {
                    o3a = o3a.o;
                } else if (ordinal != 2) {
                    o3a = o3a.X;
                    if (!(ordinal == 3 || ordinal == 4)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            t3a.setAppearance(o3a);
        }
    }

    public final s0a getAppearance() {
        k77 k77 = F0[2];
        return (s0a) this.c.b;
    }

    public final pda getCustomTheme() {
        k77 k77 = F0[3];
        return (pda) this.o.b;
    }

    public final u0a getMode() {
        k77 k77 = F0[1];
        return (u0a) this.b.b;
    }

    public final v0a getSize() {
        k77 k77 = F0[0];
        return (v0a) this.a.b;
    }

    public final String getText() {
        t97 t97 = this.A0;
        return t97.a() ? ((TextView) t97.getValue()).getText().toString() : "";
    }

    public final void h() {
        pda currentTheme = getCurrentTheme();
        u0a mode = getMode();
        s0a appearance = getAppearance();
        int ordinal = mode.ordinal();
        int i = -1;
        if (ordinal == 0) {
            int ordinal2 = appearance.ordinal();
            if (ordinal2 == 0 || ordinal2 == 1) {
                currentTheme.getIcon();
            } else if (ordinal2 == 2) {
                i = currentTheme.getIcon().b;
            } else if (ordinal2 == 3) {
                currentTheme.getIcon();
            } else if (ordinal2 == 4) {
                currentTheme.getIcon();
                i = -15987442;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            int ordinal3 = appearance.ordinal();
            if (ordinal3 == 0) {
                currentTheme.getIcon();
                i = -16745729;
            } else if (ordinal3 == 1) {
                i = currentTheme.getIcon().c;
            } else if (ordinal3 == 2) {
                i = currentTheme.getIcon().f;
            } else if (ordinal3 == 3) {
                i = currentTheme.getIcon().d;
            } else if (ordinal3 == 4) {
                currentTheme.getIcon();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (this.E0) {
            t97 t97 = this.y0;
            if (t97.a()) {
                ((ImageView) t97.getValue()).setImageTintList(ColorStateList.valueOf(i));
            }
        }
        t97 t972 = this.z0;
        if (t972.a()) {
            ((ImageView) t972.getValue()).setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final void i() {
        int X = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        u1 u1Var = new u1(4, this);
        int i = 0;
        while (u1Var.hasNext()) {
            Object next = u1Var.next();
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) next;
                if (i != getChildCount() - 1) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginEnd(X);
                        view.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                i = i2;
            } else {
                p23.G();
                throw null;
            }
        }
        requestLayout();
    }

    public final void j() {
        y8a y8a;
        t97 t97 = this.x0;
        if (t97.a()) {
            a9a a9a = (a9a) t97.getValue();
            u0a mode = getMode();
            s0a appearance = getAppearance();
            int i = cu0.$EnumSwitchMapping$3[mode.ordinal()];
            t8a t8a = n8a.a;
            if (i == 1) {
                int i2 = cu0.$EnumSwitchMapping$2[appearance.ordinal()];
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        t8a = m8a.a;
                    } else if (i2 != 4) {
                        if (i2 == 5) {
                            t8a = q8a.a;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            } else if (i == 2 || i == 3 || i == 4) {
                int i3 = cu0.$EnumSwitchMapping$2[appearance.ordinal()];
                if (i3 == 1) {
                    t8a = s8a.a;
                } else if (i3 != 2) {
                    p8a p8a = p8a.a;
                    if (i3 == 3 || i3 == 4) {
                        t8a = p8a;
                    } else if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    t8a = o8a.a;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            a9a.setAppearance(t8a);
            int i4 = cu0.$EnumSwitchMapping$0[getSize().ordinal()];
            if (i4 == 1) {
                y8a = w8a.a;
            } else if (i4 == 2 || i4 == 3) {
                y8a = v8a.a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            a9a.setSize(y8a);
        }
    }

    public final void k() {
        bu0 bu0;
        nge nge;
        int i;
        y8a y8a;
        setMinimumHeight(kjd.E(getSize()));
        setOutlineProvider(new eu3(kjd.i(getSize())));
        v0a size = getSize();
        int ordinal = getInternalType().ordinal();
        if (ordinal == 0) {
            int ordinal2 = size.ordinal();
            if (ordinal2 == 0) {
                bu0 = new bu0(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), a24.X(((float) 5) * dh4.c().getDisplayMetrics().density));
            } else if (ordinal2 == 1) {
                bu0 = new bu0(a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), a24.X(((float) 10) * dh4.c().getDisplayMetrics().density));
            } else if (ordinal2 == 2) {
                bu0 = new bu0(a24.X(((float) 20) * dh4.c().getDisplayMetrics().density), a24.X(((float) 15) * dh4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 1) {
            int ordinal3 = size.ordinal();
            if (ordinal3 == 0) {
                float f = (float) 6;
                bu0 = new bu0(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
            } else if (ordinal3 == 1) {
                float f2 = (float) 8;
                bu0 = new bu0(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
            } else if (ordinal3 == 2) {
                float f3 = (float) 14;
                bu0 = new bu0(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 2) {
            int ordinal4 = size.ordinal();
            if (ordinal4 == 0) {
                bu0 = new bu0(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
            } else if (ordinal4 == 1) {
                bu0 = new bu0(a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
            } else if (ordinal4 == 2) {
                bu0 = new bu0(a24.X(((float) 20) * dh4.c().getDisplayMetrics().density), a24.X(((float) 14) * dh4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = bu0.a;
        setPadding(i2, 0, i2, 0);
        int ordinal5 = getSize().ordinal();
        if (ordinal5 == 0) {
            nge = nte.C;
        } else if (ordinal5 == 1) {
            nge = nte.B;
        } else if (ordinal5 == 2) {
            nge = nte.A;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        t97 t97 = this.A0;
        if (t97.a()) {
            nge.b((TextView) t97.getValue(), yq4.b);
        }
        int ordinal6 = getSize().ordinal();
        if (ordinal6 == 0) {
            i = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        } else if (ordinal6 == 1) {
            i = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        } else if (ordinal6 == 2) {
            i = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        t97 t972 = this.y0;
        if (t972.a()) {
            ImageView imageView = (ImageView) t972.getValue();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = i;
                imageView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        t97 t973 = this.z0;
        if (t973.a()) {
            ImageView imageView2 = (ImageView) t973.getValue();
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = i;
                layoutParams2.height = i;
                imageView2.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        t97 t974 = this.x0;
        if (t974.a()) {
            a9a a9a = (a9a) t974.getValue();
            int i3 = cu0.$EnumSwitchMapping$0[getSize().ordinal()];
            if (i3 == 1) {
                y8a = w8a.a;
            } else if (i3 == 2 || i3 == 3) {
                y8a = v8a.a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            a9a.setSize(y8a);
        }
        requestLayout();
        requestLayout();
        invalidate();
    }

    public final void l() {
        t97 t97 = this.A0;
        if (t97.a()) {
            TextView textView = (TextView) t97.getValue();
            textView.setTextColor(kjd.L(getCurrentTheme(), getMode(), getAppearance(), textView.isEnabled()));
        }
    }

    public final void onThemeChanged(pda pda) {
        e();
    }

    public final void setAppearance(s0a s0a) {
        this.c.o1(this, F0[2], s0a);
    }

    public final void setCustomTheme(pda pda) {
        this.o.o1(this, F0[3], pda);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        f();
        l();
        invalidate();
    }

    public final void setEndIcon(Drawable drawable) {
        ImageView imageView = (ImageView) this.z0.getValue();
        imageView.setId(qhc.g);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        imageView.setVisibility(drawable == null ? 8 : 0);
        ek8.d(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        k();
        i();
    }

    public final void setMode(u0a u0a) {
        this.b.o1(this, F0[1], u0a);
    }

    public final void setProgressEnabled(boolean z) {
        this.w0.o1(this, F0[4], Boolean.valueOf(z));
    }

    public final void setSize(v0a v0a) {
        this.a.o1(this, F0[0], v0a);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.A0.getValue();
        textView.setId(qhc.j);
        textView.setText(charSequence);
        setupTextViewParams(textView);
        ek8.d(this, textView, Integer.valueOf(b(textView.getId())));
        l();
        k();
        i();
    }

    public final void setEndIcon(Integer num) {
        ImageView imageView = (ImageView) this.z0.getValue();
        imageView.setId(qhc.g);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setVisibility(num == null ? 8 : 0);
        ek8.d(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        k();
        i();
    }

    public final void setText(int i) {
        TextView textView = (TextView) this.A0.getValue();
        textView.setId(qhc.j);
        textView.setText(i);
        setupTextViewParams(textView);
        ek8.d(this, textView, Integer.valueOf(b(textView.getId())));
        l();
        k();
        i();
    }
}
