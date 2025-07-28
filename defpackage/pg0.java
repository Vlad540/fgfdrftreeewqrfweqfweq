package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: pg0  reason: default package */
public abstract class pg0 extends ol implements qce, tna {
    public final int o;

    public pg0(long j, int i) {
        super(j);
        this.o = i;
    }

    public final void c(lbe lbe) {
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        if (plVar.e().b(p23.B(new una[]{una.TYPE_ASSETS_ADD, una.TYPE_ASSETS_REMOVE, una.TYPE_ASSETS_MOVE, una.TYPE_ASSETS_LIST_MODIFY})) > 1) {
            pl plVar3 = this.c;
            if (plVar3 != null) {
                plVar2 = plVar3;
            }
            o1d.y((luf) plVar2.g.getValue());
        }
        u(lbe);
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            plVar.b().c(new jh0(this.a, uae));
        }
    }

    /* JADX INFO: finally extract failed */
    public final int e() {
        m54 m54;
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        jee e = plVar.e();
        List B = p23.B(new una[]{una.TYPE_ASSETS_ADD, una.TYPE_ASSETS_REMOVE, una.TYPE_ASSETS_MOVE, una.TYPE_ASSETS_LIST_MODIFY});
        bfc bfc = ((hz3) ((a04) e.a.get())).f;
        mee b = bfc.b();
        b.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tasks WHERE type in (");
        int size = B.size();
        a06.e(sb, size);
        sb.append(")");
        pec a = pec.a(size, sb.toString());
        Iterator it = B.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            m54 = b.c;
            if (!hasNext) {
                break;
            }
            m54.getClass();
            a.j(i, (long) ((una) it.next()).a);
            i++;
        }
        aec aec = b.a;
        aec.b();
        Cursor o2 = aec.o(a, (CancellationSignal) null);
        try {
            int o3 = gp0.o(o2, ApiProtocol.KEY_ID);
            int o4 = gp0.o(o2, "type");
            int o5 = gp0.o(o2, "status");
            int o6 = gp0.o(o2, "fails_count");
            int o7 = gp0.o(o2, "depends_request_id");
            int o8 = gp0.o(o2, "dependency_type");
            int o9 = gp0.o(o2, "data");
            int o10 = gp0.o(o2, "created_time");
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                long j = o2.getLong(o3);
                int i2 = o2.getInt(o4);
                m54.getClass();
                arrayList.add(new aee(j, m54.t(i2), m54.s(o2.getInt(o5)), o2.getInt(o6), o2.getLong(o7), o2.getInt(o8), o2.isNull(o9) ? null : o2.getBlob(o9), o2.getLong(o10)));
            }
            o2.close();
            a.m();
            List c = bfc.c(arrayList);
            Iterator it2 = c.iterator();
            while (true) {
                boolean hasNext2 = it2.hasNext();
                long j2 = this.a;
                if (!hasNext2) {
                    return ((zde) c.get(0)).a != j2 ? 2 : 1;
                }
                zde zde = (zde) it2.next();
                if (zde.a == j2 && (zde.f instanceof lt)) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            o2.close();
            a.m();
            throw th;
        }
    }

    public final void f() {
        int i = this.o;
        int t = hr1.t(i);
        pl plVar = null;
        if (t == 3) {
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            ((fa5) plVar2.p.getValue()).c();
        } else if (t != 4) {
            udd.U(getClass().getName(), "unsuspporeted type ".concat(hr1.u(i)));
        } else {
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            ((l95) plVar3.q.getValue()).f();
        }
        pl plVar4 = this.c;
        if (plVar4 != null) {
            plVar = plVar4;
        }
        plVar.e().d(this.a);
    }

    public final long getId() {
        return this.a;
    }

    public final int h() {
        return 10;
    }

    public abstract void u(lbe lbe);

    public final void v(long j) {
        pl plVar = null;
        int i = this.o;
        if (i == 4) {
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            ((fa5) plVar.p.getValue()).f(j);
        } else if (i == 5) {
            pl plVar3 = this.c;
            if (plVar3 != null) {
                plVar = plVar3;
            }
            ((l95) plVar.q.getValue()).g(j);
        }
    }
}
