package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: ba5  reason: default package */
public final /* synthetic */ class ba5 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa5 b;
    public final /* synthetic */ List c;

    public /* synthetic */ ba5(fa5 fa5, List list, int i) {
        this.a = i;
        this.b = fa5;
        this.c = list;
    }

    public final void accept(Object obj) {
        List list = this.c;
        fa5 fa5 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        fa5.getClass();
        switch (i) {
            case 0:
                udd.s("fa5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove stickers %s from cache", new Object[]{list}), th);
                fa5.c();
                return;
            default:
                udd.s("fa5", String.format(Locale.ENGLISH, "onListUpdated: failed to store stickers %s", new Object[]{list}), th);
                fa5.c();
                return;
        }
    }
}
