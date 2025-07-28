package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.UUID;

/* renamed from: vz5  reason: default package */
public final class vz5 extends SQLiteOpenHelper {
    public static final /* synthetic */ int w0 = 0;
    public boolean X;
    public final l4b Y;
    public boolean Z;
    public final Context a;
    public final c9 b;
    public final ope c;
    public final boolean o;

    public vz5(Context context, String str, c9 c9Var, ope ope, boolean z) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, ope.b, new tz5(ope, c9Var));
        this.a = context;
        this.b = c9Var;
        this.c = ope;
        this.o = z;
        this.Y = new l4b(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    public final sz5 a(boolean z) {
        l4b l4b = this.Y;
        try {
            l4b.a(!this.Z && getDatabaseName() != null);
            this.X = false;
            SQLiteDatabase g = g(z);
            if (this.X) {
                close();
                sz5 a2 = a(z);
                l4b.b();
                return a2;
            }
            sz5 d = d(g);
            l4b.b();
            return d;
        } catch (Throwable th) {
            l4b.b();
            throw th;
        }
    }

    public final void close() {
        l4b l4b = this.Y;
        try {
            l4b.a(l4b.a);
            super.close();
            this.b.b = null;
            this.Z = false;
        } finally {
            l4b.b();
        }
    }

    public final sz5 d(SQLiteDatabase sQLiteDatabase) {
        c9 c9Var = this.b;
        sz5 sz5 = (sz5) c9Var.b;
        if (sz5 != null && hhd.f((SQLiteDatabase) sz5.b, sQLiteDatabase)) {
            return sz5;
        }
        sz5 sz52 = new sz5(0, sQLiteDatabase);
        c9Var.b = sz52;
        return sz52;
    }

    public final SQLiteDatabase g(boolean z) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.Z;
        Context context = this.a;
        if (!(databaseName == null || z2 || (parentFile = context.getDatabasePath(databaseName).getParentFile()) == null)) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        if (!z) {
            return getReadableDatabase();
        }
        try {
            return getWritableDatabase();
        } catch (Throwable th) {
            super.close();
            if (th instanceof uz5) {
                uz5 uz5 = th;
                int t = hr1.t(uz5.a);
                Throwable th2 = uz5.b;
                if (t == 0 || t == 1 || t == 2 || t == 3) {
                    throw th2;
                } else if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
            } else if (!(th instanceof SQLiteException)) {
                throw th;
            } else if (databaseName == null || !this.o) {
                throw th;
            }
            context.deleteDatabase(databaseName);
            if (!z) {
                return getReadableDatabase();
            }
            try {
                return getWritableDatabase();
            } catch (uz5 e) {
                throw e.b;
            }
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.X;
        ope ope = this.c;
        if (!z && ope.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            d(sQLiteDatabase);
            ope.getClass();
        } catch (Throwable th) {
            throw new uz5(th, 1);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.J(d(sQLiteDatabase));
        } catch (Throwable th) {
            throw new uz5(th, 2);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.X = true;
        try {
            this.c.K(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new uz5(th, 4);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.X) {
            try {
                this.c.L(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new uz5(th, 5);
            }
        }
        this.Z = true;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.X = true;
        try {
            this.c.M(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new uz5(th, 3);
        }
    }
}
