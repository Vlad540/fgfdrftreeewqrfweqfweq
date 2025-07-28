package defpackage;

import java.util.Locale;

/* renamed from: e95  reason: default package */
public final /* synthetic */ class e95 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l95 b;
    public final /* synthetic */ long c;

    public /* synthetic */ e95(l95 l95, long j, int i) {
        this.a = i;
        this.b = l95;
        this.c = j;
    }

    public final void accept(Object obj) {
        long j = this.c;
        l95 l95 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        l95.getClass();
        switch (i) {
            case 0:
                Locale locale = Locale.ENGLISH;
                udd.s("l95", "onNotifUpdated: failed for id: " + j, th);
                l95.f();
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                udd.s("l95", wn6.k(new StringBuilder("onNotifAdded: failed to add sticker set "), j, " to cache"), th);
                l95.f();
                return;
        }
    }
}
