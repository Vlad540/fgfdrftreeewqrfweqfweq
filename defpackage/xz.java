package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.Size;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: xz  reason: default package */
public final /* synthetic */ class xz implements bid, e21, au, of3, l7e, tn1, StatsObserver, byb, y1e, dwf, m9e, r3e, ou9, m48, lh7, ld8, zt, x4e, vic {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ xz(md8 md8, v1d v1d, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 17;
        this.b = md8;
        this.c = bundle;
        this.o = resultReceiver;
    }

    public Object a() {
        ia4 ia4 = (ia4) this.b;
        xic xic = ia4.d;
        xic.getClass();
        hb0 hb0 = (hb0) this.c;
        t3b t3b = hb0.c;
        i90 i90 = (i90) this.o;
        String str = i90.a;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(t3b);
        }
        ((Long) xic.o(new xz((Object) xic, (Object) i90, (Object) hb0, 27))).getClass();
        ia4.a.a(hb0, 1, false);
        return null;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                y52 y52 = (y52) obj;
                ((t52) this.b).getClass();
                Set set = (Set) this.c;
                a62 a2 = t52.G(y52, set).a();
                a2.o = (h62) this.o;
                t52.a0(y52, set, a2.a());
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                xia xia = (xia) obj;
                vd9 vd9 = (vd9) this.b;
                vd9.getClass();
                Uri uri = (Uri) xia.a;
                Uri uri2 = (Uri) xia.b;
                if (uri2.equals(Uri.EMPTY)) {
                    uri2 = null;
                }
                ((ActLocalMedias) vd9.c).r0(uri, (File) this.c, uri2, (File) this.o, (jw3) null);
                return;
            default:
                vl6 vl6 = (vl6) obj;
                tae tae = (tae) this.b;
                tae.getClass();
                boolean z = vl6.a;
                ea6 ea6 = (ea6) this.o;
                if (z) {
                    t97 t97 = tae.c;
                    kp kpVar = ((j2b) ((g2b) t97.getValue())).c;
                    ((j2b) ((g2b) t97.getValue())).b.getClass();
                    kpVar.l("app.extra.downloaded.emoji.font.url", "");
                    tae.d((File) this.c, ea6);
                    return;
                }
                tae.z0 = (int) vl6.b;
                long nanoTime = System.nanoTime();
                long j = tae.A0;
                if (j == 0 || Math.abs(nanoTime - j) > 1000000000) {
                    tae.A0 = nanoTime;
                    if (ea6 != null) {
                        int i = tae.z0;
                        udd.p(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontProgressChange %d", new Object[]{Integer.valueOf(i)});
                        ((LoadEmojiFontWorker) ea6.b).state = new si7(i);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v1, types: [yd3, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0079 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* renamed from: apply  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m82apply(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.String r1 = "bytes"
            r2 = 0
            java.lang.String r3 = "PRAGMA page_size"
            java.lang.String r4 = "PRAGMA page_count"
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            qn7 r9 = qn7.o
            r10 = 2
            java.lang.Object r11 = r0.o
            java.lang.Object r12 = r0.c
            r13 = 0
            java.lang.Object r14 = r0.b
            r15 = 1
            int r0 = r0.a
            switch(r0) {
                case 26: goto L_0x02b3;
                case 27: goto L_0x0145;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r26
            android.database.Cursor r0 = (android.database.Cursor) r0
            xic r14 = (xic) r14
            r14.getClass()
        L_0x0026:
            boolean r1 = r0.moveToNext()
            r2 = r12
            java.util.Map r2 = (java.util.Map) r2
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r0.getString(r13)
            int r13 = r0.getInt(r15)
            qn7 r16 = qn7.b
            if (r13 != 0) goto L_0x003e
        L_0x003b:
            r5 = r16
            goto L_0x0067
        L_0x003e:
            if (r13 != r15) goto L_0x0043
            qn7 r16 = qn7.c
            goto L_0x003b
        L_0x0043:
            if (r13 != r10) goto L_0x0047
            r5 = r9
            goto L_0x0067
        L_0x0047:
            if (r13 != r8) goto L_0x004c
            qn7 r16 = qn7.X
            goto L_0x003b
        L_0x004c:
            if (r13 != r7) goto L_0x0051
            qn7 r16 = qn7.Y
            goto L_0x003b
        L_0x0051:
            if (r13 != r6) goto L_0x0056
            qn7 r16 = qn7.Z
            goto L_0x003b
        L_0x0056:
            if (r13 != r5) goto L_0x005b
            qn7 r16 = qn7.w0
            goto L_0x003b
        L_0x005b:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r5 = "SQLiteEventStore"
            java.lang.String r6 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            n1g.h(r5, r6, r13)
            goto L_0x003b
        L_0x0067:
            long r7 = r0.getLong(r10)
            boolean r16 = r2.containsKey(r1)
            if (r16 != 0) goto L_0x0079
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2.put(r1, r6)
        L_0x0079:
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            rn7 r2 = new rn7
            r2.<init>(r7, r5)
            r1.add(r2)
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r13 = 0
            goto L_0x0026
        L_0x008d:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0095:
            boolean r1 = r0.hasNext()
            r2 = r11
            nxc r2 = (defpackage.nxc) r2
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r5 = wn7.c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            wn7 r6 = new wn7
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r6.<init>(r5, r1)
            java.lang.Object r1 = r2.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r6)
            goto L_0x0095
        L_0x00c8:
            eye r0 = r14.b
            long r0 = r0.a()
            android.database.sqlite.SQLiteDatabase r5 = r14.m()
            r5.beginTransaction()
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"
            android.database.Cursor r6 = r5.rawQuery(r7, r6)     // Catch:{ all -> 0x0140 }
            f00 r7 = new f00     // Catch:{ all -> 0x0140 }
            r8 = 26
            r7.<init>(r0, r8)     // Catch:{ all -> 0x0140 }
            java.lang.Object r0 = xic.n0(r6, r7)     // Catch:{ all -> 0x0140 }
            jje r0 = (jje) r0     // Catch:{ all -> 0x0140 }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x0140 }
            r5.endTransaction()
            r2.b = r0
            android.database.sqlite.SQLiteDatabase r0 = r14.m()
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r4)
            long r0 = r0.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r4 = r14.m()
            android.database.sqlite.SQLiteStatement r3 = r4.compileStatement(r3)
            long r3 = r3.simpleQueryForLong()
            long r3 = r3 * r0
            j90 r0 = j90.f
            bzd r1 = new bzd
            long r5 = r0.a
            r1.<init>(r3, r5)
            fa6 r0 = new fa6
            r0.<init>(r1)
            r2.o = r0
            javax.inject.Provider r0 = r14.X
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r2.a = r0
            e03 r0 = new e03
            java.lang.Object r1 = r2.b
            jje r1 = (jje) r1
            java.lang.Object r3 = r2.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.lang.Object r4 = r2.o
            fa6 r4 = (fa6) r4
            java.lang.Object r2 = r2.a
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r1, r3, r4, r2)
            return r0
        L_0x0140:
            r0 = move-exception
            r5.endTransaction()
            throw r0
        L_0x0145:
            r0 = r26
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
            xic r14 = (xic) r14
            android.database.sqlite.SQLiteDatabase r5 = r14.m()
            android.database.sqlite.SQLiteStatement r4 = r5.compileStatement(r4)
            long r4 = r4.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r6 = r14.m()
            android.database.sqlite.SQLiteStatement r3 = r6.compileStatement(r3)
            long r6 = r3.simpleQueryForLong()
            long r6 = r6 * r4
            j90 r3 = r14.o
            long r4 = r3.a
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            i90 r12 = (i90) r12
            if (r4 < 0) goto L_0x017d
            java.lang.String r0 = r12.a
            r1 = 1
            r14.U(r1, r9, r0)
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x02b2
        L_0x017d:
            hb0 r11 = (hb0) r11
            java.lang.Long r4 = xic.n(r0, r11)
            if (r4 == 0) goto L_0x018a
            long r4 = r4.longValue()
            goto L_0x01c2
        L_0x018a:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r5 = "backend_name"
            java.lang.String r6 = r11.a
            r4.put(r5, r6)
            t3b r5 = r11.c
            int r5 = w3b.a(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "priority"
            r4.put(r6, r5)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.String r7 = "next_request_ms"
            r4.put(r7, r6)
            byte[] r6 = r11.b
            if (r6 == 0) goto L_0x01bc
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r5)
            java.lang.String r5 = "extras"
            r4.put(r5, r6)
        L_0x01bc:
            java.lang.String r5 = "transport_contexts"
            long r4 = r0.insert(r5, r2, r4)
        L_0x01c2:
            cx4 r6 = r12.c
            byte[] r6 = r6.b
            int r7 = r6.length
            int r3 = r3.e
            if (r7 > r3) goto L_0x01cd
            r7 = r15
            goto L_0x01ce
        L_0x01cd:
            r7 = 0
        L_0x01ce:
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "context_id"
            r8.put(r5, r4)
            java.lang.String r4 = "transport_name"
            java.lang.String r5 = r12.a
            r8.put(r4, r5)
            long r4 = r12.d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "timestamp_ms"
            r8.put(r5, r4)
            long r4 = r12.e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "uptime_ms"
            r8.put(r5, r4)
            cx4 r4 = r12.c
            cy4 r4 = r4.a
            java.lang.String r4 = r4.a
            java.lang.String r5 = "payload_encoding"
            r8.put(r5, r4)
            java.lang.String r4 = "code"
            java.lang.Integer r5 = r12.b
            r8.put(r4, r5)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r9 = "num_attempts"
            r8.put(r9, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            java.lang.String r9 = "inline"
            r8.put(r9, r5)
            if (r7 == 0) goto L_0x0222
            r4 = r6
            goto L_0x0224
        L_0x0222:
            byte[] r4 = new byte[r4]
        L_0x0224:
            java.lang.String r5 = "payload"
            r8.put(r5, r4)
            java.lang.String r4 = "events"
            long r4 = r0.insert(r4, r2, r8)
            java.lang.String r8 = "event_id"
            if (r7 != 0) goto L_0x026c
            int r7 = r6.length
            double r9 = (double) r7
            double r13 = (double) r3
            double r9 = r9 / r13
            double r9 = java.lang.Math.ceil(r9)
            int r7 = (int) r9
            r9 = r15
        L_0x023d:
            if (r9 > r7) goto L_0x026c
            int r10 = r9 + -1
            int r10 = r10 * r3
            int r11 = r9 * r3
            int r13 = r6.length
            int r11 = java.lang.Math.min(r11, r13)
            byte[] r10 = java.util.Arrays.copyOfRange(r6, r10, r11)
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>()
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r11.put(r8, r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            java.lang.String r14 = "sequence_num"
            r11.put(r14, r13)
            r11.put(r1, r10)
            java.lang.String r10 = "event_payloads"
            r0.insert(r10, r2, r11)
            int r9 = r9 + r15
            goto L_0x023d
        L_0x026c:
            java.util.Map r1 = r12.f
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x027a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02ae
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r6.put(r8, r7)
            java.lang.Object r7 = r3.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r9 = "name"
            r6.put(r9, r7)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = "value"
            r6.put(r7, r3)
            java.lang.String r3 = "event_metadata"
            r0.insert(r3, r2, r6)
            goto L_0x027a
        L_0x02ae:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L_0x02b2:
            return r0
        L_0x02b3:
            r0 = r26
            android.database.Cursor r0 = (android.database.Cursor) r0
            xic r14 = (xic) r14
            r14.getClass()
        L_0x02bc:
            boolean r3 = r0.moveToNext()
            if (r3 == 0) goto L_0x03cf
            r3 = 0
            long r4 = r0.getLong(r3)
            r3 = 7
            int r3 = r0.getInt(r3)
            if (r3 == 0) goto L_0x02d0
            r3 = r15
            goto L_0x02d1
        L_0x02d0:
            r3 = 0
        L_0x02d1:
            yd3 r7 = new yd3
            r7.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7.f = r6
            java.lang.String r6 = r0.getString(r15)
            if (r6 == 0) goto L_0x03c7
            r7.a = r6
            long r8 = r0.getLong(r10)
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r7.d = r6
            r8 = 3
            long r18 = r0.getLong(r8)
            java.lang.Long r6 = java.lang.Long.valueOf(r18)
            r7.e = r6
            if (r3 == 0) goto L_0x0320
            cx4 r3 = new cx4
            r6 = 4
            java.lang.String r9 = r0.getString(r6)
            if (r9 != 0) goto L_0x0309
            cy4 r9 = xic.Y
        L_0x0307:
            r13 = 5
            goto L_0x0310
        L_0x0309:
            cy4 r13 = new cy4
            r13.<init>(r9)
            r9 = r13
            goto L_0x0307
        L_0x0310:
            byte[] r6 = r0.getBlob(r13)
            r3.<init>(r9, r6)
            r7.c = r3
            r21 = r1
            r1 = r15
            r2 = 6
            r8 = 0
            goto L_0x0399
        L_0x0320:
            r13 = 5
            cx4 r3 = new cx4
            r6 = 4
            java.lang.String r9 = r0.getString(r6)
            if (r9 != 0) goto L_0x032d
            cy4 r9 = xic.Y
            goto L_0x0333
        L_0x032d:
            cy4 r6 = new cy4
            r6.<init>(r9)
            r9 = r6
        L_0x0333:
            android.database.sqlite.SQLiteDatabase r17 = r14.m()
            java.lang.String[] r19 = new java.lang.String[]{r1}
            java.lang.String r6 = java.lang.String.valueOf(r4)
            java.lang.String[] r21 = new java.lang.String[]{r6}
            r23 = 0
            java.lang.String r24 = "sequence_num"
            java.lang.String r18 = "event_payloads"
            java.lang.String r20 = "event_id = ?"
            r22 = 0
            android.database.Cursor r6 = r17.query(r18, r19, r20, r21, r22, r23, r24)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x03c2 }
            r8.<init>()     // Catch:{ all -> 0x03c2 }
            r10 = 0
        L_0x0357:
            boolean r18 = r6.moveToNext()     // Catch:{ all -> 0x03c2 }
            if (r18 == 0) goto L_0x036a
            r13 = 0
            byte[] r2 = r6.getBlob(r13)     // Catch:{ all -> 0x03c2 }
            r8.add(r2)     // Catch:{ all -> 0x03c2 }
            int r2 = r2.length     // Catch:{ all -> 0x03c2 }
            int r10 = r10 + r2
            r2 = 0
            r13 = 5
            goto L_0x0357
        L_0x036a:
            byte[] r2 = new byte[r10]     // Catch:{ all -> 0x03c2 }
            r10 = 0
            r13 = 0
        L_0x036e:
            int r15 = r8.size()     // Catch:{ all -> 0x03c2 }
            if (r10 >= r15) goto L_0x038c
            java.lang.Object r15 = r8.get(r10)     // Catch:{ all -> 0x03c2 }
            byte[] r15 = (byte[]) r15     // Catch:{ all -> 0x03c2 }
            r21 = r1
            int r1 = r15.length     // Catch:{ all -> 0x03c2 }
            r26 = r8
            r8 = 0
            java.lang.System.arraycopy(r15, r8, r2, r13, r1)     // Catch:{ all -> 0x03c2 }
            int r1 = r15.length     // Catch:{ all -> 0x03c2 }
            int r13 = r13 + r1
            r1 = 1
            int r10 = r10 + r1
            r8 = r26
            r1 = r21
            goto L_0x036e
        L_0x038c:
            r21 = r1
            r1 = 1
            r8 = 0
            r6.close()
            r3.<init>(r9, r2)
            r7.c = r3
            r2 = 6
        L_0x0399:
            boolean r3 = r0.isNull(r2)
            if (r3 != 0) goto L_0x03a9
            int r3 = r0.getInt(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.b = r3
        L_0x03a9:
            i90 r3 = r7.c()
            fa0 r6 = new fa0
            r7 = r11
            hb0 r7 = (hb0) r7
            r6.<init>(r4, r7, r3)
            r3 = r12
            java.util.List r3 = (java.util.List) r3
            r3.add(r6)
            r15 = r1
            r1 = r21
            r2 = 0
            r10 = 2
            goto L_0x02bc
        L_0x03c2:
            r0 = move-exception
            r6.close()
            throw r0
        L_0x03c7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null transportName"
            r0.<init>(r1)
            throw r0
        L_0x03cf:
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz.m82apply(java.lang.Object):java.lang.Object");
    }

    public void b(ic8 ic8) {
        Bundle bundle = (Bundle) this.c;
        md8 md8 = (md8) this.b;
        if (bundle == null) {
            md8.getClass();
            Bundle bundle2 = Bundle.EMPTY;
        }
        bs6 m = md8.f.m(ic8);
        ResultReceiver resultReceiver = (ResultReceiver) this.o;
        if (resultReceiver != null) {
            m.c(new zo5(m, 21, resultReceiver), lh4.a);
        }
    }

    public void c(j9e j9e, int i) {
        TabLayout tabLayout = (o87) this.b;
        int selectedTabPosition = tabLayout.getSelectedTabPosition();
        View view = j9e.e;
        n87 n87 = view instanceof n87 ? (n87) view : null;
        p87 p87 = (p87) this.c;
        if (i > p23.A(p87.a)) {
            String name = p87.class.getName();
            int size = p87.a.size();
            udd.U(name, "Keyboard media tabs position wrong, pos:" + i + "|size:" + size);
            return;
        }
        l87 l87 = (l87) p87.a.get(i);
        Context context = ((ViewPager2) this.o).getContext();
        int i2 = 1;
        boolean z = i == selectedTabPosition;
        String valueOf = String.valueOf(l87.c);
        String string = context.getString(l87.a);
        if (!z) {
            i2 = 2;
        }
        sz9 sz9 = new sz9(valueOf, i2, 56, string);
        if (n87 != null) {
            n87.setTabItem(sz9);
            return;
        }
        n87 n872 = new n87(tabLayout.getContext());
        n872.setTabItem(sz9);
        j9e.e = n872;
        l9e l9e = j9e.g;
        if (l9e != null) {
            l9e.e();
        }
    }

    public void d(at9 at9) {
        st7 st7 = (st7) this.b;
        st7.getClass();
        st7.a();
        if (!at9.h()) {
            Map map = st7.a;
            ev7 ev7 = (ev7) this.c;
            pt7 pt7 = (pt7) map.get(ev7);
            if (pt7 == null) {
                pt7 = st7.b((Context) this.o, ev7, false, false);
            }
            at9.c(pt7.b);
        }
        at9.b();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    public void e(Throwable th) {
        FrgContactAvatar frgContactAvatar = (FrgContactAvatar) this.b;
        frgContactAvatar.getClass();
        ? r1 = (ZoomableDraweeView) this.c;
        r1.setZoomEnabled(false);
        frgContactAvatar.M1 = true;
        if (th != null && th.getMessage() != null && th.getMessage().contains("404")) {
            r1.setVisibility(8);
            ((SlideOutLayout) this.o).findViewById(yqb.frg_unknown_attach__deleted_view).setVisibility(0);
        } else if (((kdf) ((aq) vl.b().getAccessor().c(aq.class))).c()) {
            vl vlVar = vl.o;
            a06.H(1, vlVar, vlVar.getString(cic.F));
        }
    }

    public void f(nn6 nn6, int i) {
        o48 o48 = (o48) this.b;
        o48.getClass();
        nn6.p0(o48.c, i, ((v1d) this.c).b(), (Bundle) this.o);
    }

    public void g(cb0 cb0) {
        io9 io9;
        ea6 ea6 = (ea6) this.b;
        ea6.getClass();
        Objects.toString(cb0);
        boolean z = ((hu1) this.c).p().g() == 0;
        k3b k3b = (k3b) ea6.b;
        f3b f3b = k3b.o;
        Size size = ((y4e) this.o).b;
        f3b.getClass();
        Objects.toString(cb0);
        Objects.toString(size);
        f3b.b = cb0.a;
        f3b.c = cb0.b;
        int i = cb0.c;
        f3b.e = i;
        f3b.a = size;
        f3b.f = z;
        f3b.g = cb0.d;
        f3b.d = cb0.e;
        if (i == -1 || ((io9 = k3b.b) != null && (io9 instanceof c5e))) {
            k3b.w0 = true;
        } else {
            k3b.w0 = false;
        }
        k3b.b();
    }

    public Object get() {
        mm7 mm7 = (mm7) this.b;
        mm7.getClass();
        return new wf6((ua6) ((t97) this.c).getValue(), mm7, (Context) this.o);
    }

    public void h() {
        e3b e3b;
        AtomicReference atomicReference = ((k3b) ((ea6) this.b).b).y0;
        while (true) {
            e3b = (e3b) this.c;
            if (!atomicReference.compareAndSet(e3b, (Object) null)) {
                if (atomicReference.get() != e3b) {
                    break;
                }
            } else {
                e3b.b(j3b.a);
                break;
            }
        }
        j36 j36 = e3b.e;
        if (j36 != null) {
            j36.cancel(false);
            e3b.e = null;
        }
        ((hu1) this.o).f().r(e3b);
    }

    public void i(q7 q7Var) {
        f21 f21 = (f21) this.b;
        f21.getClass();
        lv1 lv1 = ((zz0) this.c).Q0;
        if (lv1 != null) {
            int id = q7Var.getId();
            k77[] k77Arr = CallBottomPanelWidget.w0;
            ((CallBottomPanelWidget) lv1.b).m0().r().j(((l31) ((List) this.o).get(id)).b());
        }
        zq3 zq3 = f21.a;
        if (zq3 != null) {
            zq3.dismiss();
        }
        f21.a = null;
    }

    public void invoke(Object obj) {
        ((hya) obj).q(((fza) ((yd3) this.b).a).c.a, ((fza) ((yd3) this.c).a).c.a, ((Integer) this.o).intValue());
    }

    public void j(ihd ihd) {
        Object obj = this.o;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                b00 b00 = (b00) obj3;
                b00.getClass();
                Locale locale = Locale.ENGLISH;
                String i = wn6.i("preview_", ((o10) obj2).q, "_.png");
                mg5 mg5 = (mg5) b00.c;
                mg5.getClass();
                File g = mg5.g(mg5.b(), "previewVideoCache");
                if (lp.n(g)) {
                    File file = new File(g, i);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        Uri fromFile = Uri.fromFile(file);
                        fr6 u = a06.u();
                        u.getClass();
                        hy5 hy5 = new hy5(5, fromFile);
                        u.f.m(hy5);
                        u.g.m(hy5);
                        u.f(tr6.a(fromFile), (m18) null);
                        if (!ihd.h()) {
                            ihd.a(file);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                } else if (!ihd.h()) {
                    ihd.onError(new IllegalStateException("Preview cache directory not exist or can't read"));
                    return;
                } else {
                    return;
                }
            default:
                Context context = ((f94) obj3).a;
                int f = xy6.f(context);
                Bitmap bitmap2 = new vm0(context, (Uri) obj2, (Uri) null, f, f, (tm0) null).d().a;
                if (bitmap2 != null) {
                    Bitmap bitmap3 = new vm0(context, (Uri) obj, (Uri) null, f, f, (tm0) null).d().a;
                    if (bitmap3 != null) {
                        int i2 = xs7.y;
                        Canvas canvas = new Canvas(bitmap2);
                        float width = ((float) bitmap2.getWidth()) / ((float) bitmap3.getWidth());
                        canvas.scale(width, width);
                        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                        mg5 h = vl.b().h();
                        h.getClass();
                        File o2 = h.o((String) null, "jpg");
                        at7.M(o2.getAbsolutePath(), bitmap2, 100);
                        String absolutePath = o2.getAbsolutePath();
                        bitmap2.recycle();
                        if (!ihd.h()) {
                            ihd.a(Uri.fromFile(new File(absolutePath)));
                            return;
                        }
                        return;
                    } else if (!ihd.h()) {
                        ihd.onError(new IllegalStateException("overlayBitmap not decoded"));
                        return;
                    } else {
                        return;
                    }
                } else if (!ihd.h()) {
                    ihd.onError(new IllegalStateException("bitmap not decoded"));
                    return;
                } else {
                    return;
                }
        }
        throw th;
    }

    public n6g o(Object obj) {
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str2 = (String) this.c;
        dzd dzd = (dzd) this.o;
        String str3 = (String) obj;
        ea6 c2 = FirebaseMessaging.c(firebaseMessaging.b);
        String d = firebaseMessaging.d();
        String g = firebaseMessaging.h.g();
        synchronized (c2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = dzd.e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiProtocol.KEY_TOKEN, (Object) str3);
                jSONObject.put("appVersion", (Object) g);
                jSONObject.put("timestamp", currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c2.b).edit();
                edit.putString(ea6.F(d, str2), str);
                edit.commit();
            }
        }
        if (dzd == null || !str3.equals(dzd.a)) {
            ih5 ih5 = firebaseMessaging.a;
            ih5.a();
            if ("[DEFAULT]".equals(ih5.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    ih5.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(ApiProtocol.KEY_TOKEN, str3);
                new afc(firebaseMessaging.b, 1).E(intent);
            }
        }
        return gwf.o(str3);
    }

    public void onComplete(StatsReport[] statsReportArr) {
        ih4 ih4 = (ih4) this.b;
        ih4.getClass();
        ArrayList arrayList = new ArrayList();
        for (StatsReport statsReport : statsReportArr) {
            if ("ssrc".equals(statsReport.type)) {
                arrayList.add(statsReport);
            }
        }
        ih4.a.post(new co1(ih4, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[arrayList.size()]), (ge1) this.c, (jsd) this.o, 4));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [xp0, java.lang.Object, i36] */
    public String z(sn1 sn1) {
        switch (this.a) {
            case 5:
                bb4 bb4 = (bb4) this.b;
                bb4.getClass();
                bb4.e(new wc3(bb4, (zq4) this.c, (Map) this.o, sn1, 2), new lc(5));
                return "Init GlRenderer";
            case 6:
                vn1 vn1 = (ch7) this.b;
                oc4 oc4 = new oc4(1, vn1);
                Executor executor = (Executor) this.c;
                sn1.a(oc4, executor);
                ? obj = new Object();
                obj.a = false;
                obj.b = sn1;
                ct0.a(vn1, obj, executor);
                return "surfaceList[" + ((Collection) this.o) + "]";
            case 8:
                pp4 pp4 = (pp4) this.b;
                pp4.getClass();
                pp4.e(new wc3(pp4, (zq4) this.c, (Map) this.o, sn1, 4), new lc(5));
                return "Init GlRenderer";
            default:
                ((e3b) this.b).getClass();
                fu1 fu1 = (fu1) this.c;
                wq1 wq1 = new wq1(sn1, fu1);
                ((List) this.o).add(wq1);
                fu1.n(pa2.j(), wq1);
                return "waitForCaptureResult";
        }
    }

    public /* synthetic */ xz(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX WARNING: type inference failed for: r3v21, types: [ch7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v26, types: [ch7, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b6 A[Catch:{ CameraAccessException -> 0x02b9, all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01dd A[Catch:{ CameraAccessException -> 0x02b9, all -> 0x00b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ch7 apply(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r2 = 10
            r3 = 19
            r4 = 2
            r5 = 0
            r6 = 1
            int r7 = r0.a
            switch(r7) {
                case 2: goto L_0x0078;
                case 18: goto L_0x0045;
                default: goto L_0x000e;
            }
        L_0x000e:
            r12 = r23
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r1 = r0.b
            cd8 r1 = (cd8) r1
            android.os.Handler r4 = r1.l
            wc3 r6 = new wc3
            java.lang.Object r7 = r0.o
            r10 = r7
            ke8 r10 = (ke8) r10
            java.lang.Object r0 = r0.c
            ic8 r0 = (ic8) r0
            r13 = 11
            r8 = r6
            r9 = r1
            r11 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            zo5 r7 = new zo5
            r7.<init>(r1, r0, r6, r3)
            p2d r0 = new p2d
            r0.<init>(r5)
            int r1 = oze.a
            a4d r1 = new a4d
            r1.<init>()
            ncd r3 = new ncd
            r3.<init>(r1, r7, r0, r2)
            oze.W(r4, r3)
            return r1
        L_0x0045:
            r1 = r23
            jc8 r1 = (jc8) r1
            java.lang.Object r4 = r0.b
            cd8 r4 = (cd8) r4
            android.os.Handler r6 = r4.l
            px4 r7 = new px4
            java.lang.Object r8 = r0.o
            be8 r8 = (be8) r8
            r9 = 16
            r7.<init>(r4, r8, r1, r9)
            zo5 r1 = new zo5
            java.lang.Object r0 = r0.c
            ic8 r0 = (ic8) r0
            r1.<init>(r4, r0, r7, r3)
            p2d r0 = new p2d
            r0.<init>(r5)
            int r3 = oze.a
            a4d r3 = new a4d
            r3.<init>()
            ncd r4 = new ncd
            r4.<init>(r3, r1, r0, r2)
            oze.W(r6, r4)
            return r3
        L_0x0078:
            java.lang.String r2 = "openCaptureSession() should not be possible in state: "
            java.lang.String r3 = "openCaptureSession() not execute in state: "
            java.lang.Object r7 = r0.b
            ww1 r7 = (ww1) r7
            java.lang.Object r8 = r0.c
            c2d r8 = (c2d) r8
            java.lang.Object r0 = r0.o
            android.hardware.camera2.CameraDevice r0 = (android.hardware.camera2.CameraDevice) r0
            r9 = r23
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r7.a
            monitor-enter(r10)
            int r11 = r7.i     // Catch:{ all -> 0x00b5 }
            int r11 = hr1.t(r11)     // Catch:{ all -> 0x00b5 }
            if (r11 == 0) goto L_0x02c2
            if (r11 == r6) goto L_0x02c2
            r12 = 4
            if (r11 == r4) goto L_0x00b8
            if (r11 == r12) goto L_0x02c2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x00b5 }
            int r1 = r7.i     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = defpackage.rf0.s(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r3.concat(r1)     // Catch:{ all -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b5 }
            as6 r1 = new as6     // Catch:{ all -> 0x00b5 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x02d8
        L_0x00b5:
            r0 = move-exception
            goto L_0x02d9
        L_0x00b8:
            java.util.HashMap r2 = r7.g     // Catch:{ all -> 0x00b5 }
            r2.clear()     // Catch:{ all -> 0x00b5 }
            r2 = r5
        L_0x00be:
            int r3 = r9.size()     // Catch:{ all -> 0x00b5 }
            if (r2 >= r3) goto L_0x00d9
            java.util.HashMap r3 = r7.g     // Catch:{ all -> 0x00b5 }
            java.util.List r11 = r7.h     // Catch:{ all -> 0x00b5 }
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x00b5 }
            xc4 r11 = (xc4) r11     // Catch:{ all -> 0x00b5 }
            java.lang.Object r13 = r9.get(r2)     // Catch:{ all -> 0x00b5 }
            android.view.Surface r13 = (android.view.Surface) r13     // Catch:{ all -> 0x00b5 }
            r3.put(r11, r13)     // Catch:{ all -> 0x00b5 }
            int r2 = r2 + r6
            goto L_0x00be
        L_0x00d9:
            r7.i = r12     // Catch:{ all -> 0x00b5 }
            vw1 r2 = r7.c     // Catch:{ all -> 0x00b5 }
            vw1 r3 = new vw1     // Catch:{ all -> 0x00b5 }
            java.util.List r9 = r8.d     // Catch:{ all -> 0x00b5 }
            r3.<init>(r6, r9)     // Catch:{ all -> 0x00b5 }
            n7e[] r9 = new n7e[r4]     // Catch:{ all -> 0x00b5 }
            r9[r5] = r2     // Catch:{ all -> 0x00b5 }
            r9[r6] = r3     // Catch:{ all -> 0x00b5 }
            vw1 r2 = new vw1     // Catch:{ all -> 0x00b5 }
            java.util.List r3 = java.util.Arrays.asList(r9)     // Catch:{ all -> 0x00b5 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x00b5 }
            js1 r3 = new js1     // Catch:{ all -> 0x00b5 }
            pw1 r4 = r8.g     // Catch:{ all -> 0x00b5 }
            ia3 r5 = r4.b     // Catch:{ all -> 0x00b5 }
            r9 = 7
            r3.<init>(r9, r5)     // Catch:{ all -> 0x00b5 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x00b5 }
            r5.<init>()     // Catch:{ all -> 0x00b5 }
            fc9.c()     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r9.<init>()     // Catch:{ all -> 0x00b5 }
            nc9.a()     // Catch:{ all -> 0x00b5 }
            java.util.List r11 = r4.a     // Catch:{ all -> 0x00b5 }
            r5.addAll(r11)     // Catch:{ all -> 0x00b5 }
            ia3 r11 = r4.b     // Catch:{ all -> 0x00b5 }
            fc9 r11 = fc9.e(r11)     // Catch:{ all -> 0x00b5 }
            int r15 = r4.c     // Catch:{ all -> 0x00b5 }
            java.util.List r12 = r4.e     // Catch:{ all -> 0x00b5 }
            r9.addAll(r12)     // Catch:{ all -> 0x00b5 }
            boolean r14 = r4.f     // Catch:{ all -> 0x00b5 }
            android.util.ArrayMap r12 = new android.util.ArrayMap     // Catch:{ all -> 0x00b5 }
            r12.<init>()     // Catch:{ all -> 0x00b5 }
            s9e r13 = r4.g     // Catch:{ all -> 0x00b5 }
            java.util.Map r6 = r13.a     // Catch:{ all -> 0x00b5 }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x00b5 }
        L_0x0132:
            boolean r16 = r6.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r16 == 0) goto L_0x014e
            java.lang.Object r16 = r6.next()     // Catch:{ all -> 0x00b5 }
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00b5 }
            r22 = r6
            java.util.Map r6 = r13.a     // Catch:{ all -> 0x00b5 }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x00b5 }
            r12.put(r1, r6)     // Catch:{ all -> 0x00b5 }
            r6 = r22
            goto L_0x0132
        L_0x014e:
            nc9 r1 = new nc9     // Catch:{ all -> 0x00b5 }
            r1.<init>(r12)     // Catch:{ all -> 0x00b5 }
            boolean r4 = r4.d     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x00b5 }
            r6.<init>()     // Catch:{ all -> 0x00b5 }
            boolean r12 = r7.r     // Catch:{ all -> 0x00b5 }
            r13 = 35
            if (r12 == 0) goto L_0x0172
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            if (r12 < r13) goto L_0x0172
            java.util.List r6 = r8.a     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r6 = ww1.g(r6)     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r12 = r7.g     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r6 = ww1.c(r6, r12)     // Catch:{ all -> 0x00b5 }
        L_0x0172:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r12.<init>()     // Catch:{ all -> 0x00b5 }
            z80 r13 = js1.y0     // Catch:{ all -> 0x00b5 }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x00b5 }
            ia3 r3 = (ia3) r3     // Catch:{ all -> 0x00b5 }
            r21 = r0
            r0 = 0
            java.lang.Object r3 = r3.d(r13, r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b5 }
            java.util.List r13 = r8.a     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x00b5 }
        L_0x018c:
            boolean r16 = r13.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r16 == 0) goto L_0x01ec
            java.lang.Object r16 = r13.next()     // Catch:{ all -> 0x00b5 }
            r0 = r16
            ra0 r0 = (ra0) r0     // Catch:{ all -> 0x00b5 }
            r23 = r13
            boolean r13 = r7.r     // Catch:{ all -> 0x00b5 }
            if (r13 == 0) goto L_0x01af
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            r16 = r14
            r14 = 35
            if (r13 < r14) goto L_0x01b3
            java.lang.Object r13 = r6.get(r0)     // Catch:{ all -> 0x00b5 }
            fha r13 = (fha) r13     // Catch:{ all -> 0x00b5 }
            goto L_0x01b4
        L_0x01af:
            r16 = r14
            r14 = 35
        L_0x01b3:
            r13 = 0
        L_0x01b4:
            if (r13 != 0) goto L_0x01dd
            java.util.HashMap r13 = r7.g     // Catch:{ all -> 0x00b5 }
            fha r13 = r7.e(r0, r13, r3)     // Catch:{ all -> 0x00b5 }
            java.util.Map r14 = r7.l     // Catch:{ all -> 0x00b5 }
            r17 = r3
            xc4 r3 = r0.a     // Catch:{ all -> 0x00b5 }
            boolean r3 = r14.containsKey(r3)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x01df
            java.util.Map r3 = r7.l     // Catch:{ all -> 0x00b5 }
            xc4 r0 = r0.a     // Catch:{ all -> 0x00b5 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00b5 }
            r3 = r15
            long r14 = r0.longValue()     // Catch:{ all -> 0x00b5 }
            hha r0 = r13.a     // Catch:{ all -> 0x00b5 }
            r0.h(r14)     // Catch:{ all -> 0x00b5 }
            goto L_0x01e0
        L_0x01dd:
            r17 = r3
        L_0x01df:
            r3 = r15
        L_0x01e0:
            r12.add(r13)     // Catch:{ all -> 0x00b5 }
            r13 = r23
            r15 = r3
            r14 = r16
            r3 = r17
            r0 = 0
            goto L_0x018c
        L_0x01ec:
            r16 = r14
            r3 = r15
            java.util.ArrayList r0 = ww1.f(r12)     // Catch:{ all -> 0x00b5 }
            p7e r6 = r7.d     // Catch:{ all -> 0x00b5 }
            int r12 = r8.h     // Catch:{ all -> 0x00b5 }
            r6.e = r2     // Catch:{ all -> 0x00b5 }
            e2d r2 = new e2d     // Catch:{ all -> 0x00b5 }
            ys1 r13 = new ys1     // Catch:{ all -> 0x00b5 }
            r14 = r6
            q7e r14 = (q7e) r14     // Catch:{ all -> 0x00b5 }
            r15 = 1
            r13.<init>(r15, r14)     // Catch:{ all -> 0x00b5 }
            java.util.concurrent.Executor r6 = r6.c     // Catch:{ all -> 0x00b5 }
            r2.<init>(r12, r0, r6, r13)     // Catch:{ all -> 0x00b5 }
            pw1 r0 = r8.g     // Catch:{ all -> 0x00b5 }
            int r0 = r0.c     // Catch:{ all -> 0x00b5 }
            r6 = 5
            if (r0 != r6) goto L_0x0241
            android.hardware.camera2.params.InputConfiguration r0 = r8.i     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0241
            if (r0 != 0) goto L_0x0218
            r6 = 0
            goto L_0x0233
        L_0x0218:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            r8 = 31
            if (r6 < r8) goto L_0x0229
            fx6 r6 = new fx6     // Catch:{ all -> 0x00b5 }
            ex6 r8 = new ex6     // Catch:{ all -> 0x00b5 }
            r8.<init>(r0)     // Catch:{ all -> 0x00b5 }
            r6.<init>(r8)     // Catch:{ all -> 0x00b5 }
            goto L_0x0233
        L_0x0229:
            fx6 r6 = new fx6     // Catch:{ all -> 0x00b5 }
            dx6 r8 = new dx6     // Catch:{ all -> 0x00b5 }
            r8.<init>(r0)     // Catch:{ all -> 0x00b5 }
            r6.<init>(r8)     // Catch:{ all -> 0x00b5 }
        L_0x0233:
            d2d r0 = r2.a     // Catch:{ all -> 0x00b5 }
            r0.getClass()     // Catch:{ all -> 0x00b5 }
            dx6 r6 = r6.a     // Catch:{ all -> 0x00b5 }
            android.hardware.camera2.params.InputConfiguration r6 = r6.a     // Catch:{ all -> 0x00b5 }
            android.hardware.camera2.params.SessionConfiguration r0 = r0.a     // Catch:{ all -> 0x00b5 }
            r0.setInputConfiguration(r6)     // Catch:{ all -> 0x00b5 }
        L_0x0241:
            pw1 r12 = new pw1     // Catch:{ CameraAccessException -> 0x02b9 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x02b9 }
            r13.<init>(r5)     // Catch:{ CameraAccessException -> 0x02b9 }
            hga r0 = hga.a(r11)     // Catch:{ CameraAccessException -> 0x02b9 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x02b9 }
            r5.<init>(r9)     // Catch:{ CameraAccessException -> 0x02b9 }
            s9e r6 = s9e.b     // Catch:{ CameraAccessException -> 0x02b9 }
            android.util.ArrayMap r6 = new android.util.ArrayMap     // Catch:{ CameraAccessException -> 0x02b9 }
            r6.<init>()     // Catch:{ CameraAccessException -> 0x02b9 }
            java.util.Map r8 = r1.a     // Catch:{ CameraAccessException -> 0x02b9 }
            java.util.Set r8 = r8.keySet()     // Catch:{ CameraAccessException -> 0x02b9 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ CameraAccessException -> 0x02b9 }
        L_0x0262:
            boolean r9 = r8.hasNext()     // Catch:{ CameraAccessException -> 0x02b9 }
            if (r9 == 0) goto L_0x0278
            java.lang.Object r9 = r8.next()     // Catch:{ CameraAccessException -> 0x02b9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ CameraAccessException -> 0x02b9 }
            java.util.Map r11 = r1.a     // Catch:{ CameraAccessException -> 0x02b9 }
            java.lang.Object r11 = r11.get(r9)     // Catch:{ CameraAccessException -> 0x02b9 }
            r6.put(r9, r11)     // Catch:{ CameraAccessException -> 0x02b9 }
            goto L_0x0262
        L_0x0278:
            s9e r1 = new s9e     // Catch:{ CameraAccessException -> 0x02b9 }
            r1.<init>(r6)     // Catch:{ CameraAccessException -> 0x02b9 }
            r20 = 0
            r6 = r16
            r14 = r0
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ CameraAccessException -> 0x02b9 }
            kp0 r1 = r7.q     // Catch:{ CameraAccessException -> 0x02b9 }
            if (r21 != 0) goto L_0x0296
            r4 = r21
            r1 = 0
            goto L_0x02a6
        L_0x0296:
            r4 = r21
            android.hardware.camera2.CaptureRequest$Builder r5 = r4.createCaptureRequest(r3)     // Catch:{ CameraAccessException -> 0x02b9 }
            r1g.b(r5, r3, r1)     // Catch:{ CameraAccessException -> 0x02b9 }
            r1g.a(r5, r0)     // Catch:{ CameraAccessException -> 0x02b9 }
            android.hardware.camera2.CaptureRequest r1 = r5.build()     // Catch:{ CameraAccessException -> 0x02b9 }
        L_0x02a6:
            if (r1 == 0) goto L_0x02af
            d2d r0 = r2.a     // Catch:{ CameraAccessException -> 0x02b9 }
            android.hardware.camera2.params.SessionConfiguration r0 = r0.a     // Catch:{ CameraAccessException -> 0x02b9 }
            r0.setSessionParameters(r1)     // Catch:{ CameraAccessException -> 0x02b9 }
        L_0x02af:
            p7e r0 = r7.d     // Catch:{ all -> 0x00b5 }
            java.util.List r1 = r7.h     // Catch:{ all -> 0x00b5 }
            ch7 r1 = r0.m(r4, r2, r1)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x02d8
        L_0x02b9:
            r0 = move-exception
            as6 r1 = new as6     // Catch:{ all -> 0x00b5 }
            r2 = 1
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x02d8
        L_0x02c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b5 }
            int r1 = r7.i     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = defpackage.rf0.s(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b5 }
            as6 r1 = new as6     // Catch:{ all -> 0x00b5 }
            r2 = 1
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
        L_0x02d8:
            return r1
        L_0x02d9:
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz.apply(java.lang.Object):ch7");
    }
}
