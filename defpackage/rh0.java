package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: rh0  reason: default package */
public final /* synthetic */ class rh0 implements of3 {
    public final /* synthetic */ nt7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long o;

    public /* synthetic */ rh0(nt7 nt7, long j, boolean z, long j2) {
        this.a = nt7;
        this.b = j;
        this.c = z;
        this.o = j2;
    }

    public final void accept(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = this.a.b;
        sh0 sh0 = (sh0) linkedHashMap.get(Long.valueOf(this.b));
        boolean z = this.c;
        if (sh0 != null) {
            c9 c9Var = sh0.a;
            if (z) {
                c9Var.w((om0) map.get(rt7.a));
            } else {
                c9Var.w((om0) map.get(rt7.c));
            }
            c9Var.y();
        }
        sh0 sh02 = (sh0) linkedHashMap.get(Long.valueOf(this.o));
        if (sh02 != null) {
            c9 c9Var2 = sh02.a;
            if (z) {
                c9Var2.w((om0) map.get(rt7.b));
            } else {
                c9Var2.w((om0) map.get(rt7.o));
            }
            c9Var2.y();
        }
    }
}
