package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: vd4  reason: default package */
public final /* synthetic */ class vd4 implements be4, tn1, v1b, l7e {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ vd4(vn1 vn1, ScheduledExecutorService scheduledExecutorService, long j) {
        this.a = 2;
        this.b = vn1;
        this.X = scheduledExecutorService;
        this.o = null;
        this.c = j;
    }

    public Object a() {
        Cursor rawQuery;
        vxe vxe = (vxe) this.b;
        xic xic = (xic) vxe.c;
        xic.getClass();
        Iterable iterable = (Iterable) this.X;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + xic.m0(iterable);
            SQLiteDatabase m = xic.m();
            m.beginTransaction();
            try {
                m.compileStatement(str).execute();
                rawQuery = m.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (String[]) null);
                while (rawQuery.moveToNext()) {
                    xic.U((long) rawQuery.getInt(0), qn7.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                m.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                m.setTransactionSuccessful();
                m.endTransaction();
            } catch (Throwable th) {
                m.endTransaction();
                throw th;
            }
        }
        xic.o(new sq1(vxe.g.a() + this.c, (Object) (hb0) this.o, 8));
        return null;
    }

    public ScheduledFuture b(c9 c9Var) {
        switch (this.a) {
            case 0:
                ae4 ae4 = (ae4) this.b;
                ae4.getClass();
                return ae4.b.schedule(new yd4(ae4, (Runnable) this.X, c9Var, 1), this.c, (TimeUnit) this.o);
            default:
                ae4 ae42 = (ae4) this.b;
                ae42.getClass();
                return ae42.b.schedule(new xs0(ae42, (Callable) this.X, c9Var, 1), this.c, (TimeUnit) this.o);
        }
    }

    public boolean test(Object obj) {
        v1b v1b;
        AtomicLong atomicLong = (AtomicLong) this.b;
        long j = atomicLong.get();
        long nanoTime = System.nanoTime();
        if (j != 0 && Math.abs(nanoTime - j) <= ((TimeUnit) this.o).toNanos(this.c) && ((v1b = (v1b) this.X) == null || !v1b.test(obj))) {
            return false;
        }
        atomicLong.set(nanoTime);
        return true;
    }

    public String z(sn1 sn1) {
        ch7 ch7 = (ch7) this.b;
        ct0.C(ch7, sn1);
        if (!ch7.isDone()) {
            ch7.c(new m36(((ScheduledExecutorService) this.X).schedule(new se5(sn1, (vn1) ch7), this.c, TimeUnit.MILLISECONDS), 1), pa2.j());
        }
        return "TimeoutFuture[" + ch7 + "]";
    }

    public /* synthetic */ vd4(ae4 ae4, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = ae4;
        this.X = obj;
        this.c = j;
        this.o = timeUnit;
    }

    public /* synthetic */ vd4(vxe vxe, Iterable iterable, hb0 hb0, long j) {
        this.a = 4;
        this.b = vxe;
        this.X = iterable;
        this.o = hb0;
        this.c = j;
    }

    public /* synthetic */ vd4(AtomicLong atomicLong, TimeUnit timeUnit, long j, v1b v1b) {
        this.a = 3;
        this.b = atomicLong;
        this.o = timeUnit;
        this.c = j;
        this.X = v1b;
    }
}
