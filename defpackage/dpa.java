package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: dpa  reason: default package */
public final class dpa {
    public final aec a;
    public final sh b;
    public final f74 c;
    public final yv8 d;
    public final yv8 e;
    public final yv8 f;

    public dpa(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 15);
        this.c = new f74(oneMeRoomDatabase, 3);
        this.d = new yv8(oneMeRoomDatabase, 18);
        this.e = new yv8(oneMeRoomDatabase, 19);
        this.f = new yv8(oneMeRoomDatabase, 20);
    }

    public static void a(dpa dpa, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            aec aec = dpa.a;
            aec.b();
            yv8 yv8 = dpa.f;
            yz5 f2 = yv8.f();
            f2.j(1, longValue);
            try {
                aec.c();
                f2.n();
                aec.r();
                aec.l();
                yv8.u(f2);
            } catch (Throwable th) {
                yv8.u(f2);
                throw th;
            }
        }
    }
}
