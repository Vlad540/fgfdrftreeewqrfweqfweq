package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: qs7  reason: default package */
public final /* synthetic */ class qs7 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String o;

    public /* synthetic */ qs7(vs7 vs7, long j, String str, int i) {
        this.a = i;
        this.b = vs7;
        this.c = j;
        this.o = str;
    }

    public final void accept(Object obj) {
        int size;
        boolean z;
        switch (this.a) {
            case 0:
                vs7 vs7 = this.b;
                long j = this.c;
                String str = this.o;
                ss7 ss7 = (ss7) obj;
                vs7.getClass();
                synchronized (ss7) {
                    size = ss7.b.size();
                }
                udd.I("vs7", "searchChatsAndMessages %d, finish %d ms", new Object[]{Integer.valueOf(size), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j))});
                ArrayList arrayList = new ArrayList(ss7.b);
                vs7.m = arrayList;
                if (!arrayList.isEmpty()) {
                    try {
                        vs7.e.d(vs7);
                    } catch (Exception unused) {
                    }
                }
                if (arrayList.isEmpty()) {
                    synchronized (ss7) {
                        z = ss7.a.contains(ts7.a) && ss7.a.contains(ts7.c) && ss7.a.contains(ts7.b);
                    }
                    if (!z) {
                        return;
                    }
                }
                if (vs7.h != null) {
                    udd.I("vs7", "searchChatsAndMessages, notify listener", new Object[0]);
                    vs7.h.g(str, arrayList);
                    return;
                }
                return;
            default:
                vs7 vs72 = this.b;
                long j2 = this.c;
                String str2 = this.o;
                List list = (List) obj;
                vs72.getClass();
                udd.I("vs7", "searchChats %d, finish %dms", new Object[]{Integer.valueOf(list.size()), Long.valueOf(System.currentTimeMillis() - j2)});
                vs72.n = list;
                if (!list.isEmpty()) {
                    try {
                        vs72.e.d(vs72);
                    } catch (Exception unused2) {
                    }
                }
                ms7 ms7 = vs72.h;
                if (ms7 != null) {
                    ms7.b(str2, list);
                    return;
                }
                return;
        }
    }
}
