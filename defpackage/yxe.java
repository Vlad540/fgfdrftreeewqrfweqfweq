package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: yxe  reason: default package */
public final class yxe {
    public final aec a;
    public final sh b;
    public final tdc c;
    public final tdc d;
    public final tdc e;
    public final tdc f;

    public yxe(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 26);
        this.c = new tdc(oneMeRoomDatabase, 19);
        this.d = new tdc(oneMeRoomDatabase, 20);
        this.e = new tdc(oneMeRoomDatabase, 21);
        this.f = new tdc(oneMeRoomDatabase, 22);
    }
}
