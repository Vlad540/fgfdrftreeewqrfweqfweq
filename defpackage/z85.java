package defpackage;

import java.util.ArrayList;

/* renamed from: z85  reason: default package */
public final /* synthetic */ class z85 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z85(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = j;
        this.c = i;
    }

    public final void run() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                long j = this.b;
                ha5 ha5 = (ha5) this.d;
                aec aec = ha5.a;
                aec.c();
                try {
                    ArrayList c2 = ha5.c();
                    int indexOf = c2.indexOf(Long.valueOf(j));
                    if (indexOf >= 0 && (i = this.c) >= 0) {
                        if (i < c2.size()) {
                            Object obj = c2.get(indexOf);
                            c2.remove(indexOf);
                            c2.add(i, obj);
                            ha5.a(c2);
                        }
                    }
                    aec.r();
                    return;
                } finally {
                    aec.l();
                }
            default:
                long j2 = this.b;
                y95 y95 = (y95) this.d;
                aec aec2 = y95.a;
                aec2.c();
                try {
                    ArrayList c3 = y95.c();
                    int indexOf2 = c3.indexOf(Long.valueOf(j2));
                    if (indexOf2 >= 0 && (i2 = this.c) >= 0) {
                        if (i2 < c3.size()) {
                            Object obj2 = c3.get(indexOf2);
                            c3.remove(indexOf2);
                            c3.add(i2, obj2);
                            y95.a(c3);
                        }
                    }
                    aec2.r();
                    return;
                } finally {
                    aec2.l();
                }
        }
    }
}
