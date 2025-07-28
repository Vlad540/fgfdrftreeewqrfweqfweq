package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: qd9  reason: default package */
public final /* synthetic */ class qd9 implements of3, bid {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd9 b;

    public /* synthetic */ qd9(vd9 vd9, int i) {
        this.a = i;
        this.b = vd9;
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [android.content.Context, java.lang.Object, ru.ok.messages.media.mediabar.ActLocalMedias] */
    /* JADX WARNING: type inference failed for: r9v6, types: [android.content.Context, java.lang.Object, ru.ok.messages.media.mediabar.ActLocalMedias] */
    /* JADX WARNING: type inference failed for: r9v9, types: [android.content.Context, java.lang.Object, ru.ok.messages.media.mediabar.ActLocalMedias] */
    public void accept(Object obj) {
        qjb qjb;
        vd9 vd9 = this.b;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                vd9.getClass();
                int i = cic.D;
                ? r9 = (ActLocalMedias) vd9.c;
                r9.getClass();
                Handler handler = a06.h;
                a06.H(0, r9, r9.getString(i));
                return;
            case 2:
                Throwable th2 = (Throwable) obj;
                vd9.getClass();
                int i2 = cic.D;
                ? r92 = (ActLocalMedias) vd9.c;
                r92.getClass();
                Handler handler2 = a06.h;
                a06.H(0, r92, r92.getString(i2));
                return;
            case 3:
                vd9.getClass();
                udd.u("vd9", (Throwable) obj, "startCrop error", new Object[0]);
                int i3 = cic.D;
                ? r93 = (ActLocalMedias) vd9.c;
                r93.getClass();
                Handler handler3 = a06.h;
                a06.H(0, r93, r93.getString(i3));
                return;
            default:
                ud9 ud9 = (ud9) obj;
                vd9.getClass();
                udd.n("vd9", "initVideoLocalMediasResult doOnSuccess");
                vd9.Z = ud9.c;
                long j = ud9.a;
                vd9.w0 = j;
                vd9.x0 = ud9.b;
                if (j == 0) {
                    udd.n("vd9", "videoDuration == 0 -> hide controls");
                    vd9.f2(new sr1(11));
                } else if (ud9.d) {
                    udd.n("vd9", "showQualityButton == true");
                    vd9.f2(new td9(vd9, ud9, 0));
                } else {
                    udd.n("vd9", "showQualityButton == false");
                    if (vd9.Z.isEmpty()) {
                        udd.n("vd9", "allowedQualities is empty -> set default 480p");
                        qjb = qjb.P_480;
                    } else {
                        qjb = vd9.x0.a;
                    }
                    vd9.f2(new td9(vd9, qjb, 1));
                }
                nd9 nd9 = vd9.c;
                if (nd9 != null) {
                    ((ActLocalMedias) nd9).o0(!vd9.x0.d, false);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.content.Context, r5, java.lang.Object, ru.ok.messages.media.mediabar.ActLocalMedias] */
    public void j(ihd ihd) {
        f3f f3f;
        f3f f3f2;
        vd9 vd9 = this.b;
        String a2 = vd9.X.a();
        ? r1 = (ActLocalMedias) vd9.c;
        r1.getClass();
        hi5 V = x87.V(r1, Uri.parse(a2));
        Collections.emptyList();
        if (V.c != 0 && !ihd.h()) {
            l10 l10 = new l10(1);
            Object obj = null;
            l10.a = null;
            l10.b = 0.0f;
            l10.c = 1.0f;
            l10.d = false;
            f3f f3f3 = new f3f(l10);
            rwc h = vd9.A0.h(vd9.X);
            if (!(h == null || (f3f2 = h.b) == null)) {
                l10 l102 = new l10(1);
                l102.a = f3f2.a;
                l102.b = f3f2.b;
                l102.c = f3f2.c;
                l102.d = f3f2.d;
                f3f3 = new f3f(l102);
            }
            if (!ihd.h()) {
                ArrayList y = ete.y(Uri.parse(vd9.X.a()), r1, (xh0) ((k93) r1.O0.b).getAccessor().c(xh0.class));
                if (y == null) {
                    y = new ArrayList();
                } else {
                    Collections.sort(y, rjb.g);
                }
                ArrayList arrayList = y;
                boolean z = arrayList.size() > 1;
                if (arrayList.size() > 0 && f3f3.a == null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        obj = it.next();
                        if (it.hasNext()) {
                            qjb qjb = ((rjb) obj).a;
                            do {
                                Object next = it.next();
                                qjb qjb2 = ((rjb) next).a;
                                if (qjb.compareTo(qjb2) > 0) {
                                    obj = next;
                                    qjb = qjb2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    rjb rjb = (rjb) obj;
                    qjb qjb3 = vd9.Y.a;
                    if (rjb != null) {
                        qjb qjb4 = rjb.a;
                        if (qjb4.compareTo(qjb3) >= 0) {
                            qjb3 = qjb4;
                        }
                    }
                    l10 a3 = f3f3.a();
                    a3.a = qjb3;
                    f3f3 = new f3f(a3);
                }
                if (!V.b) {
                    l10 a4 = f3f3.a();
                    a4.d = true;
                    f3f = new f3f(a4);
                } else {
                    f3f = f3f3;
                }
                ihd.a(new ud9(V.c, f3f, arrayList, z, V.b));
            }
        }
    }
}
