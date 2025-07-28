package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: xdc  reason: default package */
public final class xdc {
    public static final xb4 g = new xb4(17);
    public final bec a;
    public final r7e b = new r7e(new vdc(this, 0));
    public final r7e c = new r7e(new vdc(this, 1));
    public final r7e d = new r7e(new vdc(this, 2));
    public final t97 e;
    public final r7e f;

    public xdc(bec bec, t97 t97) {
        this.a = bec;
        this.e = t97;
        this.f = new r7e(yr3.A0);
    }

    public final p62 a(o72 o72) {
        ConcurrentHashMap concurrentHashMap = ((l16) this.f.getValue()).a;
        long j = o72.a;
        o62 o62 = o72.c;
        String str = o62.g;
        if (str != null) {
            concurrentHashMap.put(Long.valueOf(j), str);
        }
        return new p62(o72.a, o62);
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        yp2 c2 = c();
        aec aec = c2.a;
        aec.c();
        try {
            yp2.b(c2);
            aec.r();
            aec.l();
            ((l16) this.f.getValue()).a.clear();
            pkc pkc = (pkc) this.c.getValue();
            aec aec2 = pkc.a;
            aec2.b();
            tdc tdc = pkc.d;
            yz5 f2 = tdc.f();
            try {
                aec2.c();
                f2.n();
                aec2.r();
                aec2.l();
                tdc.u(f2);
            } catch (Throwable th) {
                tdc.u(f2);
                throw th;
            }
        } catch (Throwable th2) {
            aec.l();
            throw th2;
        }
    }

    public final yp2 c() {
        return (yp2) this.b.getValue();
    }

    public final long d(o62 o62) {
        return ((Number) this.a.m().p(new wdc(0, new nya(this, 9, o62)))).longValue();
    }

    public final p62 e(long j) {
        o72 o72;
        yp2 c2 = c();
        c2.getClass();
        pec a2 = pec.a(1, "SELECT * FROM chats WHERE server_id = ?");
        a2.j(1, j);
        aec aec = c2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "server_id");
            int o4 = gp0.o(o, "data");
            int o5 = gp0.o(o, "favourite_index");
            int o6 = gp0.o(o, "sort_time");
            int o7 = gp0.o(o, "cid");
            if (o.moveToFirst()) {
                o72 = new o72(o.getLong(o2), o.getLong(o3), c2.a().a(o.isNull(o4) ? null : o.getBlob(o4)), o.getLong(o5), o.getLong(o6), o.getLong(o7));
            } else {
                o72 = null;
            }
            if (o72 != null) {
                return a(o72);
            }
            return null;
        } finally {
            o.close();
            a2.m();
        }
    }

    /* JADX INFO: finally extract failed */
    public final p62 f(long j) {
        Object obj;
        yp2 c2 = c();
        c2.getClass();
        pec a2 = pec.a(1, "SELECT * FROM chats WHERE cid = ?");
        a2.j(1, j);
        aec aec = c2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "server_id");
            int o4 = gp0.o(o, "data");
            int o5 = gp0.o(o, "favourite_index");
            int o6 = gp0.o(o, "sort_time");
            int o7 = gp0.o(o, "cid");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new o72(o.getLong(o2), o.getLong(o3), c2.a().a(o.isNull(o4) ? null : o.getBlob(o4)), o.getLong(o5), o.getLong(o6), o.getLong(o7)));
            }
            o.close();
            a2.m();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((o72) obj).c.b == n62.a) {
                    break;
                }
            }
            o72 o72 = (o72) obj;
            if (o72 != null) {
                return a(o72);
            }
            return null;
        } catch (Throwable th) {
            o.close();
            a2.m();
            throw th;
        }
    }

    public final void g(long j, o62 o62) {
        o62 o622 = o62;
        long d2 = c().d(new o72(j, o622.a, o62, o62.a().e, pfa.n(((cw8) this.d.getValue()).k(o622.j), o622), o622.l), ((l16) this.f.getValue()).a);
        t97 t97 = this.e;
        if (o622.f(((aqc) t97.getValue()).a())) {
            ((pkc) this.c.getValue()).a(((aqc) t97.getValue()).a(), d2);
        }
    }
}
