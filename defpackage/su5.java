package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ForkJoinPool;

/* renamed from: su5  reason: default package */
public final class su5 {
    public final ConcurrentSkipListSet a = new ConcurrentSkipListSet();
    public final ru5 b = new ru5(this);
    public final ArrayList c = new ArrayList();

    public final pu5 a(String str, Iterable iterable, s16 s16) {
        pu5 pu5 = new pu5(str, new wc3(iterable, s16, this, str, 5));
        ArrayList arrayList = this.c;
        qu5 qu5 = pu5.b;
        arrayList.add(0, qu5);
        ForkJoinPool.commonPool().execute(qu5);
        return pu5;
    }
}
