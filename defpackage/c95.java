package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: c95  reason: default package */
public final /* synthetic */ class c95 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l95 b;
    public final /* synthetic */ List c;

    public /* synthetic */ c95(l95 l95, List list, int i) {
        this.a = i;
        this.b = l95;
        this.c = list;
    }

    public final void accept(Object obj) {
        List list = this.c;
        l95 l95 = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        l95.getClass();
        switch (i) {
            case 0:
                udd.s("l95", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove sticker sets %s from cache", new Object[]{list}), th);
                l95.f();
                return;
            default:
                udd.s("l95", String.format(Locale.ENGLISH, "onListUpdated: failed to store sticker sets=%s", new Object[]{list}), th);
                l95.f();
                return;
        }
    }
}
