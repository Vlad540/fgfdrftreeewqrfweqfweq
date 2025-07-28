package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: pkc  reason: default package */
public final class pkc {
    public final aec a;
    public final tdc b;
    public final tdc c;
    public final tdc d;

    public pkc(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new tdc(oneMeRoomDatabase, 4);
        this.c = new tdc(oneMeRoomDatabase, 5);
        this.d = new tdc(oneMeRoomDatabase, 6);
    }

    public final void a(long j, long j2) {
        aec aec = this.a;
        aec.b();
        tdc tdc = this.b;
        yz5 f = tdc.f();
        f.j(1, j);
        f.j(2, j2);
        try {
            aec.c();
            f.m();
            aec.r();
            aec.l();
            tdc.u(f);
        } catch (Throwable th) {
            tdc.u(f);
            throw th;
        }
    }
}
