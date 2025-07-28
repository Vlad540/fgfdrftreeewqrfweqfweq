package defpackage;

import android.graphics.Bitmap;

/* renamed from: xm0  reason: default package */
public final class xm0 extends kr7 {
    public final /* synthetic */ int g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xm0(int i, int i2) {
        super(i);
        this.g = i2;
    }

    public Object a(Object obj) {
        switch (this.g) {
            case 3:
                lnd lnd = (lnd) obj;
                return oad.b(lnd.a, lnd.b);
            default:
                return xm0.super.a(obj);
        }
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 1:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj3;
                ((Bitmap) obj2).recycle();
                return;
            default:
                return;
        }
    }

    public int h(Object obj) {
        switch (this.g) {
            case 0:
                int d = mn0.d((Bitmap) obj);
                if (d < 1) {
                    return 1;
                }
                return d;
            default:
                return xm0.super.h(obj);
        }
    }
}
