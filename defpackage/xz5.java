package defpackage;

import android.database.sqlite.SQLiteProgram;

/* renamed from: xz5  reason: default package */
public class xz5 implements e4e {
    public final SQLiteProgram a;

    public xz5(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    public final void W(int i) {
        this.a.bindNull(i);
    }

    public final void close() {
        this.a.close();
    }

    public final void f(int i, String str) {
        this.a.bindString(i, str);
    }

    public final void h(int i, double d) {
        this.a.bindDouble(i, d);
    }

    public final void j(int i, long j) {
        this.a.bindLong(i, j);
    }

    public final void k(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }
}
