package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: cr1  reason: default package */
public final /* synthetic */ class cr1 implements Runnable {
    public final /* synthetic */ pye X;
    public final /* synthetic */ va0 Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ lr1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c2d o;

    public /* synthetic */ cr1(lr1 lr1, String str, c2d c2d, pye pye, va0 va0, List list, int i) {
        this.a = i;
        this.b = lr1;
        this.c = str;
        this.o = c2d;
        this.X = pye;
        this.Y = va0;
        this.Z = list;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                lr1 lr1 = this.b;
                String str = this.c;
                c2d c2d = this.o;
                pye pye = this.X;
                va0 va0 = this.Y;
                List list = this.Z;
                lr1.getClass();
                lr1.toString();
                lr1.a.N(str, c2d, pye, va0, list);
                lr1.q();
                lr1.D();
                lr1.K();
                if (lr1.W0 == 9) {
                    lr1.B();
                    return;
                }
                return;
            case 1:
                lr1 lr12 = this.b;
                lr12.getClass();
                lr12.toString();
                lr12.a.N(this.c, this.o, this.X, this.Y, this.Z);
                lr12.K();
                return;
            default:
                lr1 lr13 = this.b;
                lr13.getClass();
                lr13.toString();
                LinkedHashMap linkedHashMap = (LinkedHashMap) lr13.a.b;
                String str2 = this.c;
                nye nye = (nye) linkedHashMap.get(str2);
                c2d c2d2 = this.o;
                pye pye2 = this.X;
                va0 va02 = this.Y;
                List list2 = this.Z;
                if (nye == null) {
                    nye = new nye(c2d2, pye2, va02, list2);
                    linkedHashMap.put(str2, nye);
                }
                nye.f = true;
                lr13.a.N(str2, c2d2, pye2, va02, list2);
                lr13.K();
                return;
        }
    }
}
