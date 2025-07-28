package defpackage;

import java.util.ArrayList;

/* renamed from: ci3  reason: default package */
public final /* synthetic */ class ci3 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ci3(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                di3 di3 = (di3) this.d;
                di3.getClass();
                di3.c(this.b, new f00(this.c, 11));
                return;
            default:
                long j = this.b;
                long j2 = this.c;
                y95 y95 = (y95) this.d;
                aec aec = y95.a;
                aec.c();
                try {
                    ArrayList c2 = y95.c();
                    int indexOf = c2.indexOf(Long.valueOf(j));
                    int indexOf2 = c2.indexOf(Long.valueOf(j2));
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        Object obj = c2.get(indexOf);
                        c2.remove(indexOf);
                        c2.add(indexOf2, obj);
                        y95.a(c2);
                    }
                    aec.r();
                    return;
                } finally {
                    aec.l();
                }
        }
    }
}
