package defpackage;

import android.content.Context;

/* renamed from: k83  reason: default package */
public final /* synthetic */ class k83 implements jib {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k83(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                l83 l83 = (l83) this.b;
                l83.getClass();
                t73 t73 = (t73) this.c;
                return t73.f.h(new uwb(t73, l83));
            case 1:
                return new jf6((Context) this.b, (String) this.c);
            default:
                ih5 ih5 = (ih5) this.b;
                String c2 = ih5.c();
                cjb cjb = (cjb) ih5.d.a(cjb.class);
                return new dz3((Context) this.c, c2);
        }
    }
}
