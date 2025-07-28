package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: gda  reason: default package */
public final class gda extends LinearLayout implements mhe {
    public static final /* synthetic */ k77[] z0;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final fda w0 = new fda(this);
    public final fda x0 = new fda((sz9) sz9.g.getValue(), this);
    public e9e y0 = iu7.Z(getTabItem().c, km4.y0.r(this));

    static {
        Class<gda> cls = gda.class;
        z0 = new k77[]{new hc9(cls, "isIndicatorVisible", "isIndicatorVisible()Z"), c3d.g(m7c.a, cls, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;")};
    }

    public gda(Context context) {
        super(context, (AttributeSet) null);
        this.a = ez3.O(3, new t2a(context, 8));
        this.b = ez3.O(3, new t2a(context, 9));
        this.c = ez3.O(3, new t2a(context, 10));
        this.o = ez3.O(3, new zu4(context, 26, this));
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setClipToPadding(false);
    }

    public static final void a(gda gda) {
        gda.setText(gda.getTabItem().b);
        gda.y0 = iu7.Z(gda.getTabItem().c, km4.y0.r(gda));
        Drawable drawable = gda.getTabItem().e;
        t97 t97 = gda.b;
        if (drawable != null) {
            ImageView imageView = (ImageView) t97.getValue();
            imageView.setImageDrawable(drawable);
            ek8.d(gda, imageView, Integer.valueOf(gda.b(imageView.getId())));
        }
        k77 k77 = z0[0];
        boolean booleanValue = ((Boolean) gda.w0.b).booleanValue();
        t97 t972 = gda.o;
        t97 t973 = gda.c;
        if (booleanValue) {
            fja fja = gda.getTabItem().d;
            if (fja instanceof pz9) {
                t3a t3a = (t3a) t973.getValue();
                ek8.d(gda, t3a, Integer.valueOf(gda.b(t3a.getId())));
            } else {
                int i = 8;
                if (hhd.f(fja, qz9.e)) {
                    f4a f4a = (f4a) t972.getValue();
                    if (gda.y0.d) {
                        i = 0;
                    }
                    f4a.setVisibility(i);
                    ek8.d(gda, f4a, Integer.valueOf(gda.b(f4a.getId())));
                } else if (hhd.f(fja, rz9.e)) {
                    if (t972.a()) {
                        ((f4a) t972.getValue()).setVisibility(8);
                    }
                    if (t973.a()) {
                        ((t3a) t973.getValue()).setVisibility(8);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        gda.c();
        boolean a2 = t97.a();
        t97 t974 = gda.a;
        if (a2) {
            ImageView imageView2 = (ImageView) t97.getValue();
            if (imageView2.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(a24.X(((ek8.L(t974) || ek8.L(t972) || ek8.L(t973)) ? (float) 4 : (float) 0) * dh4.c().getDisplayMetrics().density));
                    imageView2.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        if (t974.a()) {
            TextView textView = (TextView) t974.getValue();
            if (textView.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginEnd(a24.X(((ek8.L(t972) || ek8.L(t973)) ? (float) 4 : (float) 0) * dh4.c().getDisplayMetrics().density));
                    textView.setLayoutParams(marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        gda.requestLayout();
        gda.invalidate();
    }

    public static /* synthetic */ void getTabItem$annotations() {
    }

    private final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.a.getValue();
        textView.setText(charSequence);
        ek8.d(this, textView, Integer.valueOf(b(textView.getId())));
    }

    public final int b(int i) {
        if (i == qhc.y0) {
            return 0;
        }
        if (i == qhc.A0) {
            return myc.J(pfa.o(this)) / 2;
        }
        if (i == qhc.z0) {
            return myc.J(pfa.o(this)) - 1;
        }
        return -1;
    }

    public final void c() {
        t97 t97 = this.a;
        if (t97.a()) {
            ((TextView) t97.getValue()).setTextColor(this.y0.b);
        }
        t97 t972 = this.b;
        if (t972.a()) {
            ((ImageView) t972.getValue()).setImageTintList(ColorStateList.valueOf(this.y0.a));
        }
        int i = 0;
        k77 k77 = z0[0];
        if (((Boolean) this.w0.b).booleanValue()) {
            fja fja = getTabItem().d;
            boolean f = hhd.f(fja, qz9.e);
            t97 t973 = this.o;
            if (!f) {
                boolean z = fja instanceof pz9;
                t97 t974 = this.c;
                if (z) {
                    boolean z2 = this.y0.d && ((pz9) fja).e != 0;
                    if (t974.a()) {
                        t3a t3a = (t3a) t974.getValue();
                        if (!z2) {
                            i = 8;
                        }
                        t3a.setVisibility(i);
                        int t = hr1.t(getTabItem().c);
                        o3a o3a = o3a.a;
                        if (t != 0) {
                            if (t == 1) {
                                o3a = o3a.c;
                            } else if (t != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        t3a.setAppearance(o3a);
                        t3a.g(((pz9) fja).e, true);
                    }
                } else if (hhd.f(fja, rz9.e)) {
                    if (t974.a()) {
                        ((t3a) t974.getValue()).setVisibility(8);
                    }
                    if (t973.a()) {
                        ((f4a) t973.getValue()).setVisibility(8);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (t973.a()) {
                f4a f4a = (f4a) t973.getValue();
                if (!this.y0.d) {
                    i = 8;
                }
                f4a.setVisibility(i);
            }
        }
    }

    public final sz9 getTabItem() {
        k77 k77 = z0[1];
        return (sz9) this.x0.b;
    }

    public final void onThemeChanged(pda pda) {
        this.y0 = iu7.Z(getTabItem().c, pda);
        c();
        km4.d(km4.y0.n(getContext()), this);
    }

    public final void setIndicatorVisible(boolean z) {
        this.w0.o1(this, z0[0], Boolean.valueOf(z));
    }

    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(sz9.a(getTabItem(), (CharSequence) null, z ? 1 : 2, (pz9) null, 59));
        }
        super.setSelected(z);
    }

    public final void setTabItem(sz9 sz9) {
        this.x0.o1(this, z0[1], sz9);
    }
}
