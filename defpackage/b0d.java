package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.widget.RemoteViews;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.core.graphics.drawable.IconCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: b0d  reason: default package */
public final class b0d implements pg6, uvf, lta, ix4, vvc, nn1 {
    public static b0d Y;
    public static final zia Z = new Object();
    public Object X;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ b0d(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.X = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static synchronized b0d t() {
        b0d b0d;
        synchronized (b0d.class) {
            try {
                if (Y == null) {
                    Y = new b0d(0);
                }
                b0d = Y;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return b0d;
    }

    public static void z(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public gj0 A(List list) {
        ArrayList o2 = o(list);
        if (o2.size() < 2) {
            return (gj0) gwf.s(o2, (Object) null);
        }
        Collections.sort(o2, new yz(3));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((gj0) o2.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= o2.size()) {
                break;
            }
            gj0 gj0 = (gj0) o2.get(i3);
            if (i2 == gj0.c) {
                arrayList.add(new Pair(gj0.b, Integer.valueOf(gj0.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (gj0) o2.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.o;
        gj0 gj02 = (gj0) hashMap.get(arrayList);
        if (gj02 == null) {
            List subList = o2.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((gj0) subList.get(i5)).d;
            }
            int nextInt = ((Random) this.X).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= subList.size()) {
                    gj02 = (gj0) gwf.t(subList);
                    break;
                }
                gj0 gj03 = (gj0) subList.get(i);
                i6 += gj03.d;
                if (nextInt < i6) {
                    gj02 = gj03;
                    break;
                }
                i++;
            }
            hashMap.put(arrayList, gj02);
        }
        return gj02;
    }

    public void a(TotalCaptureResult totalCaptureResult) {
        if (((sn1) this.o) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.X;
            if (rect2 != null && rect2.equals(rect)) {
                ((sn1) this.o).b((Object) null);
                this.o = null;
                this.X = null;
            }
        }
    }

    public float b() {
        Float f = (Float) ((et1) this.b).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public float c() {
        return 1.0f;
    }

    public pj5 d(long j) {
        Object obj;
        Iterator it = ((Set) ((AtomicReference) ((j54) this.b).X).get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((zta) obj).a == j) {
                break;
            }
        }
        zta zta = (zta) obj;
        fw4 fw4 = fw4.a;
        if (zta == null) {
            return fw4;
        }
        int ordinal = zta.b.ordinal();
        if (ordinal == 0) {
            return ((lta) this.c).d(j);
        }
        if (ordinal != 1) {
            return fw4;
        }
        return ez3.P(new ik5(((ap3) ((t97) this.o).getValue()).c(((f03) ((t97) this.X).getValue()).s() ^ j), 2), new xta(j, (Continuation) null));
    }

    public void e(mv4 mv4) {
        Rect rect = (Rect) this.c;
        if (rect != null) {
            mv4.P(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    public Rect f() {
        Rect rect = (Rect) this.c;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((et1) this.b).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    public void g(EncodeException encodeException) {
        if (((y5c) this.X).W == null) {
            ((rf3) this.c).accept(encodeException);
        }
    }

    public void h(float f, sn1 sn1) {
        Rect rect = (Rect) ((et1) this.b).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float width = ((float) rect.width()) / f;
        float height = ((float) rect.height()) / f;
        float width2 = (((float) rect.width()) - width) / 2.0f;
        float height2 = (((float) rect.height()) - height) / 2.0f;
        this.c = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        sn1 sn12 = (sn1) this.o;
        if (sn12 != null) {
            sn12.d(new Exception("There is a new zoomRatio being set"));
        }
        this.X = (Rect) this.c;
        this.o = sn1;
    }

    public void i() {
        ((sn1) this.b).b((Object) null);
    }

    public void j(y0c y0c, xbc xbc) {
        gbe gbe = (gbe) this.X;
        afc afc = (afc) this.c;
        ((sw9) this.b).e = SystemClock.elapsedRealtime();
        f1c f1c = xbc.Z;
        try {
            if (!xbc.m()) {
                bd b2 = vl.b().b();
                int i = xbc.o;
                if (!b2.a().c()) {
                    b2.g("HTTP_ERROR", String.valueOf(i));
                }
                IOException iOException = new IOException("Unexpected HTTP code " + xbc);
                gbe.getClass();
                if (y0c.B0) {
                    ((rh9) afc.b).getClass();
                    zb5 zb5 = (zb5) afc.a;
                    zb5.a().k(zb5.b, "NetworkFetchProducer");
                    zb5.a.c();
                } else {
                    afc.B(iOException);
                }
                if (f1c != null) {
                    try {
                        f1c.close();
                    } catch (Exception e) {
                        m75.k(e);
                    }
                }
            } else {
                long n = f1c.n();
                if (n < 0) {
                    n = 0;
                }
                afc.C(f1c.m(), (int) n);
                try {
                    f1c.close();
                } catch (Exception e2) {
                    m75.k(e2);
                }
            }
        } catch (Exception e3) {
            gbe.getClass();
            if (y0c.B0) {
                ((rh9) afc.b).getClass();
                zb5 zb52 = (zb5) afc.a;
                zb52.a().k(zb52.b, "NetworkFetchProducer");
                zb52.a.c();
            } else {
                afc.B(e3);
            }
            if (f1c != null) {
                f1c.close();
            }
        } catch (Throwable th) {
            if (f1c != null) {
                try {
                    f1c.close();
                } catch (Exception e4) {
                    m75.k(e4);
                }
            }
            throw th;
        }
    }

    public og6 k() {
        i22 B = ((t52) this.o).B(((i22) this.b).a);
        if (B != null) {
            this.b = B;
        }
        return new ab2(this, t52.H(((i22) this.b).b, (Set) this.X));
    }

    public void l() {
        this.X = null;
        this.c = null;
        sn1 sn1 = (sn1) this.o;
        if (sn1 != null) {
            sn1.d(new Exception("Camera is not active."));
            this.o = null;
        }
    }

    public void m(xw4 xw4) {
        y5c y5c = (y5c) this.X;
        if (y5c.f0 != 3) {
            MediaMuxer mediaMuxer = y5c.C;
            na0 na0 = (na0) this.o;
            if (mediaMuxer == null) {
                if (!y5c.r) {
                    y5c.V.f(new zr0(xw4));
                    if (y5c.U != null) {
                        y5c.C(na0);
                    }
                }
                xw4.close();
                return;
            }
            try {
                y5c.J(xw4, na0);
                xw4.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            xw4.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        throw th;
    }

    public void n(gn9 gn9) {
        IconCompat a2 = gn9.a();
        Icon icon = null;
        if (a2 != null) {
            icon = zn6.d(a2, (Context) null);
        }
        Notification.Action.Builder a3 = po9.a(icon, gn9.i, gn9.j);
        u8c[] u8cArr = gn9.c;
        if (u8cArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[u8cArr.length];
            for (int i = 0; i < u8cArr.length; i++) {
                remoteInputArr[i] = u8c.a(u8cArr[i]);
            }
            for (RemoteInput c2 : remoteInputArr) {
                no9.c(a3, c2);
            }
        }
        Bundle bundle = gn9.a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z = gn9.d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i2 = Build.VERSION.SDK_INT;
        qo9.a(a3, z);
        int i3 = gn9.f;
        bundle2.putInt("android.support.action.semanticAction", i3);
        so9.b(a3, i3);
        to9.c(a3, gn9.g);
        if (i2 >= 31) {
            uo9.a(a3, gn9.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", gn9.e);
        no9.b(a3, bundle2);
        no9.a((Notification.Builder) this.c, no9.d(a3));
    }

    public ArrayList o(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        z(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        z(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            gj0 gj0 = (gj0) list.get(i);
            if (!hashMap.containsKey(gj0.b) && !hashMap2.containsKey(Integer.valueOf(gj0.c))) {
                arrayList.add(gj0);
            }
        }
        return arrayList;
    }

    public void p(r34 r34) {
        ((y5c) this.X).I = r34;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map q(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "featuresPerRole"
            org.json.JSONObject r11 = r11.optJSONObject(r0)
            if (r11 != 0) goto L_0x000b
            iw4 r10 = defpackage.iw4.a
            return r10
        L_0x000b:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r11.keys()
        L_0x0014:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.o
            jk9 r3 = (defpackage.jk9) r3
            r3.getClass()
            e51 r3 = defpackage.jk9.p(r2)
            if (r3 != 0) goto L_0x003d
            java.lang.String r3 = "warning: unknown feature: "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "CallFeatureNotificationHandler"
            java.lang.Object r4 = r10.c
            xwb r4 = (xwb) r4
            r4.log(r3, r2)
            goto L_0x0014
        L_0x003d:
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r2 != 0) goto L_0x0046
            qw4 r2 = defpackage.qw4.a
            goto L_0x00a2
        L_0x0046:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            int r5 = r2.length()
            r6 = 0
        L_0x0050:
            if (r6 >= r5) goto L_0x00a1
            java.lang.String r7 = r2.optString(r6)
            if (r7 != 0) goto L_0x0059
            goto L_0x009e
        L_0x0059:
            java.lang.Object r8 = r10.X
            dr9 r8 = (dr9) r8
            r8.getClass()
            int r8 = r7.hashCode()
            r9 = -1290540065(0xffffffffb313ebdf, float:-3.4440628E-8)
            if (r8 == r9) goto L_0x008c
            r9 = 62130991(0x3b40b2f, float:1.0582017E-36)
            if (r8 == r9) goto L_0x0080
            r9 = 1746537484(0x681a0c0c, float:2.9098667E24)
            if (r8 == r9) goto L_0x0074
            goto L_0x0094
        L_0x0074:
            java.lang.String r8 = "CREATOR"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x007d
            goto L_0x0094
        L_0x007d:
            je1 r7 = je1.a
            goto L_0x0098
        L_0x0080:
            java.lang.String r8 = "ADMIN"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0089
            goto L_0x0094
        L_0x0089:
            je1 r7 = je1.b
            goto L_0x0098
        L_0x008c:
            java.lang.String r8 = "SPEAKER"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0096
        L_0x0094:
            r7 = 0
            goto L_0x0098
        L_0x0096:
            je1 r7 = je1.c
        L_0x0098:
            if (r7 != 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            r4.add(r7)
        L_0x009e:
            int r6 = r6 + 1
            goto L_0x0050
        L_0x00a1:
            r2 = r4
        L_0x00a2:
            r0.put(r3, r2)
            goto L_0x0014
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0d.q(org.json.JSONObject):java.util.Map");
    }

    public void r(y0c y0c, IOException iOException) {
        bd b2 = vl.b().b();
        if (!b2.a().c()) {
            b2.g("HTTP_ERROR", iOException.getClass().getSimpleName());
        }
        if (iOException.getMessage() == null || iOException.getMessage().toLowerCase().equals("canceled")) {
            udd.u("OkHttpNetworkFetchProducer", iOException, "onFailure for request %s", (lac) this.o);
        }
        afc afc = (afc) this.c;
        ((gbe) this.X).getClass();
        if (y0c.B0) {
            ((rh9) afc.b).getClass();
            zb5 zb5 = (zb5) afc.a;
            zb5.a().k(zb5.b, "NetworkFetchProducer");
            zb5.a.c();
            return;
        }
        afc.B(iOException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q1f s(n10 r34, o10 r35, java.lang.String r36) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            java.lang.String r3 = r2.r
            android.net.Uri r4 = defpackage.at7.x(r3)
            java.lang.String r5 = r1.d
            android.net.Uri r5 = defpackage.at7.x(r5)
            java.lang.Object r6 = r0.c
            t97 r6 = (defpackage.t97) r6
            java.lang.Object r7 = r6.getValue()
            wz r7 = (wz) r7
            r10 r7 = (r10) r7
            r8 = 0
            android.net.Uri r19 = r7.c(r2, r8)
            if (r5 != 0) goto L_0x002a
            if (r3 == 0) goto L_0x002a
        L_0x0027:
            r23 = r4
            goto L_0x0036
        L_0x002a:
            if (r5 == 0) goto L_0x002f
            r23 = r5
            goto L_0x0036
        L_0x002f:
            if (r19 == 0) goto L_0x0034
            r23 = r19
            goto L_0x0036
        L_0x0034:
            r4 = 0
            goto L_0x0027
        L_0x0036:
            java.lang.Object r3 = r0.X
            r7e r3 = (defpackage.r7e) r3
            r4 = 1
            java.lang.Object r0 = r0.b
            jg8 r0 = (jg8) r0
            int r5 = r1.f
            int r7 = r1.e
            long r9 = r1.c
            g10 r15 = r2.n
            if (r23 != 0) goto L_0x0077
            q1f r2 = q1f.k
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r6 = defpackage.zp4.o
            eq4 r6 = defpackage.eq4.MILLISECONDS
            long r16 = defpackage.mt0.Q(r9, r6)
            hbc r20 = r0.t(r7, r5, r4)
            android.net.Uri r12 = r2.b
            q1f r0 = new q1f
            int r13 = r1.e
            int r14 = r1.f
            long r10 = r1.a
            r9 = r0
            r32 = r15
            r15 = r3
            r18 = r36
            r21 = r32
            r9.<init>(r10, r12, r13, r14, r15, r16, r18, r19, r20, r21)
            return r0
        L_0x0077:
            r32 = r15
            q1f r11 = new q1f
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r26 = r3.intValue()
            int r3 = defpackage.zp4.o
            eq4 r3 = defpackage.eq4.MILLISECONDS
            long r27 = defpackage.mt0.Q(r9, r3)
            java.lang.Object r3 = r6.getValue()
            wz r3 = (wz) r3
            r10 r3 = (r10) r3
            android.net.Uri r30 = r3.c(r2, r8)
            hbc r31 = r0.t(r7, r5, r4)
            int r0 = r1.e
            int r2 = r1.f
            long r3 = r1.a
            r20 = r11
            r21 = r3
            r24 = r0
            r25 = r2
            r29 = r36
            r20.<init>(r21, r23, r24, r25, r26, r27, r29, r30, r31, r32)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0d.s(n10, o10, java.lang.String):q1f");
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "Pack{incomingAudio=" + ((List) this.b) + ", incomingVideo=" + ((List) this.c) + ", outgoingAudio=" + ((List) this.o) + ", outgoingVideo=" + ((List) this.X) + '}';
            default:
                return super.toString();
        }
    }

    public void u(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("feedback");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        ((xhd) this.c).getClass();
                        arrayList.add(xhd.j(jSONObject2));
                    }
                }
                ((jk9) this.o).getClass();
                ((nb5) this.X).onFeedback(new k51(jk9.q(jSONObject), arrayList));
            }
        } catch (JSONException e) {
            ((xwb) this.b).logException("FeedbackNotificationHandler", "Can't parse feedback", e);
        }
    }

    public boolean v(Context context) {
        if (((Boolean) this.o) == null) {
            this.o = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.o).booleanValue();
    }

    public boolean w(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.c).booleanValue();
    }

    public void x(JSONObject jSONObject) {
        xwb xwb = (xwb) this.c;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                ((jk9) this.o).getClass();
                e51 p = jk9.p(string);
                if (p != null) {
                    linkedHashSet.add(p);
                } else {
                    xwb.log("CallFeatureNotificationHandler", "warning: unknown feature: ".concat(string));
                }
            }
            ((i26) this.b).invoke(g41.B0, new h51(linkedHashSet));
        } catch (JSONException e) {
            xwb.logException("CallFeatureNotificationHandler", "feature set changed notification parsing error", e);
        }
    }

    public void y(JSONObject jSONObject) {
        try {
            ((i26) this.b).invoke(g41.C0, new i51(q(jSONObject)));
        } catch (JSONException e) {
            ((xwb) this.c).logException("CallFeatureNotificationHandler", "features per role changed notification parsing error", e);
        }
    }

    public /* synthetic */ b0d(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    public b0d(gvf gvf) {
        this.a = 2;
        this.X = new CopyOnWriteArrayList();
        this.o = gvf;
    }

    public b0d(Context context, t97 t97, t97 t972, jg8 jg8) {
        this.a = 16;
        this.b = jg8;
        this.c = t972;
        this.o = new r7e(new nd(t97, context, 3));
        this.X = new r7e(new q6e(7, this));
    }

    public b0d(et1 et1) {
        this.a = 7;
        this.c = null;
        this.X = null;
        this.b = et1;
    }

    public b0d(ou3 ou3, pae pae, List list) {
        this.a = 9;
        this.b = ou3;
        this.c = pae;
        this.o = list;
        this.X = xs7.a(0, 0, 7);
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ez3.V(((q57) it.next()).b()));
        }
        int i = am5.a;
        ez3.N(ez3.J(new ck5(new q02(arrayList, bw4.a, -2, 1, 1), new j57(this, (Continuation) null), 5), ((pae) this.c).b()), (ou3) this.b);
    }

    public b0d(un9 un9) {
        Icon icon;
        int i;
        Bundle bundle;
        ArrayList arrayList;
        Bundle[] bundleArr;
        gn9 gn9;
        gn9 gn92;
        b0d b0d = this;
        un9 un92 = un9;
        b0d.a = 10;
        new ArrayList();
        b0d.X = new Bundle();
        b0d.o = un92;
        Context context = un92.a;
        b0d.b = context;
        Notification.Builder a2 = ro9.a(context, un92.z);
        b0d.c = a2;
        Notification notification = un92.F;
        Bundle[] bundleArr2 = null;
        int i2 = 2;
        a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(un92.e).setContentText(un92.f).setContentInfo((CharSequence) null).setContentIntent(un92.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(un92.h, (notification.flags & 128) != 0).setNumber(un92.j).setProgress(un92.o, un92.p, un92.q);
        IconCompat iconCompat = un92.i;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = zn6.d(iconCompat, context);
        }
        po9.b(a2, icon);
        a2.setSubText((CharSequence) null).setUsesChronometer(un92.m).setPriority(un92.k);
        io9 io9 = un92.n;
        if (io9 instanceof zn9) {
            zn9 zn9 = (zn9) io9;
            int i3 = xnb.ic_call_decline;
            PendingIntent pendingIntent = zn9.h;
            if (pendingIntent == null) {
                gn9 = zn9.p(i3, rtb.call_notification_hang_up_action, fmb.call_notification_decline_color, zn9.i);
            } else {
                gn9 = zn9.p(i3, rtb.call_notification_decline_action, fmb.call_notification_decline_color, pendingIntent);
            }
            int i4 = xnb.ic_call_answer;
            PendingIntent pendingIntent2 = zn9.g;
            if (pendingIntent2 == null) {
                gn92 = null;
            } else {
                gn92 = zn9.p(i4, rtb.call_notification_answer_action, fmb.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(gn9);
            ArrayList arrayList3 = ((un9) zn9.b).b;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    gn9 gn93 = (gn9) it.next();
                    if (gn93.g) {
                        arrayList2.add(gn93);
                    } else if (!gn93.a.getBoolean("key_action_priority") && i2 > 1) {
                        arrayList2.add(gn93);
                        i2--;
                    }
                    if (gn92 != null && i2 == 1) {
                        arrayList2.add(gn92);
                        i2--;
                    }
                }
            }
            if (gn92 != null && i2 >= 1) {
                arrayList2.add(gn92);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                b0d.n((gn9) it2.next());
            }
        } else {
            Iterator it3 = un92.b.iterator();
            while (it3.hasNext()) {
                b0d.n((gn9) it3.next());
            }
        }
        Bundle bundle2 = un92.w;
        if (bundle2 != null) {
            ((Bundle) b0d.X).putAll(bundle2);
        }
        ((Notification.Builder) b0d.c).setShowWhen(un92.l);
        no9.i((Notification.Builder) b0d.c, un92.u);
        no9.g((Notification.Builder) b0d.c, un92.r);
        no9.j((Notification.Builder) b0d.c, un92.t);
        no9.h((Notification.Builder) b0d.c, un92.s);
        oo9.b((Notification.Builder) b0d.c, un92.v);
        oo9.c((Notification.Builder) b0d.c, un92.x);
        oo9.f((Notification.Builder) b0d.c, un92.y);
        oo9.d((Notification.Builder) b0d.c, (Notification) null);
        oo9.e((Notification.Builder) b0d.c, notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = un92.G;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                oo9.a((Notification.Builder) b0d.c, (String) it4.next());
            }
        }
        ArrayList arrayList5 = un92.d;
        if (arrayList5.size() > 0) {
            if (un92.w == null) {
                un92.w = new Bundle();
            }
            Bundle bundle3 = un92.w.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList5.size()) {
                String num = Integer.toString(i5);
                gn9 gn94 = (gn9) arrayList5.get(i5);
                Bundle bundle6 = new Bundle();
                IconCompat a3 = gn94.a();
                bundle6.putInt("icon", a3 != null ? a3.e() : 0);
                bundle6.putCharSequence("title", gn94.i);
                bundle6.putParcelable("actionIntent", gn94.j);
                Bundle bundle7 = gn94.a;
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", gn94.d);
                bundle6.putBundle("extras", bundle);
                u8c[] u8cArr = gn94.c;
                if (u8cArr == null) {
                    arrayList = arrayList5;
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[u8cArr.length];
                    int i6 = 0;
                    while (i6 < u8cArr.length) {
                        u8c u8c = u8cArr[i6];
                        ArrayList arrayList6 = arrayList5;
                        Bundle bundle8 = new Bundle();
                        u8c[] u8cArr2 = u8cArr;
                        bundle8.putString("resultKey", u8c.a);
                        bundle8.putCharSequence("label", u8c.b);
                        bundle8.putCharSequenceArray("choices", u8c.c);
                        bundle8.putBoolean("allowFreeFormInput", u8c.d);
                        bundle8.putBundle("extras", u8c.f);
                        Set<String> set = u8c.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList arrayList7 = new ArrayList(set.size());
                            for (String add : set) {
                                arrayList7.add(add);
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList7);
                        }
                        bundleArr[i6] = bundle8;
                        i6++;
                        arrayList5 = arrayList6;
                        u8cArr = u8cArr2;
                    }
                    arrayList = arrayList5;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", gn94.e);
                bundle6.putInt("semanticAction", gn94.f);
                bundle5.putBundle(num, bundle6);
                i5++;
                bundleArr2 = null;
                arrayList5 = arrayList;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (un92.w == null) {
                un92.w = new Bundle();
            }
            un92.w.putBundle("android.car.EXTENSIONS", bundle3);
            b0d = this;
            ((Bundle) b0d.X).putBundle("android.car.EXTENSIONS", bundle4);
        }
        ((Notification.Builder) b0d.c).setExtras(un92.w);
        qo9.e((Notification.Builder) b0d.c, (CharSequence[]) null);
        ro9.b((Notification.Builder) b0d.c, un92.A);
        ro9.e((Notification.Builder) b0d.c, (CharSequence) null);
        ro9.f((Notification.Builder) b0d.c, un92.B);
        ro9.g((Notification.Builder) b0d.c, 0);
        ro9.d((Notification.Builder) b0d.c, un92.C);
        if (!TextUtils.isEmpty(un92.z)) {
            ((Notification.Builder) b0d.c).setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        Iterator it5 = un92.c.iterator();
        while (it5.hasNext()) {
            wna wna = (wna) it5.next();
            wna.getClass();
            so9.a((Notification.Builder) b0d.c, vna.b(wna));
        }
        int i7 = Build.VERSION.SDK_INT;
        to9.a((Notification.Builder) b0d.c, un92.E);
        to9.b((Notification.Builder) b0d.c, (Notification.BubbleMetadata) null);
        if (i7 >= 31 && (i = un92.D) != 0) {
            uo9.b((Notification.Builder) b0d.c, i);
        }
    }

    public b0d(int i) {
        this.a = i;
        switch (i) {
            case 3:
                Random random = new Random();
                this.o = new HashMap();
                this.X = random;
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            case 6:
                return;
            default:
                this.b = null;
                this.c = null;
                this.o = null;
                this.X = new ArrayDeque();
                return;
        }
    }

    public b0d(ArrayList arrayList, List list) {
        this.a = 1;
        this.b = arrayList;
        this.o = new SparseBooleanArray();
        this.c = new kgd(0);
        int size = arrayList.size();
        int i = Integer.MIN_VALUE;
        aja aja = null;
        for (int i2 = 0; i2 < size; i2++) {
            aja aja2 = (aja) arrayList.get(i2);
            int i3 = aja2.e;
            if (i3 > i) {
                aja = aja2;
                i = i3;
            }
        }
        this.X = aja;
    }
}
