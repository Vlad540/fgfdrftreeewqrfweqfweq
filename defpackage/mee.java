package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: mee  reason: default package */
public final class mee {
    public final aec a;
    public final xp2 b;
    public final m54 c = new Object();
    public final tdc d;
    public final tdc e;
    public final tdc f;
    public final tdc g;
    public final tdc h;
    public final tdc i;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m54] */
    public mee(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new xp2(this, oneMeRoomDatabase, 2);
        new bw8(this, oneMeRoomDatabase, 4);
        this.d = new tdc(oneMeRoomDatabase, 12);
        new tdc(oneMeRoomDatabase, 13);
        this.e = new tdc(oneMeRoomDatabase, 14);
        this.f = new tdc(oneMeRoomDatabase, 15);
        this.g = new tdc(oneMeRoomDatabase, 16);
        this.h = new tdc(oneMeRoomDatabase, 17);
        this.i = new tdc(oneMeRoomDatabase, 18);
    }

    public static void a(mee mee, long j) {
        mee.c(j, lee.FAILED);
        aec aec = mee.a;
        aec.b();
        tdc tdc = mee.f;
        yz5 f2 = tdc.f();
        f2.j(1, j);
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            tdc.u(f2);
        } catch (Throwable th) {
            tdc.u(f2);
            throw th;
        }
    }

    public final ArrayList b(int i2, List list) {
        StringBuilder l = hr1.l("SELECT id FROM tasks WHERE status in (");
        int size = list.size();
        a06.e(l, size);
        l.append(") LIMIT ");
        l.append("?");
        int i3 = size + 1;
        pec a2 = pec.a(i3, l.toString());
        Iterator it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            this.c.getClass();
            a2.j(i4, (long) ((lee) it.next()).a);
            i4++;
        }
        a2.j(i3, (long) i2);
        aec aec = this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
            }
            return arrayList;
        } finally {
            o.close();
            a2.m();
        }
    }

    public final void c(long j, lee lee) {
        aec aec = this.a;
        aec.b();
        tdc tdc = this.d;
        yz5 f2 = tdc.f();
        this.c.getClass();
        f2.j(1, (long) lee.a);
        f2.j(2, j);
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            tdc.u(f2);
        } catch (Throwable th) {
            tdc.u(f2);
            throw th;
        }
    }
}
