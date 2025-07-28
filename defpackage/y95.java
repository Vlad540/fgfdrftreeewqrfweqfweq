package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: y95  reason: default package */
public final class y95 {
    public final aec a;
    public final sh b;
    public final th c;

    public y95(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 7);
        this.c = new th(oneMeRoomDatabase, 18);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [m95, java.lang.Object] */
    public static ArrayList b(long j, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ? obj = new Object();
            obj.a = ((Long) list.get(i)).longValue();
            obj.b = ((long) i) + j;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void a(List list) {
        aec aec = this.a;
        aec.c();
        try {
            new w63(new y63(2, new g74(2, this)), 0, new y63(2, new x95(this, b(0, list), 0))).a();
            aec.r();
        } finally {
            aec.l();
        }
    }

    public final ArrayList c() {
        pec a2 = pec.a(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC");
        aec aec = this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
            }
            return arrayList;
        } finally {
            o.close();
            a2.m();
        }
    }
}
