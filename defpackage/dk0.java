package defpackage;

import android.os.Build;

/* renamed from: dk0  reason: default package */
public final class dk0 extends oe3 {
    public final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk0(cf3 cf3, int i) {
        super(cf3);
        this.f = i;
    }

    public final boolean a(ztf ztf) {
        switch (this.f) {
            case 0:
                return ztf.j.b;
            case 1:
                return ztf.j.d;
            case 2:
                return ztf.j.a == 2;
            case 3:
                int i = ztf.j.a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return ztf.j.e;
        }
    }

    public final boolean b(Object obj) {
        switch (this.f) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                uh9 uh9 = (uh9) obj;
                return !uh9.a || !uh9.b;
            case 3:
                uh9 uh92 = (uh9) obj;
                return !uh92.a || uh92.c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
