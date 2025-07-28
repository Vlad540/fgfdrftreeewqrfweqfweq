package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zne  reason: default package */
public final class zne {
    public final String a;
    public final f2b b;
    public volatile boolean c;
    public final Context d;
    public final t97 e = ez3.O(2, new yne(this, 1));
    public final t97 f = ez3.O(2, new yne(this, 0));
    public final mv4 g = new mv4(25);
    public final fzd h;
    public final w4g i;
    public final vbe j;
    public final v2b k;

    /* JADX WARNING: type inference failed for: r5v9, types: [vbe, java.lang.Object] */
    public zne(Context context, String str, f2b f2b) {
        this.a = str;
        this.b = f2b;
        this.d = context.getApplicationContext();
        this.h = new fzd(context, str);
        this.i = new w4g(context, str);
        ? obj = new Object();
        obj.a = Executors.newCachedThreadPool(new une(new AtomicInteger(0), str));
        this.j = obj;
        this.k = new v2b(context, str, false, 11);
    }

    public final boe a() {
        return (boe) this.e.getValue();
    }

    public final void b(String str, String str2) {
        if (!this.c) {
            mv4 mv4 = this.g;
            mv4.getClass();
            String y0 = h0e.y0(31, str);
            String y02 = h0e.y0(31, str2);
            synchronized (((ConcurrentHashMap) mv4.b)) {
                String str3 = (String) ((ConcurrentHashMap) mv4.b).remove(y0);
                ((ConcurrentHashMap) mv4.b).put(y0, y02);
                if (str3 == null && ((ConcurrentHashMap) mv4.b).size() > 30) {
                    ((ConcurrentHashMap) mv4.b).entrySet().iterator().remove();
                }
            }
        }
    }
}
