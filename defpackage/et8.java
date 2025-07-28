package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: et8  reason: default package */
public final class et8 {
    public final aec a;
    public final sh b;
    public final th c;
    public final th d;

    public et8(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 11);
        this.c = new th(oneMeRoomDatabase, 24);
        this.d = new th(oneMeRoomDatabase, 25);
    }
}
