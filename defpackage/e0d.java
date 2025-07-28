package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: e0d  reason: default package */
public final class e0d extends c0d {
    public final /* synthetic */ int b;
    public final Object c;

    public e0d() {
        this.b = 0;
        this.c = e0d.class.getName();
    }

    /* JADX INFO: finally extract failed */
    public final void x() {
        Object obj = this.c;
        switch (this.b) {
            case 0:
                bfc bfc = ((hz3) ((a04) s().a.get())).f;
                om3 om3 = lee.b;
                mee b2 = bfc.b();
                b2.getClass();
                pec a = pec.a(1, "SELECT * FROM tasks WHERE status = ?");
                b2.c.getClass();
                a.j(1, (long) 10);
                aec aec = b2.a;
                aec.b();
                Cursor o = aec.o(a, (CancellationSignal) null);
                try {
                    int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                    int o3 = gp0.o(o, "type");
                    int o4 = gp0.o(o, "status");
                    int o5 = gp0.o(o, "fails_count");
                    int o6 = gp0.o(o, "depends_request_id");
                    int o7 = gp0.o(o, "dependency_type");
                    int o8 = gp0.o(o, "data");
                    int o9 = gp0.o(o, "created_time");
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        arrayList.add(new aee(o.getLong(o2), m54.t(o.getInt(o3)), m54.s(o.getInt(o4)), o.getInt(o5), o.getLong(o6), o.getInt(o7), o.isNull(o8) ? null : o.getBlob(o8), o.getLong(o9)));
                    }
                    o.close();
                    a.m();
                    for (zde zde : bfc.c(arrayList)) {
                        udd.q((String) obj, "mark processing task: " + zde + " as failed");
                        s().c(zde.a);
                    }
                    return;
                } catch (Throwable th) {
                    o.close();
                    a.m();
                    throw th;
                }
            default:
                HashSet hashSet = new HashSet();
                Collection collection = (Collection) obj;
                if (collection == null || collection.contains(xv0.c)) {
                    hashSet.add(2);
                }
                if (collection == null || collection.contains(xv0.b)) {
                    hashSet.add(1);
                    hashSet.add(4);
                }
                if (true ^ hashSet.isEmpty()) {
                    nec nec = ((hz3) o().a).c;
                    be8 be8 = new be8(12);
                    nec.getClass();
                    try {
                        nec.a.m().q(new px4(nec, hashSet, be8, 28));
                        return;
                    } catch (Throwable th2) {
                        udd.s("RoomMessagesDatabase", "Can't update attach by type", th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public e0d(HashSet hashSet) {
        this.b = 1;
        this.c = hashSet;
    }
}
