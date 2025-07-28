package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.SurfaceTexture;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.transformer.ExportException;
import com.google.android.gms.tasks.Task;
import com.my.tracker.obfuscated.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: xle  reason: default package */
public final /* synthetic */ class xle implements uw9, lh7, nf3, l7e, h73, of3, j26, tce, bid, hx9, otc, aqf, mr6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xle() {
        this.a = 9;
        this.b = rxe.UPLOADING;
    }

    public nsf M(View view, nsf nsf) {
        Toolbar toolbar = (Toolbar) ((mif) this.b).b;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
        lsf lsf = nsf.a;
        marginLayoutParams.topMargin = lsf.f(7).b;
        toolbar.setLayoutParams(marginLayoutParams);
        at7.f(toolbar, lsf.f(7).c);
        at7.g(toolbar, lsf.f(7).a);
        return nsf;
    }

    /* JADX INFO: finally extract failed */
    public Object a() {
        Object obj = this.b;
        switch (this.a) {
            case 3:
                xic xic = (a03) obj;
                xic.getClass();
                int i = e03.e;
                nxc nxc = new nxc(6);
                HashMap hashMap = new HashMap();
                SQLiteDatabase m = xic.m();
                m.beginTransaction();
                try {
                    e03 e03 = (e03) xic.n0(m.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new xz((Object) xic, (Object) hashMap, (Object) nxc, 28));
                    m.setTransactionSuccessful();
                    return e03;
                } finally {
                    m.endTransaction();
                }
            case 4:
                xic xic2 = (a15) obj;
                long a2 = xic2.b.a() - xic2.o.d;
                SQLiteDatabase m2 = xic2.m();
                m2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a2)};
                    xic.n0(m2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new sic(1, xic2));
                    int delete = m2.delete("events", "timestamp_ms < ?", strArr);
                    m2.setTransactionSuccessful();
                    m2.endTransaction();
                    return Integer.valueOf(delete);
                } catch (Throwable th) {
                    m2.endTransaction();
                    throw th;
                }
            case 5:
                xic xic3 = ((vxe) obj).i;
                SQLiteDatabase m3 = xic3.m();
                m3.beginTransaction();
                try {
                    m3.compileStatement("DELETE FROM log_event_dropped").execute();
                    m3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + xic3.b.a()).execute();
                    m3.setTransactionSuccessful();
                    return null;
                } finally {
                    m3.endTransaction();
                }
            default:
                etf etf = (etf) obj;
                for (hb0 a3 : (Iterable) etf.b.o(new lpa(18))) {
                    etf.c.a(a3, 1, false);
                }
                return null;
        }
    }

    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                ((nqe) obj2).d((ExportException) obj);
                return;
            default:
                ((zxe) obj2).a((wve) obj);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r6v11, types: [y79] */
    /* JADX WARNING: type inference failed for: r6v12, types: [uj6] */
    /* JADX WARNING: type inference failed for: r6v13, types: [xy3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.a
            switch(r1) {
                case 9: goto L_0x012d;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r23
            xb5 r1 = (defpackage.xb5) r1
            r2 = 0
            if (r1 == 0) goto L_0x0121
            java.util.List r3 = r1.b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0018
            goto L_0x0121
        L_0x0018:
            java.lang.Object r0 = r0.b
            n10 r0 = (defpackage.n10) r0
            m10 r4 = r0.l
            r5 = 1
            if (r4 == 0) goto L_0x0027
            boolean r4 = r4.d
            if (r4 == 0) goto L_0x0027
            r4 = r5
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            java.util.Iterator r6 = r3.iterator()
        L_0x002c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x003e
            java.lang.Object r7 = r6.next()
            vb5 r7 = (defpackage.vb5) r7
            int r8 = r7.a
            r9 = 2
            if (r8 != r9) goto L_0x002c
            goto L_0x003f
        L_0x003e:
            r7 = r2
        L_0x003f:
            if (r7 == 0) goto L_0x006c
            xy3 r2 = new xy3
            int r3 = r0.p
            int r5 = r0.q
            java.lang.String r1 = r1.a
            java.lang.String r8 = r7.b
            long r9 = r0.k
            long r11 = r0.c
            long r13 = r0.a
            boolean r15 = r0.g
            xx r7 = r0.n
            int r6 = r0.e
            int r0 = r0.f
            r20 = r6
            r6 = r2
            r16 = r7
            r7 = r1
            r17 = r4
            r18 = r3
            r19 = r5
            r21 = r0
            r6.<init>(r7, r8, r9, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0121
        L_0x006c:
            java.util.Iterator r6 = r3.iterator()
        L_0x0070:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0081
            java.lang.Object r7 = r6.next()
            vb5 r7 = (defpackage.vb5) r7
            int r8 = r7.a
            if (r8 != r5) goto L_0x0070
            goto L_0x0082
        L_0x0081:
            r7 = r2
        L_0x0082:
            if (r7 == 0) goto L_0x00af
            uj6 r2 = new uj6
            int r3 = r0.p
            int r5 = r0.q
            java.lang.String r1 = r1.a
            java.lang.String r8 = r7.b
            long r9 = r0.k
            long r11 = r0.c
            long r13 = r0.a
            boolean r15 = r0.g
            xx r7 = r0.n
            int r6 = r0.e
            int r0 = r0.f
            r20 = r6
            r6 = r2
            r16 = r7
            r7 = r1
            r17 = r4
            r18 = r3
            r19 = r5
            r21 = r0
            r6.<init>(r7, r8, r9, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0121
        L_0x00af:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00b8:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00cd
            java.lang.Object r6 = r3.next()
            vb5 r6 = (defpackage.vb5) r6
            int r7 = r6.a
            r8 = 3
            if (r7 != r8) goto L_0x00b8
            r5.add(r6)
            goto L_0x00b8
        L_0x00cd:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x00d4
            r5 = r2
        L_0x00d4:
            if (r5 == 0) goto L_0x0121
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = r5.size()
            r8.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x00e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0107
            java.lang.Object r3 = r2.next()
            vb5 r3 = (defpackage.vb5) r3     // Catch:{ all -> 0x0100 }
            w79 r5 = new w79     // Catch:{ all -> 0x0100 }
            java.lang.String r6 = r3.b     // Catch:{ all -> 0x0100 }
            int r7 = r3.c     // Catch:{ all -> 0x0100 }
            int r9 = r3.d     // Catch:{ all -> 0x0100 }
            int r3 = r3.e     // Catch:{ all -> 0x0100 }
            r5.<init>(r7, r6, r9, r3)     // Catch:{ all -> 0x0100 }
            r8.add(r5)     // Catch:{ all -> 0x0100 }
            goto L_0x00e3
        L_0x0100:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0107:
            y79 r2 = new y79
            long r13 = r0.a
            xx r15 = r0.n
            java.lang.String r7 = r1.a
            long r9 = r0.k
            long r11 = r0.c
            int r1 = r0.p
            int r0 = r0.q
            r6 = r2
            r16 = r4
            r17 = r1
            r18 = r0
            r6.<init>(r7, r8, r9, r11, r13, r15, r16, r17, r18)
        L_0x0121:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            java.lang.String r1 = "VideoRipper"
            java.lang.String r3 = "getVideoContent: processFetchResult for videoContent %s"
            udd.p(r1, r3, r0)
            return r2
        L_0x012d:
            r1 = r23
            yxe r1 = (defpackage.yxe) r1
            r1.getClass()
            java.lang.String r2 = "SELECT * FROM uploads WHERE upload_status=?"
            r3 = 1
            pec r2 = pec.a(r3, r2)
            java.lang.Object r0 = r0.b
            rxe r0 = (defpackage.rxe) r0
            int r0 = r0.a
            long r4 = (long) r0
            r2.j(r3, r4)
            wxe r0 = new wxe
            r3 = 1
            r0.<init>(r1, r2, r3)
            ox7 r1 = new ox7
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xle.apply(java.lang.Object):java.lang.Object");
    }

    public void b(x63 x63) {
        switch (this.a) {
            case 6:
                bye bye = (bye) this.b;
                bye.getClass();
                udd.q("bye", "clear: ");
                synchronized (bye) {
                    bye.a.clear().e(((zxe) bye.b.getValue()).clear()).a();
                }
                if (!x63.h()) {
                    x63.b();
                    return;
                }
                return;
            default:
                ((Map) ((dye) this.b).b).clear();
                x63.b();
                return;
        }
    }

    public void c(Display display) {
        u4f u4f = (u4f) this.b;
        if (display != null) {
            u4f.getClass();
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            u4f.i = refreshRate;
            u4f.j = (refreshRate * 80) / 100;
            return;
        }
        u4f.i = -9223372036854775807L;
        u4f.j = -9223372036854775807L;
    }

    public void f(nr6 nr6) {
        ewf ewf = (ewf) this.b;
        ewf.getClass();
        try {
            lr6 c = nr6.c();
            if (c != null) {
                ewf.b.j(c);
            }
        } catch (IllegalStateException e) {
            e.getMessage();
        }
    }

    public int i(int i) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return ((yof) ((pg7) ((WebAppSettingsScreen) this.b).Z.C(i))).a();
            default:
                yof yof = (yof) ((pg7) ((WebAppsSettingScreen) this.b).o.C(i));
                if (yof.a() != 0) {
                    return yof.a();
                }
                return 0;
        }
    }

    public void invoke(Object obj) {
        kqe kqe = (kqe) this.b;
        ig8 ig8 = (ig8) obj;
        kqe.t.getClass();
        o55 a2 = kqe.q.a();
        String str = ig8.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "onCompleted", (Throwable) null);
        }
        gg8 gg8 = ig8.a;
        gg8.f.set(a2);
        gg8.g.set((Object) null);
        ig8.a();
    }

    public void j(ihd ihd) {
        int i;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 13:
                xcf xcf = (xcf) this.b;
                xcf.getClass();
                if (g02.w0 == null) {
                    g02.w0 = new g02(19);
                }
                g02 g02 = g02.w0;
                f2b f2b = new f2b((Object) xcf, 15, (Object) ihd);
                g02.getClass();
                String str = xcf.a;
                if (str.length() == 0) {
                    new IllegalArgumentException("Video identifier cannot be empty");
                    f2b.j();
                    return;
                }
                try {
                    cqc.r(str).e(new s5c(f2b, new Object(), false, 10));
                    return;
                } catch (IOException e) {
                    f2b.j();
                    e.printStackTrace();
                    return;
                }
            default:
                pvf pvf = (pvf) this.b;
                ovf ovf = pvf.b;
                ovf.execute(new String[]{pvf.a});
                SparseArray sparseArray = (SparseArray) ovf.get();
                if (sparseArray != null && sparseArray.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        sparseArray.keyAt(i2);
                        qvf qvf = (qvf) sparseArray.valueAt(i2);
                        wu5 wu5 = qvf.a;
                        if (wu5 != null && (i = wu5.e) > 0 && !(z = wu5.f) && !(z2 = wu5.g)) {
                            arrayList.add(new vb5(z ? 2 : z2 ? 1 : 3, -1, wu5.c, i, qvf.b));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ihd.onError(new FetcherException(4, "Can't find any link"));
                        return;
                    } else if (!ihd.h()) {
                        ihd.a(new xb5("YouTube", arrayList));
                        return;
                    } else {
                        return;
                    }
                } else if (!ihd.h()) {
                    ihd.onError(new FetcherException(4, "Can't get video link"));
                    return;
                } else {
                    return;
                }
        }
    }

    public void l(Task task) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION:
                kef.b((Intent) this.b);
                return;
            case 18:
                ((ssf) this.b).b.d((Object) null);
                return;
            case 19:
                ((ScheduledFuture) this.b).cancel(false);
                return;
            default:
                x.b.b((x.c) this.b, task);
                return;
        }
    }

    public /* synthetic */ xle(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ xle(VideoView videoView, SurfaceTexture surfaceTexture) {
        this.a = 12;
        this.b = videoView;
    }
}
