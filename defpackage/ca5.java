package defpackage;

import java.util.Locale;

/* renamed from: ca5  reason: default package */
public final /* synthetic */ class ca5 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ca5(fa5 fa5, long j, int i) {
        this.a = i;
        this.b = fa5;
        this.c = j;
    }

    public final void accept(Object obj) {
        long j = this.c;
        fa5 fa5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        fa5.getClass();
        switch (i) {
            case 0:
                Locale locale = Locale.ENGLISH;
                udd.s("fa5", wn6.k(new StringBuilder("onNotifAdded: failed to add sticker "), j, " to cache"), th);
                fa5.c();
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                udd.s("fa5", "onNotifUpdated: failed for id: " + j, th);
                fa5.c();
                return;
        }
    }
}
