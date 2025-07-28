package defpackage;

import android.opengl.EGLSurface;
import java.util.ArrayList;

/* renamed from: zxf  reason: default package */
public final class zxf extends b97 implements u16 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ sc1 b;
    public final /* synthetic */ tc1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zxf(sc1 sc1, tc1 tc1) {
        super(1);
        this.b = sc1;
        this.c = tc1;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                rc1 rc1 = (rc1) obj;
                ArrayList arrayList = this.c.i;
                sc1 sc1 = this.b;
                if (arrayList.remove(sc1)) {
                    EGLSurface eGLSurface = sc1.a;
                    sc1.a = null;
                    rc1.e(eGLSurface);
                    sc1.a();
                }
                return jue.a;
            default:
                this.b.b(this.c, (rc1) obj);
                return jue.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zxf(tc1 tc1, sc1 sc1) {
        super(1);
        this.c = tc1;
        this.b = sc1;
    }
}
