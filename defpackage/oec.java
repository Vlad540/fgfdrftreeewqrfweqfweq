package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: oec  reason: default package */
public final class oec {
    public final bec a;
    public final r7e b = new r7e(new u5b(11, this));

    public oec(bec bec) {
        this.a = bec;
    }

    public static joa b(oec oec, ioa ioa) {
        oec.getClass();
        return new joa(ioa.b, ioa.c, ioa.o, ioa.X, ioa.Y, ioa.Z, ioa.w0, ioa.x0, ioa.y0, ioa.z0);
    }

    public static ioa d(joa joa) {
        long j = joa.a;
        int t = hr1.t(joa.j);
        return new ioa(j, joa.b, joa.c, joa.d, joa.e, joa.f, joa.g, joa.h, joa.i, t);
    }

    public final void a() {
        dpa c = c();
        aec aec = c.a;
        aec.b();
        yv8 yv8 = c.e;
        yz5 f = yv8.f();
        try {
            aec.c();
            f.n();
            aec.r();
            aec.l();
            yv8.u(f);
        } catch (Throwable th) {
            yv8.u(f);
            throw th;
        }
    }

    public final dpa c() {
        return (dpa) this.b.getValue();
    }

    /* JADX INFO: finally extract failed */
    public final ArrayList e() {
        dpa c = c();
        c.getClass();
        pec a2 = pec.a(0, "SELECT * FROM phones");
        aec aec = c.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "phonebook_id");
            int o4 = gp0.o(o, "contact_id");
            int o5 = gp0.o(o, "phone");
            int o6 = gp0.o(o, "server_phone");
            int o7 = gp0.o(o, "email");
            int o8 = gp0.o(o, "first_name");
            int o9 = gp0.o(o, "last_name");
            int o10 = gp0.o(o, "avatar_path");
            int o11 = gp0.o(o, "type");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new joa(o.getLong(o2), o.getLong(o3), o.getInt(o4), o.isNull(o5) ? null : o.getString(o5), o.getLong(o6), o.isNull(o7) ? null : o.getString(o7), o.isNull(o8) ? null : o.getString(o8), o.isNull(o9) ? null : o.getString(o9), o.isNull(o10) ? null : o.getString(o10), us8.b(o.getInt(o11))));
            }
            o.close();
            a2.m();
            ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(d((joa) it.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            o.close();
            a2.m();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final ArrayList f(List list) {
        dpa c = c();
        c.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM phones WHERE server_phone in (");
        int size = list.size();
        a06.e(sb, size);
        sb.append(")");
        pec a2 = pec.a(size, sb.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                a2.W(i);
            } else {
                a2.j(i, l.longValue());
            }
            i++;
        }
        aec aec = c.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "phonebook_id");
            int o4 = gp0.o(o, "contact_id");
            int o5 = gp0.o(o, "phone");
            int o6 = gp0.o(o, "server_phone");
            int o7 = gp0.o(o, "email");
            int o8 = gp0.o(o, "first_name");
            int o9 = gp0.o(o, "last_name");
            int o10 = gp0.o(o, "avatar_path");
            int o11 = gp0.o(o, "type");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new joa(o.getLong(o2), o.getLong(o3), o.getInt(o4), o.isNull(o5) ? null : o.getString(o5), o.getLong(o6), o.isNull(o7) ? null : o.getString(o7), o.isNull(o8) ? null : o.getString(o8), o.isNull(o9) ? null : o.getString(o9), o.isNull(o10) ? null : o.getString(o10), us8.b(o.getInt(o11))));
            }
            o.close();
            a2.m();
            ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((joa) it2.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            o.close();
            a2.m();
            throw th;
        }
    }
}
