package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: kk6  reason: default package */
public final class kk6 extends taf {
    public final t97 X;
    public final SharedPreferences Y;
    public final ArrayList Z;
    public final ez2 b;
    public final t97 c;
    public final t97 o;
    public final grd w0 = hrd.a(r());
    public final l05 x0 = new l05(0);

    public kk6() {
        ff4 ff4 = ff4.a;
        Class<Context> cls = Context.class;
        Class<zy9> cls2 = zy9.class;
        r7e d = ff4.getAccessor().d(cls2);
        r7e d2 = ff4.getAccessor().d(g2b.class);
        r7e d3 = ff4.getAccessor().d(pae.class);
        this.b = new ez2((t97) ff4.getAccessor().d(tt0.class), (t97) ff4.getAccessor().d(cls2), (t97) ff4.getAccessor().d(b9e.class), (Context) ff4.getAccessor().c(cls));
        this.c = d2;
        this.o = d3;
        this.X = d;
        this.Y = ((Context) ff4.getAccessor().c(cls)).getSharedPreferences("dev_tools", 0);
        List B = p23.B("api.oneme.ru", "api-test.oneme.ru", "api-tg.oneme.ru", "api-test2.oneme.ru");
        ArrayList arrayList = new ArrayList(B.size());
        arrayList.addAll(B);
        u23.M(arrayList, new String[0]);
        this.Z = arrayList;
    }

    public final g2b q() {
        return (g2b) this.c.getValue();
    }

    public final lg7 r() {
        lg7 c2 = hwf.c();
        ArrayList arrayList = this.Z;
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList2.add(new ck6(str, Boolean.valueOf(hhd.f(str, q().a.B()))));
        }
        c2.addAll(arrayList2);
        SharedPreferences sharedPreferences = this.Y;
        String str2 = BuildConfig.FLAVOR;
        String string = sharedPreferences.getString("Custom", str2);
        if (!(string == null || string.length() == 0)) {
            str2 = wn6.i(" (", string, ")");
        }
        c2.add(new ck6(rf0.h("Custom", str2), Boolean.valueOf(hhd.f(string, q().a.B()))));
        return hwf.a(c2);
    }

    public final void s(String str) {
        xs7.E(this.a, ((pae) this.o.getValue()).a().plus(sk9.a), (ru3) null, new jk6(str, this, (Continuation) null), 2);
    }
}
