package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: rz5  reason: default package */
public final class rz5 extends b97 implements m26 {
    public final /* synthetic */ f4e a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rz5(f4e f4e) {
        super(4);
        this.a = f4e;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        this.a.o(new xz5(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
