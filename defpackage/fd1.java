package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

/* renamed from: fd1  reason: default package */
public final class fd1 extends chd {
    public final nfc J0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fd1(android.content.Context r3, defpackage.nfc r4) {
        /*
            r2 = this;
            kh3 r0 = new kh3
            r1 = 0
            r0.<init>(r3, r1)
            r2.<init>(r0)
            r2.J0 = r4
            qda r2 = qda.a
            r0.setCustomTheme(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd1.<init>(android.content.Context, nfc):void");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [fd1, b7c] */
    public final void A(pg7 pg7) {
        String str;
        ad1 ad1 = (ad1) pg7;
        View view = this.a;
        kh3 kh3 = (kh3) view;
        kh3.setId(Long.hashCode(ad1.x0));
        String str2 = ad1.b;
        kh3.setName((CharSequence) str2);
        le1 le1 = ad1.a;
        kh3.O(le1.a, str2, ad1.c);
        Integer num = null;
        Integer num2 = ad1.w0;
        if (num2 != null) {
            str = kh3.getContext().getString(num2.intValue());
        } else {
            str = null;
        }
        kh3.setMessage(str);
        qda qda = qda.a;
        int i = qda.f.a.b;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(-15263716);
        kh3.setBackground(new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, (Drawable) null));
        F(le1, ad1.o);
        if (ad1.Y) {
            num = Integer.valueOf(n1a.I);
        }
        ((kh3) view).setIconInfo(num);
        kh3.setCustomTheme(qda);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [fd1, java.lang.Object, b7c] */
    public final void F(le1 le1, boolean z) {
        View view = this.a;
        ((kh3) view).R(Integer.valueOf(n1a.w0), u0a.o, s0a.X, new x2((Object) this, 13, (Object) le1));
        if (z) {
            view.setOnClickListener((View.OnClickListener) null);
        } else {
            a24.Z(view, 300, new ub(this, 4, le1));
        }
    }
}
