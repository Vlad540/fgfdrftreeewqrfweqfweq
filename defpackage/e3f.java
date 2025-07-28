package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: e3f  reason: default package */
public final class e3f {
    public final aec a;
    public final sh b;
    public final tdc c;
    public final tdc d;

    public e3f(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 27);
        this.c = new tdc(oneMeRoomDatabase, 23);
        this.d = new tdc(oneMeRoomDatabase, 24);
    }
}
