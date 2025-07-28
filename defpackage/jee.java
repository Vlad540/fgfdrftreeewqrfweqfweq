package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: jee  reason: default package */
public final class jee {
    public static final List d = Arrays.asList(new lee[]{lee.PROCESSING, lee.WAITING});
    public final nj4 a;
    public final g15 b;
    public final ajb c = new ajb();

    public jee(nj4 nj4, g15 g15) {
        this.a = nj4;
        this.b = g15;
    }

    public final j73 a(List list) {
        udd.p("jee", "awaitNoTasksByTypes: types=%s", new Object[]{list});
        return new w63(new mhd(new mv9(2, new rz3(this, 7, list)), new d52(28, list), 2).h(new kce(8)), 2, new iee(this, list)).f(new b95(7, list));
    }

    public final long b(List list) {
        mee b2 = ((hz3) ((a04) this.a.get())).f.b();
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks where type in (");
        int size = list.size();
        a06.e(sb, size);
        sb.append(")");
        pec a2 = pec.a(size, sb.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            b2.c.getClass();
            a2.j(i, (long) ((una) it.next()).a);
            i++;
        }
        aec aec = b2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            return o.moveToFirst() ? o.getLong(0) : 0;
        } finally {
            o.close();
            a2.m();
        }
    }

    public final void c(long j) {
        mee b2 = ((hz3) ((a04) this.a.get())).f.b();
        aec aec = b2.a;
        aec.c();
        try {
            mee.a(b2, j);
            aec.r();
        } finally {
            aec.l();
        }
    }

    public final void d(long j) {
        udd.q("jee", "remove task = " + j);
        ((hz3) ((a04) this.a.get())).f.a(j);
        this.c.c(Boolean.TRUE);
    }

    /* JADX INFO: finally extract failed */
    public final void e(AbstractCollection abstractCollection) {
        udd.p("jee", "remove tasks %d", new Object[]{Integer.valueOf(abstractCollection.size())});
        if (!ek8.J(abstractCollection)) {
            aec aec = ((hz3) ((a04) this.a.get())).f.b().a;
            aec.b();
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM tasks WHERE id in (");
            a06.e(sb, abstractCollection.size());
            sb.append(")");
            yz5 d2 = aec.d(sb.toString());
            Iterator it = abstractCollection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Long l = (Long) it.next();
                if (l == null) {
                    d2.W(i);
                } else {
                    d2.j(i, l.longValue());
                }
                i++;
            }
            aec.c();
            try {
                d2.n();
                aec.r();
                aec.l();
                this.c.c(Boolean.TRUE);
            } catch (Throwable th) {
                aec.l();
                throw th;
            }
        }
    }

    public final void f() {
        udd.p("jee", "remove tasks by type = %d", new Object[]{una.TYPE_SYNC_CHAT_HISTORY});
        mee b2 = ((hz3) ((a04) this.a.get())).f.b();
        aec aec = b2.a;
        aec.b();
        tdc tdc = b2.i;
        yz5 f = tdc.f();
        b2.c.getClass();
        f.j(1, (long) 12);
        try {
            aec.c();
            f.n();
            aec.r();
            aec.l();
            tdc.u(f);
            this.c.c(Boolean.TRUE);
        } catch (Throwable th) {
            tdc.u(f);
            throw th;
        }
    }

    public final void g(tna tna, long j, int i) {
        StringBuilder sb = new StringBuilder("save task = ");
        tna tna2 = tna;
        sb.append(tna);
        udd.q("jee", sb.toString());
        mee b2 = ((hz3) ((a04) this.a.get())).f.b();
        aee aee = new aee(tna.getId(), tna.getType(), lee.WAITING, 0, j, i, tna.g(), System.currentTimeMillis());
        aec aec = b2.a;
        aec.b();
        aec.c();
        try {
            b2.b.D(aee);
            aec.r();
        } finally {
            aec.l();
        }
    }

    /* JADX INFO: finally extract failed */
    public final List h(long j, una una) {
        bfc bfc = ((hz3) ((a04) this.a.get())).f;
        mee b2 = bfc.b();
        b2.getClass();
        pec a2 = pec.a(2, "SELECT * FROM tasks WHERE id > ? AND type = ?");
        a2.j(1, j);
        b2.c.getClass();
        a2.j(2, (long) una.a);
        aec aec = b2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "type");
            int o4 = gp0.o(o, "status");
            int o5 = gp0.o(o, "fails_count");
            int o6 = gp0.o(o, "depends_request_id");
            int o7 = gp0.o(o, "dependency_type");
            int o8 = gp0.o(o, "data");
            int o9 = gp0.o(o, "created_time");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new aee(o.getLong(o2), m54.t(o.getInt(o3)), m54.s(o.getInt(o4)), o.getInt(o5), o.getLong(o6), o.getInt(o7), o.isNull(o8) ? null : o.getBlob(o8), o.getLong(o9)));
            }
            o.close();
            a2.m();
            return bfc.c(arrayList);
        } catch (Throwable th) {
            o.close();
            a2.m();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final List i(Collection collection) {
        m54 m54;
        bfc bfc = ((hz3) ((a04) this.a.get())).f;
        mee b2 = bfc.b();
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tasks WHERE type in (");
        int size = collection.size();
        a06.e(sb, size);
        sb.append(") AND status in (");
        List<lee> list = d;
        int size2 = list.size();
        a06.e(sb, size2);
        sb.append(")");
        pec a2 = pec.a(size2 + size, sb.toString());
        Iterator it = collection.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            m54 = b2.c;
            if (!hasNext) {
                break;
            }
            m54.getClass();
            a2.j(i, (long) ((una) it.next()).a);
            i++;
        }
        int i2 = size + 1;
        for (lee lee : list) {
            m54.getClass();
            a2.j(i2, (long) lee.a);
            i2++;
        }
        aec aec = b2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "type");
            int o4 = gp0.o(o, "status");
            int o5 = gp0.o(o, "fails_count");
            int o6 = gp0.o(o, "depends_request_id");
            int o7 = gp0.o(o, "dependency_type");
            int o8 = gp0.o(o, "data");
            int o9 = gp0.o(o, "created_time");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                long j = o.getLong(o2);
                int i3 = o.getInt(o3);
                m54.getClass();
                arrayList.add(new aee(j, m54.t(i3), m54.s(o.getInt(o4)), o.getInt(o5), o.getLong(o6), o.getInt(o7), o.isNull(o8) ? null : o.getBlob(o8), o.getLong(o9)));
            }
            o.close();
            a2.m();
            return bfc.c(arrayList);
        } catch (Throwable th) {
            o.close();
            a2.m();
            throw th;
        }
    }

    public final zde j(long j) {
        pec a2;
        Cursor o;
        una una;
        nj4 nj4 = this.a;
        try {
            return ((hz3) ((a04) nj4.get())).f.e(j);
        } catch (Exception e) {
            mee b2 = ((hz3) ((a04) nj4.get())).f.b();
            b2.getClass();
            a2 = pec.a(1, "SELECT type FROM tasks WHERE id = ?");
            a2.j(1, j);
            aec aec = b2.a;
            aec.b();
            o = aec.o(a2, (CancellationSignal) null);
            if (o.moveToFirst()) {
                int i = o.getInt(0);
                b2.c.getClass();
                una = m54.t(i);
            } else {
                una = null;
            }
            o.close();
            a2.m();
            udd.R("jee", (IOException) null, "selectTask: id=%d; type=%d; exception=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), una, e.getMessage()}, 3));
            this.b.c(new Exception("Can't select task with type=" + una + "; exception= " + e.getMessage()), true);
            return null;
        } catch (Throwable th) {
            o.close();
            a2.m();
            throw th;
        }
    }

    public final int k() {
        mee b2 = ((hz3) ((a04) this.a.get())).f.b();
        List<lee> B = p23.B(new lee[]{lee.WAITING, lee.FAILED});
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks WHERE status in (");
        int size = B.size();
        a06.e(sb, size);
        sb.append(")");
        pec a2 = pec.a(size, sb.toString());
        int i = 1;
        for (lee lee : B) {
            b2.c.getClass();
            a2.j(i, (long) lee.a);
            i++;
        }
        aec aec = b2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int i2 = 0;
            if (o.moveToFirst()) {
                i2 = o.getInt(0);
            }
            return i2;
        } finally {
            o.close();
            a2.m();
        }
    }

    public final ArrayList l() {
        return ((hz3) ((a04) this.a.get())).f.b().b(Integer.MAX_VALUE, p23.B(new lee[]{lee.WAITING, lee.FAILED}));
    }

    public final ArrayList m() {
        m54 m54;
        mee b2 = ((hz3) ((a04) this.a.get())).f.b();
        List B = p23.B(new lee[]{lee.WAITING, lee.FAILED});
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT type, COUNT(*) as count FROM tasks WHERE status in (");
        int size = B.size();
        a06.e(sb, size);
        sb.append(") GROUP BY type");
        pec a2 = pec.a(size, sb.toString());
        Iterator it = B.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            m54 = b2.c;
            if (!hasNext) {
                break;
            }
            m54.getClass();
            a2.j(i, (long) ((lee) it.next()).a);
            i++;
        }
        aec aec = b2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                int i2 = o.getInt(0);
                m54.getClass();
                arrayList.add(new yde(m54.t(i2), o.getInt(1)));
            }
            return arrayList;
        } finally {
            o.close();
            a2.m();
        }
    }

    public final void n(long j, lee lee) {
        ((hz3) ((a04) this.a.get())).f.b().c(j, lee);
    }
}
