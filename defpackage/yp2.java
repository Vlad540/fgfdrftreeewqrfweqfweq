package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: yp2  reason: default package */
public final class yp2 {
    public final aec a;
    public final xp2 b;
    public lw2 c;
    public final th d;
    public final th e;
    public final th f;
    public final th g;
    public final th h;

    public yp2(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new xp2(this, oneMeRoomDatabase, 0);
        this.d = new th(oneMeRoomDatabase, 4);
        this.e = new th(oneMeRoomDatabase, 5);
        this.f = new th(oneMeRoomDatabase, 6);
        this.g = new th(oneMeRoomDatabase, 7);
        this.h = new th(oneMeRoomDatabase, 8);
    }

    public static void b(yp2 yp2) {
        aec aec = yp2.a;
        aec.b();
        th thVar = yp2.e;
        yz5 f2 = thVar.f();
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            thVar.u(f2);
            aec.b();
            th thVar2 = yp2.h;
            yz5 f3 = thVar2.f();
            try {
                aec.c();
                f3.n();
                aec.r();
                aec.l();
                thVar2.u(f3);
            } catch (Throwable th) {
                thVar2.u(f3);
                throw th;
            }
        } catch (Throwable th2) {
            thVar.u(f2);
            throw th2;
        }
    }

    public static void c(yp2 yp2, long j) {
        aec aec = yp2.a;
        aec.b();
        th thVar = yp2.d;
        yz5 f2 = thVar.f();
        f2.j(1, j);
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            thVar.u(f2);
            aec.b();
            th thVar2 = yp2.g;
            yz5 f3 = thVar2.f();
            f3.j(1, j);
            try {
                aec.c();
                f3.n();
                aec.r();
                aec.l();
                thVar2.u(f3);
            } catch (Throwable th) {
                thVar2.u(f3);
                throw th;
            }
        } catch (Throwable th2) {
            thVar.u(f2);
            throw th2;
        }
    }

    public final synchronized lw2 a() {
        try {
            if (this.c == null) {
                this.c = (lw2) this.a.l.get(lw2.class);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.c;
    }

    /* JADX INFO: finally extract failed */
    public final long d(o72 o72, ConcurrentHashMap concurrentHashMap) {
        m16 a2;
        aec aec = this.a;
        aec.b();
        aec.c();
        try {
            long D = this.b.D(o72);
            aec.r();
            aec.l();
            Object obj = concurrentHashMap.get(Long.valueOf(D));
            boolean z = false;
            o62 o62 = o72.c;
            if (!(obj == null ? false : obj.equals(o62.g))) {
                concurrentHashMap.remove(Long.valueOf(D));
                String str = o62.g;
                if (str != null) {
                    if (str.length() == 0) {
                        z = true;
                    }
                    String str2 = null;
                    if (z) {
                        str = null;
                    }
                    if (!(str == null || (a2 = o16.a(str)) == null)) {
                        m16 m16 = a2.c;
                        String str3 = m16 != null ? m16.a : null;
                        if (m16 != null) {
                            str2 = m16.b;
                        }
                        aec.b();
                        th thVar = this.f;
                        yz5 f2 = thVar.f();
                        f2.j(1, D);
                        String str4 = a2.a;
                        if (str4 == null) {
                            f2.W(2);
                        } else {
                            f2.f(2, str4);
                        }
                        String str5 = a2.b;
                        if (str5 == null) {
                            f2.W(3);
                        } else {
                            f2.f(3, str5);
                        }
                        if (str3 == null) {
                            f2.W(4);
                        } else {
                            f2.f(4, str3);
                        }
                        if (str2 == null) {
                            f2.W(5);
                        } else {
                            f2.f(5, str2);
                        }
                        f2.j(6, o72.e);
                        try {
                            aec.c();
                            f2.m();
                            aec.r();
                            aec.l();
                            thVar.u(f2);
                            String str6 = o62.g;
                            if (str6 != null) {
                                concurrentHashMap.put(Long.valueOf(D), str6);
                            }
                            udd.q(yp2.class.getName(), "update_fts_title_chat for #" + D);
                        } catch (Throwable th) {
                            thVar.u(f2);
                            throw th;
                        }
                    }
                }
            }
            return D;
        } catch (Throwable th2) {
            aec.l();
            throw th2;
        }
    }

    public final long e(long j) {
        pec a2 = pec.a(1, "SELECT id FROM chats WHERE server_id = ?");
        a2.j(1, j);
        aec aec = this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            return o.moveToFirst() ? o.getLong(0) : 0;
        } finally {
            o.close();
            a2.m();
        }
    }
}
