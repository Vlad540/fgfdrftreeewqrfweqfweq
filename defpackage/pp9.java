package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: pp9  reason: default package */
public final class pp9 extends l5e implements i26 {
    public final /* synthetic */ NotificationTamService X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ boolean x0;
    public final /* synthetic */ long y0;
    public final /* synthetic */ String z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pp9(NotificationTamService notificationTamService, long j, long j2, long j3, boolean z, long j4, String str, Continuation continuation) {
        super(2, continuation);
        this.X = notificationTamService;
        this.Y = j;
        this.Z = j2;
        this.w0 = j3;
        this.x0 = z;
        this.y0 = j4;
        this.z0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pp9(this.X, this.Y, this.Z, this.w0, this.x0, this.y0, this.z0, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        NotificationTamService notificationTamService = this.X;
        m0c m0c = (m0c) notificationTamService.Z.getValue();
        m0c.getClass();
        long j = this.Y;
        m0c.e(m0c, j, this.Z, this.w0, false, false, this.x0, 88);
        ((p7a) m0c.b.getValue()).a(j);
        nr9 e = ((mr9) notificationTamService.w0.getValue()).e();
        e.getClass();
        StringBuilder sb = new StringBuilder("onNotificationMarkAsRead: pushId=");
        long j2 = this.y0;
        sb.append(j2);
        sb.append(", eventKey=");
        String str = this.z0;
        sb.append(str);
        String sb2 = sb.toString();
        String str2 = nr9.d;
        udd.q(str2, sb2);
        if (str != null) {
            try {
                e.b().b("Action", jjd.h(new wia[]{new wia("trid", Long.valueOf(j2)), new wia("eKey", str), new wia("p_op", "m_as_read")}));
            } catch (Exception e2) {
                udd.s(str2, "onNotificationMarkAsRead: failed", e2);
                e.c().c(new Exception("failed to log mark as read", e2), true);
            }
        }
        return jue.a;
    }
}
