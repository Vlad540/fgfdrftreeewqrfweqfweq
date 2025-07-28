package defpackage;

import java.util.ArrayList;

/* renamed from: v85  reason: default package */
public final /* synthetic */ class v85 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v85(Object obj, long j, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = z;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ha5 ha5 = (ha5) this.d;
                aec aec = ha5.a;
                aec.c();
                try {
                    ArrayList c2 = ha5.c();
                    boolean z = this.c;
                    long j = this.b;
                    if (!z) {
                        if (c2.remove(Long.valueOf(j))) {
                            ha5.a(c2);
                        }
                    } else if (c2.indexOf(Long.valueOf(j)) == -1) {
                        c2.add(0, Long.valueOf(j));
                        ha5.a(c2);
                    }
                    aec.r();
                    return;
                } finally {
                    aec.l();
                }
            default:
                y95 y95 = (y95) this.d;
                aec aec2 = y95.a;
                aec2.c();
                try {
                    ArrayList c3 = y95.c();
                    boolean z2 = this.c;
                    long j2 = this.b;
                    if (!z2) {
                        if (c3.remove(Long.valueOf(j2))) {
                            y95.a(c3);
                        }
                    } else if (c3.indexOf(Long.valueOf(j2)) == -1) {
                        c3.add(0, Long.valueOf(j2));
                        y95.a(c3);
                    }
                    aec2.r();
                    return;
                } finally {
                    aec2.l();
                }
        }
    }
}
