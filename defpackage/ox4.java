package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Range;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: ox4  reason: default package */
public final /* synthetic */ class ox4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ox4(int i, long j, long j2, Object obj) {
        this.a = i;
        this.o = obj;
        this.b = j;
        this.c = j2;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        fl9 fl9;
        ybe ybe;
        long j = this.c;
        long j2 = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 0:
                xx4 xx4 = (xx4) obj;
                switch (hr1.t(xx4.D)) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        int i = xx4.D;
                        xx4.i(4);
                        Long l = (Long) xx4.t.getLower();
                        long longValue = l.longValue();
                        if (longValue != Long.MAX_VALUE) {
                            if (j2 != -1 && j2 >= longValue) {
                                j = j2;
                            }
                            if (j >= longValue) {
                                xx4.t = Range.create(l, Long.valueOf(j));
                                e07.I(j);
                                if (i != 3 || xx4.w == null) {
                                    xx4.v = true;
                                    xx4.x = pa2.A().schedule((Runnable) new lx4(xx4, 1), 1000, TimeUnit.MILLISECONDS);
                                    return;
                                }
                                xx4.j();
                                return;
                            }
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        throw new AssertionError("There should be a \"start\" before \"stop\"");
                    case 4:
                    case 5:
                        xx4.i(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(me4.r(xx4.D)));
                }
            case 1:
                iv6 iv6 = (iv6) obj;
                iv6.getClass();
                StringBuilder sb = new StringBuilder("startTimer: chatId = ");
                sb.append(j2);
                sb.append(", sender = ");
                long j3 = j;
                sb.append(j3);
                udd.n("iv6", sb.toString());
                long currentTimeMillis = System.currentTimeMillis();
                Map a2 = iv6.a(j2);
                if (a2 != null && (fl9 = (fl9) a2.get(Long.valueOf(j3))) != null) {
                    StringBuilder sb2 = new StringBuilder("startTimer: now - userTime = ");
                    long j4 = currentTimeMillis - fl9.a;
                    sb2.append(j4);
                    udd.n("iv6", sb2.toString());
                    if (j4 >= 6000) {
                        iv6.c(j2, j3);
                        return;
                    }
                    return;
                }
                return;
            default:
                j06 j06 = una.b;
                ybe ybe2 = (qbe) ((m0c) obj).h.getValue();
                t97 t97 = ybe2.X;
                bfc bfc = ((a04) ((jee) t97.getValue()).a.get()).f;
                mee b2 = bfc.b();
                b2.getClass();
                pec a3 = pec.a(1, "SELECT * FROM tasks WHERE type = ?");
                b2.c.getClass();
                a3.j(1, (long) 11);
                aec aec = b2.a;
                aec.b();
                Cursor o2 = aec.o(a3, (CancellationSignal) null);
                try {
                    int o3 = gp0.o(o2, HasExtraData.KEY_ID);
                    int o4 = gp0.o(o2, "type");
                    int o5 = gp0.o(o2, "status");
                    int o6 = gp0.o(o2, "fails_count");
                    int o7 = gp0.o(o2, "depends_request_id");
                    int o8 = gp0.o(o2, "dependency_type");
                    int o9 = gp0.o(o2, "data");
                    t97 t972 = t97;
                    int o10 = gp0.o(o2, "created_time");
                    ybe ybe3 = ybe2;
                    long j5 = j;
                    ArrayList arrayList = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        arrayList.add(new aee(o2.getLong(o3), m54.t(o2.getInt(o4)), m54.s(o2.getInt(o5)), o2.getInt(o6), o2.getLong(o7), o2.getInt(o8), o2.isNull(o9) ? null : o2.getBlob(o9), o2.getLong(o10)));
                    }
                    o2.close();
                    a3.m();
                    List<zde> c2 = bfc.c(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (zde zde : c2) {
                        qa2 qa2 = zde.f;
                        if (qa2 instanceof qa2) {
                            qa2 qa22 = qa2;
                            if (qa22.a != j2 && qa22.o == j5) {
                                udd.m(ybe.F0, new nya(zde));
                                ybe = ybe3;
                                CopyOnWriteArraySet copyOnWriteArraySet = ybe.o;
                                long j6 = zde.a;
                                copyOnWriteArraySet.add(Long.valueOf(j6));
                                arrayList2.add(Long.valueOf(j6));
                                ybe3 = ybe;
                            }
                        }
                        ybe = ybe3;
                        ybe3 = ybe;
                    }
                    ((jee) t972.getValue()).e(arrayList2);
                    return;
                } catch (Throwable th) {
                    o2.close();
                    a3.m();
                    throw th;
                }
        }
    }
}
