package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ek1  reason: default package */
public final /* synthetic */ class ek1 implements u16 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ek1(dq9 dq9, jp9 jp9) {
        this.c = dq9;
        this.o = jp9;
        this.b = false;
    }

    /* JADX INFO: finally extract failed */
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                ik1.y(this.b, (ik1) this.c, (List) this.o);
                return jue.a;
            default:
                Continuation continuation = (Continuation) obj;
                dq9 dq9 = (dq9) this.c;
                dq9.getClass();
                jp9 jp9 = (jp9) this.o;
                List<Long> o2 = hr1.o(jp9.a);
                StringBuilder l = hr1.l("SELECT * FROM notifications_read_marks WHERE chat_id IN (");
                int size = o2.size();
                a06.e(l, size);
                l.append(")");
                pec a2 = pec.a(size, l.toString());
                int i = 1;
                for (Long l2 : o2) {
                    if (l2 == null) {
                        a2.W(i);
                    } else {
                        a2.j(i, l2.longValue());
                    }
                    i++;
                }
                aec aec = dq9.a;
                aec.b();
                Cursor o3 = aec.o(a2, (CancellationSignal) null);
                try {
                    int o4 = gp0.o(o3, "chat_id");
                    int o5 = gp0.o(o3, "mark");
                    ArrayList arrayList = new ArrayList(o3.getCount());
                    while (o3.moveToNext()) {
                        arrayList.add(new jp9(o3.getLong(o4), o3.getLong(o5)));
                    }
                    o3.close();
                    a2.m();
                    jp9 jp92 = (jp9) o23.X(arrayList);
                    if (jp92 != null) {
                        int i2 = (jp92.b > jp9.b ? 1 : (jp92.b == jp9.b ? 0 : -1));
                        if (i2 == 0) {
                            return Boolean.FALSE;
                        }
                        if (i2 > 0 && !this.b) {
                            return Boolean.FALSE;
                        }
                    }
                    List singletonList = Collections.singletonList(jp9);
                    aec.b();
                    aec.c();
                    try {
                        dq9.b.B(singletonList);
                        aec.r();
                        aec.l();
                        return Boolean.TRUE;
                    } catch (Throwable th) {
                        aec.l();
                        throw th;
                    }
                } catch (Throwable th2) {
                    o3.close();
                    a2.m();
                    throw th2;
                }
        }
    }

    public /* synthetic */ ek1(boolean z, ik1 ik1, List list) {
        this.b = z;
        this.c = ik1;
        this.o = list;
    }
}
