package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: ea4  reason: default package */
public final class ea4 implements k9c {
    public final Context a;
    public final f94 b;

    public ea4(Context context) {
        this.a = context;
        this.b = new f94(context);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [q44, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v9, types: [it4, java.lang.Object] */
    public final qi0[] a(Handler handler, h45 h45, h45 h452, h45 h453, h45 h454) {
        ArrayList arrayList = new ArrayList();
        f94 f94 = this.b;
        Context context = this.a;
        Handler handler2 = handler;
        h45 h455 = h45;
        arrayList.add(new k38(context, f94, handler, h45));
        ? obj = new Object();
        obj.d = context;
        obj.e = w20.c;
        obj.g = m54.c;
        obj.a = false;
        obj.b = false;
        oyb.k(!obj.c);
        obj.c = true;
        if (((it4) obj.f) == null) {
            k50[] k50Arr = new k50[0];
            k50 ggd = new ggd();
            k50 qld = new qld();
            ? obj2 = new Object();
            k50[] k50Arr2 = new k50[(k50Arr.length + 2)];
            obj2.a = k50Arr2;
            System.arraycopy(k50Arr, 0, k50Arr2, 0, k50Arr.length);
            obj2.b = ggd;
            obj2.c = qld;
            k50Arr2[k50Arr.length] = ggd;
            k50Arr2[k50Arr.length + 1] = qld;
            obj.f = obj2;
        }
        if (((b2b) obj.h) == null) {
            obj.h = new b2b(14, (Object) context);
        }
        c54 c54 = new c54(obj);
        arrayList.add(new m28(this.a, this.b, handler, h452, c54));
        arrayList.add(new age(h453, handler.getLooper()));
        arrayList.add(new m39(h454, handler.getLooper()));
        arrayList.add(new pu1());
        arrayList.add(new qr6(hq6.y));
        return (qi0[]) arrayList.toArray(new qi0[0]);
    }
}
