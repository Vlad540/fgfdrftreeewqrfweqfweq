package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: uxe  reason: default package */
public final /* synthetic */ class uxe implements l7e {
    public final /* synthetic */ int a;
    public final /* synthetic */ vxe b;
    public final /* synthetic */ hb0 c;

    public /* synthetic */ uxe(vxe vxe, hb0 hb0, int i) {
        this.a = i;
        this.b = vxe;
        this.c = hb0;
    }

    public final Object a() {
        Boolean bool;
        Cursor rawQuery;
        switch (this.a) {
            case 0:
                hb0 hb0 = this.c;
                xic xic = (xic) this.b.c;
                SQLiteDatabase m = xic.m();
                m.beginTransaction();
                try {
                    Long n = xic.n(m, hb0);
                    if (n == null) {
                        bool = Boolean.FALSE;
                    } else {
                        rawQuery = xic.m().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{n.toString()});
                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                        rawQuery.close();
                        bool = valueOf;
                    }
                    m.setTransactionSuccessful();
                    m.endTransaction();
                    return bool;
                } catch (Throwable th) {
                    m.endTransaction();
                    throw th;
                }
            default:
                xic xic2 = (xic) this.b.c;
                xic2.getClass();
                return (Iterable) xic2.o(new w48((Object) xic2, 28, (Object) this.c));
        }
    }
}
