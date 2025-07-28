package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: r52  reason: default package */
public final /* synthetic */ class r52 implements Callable {
    public final /* synthetic */ t52 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;

    public /* synthetic */ r52(t52 t52, List list, String str, String str2) {
        this.a = t52;
        this.b = list;
        this.c = str;
        this.o = str2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [r00, java.lang.Object] */
    public final Object call() {
        t52 t52 = this.a;
        t52.getClass();
        StringBuilder sb = new StringBuilder("createMultiChat, contacts.size() = ");
        List list = this.b;
        sb.append(list.size());
        udd.q("t52", sb.toString());
        n62 n62 = n62.b;
        String str = this.o;
        String str2 = this.c;
        i22 b2 = t52.b(n62, list, str2, str);
        ? obj = new Object();
        obj.a = s00.b;
        obj.l = 3;
        obj.c = list;
        obj.d = str2;
        ((luf) t52.w.get()).a(new h0d(new g0d(b2.a, obj.a(), 1), (byte) 0));
        return b2;
    }
}
