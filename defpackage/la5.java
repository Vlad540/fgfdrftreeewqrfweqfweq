package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: la5  reason: default package */
public final /* synthetic */ class la5 implements u16 {
    public final /* synthetic */ na5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ la5(na5 na5, long j, long j2) {
        this.a = na5;
        this.b = j;
        this.c = j2;
    }

    /* JADX INFO: finally extract failed */
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        na5 na5 = this.a;
        na5.getClass();
        pec a2 = pec.a(3, "SELECT chat_id, msg_id FROM fcm_notifications_analytics WHERE analytics_status=? AND chat_id=? AND time<=?");
        a2.j(1, (long) hr1.t(3));
        long j = this.b;
        a2.j(2, j);
        long j2 = this.c;
        a2.j(3, j2);
        aec aec = na5.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new pa5(o.getLong(0), o.getLong(1)));
            }
            o.close();
            a2.m();
            aec.b();
            th thVar = na5.o;
            yz5 f = thVar.f();
            f.j(1, (long) hr1.t(3));
            f.j(2, j);
            f.j(3, j2);
            try {
                aec.c();
                f.n();
                aec.r();
                aec.l();
                thVar.u(f);
                return arrayList;
            } catch (Throwable th) {
                thVar.u(f);
                throw th;
            }
        } catch (Throwable th2) {
            o.close();
            a2.m();
            throw th2;
        }
    }
}
