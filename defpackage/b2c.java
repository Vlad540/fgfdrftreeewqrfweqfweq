package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: b2c  reason: default package */
public final class b2c {
    public final aec a;
    public final sh b;
    public final f74 c;
    public final yv8 d;

    public b2c(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 18);
        this.c = new f74(oneMeRoomDatabase, 4);
        this.d = new yv8(oneMeRoomDatabase, 22);
    }
}
