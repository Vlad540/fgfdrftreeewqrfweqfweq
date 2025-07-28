package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: do3  reason: default package */
public final class do3 {
    public final aec a;
    public final sh b;
    public final th c;
    public final th d;
    public final th e;
    public final th f;
    public final th g;
    public final th h;

    public do3(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 3);
        this.c = new th(oneMeRoomDatabase, 9);
        this.d = new th(oneMeRoomDatabase, 10);
        this.e = new th(oneMeRoomDatabase, 11);
        this.f = new th(oneMeRoomDatabase, 12);
        this.g = new th(oneMeRoomDatabase, 13);
        this.h = new th(oneMeRoomDatabase, 14);
    }

    public static void a(do3 do3) {
        aec aec = do3.a;
        aec.b();
        th thVar = do3.e;
        yz5 f2 = thVar.f();
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            thVar.u(f2);
            aec.b();
            th thVar2 = do3.h;
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

    public final void b(String str, String str2, String str3, String str4, String str5, long j) {
        aec aec = this.a;
        aec.b();
        th thVar = this.f;
        yz5 f2 = thVar.f();
        f2.j(1, j);
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        if (str2 == null) {
            f2.W(3);
        } else {
            f2.f(3, str2);
        }
        if (str3 == null) {
            f2.W(4);
        } else {
            f2.f(4, str3);
        }
        if (str4 == null) {
            f2.W(5);
        } else {
            f2.f(5, str4);
        }
        if (str5 == null) {
            f2.W(6);
        } else {
            f2.f(6, str5);
        }
        try {
            aec.c();
            f2.m();
            aec.r();
            aec.l();
            thVar.u(f2);
        } catch (Throwable th) {
            thVar.u(f2);
            throw th;
        }
    }

    public final void c(ni3 ni3, ConcurrentHashMap concurrentHashMap) {
        long j = ni3.a;
        if (ni3.j != 0) {
            aec aec = this.a;
            aec.b();
            th thVar = this.g;
            yz5 f2 = thVar.f();
            f2.j(1, j);
            try {
                aec.c();
                f2.n();
                aec.r();
                aec.l();
                thVar.u(f2);
            } catch (Throwable th) {
                thVar.u(f2);
                throw th;
            }
        } else {
            Object obj = concurrentHashMap.get(Long.valueOf(j));
            List list = ni3.f;
            if (!(obj == null ? false : obj.equals(Integer.valueOf(list.hashCode())))) {
                concurrentHashMap.remove(Long.valueOf(j));
                p7c p7c = o16.a;
                m16 b2 = o16.b(list);
                if (b2 != null) {
                    String c2 = ehe.c(ni3.p);
                    if (r1g.p(c2)) {
                        c2 = "";
                    }
                    String k = gsc.k(c2);
                    String str = null;
                    m16 m16 = b2.c;
                    String str2 = m16 != null ? m16.a : null;
                    if (m16 != null) {
                        str = m16.b;
                    }
                    b(k, b2.a, b2.b, str2, str, j);
                    concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
                }
            }
        }
    }
}
