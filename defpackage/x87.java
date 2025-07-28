package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.ImageReader;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import net.jpountz.lz4.LZ4Factory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: x87  reason: default package */
public abstract class x87 {
    public static volatile LZ4Factory a;
    public static final float[][] b = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};
    public static final Object c = new Object();

    public static x66 A(ge1 ge1, IceCandidate[] iceCandidateArr) {
        JSONArray jSONArray = new JSONArray();
        for (IceCandidate iceCandidate : iceCandidateArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidate", (Object) iceCandidate.sdp.replaceAll("(raddr|rport)\\s.+?\\s", ""));
            jSONObject.put("sdpMid", (Object) iceCandidate.sdpMid);
            jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
            jSONArray.put((Object) jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidates-removed", (Object) jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        e(ge1, jSONObject3, true);
        jSONObject3.put("data", (Object) jSONObject2);
        return d(jSONObject3, "transmit-data");
    }

    public static void A0(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused) {
            }
        }
    }

    public static ArrayList B(JSONObject jSONObject) {
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("roles")) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(je1.valueOf(optJSONArray.getString(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    public static final boolean B0(String str, Bundle bundle) {
        Boolean s0 = s0(str, bundle);
        if (s0 != null) {
            return s0.booleanValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static x66 C(g7e g7e) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "switch-room");
        if (g7e == null) {
            return new x66(jSONObject);
        }
        w2d w2d = g7e.a;
        if (w2d != null && (w2d instanceof v2d)) {
            jSONObject.put("toRoomId", ((v2d) w2d).a);
        }
        ge1 ge1 = g7e.b;
        if (ge1 != null) {
            jSONObject.put("participantId", (Object) ge1.c());
        }
        return new x66(jSONObject);
    }

    public static final double C0(String str, Bundle bundle) {
        String string = bundle.getString(str);
        Double valueOf = string != null ? Double.valueOf(Double.parseDouble(string)) : null;
        if (valueOf != null) {
            return valueOf.doubleValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static g90 D(g90 g90, Size size, Range range) {
        g90 g902 = g90;
        int i = g902.c;
        int width = size.getWidth();
        int height = size.getHeight();
        int i2 = g902.h;
        int i3 = g902.d;
        int c2 = t2f.c(i, i2, i2, i3, i3, width, g902.e, height, g902.f, range);
        int width2 = size.getWidth();
        int height2 = size.getHeight();
        return new g90(g902.a, g902.b, c2, g902.d, width2, height2, g902.g, g902.h, g902.i, g902.j);
    }

    public static final int D0(String str, Bundle bundle) {
        String string = bundle.getString(str);
        Integer valueOf = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static void E(hc7 hc7, boolean z) {
        if (!hc7.c().d) {
            hc7.c().d = true;
            Activity activity = hc7.c().b;
            if (activity != null) {
                for (f8 p : R(hc7)) {
                    p.p(activity, z);
                }
            }
        }
    }

    public static final long E0(String str, Bundle bundle) {
        Long t0 = t0(str, bundle);
        if (t0 != null) {
            return t0.longValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static boolean F(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static final long[] F0(String str, Bundle bundle) {
        return o23.t0(myc.U(new vqe(myc.L(h0e.r0(G0(str, bundle), new String[]{","}, true, 4), w24.a), x24.a)));
    }

    public static final boolean G(int i, int i2) {
        return i == i2;
    }

    public static final String G0(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final void H(View view, int i, int i2) {
        Rect rect = new Rect();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new fne(view, rect, i, i2));
            return;
        }
        view.getHitRect(rect);
        if (rect.width() < i) {
            int width = (i - rect.width()) / 2;
            rect.left -= width;
            rect.right += width;
        }
        if (rect.height() < i2) {
            int height = (i2 - rect.height()) / 2;
            rect.top -= height;
            rect.bottom += height;
        }
        view.setTouchDelegate(new h55(rect, view));
    }

    public static e8c H0(float[] fArr, ws6 ws6) {
        ts6 ts6 = new ts6();
        for (int i = 0; i < ws6.size(); i++) {
            float[] fArr2 = new float[4];
            Matrix.multiplyMV(fArr2, 0, fArr, 0, (float[]) ws6.get(i), 0);
            float f = fArr2[0];
            float f2 = fArr2[3];
            fArr2[0] = f / f2;
            fArr2[1] = fArr2[1] / f2;
            fArr2[2] = fArr2[2] / f2;
            fArr2[3] = 1.0f;
            ts6.d(fArr2);
        }
        return ts6.j();
    }

    public static void I(int i, View view, ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.post(new a93(view, 0, 0, i, 0, viewGroup, 1));
        }
    }

    public static ge1 J(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("participantId");
        String optString = jSONObject.optString("participantType");
        return new ge1("GROUP".equals(optString) ? 2 : 1, jSONObject.optInt("deviceIdx"), optLong);
    }

    public static ge1 K(JSONObject jSONObject) {
        long optLong = jSONObject.optLong(ApiProtocol.KEY_ID);
        String optString = jSONObject.optString("idType");
        return new ge1("GROUP".equals(optString) ? 2 : 1, jSONObject.optInt("deviceIdx"), optLong);
    }

    public static ema L(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        gma gma = null;
        if (optJSONObject == null) {
            return null;
        }
        int optInt = optJSONObject.optInt("maxDimension");
        int optInt2 = optJSONObject.optInt("maxBitrateK");
        int optInt3 = optJSONObject.optInt("maxFramerate");
        String optString = optJSONObject.optString("degradationPreference");
        try {
            gma = gma.a(optJSONObject.getJSONObject("bitrates"));
        } catch (Exception unused) {
        }
        return new ema(optInt, optInt, optInt2, optInt3, optString, gma, 1, 0, "");
    }

    public static oy1 M(Context context) {
        vn1 vn1;
        e4b e4b = e4b.f;
        synchronized (e4b.a) {
            vn1 = e4b.b;
            if (vn1 == null) {
                vn1 = hwf.f(new w48(e4b, 17, new hv1(context)));
                e4b.b = vn1;
            }
        }
        pt1 pt1 = new pt1(3, new c0(4, context));
        return ct0.N(vn1, new e3((Object) pt1), pa2.j());
    }

    public static LZ4Factory N() {
        if (a == null) {
            synchronized (x87.class) {
                try {
                    if (a == null) {
                        a = LZ4Factory.fastestInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    public static String O(k88 k88) {
        if (k88 == null) {
            return null;
        }
        int i = qd6.a[k88.ordinal()];
        if (i == 1) {
            return "UNMUTE";
        }
        if (i == 2) {
            return "MUTE";
        }
        if (i == 3) {
            return "MUTE_PERMANENT";
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalArgumentException("Unknown media option state: " + k88);
    }

    public static ArrayList P(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                ge1 b2 = ge1.b(optJSONArray.getString(i));
                if (b2 != null) {
                    arrayList.add(b2);
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public static f8 Q(hc7 hc7, ViewGroup viewGroup, Bundle bundle, fc7 fc7) {
        Map map = hc7.c().j;
        LinkedHashMap linkedHashMap = ic7.a;
        f8 f8Var = (f8) map.get(Integer.valueOf(viewGroup.getId()));
        if (f8Var != null) {
            f8Var.Z(fc7, viewGroup);
            return f8Var;
        }
        f8 f8Var2 = new f8();
        f8Var2.Z(fc7, viewGroup);
        if (bundle != null) {
            StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
            ViewGroup viewGroup2 = f8Var2.i;
            sb.append(viewGroup2 != null ? viewGroup2.getId() : 0);
            Bundle bundle2 = bundle.getBundle(sb.toString());
            if (bundle2 != null) {
                f8Var2.N(bundle2);
            }
        }
        hc7.c().j.put(Integer.valueOf(viewGroup.getId()), f8Var2);
        return f8Var2;
    }

    public static List R(hc7 hc7) {
        return o23.s0(hc7.c().j.values());
    }

    public static String S(mzc mzc) {
        String str;
        String str2;
        w69 w69 = mzc.a.c;
        if (w69 != null) {
            str = ":m" + w69.a;
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        xm1 xm1 = mzc.a;
        sb.append(xm1.b.c());
        sb.append(":");
        int i = qd6.b[xm1.a.ordinal()];
        if (i == 1) {
            str2 = "sCAMERA";
        } else if (i == 2) {
            str2 = "sSCREEN";
        } else if (i == 3) {
            str2 = "sMOVIE";
        } else if (i == 4) {
            str2 = "sSTREAM";
        } else if (i == 5) {
            str2 = "sANIMOJI";
        } else {
            throw new RuntimeException("Unknown VideoTrackType");
        }
        return wn6.l(sb, str2, str);
    }

    public static int T(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Throwable th) {
            udd.s("x87", "getVideoBitrate: failed", th);
            return 0;
        }
    }

    public static long U(Context context, Uri uri) {
        long j = 0;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever2.setDataSource(context, uri);
                j = Long.parseLong(mediaMetadataRetriever2.extractMetadata(9));
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    udd.s("x87", "getVideoDuration from uri: failed", th);
                    return 0;
                } finally {
                    A0(mediaMetadataRetriever);
                }
            }
            A0(mediaMetadataRetriever2);
            return j;
        } catch (Throwable th2) {
            th = th2;
            udd.s("x87", "getVideoDuration from uri: failed", th);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d A[SYNTHETIC, Splitter:B:46:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static hi5 V(android.content.Context r14, android.net.Uri r15) {
        /*
            java.lang.String r0 = "x87"
            java.lang.String r1 = "getVideoParams: failed"
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever     // Catch:{ RuntimeException -> 0x0061, all -> 0x005e }
            r7.<init>()     // Catch:{ RuntimeException -> 0x0061, all -> 0x005e }
            r7.setDataSource(r14, r15)     // Catch:{ RuntimeException -> 0x005a }
            r14 = -1
            android.graphics.Bitmap r14 = r7.getFrameAtTime(r14)     // Catch:{ RuntimeException -> 0x005a }
            r15 = 9
            java.lang.String r15 = r7.extractMetadata(r15)     // Catch:{ all -> 0x0022 }
            long r2 = java.lang.Long.parseLong(r15)     // Catch:{ all -> 0x0022 }
            goto L_0x0028
        L_0x0022:
            r15 = move-exception
            java.lang.String r8 = "getVideoDuration: failed "
            udd.s(r0, r8, r15)     // Catch:{ RuntimeException -> 0x0058 }
        L_0x0028:
            android.graphics.Point r15 = W(r7)     // Catch:{ RuntimeException -> 0x0053 }
            int r8 = T(r7)     // Catch:{ RuntimeException -> 0x0050 }
            r9 = 16
            java.lang.String r1 = r7.extractMetadata(r9)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            r1 = r5
            goto L_0x0042
        L_0x003b:
            r9 = move-exception
            java.lang.String r10 = "getVideoBitrate: failed"
            udd.s(r0, r10, r9)     // Catch:{ RuntimeException -> 0x0049 }
        L_0x0041:
            r1 = r6
        L_0x0042:
            A0(r7)
            r13 = r1
            r9 = r2
        L_0x0047:
            r12 = r8
            goto L_0x007b
        L_0x0049:
            r9 = move-exception
            goto L_0x0066
        L_0x004b:
            r4 = r7
            goto L_0x00bd
        L_0x004e:
            r14 = move-exception
            goto L_0x004b
        L_0x0050:
            r9 = move-exception
        L_0x0051:
            r8 = r5
            goto L_0x0066
        L_0x0053:
            r9 = move-exception
        L_0x0054:
            r15 = r4
            goto L_0x0051
        L_0x0056:
            r9 = r15
            goto L_0x0054
        L_0x0058:
            r15 = move-exception
            goto L_0x0056
        L_0x005a:
            r9 = move-exception
            r14 = r4
            r15 = r14
            goto L_0x0051
        L_0x005e:
            r14 = move-exception
            goto L_0x00bd
        L_0x0061:
            r9 = move-exception
            r14 = r4
            r15 = r14
            r7 = r15
            goto L_0x0051
        L_0x0066:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r10.<init>(r1)     // Catch:{ all -> 0x004e }
            r10.append(r9)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = r10.toString()     // Catch:{ all -> 0x004e }
            udd.s(r0, r1, r4)     // Catch:{ all -> 0x004e }
            A0(r7)
            r9 = r2
            r13 = r6
            goto L_0x0047
        L_0x007b:
            if (r14 == 0) goto L_0x00a4
            int r1 = r14.getWidth()     // Catch:{ all -> 0x00a2 }
            int r2 = r14.getHeight()     // Catch:{ all -> 0x00a2 }
            int r3 = java.lang.Math.max(r1, r2)     // Catch:{ all -> 0x00a2 }
            r4 = 512(0x200, float:7.175E-43)
            if (r3 <= r4) goto L_0x00a4
            r4 = 1140850688(0x44000000, float:512.0)
            float r3 = (float) r3     // Catch:{ all -> 0x00a2 }
            float r4 = r4 / r3
            float r1 = (float) r1     // Catch:{ all -> 0x00a2 }
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)     // Catch:{ all -> 0x00a2 }
            float r2 = (float) r2     // Catch:{ all -> 0x00a2 }
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)     // Catch:{ all -> 0x00a2 }
            android.graphics.Bitmap r14 = android.graphics.Bitmap.createScaledBitmap(r14, r1, r2, r6)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a4
        L_0x00a2:
            r1 = move-exception
            goto L_0x00a6
        L_0x00a4:
            r8 = r14
            goto L_0x00ac
        L_0x00a6:
            java.lang.String r2 = "getVideoParams: failed to resize to thumbnail"
            udd.s(r0, r2, r1)
            goto L_0x00a4
        L_0x00ac:
            if (r15 == 0) goto L_0x00b0
        L_0x00ae:
            r11 = r15
            goto L_0x00b6
        L_0x00b0:
            android.graphics.Point r15 = new android.graphics.Point
            r15.<init>(r5, r5)
            goto L_0x00ae
        L_0x00b6:
            hi5 r14 = new hi5
            r7 = r14
            r7.<init>(r8, r9, r11, r12, r13)
            return r14
        L_0x00bd:
            A0(r4)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x87.V(android.content.Context, android.net.Uri):hi5");
    }

    public static Point W(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt == 90 || parseInt == 270) {
                String str = extractMetadata2;
                extractMetadata2 = extractMetadata;
                extractMetadata = str;
            }
            return new Point(Integer.parseInt(extractMetadata), Integer.parseInt(extractMetadata2));
        } catch (Throwable th) {
            udd.s("x87", "getVideoSize: failed", th);
            return new Point(0, 0);
        }
    }

    public static void X(hc7 hc7, int i, int i2, Intent intent) {
        String str = (String) hc7.c().h.get(i);
        if (str != null) {
            for (f8 f : R(hc7)) {
                rr3 f2 = f.f(str);
                if (f2 != null) {
                    f2.onActivityResult(i, i2, intent);
                }
            }
        }
    }

    public static void Y(hc7 hc7, Context context) {
        if (context instanceof Activity) {
            hc7.c().b = (Activity) context;
        }
        hc7.c().d = false;
        if (!hc7.c().e) {
            hc7.c().e = true;
            int size = hc7.c().i.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    hma hma = (hma) hc7.c().i.remove(size);
                    hc7.j(hma.a, hma.b, hma.c);
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            for (f8 u : R(hc7)) {
                u.u();
            }
        }
    }

    public static void Z(hc7 hc7, Bundle bundle) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        if (bundle != null) {
            gc7 c2 = hc7.c();
            e0e parcelable = bundle.getParcelable("LifecycleHandler.permissionRequests");
            if (parcelable == null || (sparseArray = parcelable.a) == null) {
                sparseArray = new SparseArray();
            }
            c2.g = sparseArray;
            gc7 c3 = hc7.c();
            e0e parcelable2 = bundle.getParcelable("LifecycleHandler.activityRequests");
            if (parcelable2 == null || (sparseArray2 = parcelable2.a) == null) {
                sparseArray2 = new SparseArray();
            }
            c3.h = sparseArray2;
            gc7 c4 = hc7.c();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("LifecycleHandler.pendingPermissionRequests");
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList();
            }
            c4.i = parcelableArrayList;
        }
    }

    public static Drawable a(Context context, int i, float f, boolean z) {
        return z ? new oo0(context, i, f, true, false) : new ColorDrawable(i);
    }

    public static void a0(hc7 hc7) {
        Activity activity = hc7.c().b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(hc7);
            ic7.a.remove(activity);
            E(hc7, false);
            hc7.c().b = null;
        }
        hc7.c().j.clear();
    }

    public static final az1 b(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? new FrameLayout(context) : new FrameLayout(context, (AttributeSet) null, 0);
    }

    public static boolean b0(hc7 hc7, MenuItem menuItem, s16 s16) {
        List R = R(hc7);
        if (!R.isEmpty()) {
            Iterator it = R.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((f8) it.next()).w(menuItem)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return ((Boolean) s16.invoke()).booleanValue();
    }

    public static n3e c() {
        return new h37((g37) null);
    }

    public static void c0(hc7 hc7, int i, String[] strArr, int[] iArr) {
        String str = (String) hc7.c().g.get(i);
        if (str != null) {
            for (f8 f : R(hc7)) {
                rr3 f2 = f.f(str);
                if (f2 != null) {
                    f2.requestPermissionsResult(i, strArr, iArr);
                }
            }
        }
    }

    public static x66 d(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("command", (Object) str);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            return new x66(jSONObject2);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static void d0(hc7 hc7, Bundle bundle) {
        bundle.putParcelable("LifecycleHandler.permissionRequests", new e0e(hc7.c().g));
        bundle.putParcelable("LifecycleHandler.activityRequests", new e0e(hc7.c().h));
        bundle.putParcelableArrayList("LifecycleHandler.pendingPermissionRequests", hc7.c().i);
    }

    public static void e(ge1 ge1, JSONObject jSONObject, boolean z) {
        jSONObject.put("participantId", ge1.a);
        jSONObject.put("participantType", (Object) rf0.m(ge1.b));
        if (z) {
            jSONObject.put("deviceIdx", ge1.c);
        }
    }

    public static void e0(hc7 hc7, Activity activity, fc7 fc7) {
        hc7.c().b = activity;
        if (!hc7.c().c) {
            hc7.c().c = true;
            activity.getApplication().registerActivityLifecycleCallbacks(hc7);
            ic7.a.put(activity, fc7);
        }
    }

    public static boolean f(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    public static void f0(hc7 hc7, String str, String[] strArr, int i) {
        if (hc7.c().e) {
            hc7.c().g.put(i, str);
            hc7.requestPermissions(strArr, i);
            return;
        }
        hc7.c().i.add(new hma(str, strArr, i));
    }

    public static float[] g(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        oyb.c("Expecting 4 plane parameters", fArr2.length == 4);
        float f = fArr[0];
        float f2 = fArr3[0];
        float f3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr2[1];
        float f7 = fArr[2];
        float f8 = fArr3[2];
        float f9 = fArr2[2];
        float f10 = ((f7 - f8) * f9) + ((f4 - f5) * f6) + ((f - f2) * f3);
        float f11 = fArr4[0] - f2;
        float f12 = fArr4[1] - f5;
        float f13 = fArr4[2] - f8;
        float f14 = f10 / ((f9 * f13) + ((f6 * f12) + (f3 * f11)));
        return new float[]{(f11 * f14) + f2, (f12 * f14) + f5, (f13 * f14) + f8, 1.0f};
    }

    public static final void g0(hu3 hu3, Throwable th) {
        if (!(th instanceof CancellationException)) {
            try {
                xs7.F(th);
            } catch (Throwable th2) {
                jjd.d(th, th2);
                gwf.x(hu3, th);
            }
        }
    }

    public static gjd h(List list, int i, int i2) {
        boolean z = true;
        oyb.c("inputWidth must be positive", i > 0);
        if (i2 <= 0) {
            z = false;
        }
        oyb.c("inputHeight must be positive", z);
        gjd gjd = new gjd(i, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            gjd = ((uw7) list.get(i3)).d(gjd.a, gjd.b);
        }
        return gjd;
    }

    public static void h0(hc7 hc7, String str) {
        int size = hc7.c().h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (str.equals(hc7.c().h.get(hc7.c().h.keyAt(size)))) {
                hc7.c().h.removeAt(size);
            }
        }
    }

    public static x66 i(Collection collection, Boolean bool, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ge1 ge1 = (ge1) it.next();
            jSONArray.put((Object) String.valueOf(rf0.a(ge1.b)) + ge1.a);
        }
        jSONObject.put("participantIds", (Object) jSONArray);
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, (Object) jSONObject2.toString());
        }
        return d(jSONObject, "add-participant");
    }

    public static final boolean i0(rr3 rr3) {
        return rr3.viewState != null;
    }

    public static x66 j(Set set, Set set2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jSONObject.put(((fx0) it.next()).name(), true);
                }
            }
            if (set2 != null) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    jSONObject.put(((fx0) it2.next()).name(), false);
                }
            }
            x66 d = d((JSONObject) null, "change-options");
            d.a.put("options", (Object) jSONObject);
            return d;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean j0(float[] fArr, float[] fArr2) {
        oyb.c("Expecting 4 plane parameters", fArr2.length == 4);
        return (fArr2[2] * fArr[2]) + ((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) <= fArr2[3];
    }

    public static x66 k(Map map, ge1 ge1) {
        try {
            x66 d = d((JSONObject) null, "change-participant-state");
            JSONObject jSONObject = d.a;
            jSONObject.put("participantState", (Object) new JSONObject().put("state", (Object) new JSONObject((Map<?, ?>) map)));
            if (ge1 != null) {
                jSONObject.put("participantId", (Object) ge1.c());
            }
            return d;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static final List k0(boa boa) {
        Object obj;
        List list = boa.f;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Long) obj).longValue() > 0) {
                break;
            }
        }
        if (obj == null) {
            List<String> list2 = boa.e;
            list = new ArrayList(q23.H(list2, 10));
            for (String str : list2) {
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                Long H = o0e.H(sb.toString());
                list.add(Long.valueOf(H != null ? H.longValue() : 0));
            }
        }
        return list;
    }

    public static x66 l(ge1 ge1, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("participantId", ge1.a);
            jSONObject2.put("participantType", (Object) rf0.m(ge1.b));
            jSONObject2.put("deviceIdx", ge1.c);
            jSONObject2.put("data", (Object) jSONObject);
            return d(jSONObject2, "custom-data");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static void l0(hc7 hc7, Activity activity) {
        if (ic7.a(activity, hc7.c().a) == hc7) {
            hc7.c().b = activity;
            for (f8 u : o23.s0(hc7.c().j.values())) {
                u.u();
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0045=Splitter:B:19:0x0045, B:31:0x0075=Splitter:B:31:0x0075} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.y41 m(org.json.JSONObject r11) {
        /*
            java.lang.String r0 = "decorativeExternalParticipantId"
            r1 = 0
            if (r11 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "deviceIdx"
            r3 = 0
            int r2 = r11.optInt(r2, r3)     // Catch:{ JSONException -> 0x007b }
            boolean r3 = r11.has(r0)     // Catch:{ JSONException -> 0x007b }
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = "vk"
            java.lang.String r8 = "anonym"
            java.lang.String r9 = "type"
            java.lang.String r10 = "id"
            if (r3 == 0) goto L_0x004c
            org.json.JSONObject r11 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x007b }
            if (r11 != 0) goto L_0x0025
            goto L_0x004b
        L_0x0025:
            java.lang.String r0 = r11.getString(r10)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.getString(r9)     // Catch:{ JSONException -> 0x007b }
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.toLowerCase(r3)     // Catch:{ JSONException -> 0x007b }
            r11.getClass()     // Catch:{ JSONException -> 0x007b }
            boolean r3 = r11.equals(r8)
            if (r3 != 0) goto L_0x0045
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0044
            r4 = r6
            goto L_0x0045
        L_0x0044:
            r4 = r5
        L_0x0045:
            y41 r11 = new y41     // Catch:{ JSONException -> 0x007b }
            r11.<init>(r0, r4, r2)     // Catch:{ JSONException -> 0x007b }
            r1 = r11
        L_0x004b:
            return r1
        L_0x004c:
            java.lang.String r0 = "externalId"
            org.json.JSONObject r11 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x007b }
            if (r11 != 0) goto L_0x0055
            goto L_0x007b
        L_0x0055:
            java.lang.String r0 = r11.getString(r10)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.getString(r9)     // Catch:{ JSONException -> 0x007b }
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.toLowerCase(r3)     // Catch:{ JSONException -> 0x007b }
            r11.getClass()     // Catch:{ JSONException -> 0x007b }
            boolean r3 = r11.equals(r8)
            if (r3 != 0) goto L_0x0075
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0074
            r4 = r6
            goto L_0x0075
        L_0x0074:
            r4 = r5
        L_0x0075:
            y41 r11 = new y41     // Catch:{ JSONException -> 0x007b }
            r11.<init>(r0, r4, r2)     // Catch:{ JSONException -> 0x007b }
            r1 = r11
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x87.m(org.json.JSONObject):y41");
    }

    public static void m0(hc7 hc7, Activity activity) {
        if (hc7.c().b == activity) {
            for (f8 q : R(hc7)) {
                q.q(activity);
            }
        }
    }

    public static ud n(int i, int i2, int i3, int i4) {
        return new ud(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static void n0(hc7 hc7, Activity activity) {
        if (hc7.c().b == activity) {
            for (f8 r : R(hc7)) {
                r.r(activity);
            }
        }
    }

    public static JSONObject o(ge1 ge1, SessionDescription sessionDescription) {
        JSONObject jSONObject = new JSONObject();
        e(ge1, jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) sessionDescription.type.canonicalForm());
        jSONObject2.put("sdp", (Object) sessionDescription.description);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("sdp", (Object) jSONObject2);
        jSONObject.put("data", (Object) jSONObject3);
        return jSONObject;
    }

    public static void o0(hc7 hc7, Activity activity, Bundle bundle) {
        if (hc7.c().b == activity) {
            y0(hc7);
            for (f8 f8Var : R(hc7)) {
                Bundle bundle2 = new Bundle();
                f8Var.O(bundle2);
                StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
                ViewGroup viewGroup = f8Var.i;
                sb.append(viewGroup != null ? viewGroup.getId() : 0);
                bundle.putBundle(sb.toString(), bundle2);
            }
        }
    }

    public static k88 p(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("UNMUTE")) {
            return k88.a;
        }
        if (str.equals("MUTE")) {
            return k88.b;
        }
        if (str.equals("MUTE_PERMANENT")) {
            return k88.c;
        }
        return null;
    }

    public static void p0(hc7 hc7, Activity activity) {
        if (hc7.c().b == activity) {
            hc7.c().f = false;
            for (f8 s : R(hc7)) {
                s.s(activity);
            }
        }
    }

    public static HashMap q(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject("muteStates");
        if (optJSONObject != null) {
            hashMap.put(j88.a, p(optJSONObject.optString("AUDIO")));
            hashMap.put(j88.b, p(optJSONObject.optString("VIDEO")));
            hashMap.put(j88.c, p(optJSONObject.optString("SCREEN_SHARING")));
            hashMap.put(j88.o, p(optJSONObject.optString("MOVIE_SHARING")));
        }
        return hashMap;
    }

    public static void q0(hc7 hc7, Activity activity) {
        if (hc7.c().b == activity) {
            y0(hc7);
            for (f8 t : R(hc7)) {
                t.t(activity);
            }
        }
    }

    public static cc9 r(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mediaSettings");
        if (optJSONObject == null) {
            return null;
        }
        return new cc9(optJSONObject.optBoolean("isAudioEnabled", false), optJSONObject.optBoolean("isVideoEnabled", false), optJSONObject.optBoolean("isScreenSharingEnabled", false), optJSONObject.optBoolean("isAnimojiEnabled", false));
    }

    public static void r0(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static JSONObject s(yfd yfd, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isVideoEnabled", yfd.a);
            jSONObject.put("isAudioEnabled", yfd.b);
            jSONObject.put("isScreenSharingEnabled", yfd.c);
            jSONObject.put("isAnimojiEnabled", yfd.e);
            if (z) {
                jSONObject.put("isFastScreenSharingEnabled", yfd.d);
            }
            if (z2) {
                jSONObject.put("isAudioSharingEnabled", yfd.f);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static final Boolean s0(String str, Bundle bundle) {
        String string = bundle.getString(str, (String) null);
        if (string != null) {
            return Boolean.valueOf(Boolean.parseBoolean(string));
        }
        return null;
    }

    public static wia t(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(ApiProtocol.PARAM_PEER_ID);
        if (optJSONObject != null) {
            return new wia(optJSONObject.getString(ApiProtocol.KEY_ID), optJSONObject.optString("type", "WEB_SOCKET"));
        }
        return null;
    }

    public static final Long t0(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return Long.valueOf(Long.parseLong(string));
        }
        return null;
    }

    public static x66 u(ge1 ge1, boolean z) {
        try {
            x66 d = d((JSONObject) null, "promote-participant");
            JSONObject jSONObject = d.a;
            jSONObject.put("demote", !z);
            jSONObject.put("participantId", (Object) ge1.c());
            return d;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static final long[] u0(String str, Bundle bundle) {
        return bundle.containsKey(str) ? F0(str, bundle) : new long[0];
    }

    public static x66 v(ge1 ge1, Boolean bool, boolean z) {
        JSONObject jSONObject = new JSONObject();
        e(ge1, jSONObject, false);
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, (Object) jSONObject2.toString());
        }
        return d(jSONObject, "add-participant");
    }

    public static HashSet v0(JSONObject jSONObject) {
        JSONArray optJSONArray;
        ce6 ce6;
        if (!"hungup".equals(jSONObject.optString("notification")) || (optJSONArray = jSONObject.optJSONArray("errors")) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < optJSONArray.length(); i++) {
            int optInt = optJSONArray.optInt(i, Integer.MIN_VALUE);
            if (optInt != Integer.MIN_VALUE) {
                ce6[] values = ce6.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        ce6 = null;
                        break;
                    }
                    ce6 = values[i2];
                    ce6.getClass();
                    if (optInt == 1) {
                        break;
                    }
                    i2++;
                }
                if (ce6 != null) {
                    hashSet.add(ce6);
                }
            }
        }
        return hashSet;
    }

    public static x66 w(int i, Integer num, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, boolean z9) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("maxH264Decoders", i);
        if (num != null) {
            jSONObject.put("estimatedPerformanceIndex", (Object) num);
        }
        jSONObject.put("producerNotificationDataChannelVersion", 7);
        jSONObject.put("producerCommandDataChannelVersion", i2);
        jSONObject.put("audioMix", true);
        jSONObject.put("consumerUpdate", z);
        jSONObject.put("onDemandTracks", z2);
        jSONObject.put("singleSession", true);
        jSONObject.put("unifiedPlan", true);
        jSONObject.put("fastScreenShare", true);
        if (z3) {
            jSONObject.put("producerScreenDataChannelVersion", 1);
        }
        if (z4) {
            jSONObject.put("consumerScreenDataChannelVersion", 1);
        }
        if (z6) {
            jSONObject.put("animojiDataChannelVersion", 2);
        }
        if (z7) {
            jSONObject.put("asrDataChannelVersion", 1);
        }
        if (z8) {
            jSONObject.put("consumerFastScreenShare", true);
        }
        jSONObject.put("consumerFastScreenShareQualityOnDemand", true);
        if (z9) {
            jSONObject.put("audioShare", true);
        }
        jSONObject.put("red", z5);
        if (i3 > 0) {
            jSONObject.put("videoTracksCount", i3);
            jSONObject.put("csrcAccessible", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("capabilities", (Object) jSONObject);
        return d(jSONObject2, "allocate-consumer");
    }

    public static xm1 w0(String str) {
        String[] split = str.split(":");
        w8f w8f = w8f.a;
        w8f w8f2 = w8f;
        ge1 ge1 = null;
        w69 w69 = null;
        for (String str2 : split) {
            if (str2 != null) {
                if (str2.startsWith("u") || str2.startsWith("g")) {
                    ge1 = ge1.b(str);
                }
                if (str2.startsWith("s")) {
                    char c2 = 65535;
                    switch (str2.hashCode()) {
                        case -1579214262:
                            if (str2.equals("sANIMOJI")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -929065347:
                            if (str2.equals("sMOVIE")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 964253016:
                            if (str2.equals("sCAMERA")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1424315039:
                            if (str2.equals("sSCREEN")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1440014771:
                            if (str2.equals("sSTREAM")) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            w8f2 = w8f.c;
                            break;
                        case 1:
                            w8f2 = w8f.o;
                            break;
                        case 2:
                            w8f2 = w8f;
                            break;
                        case 3:
                            w8f2 = w8f.b;
                            break;
                        case 4:
                            w8f2 = w8f.X;
                            break;
                        default:
                            throw new RuntimeException("Unknown video track type");
                    }
                }
                if (str2.startsWith("m")) {
                    w69 = new w69(Long.parseLong(str2.substring(1)));
                }
            }
        }
        if (ge1 == null) {
            return null;
        }
        it4 it4 = new it4();
        it4.a = ge1;
        it4.b = w8f2;
        it4.c = w69;
        return it4.a();
    }

    public static x66 x(ge1 ge1, List list, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) ge1.c());
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((Object) (je1) it.next());
        }
        jSONObject.put("roles", (Object) jSONArray);
        jSONObject.put("revoke", z);
        return d(jSONObject, "grant-roles");
    }

    public static ge1 x0(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("video-") || str.length() == 6) {
            return null;
        }
        return ge1.b(str.substring(6));
    }

    public static x66 y(ge1 ge1, w2d w2d, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) ge1.c());
        if (w2d instanceof v2d) {
            jSONObject.put("roomId", ((v2d) w2d).a);
        }
        jSONObject.put("unpin", !z);
        return d(jSONObject, "pin-participant");
    }

    public static void y0(hc7 hc7) {
        if (!hc7.c().f) {
            hc7.c().f = true;
            for (f8 F : R(hc7)) {
                F.F();
            }
        }
    }

    public static x66 z(ge1 ge1, IceCandidate iceCandidate) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("candidate", (Object) iceCandidate.sdp.replaceAll("(raddr|rport)\\s.+?\\s", ""));
        jSONObject.put("sdpMid", (Object) iceCandidate.sdpMid);
        jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidate", (Object) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        e(ge1, jSONObject3, true);
        jSONObject3.put("data", (Object) jSONObject2);
        return d(jSONObject3, "transmit-data");
    }

    public static void z0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (c) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                uncaughtExceptionHandler = new ly1(uncaughtExceptionHandler, defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }
}
