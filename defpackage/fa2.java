package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: fa2  reason: default package */
public final /* synthetic */ class fa2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma2 b;

    public /* synthetic */ fa2(ma2 ma2, int i) {
        this.a = i;
        this.b = ma2;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = phc.x1;
                Context context = this.b.a;
                Drawable n = am7.n(context, i);
                if (n != null) {
                    js.D(n, rf0.d(km4.y0, context).c);
                    return n;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 1:
                int i2 = phc.j2;
                Context context2 = this.b.a;
                Drawable n2 = am7.n(context2, i2);
                if (n2 != null) {
                    js.D(n2, rf0.d(km4.y0, context2).c);
                    return n2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 2:
                int i3 = phc.H1;
                Context context3 = this.b.a;
                Drawable n3 = am7.n(context3, i3);
                if (n3 != null) {
                    js.D(n3, rf0.d(km4.y0, context3).b);
                    return n3;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 3:
                int i4 = phc.Y1;
                Context context4 = this.b.a;
                Drawable n4 = am7.n(context4, i4);
                if (n4 != null) {
                    js.D(n4, rf0.d(km4.y0, context4).i);
                    return n4;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 4:
                return new bi5(new kte(km4.y0.n(this.b.a).g(), new hd1(12)), vh5.a, 4);
            case 5:
                int i5 = phc.q;
                Context context5 = this.b.a;
                Drawable n5 = am7.n(context5, i5);
                if (n5 != null) {
                    js.D(n5, rf0.d(km4.y0, context5).i);
                    return n5;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 6:
                int i6 = phc.z;
                Context context6 = this.b.a;
                Drawable n6 = am7.n(context6, i6);
                if (n6 != null) {
                    js.D(n6, rf0.d(km4.y0, context6).i);
                    return n6;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 7:
                int i7 = phc.n1;
                Context context7 = this.b.a;
                Drawable n7 = am7.n(context7, i7);
                if (n7 != null) {
                    js.D(n7, rf0.d(km4.y0, context7).i);
                    return n7;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 8:
                int i8 = phc.Q;
                Context context8 = this.b.a;
                Drawable n8 = am7.n(context8, i8);
                if (n8 != null) {
                    js.D(n8, rf0.d(km4.y0, context8).i);
                    return n8;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 9:
                int i9 = phc.y1;
                Context context9 = this.b.a;
                Drawable n9 = am7.n(context9, i9);
                if (n9 != null) {
                    js.D(n9, rf0.d(km4.y0, context9).i);
                    return n9;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                int i10 = phc.l2;
                Context context10 = this.b.a;
                Drawable n10 = am7.n(context10, i10);
                if (n10 != null) {
                    js.D(n10, rf0.d(km4.y0, context10).i);
                    return n10;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
