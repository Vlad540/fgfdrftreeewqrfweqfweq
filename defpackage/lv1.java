package defpackage;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.view.ContentInfo;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.FrameLayout;
import androidx.camera.core.ImageCaptureException;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* renamed from: lv1  reason: default package */
public final class lv1 implements ew6, j39, e01, ma, q55, of3, wp3, dj7, gl8, iyc, p0c {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ lv1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static ie1 h(ge1 ge1, JSONObject jSONObject) {
        JSONObject optJSONObject;
        HashMap hashMap;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("participantState");
        ie1 ie1 = new ie1(ge1);
        HashMap hashMap2 = ie1.a;
        if (optJSONObject2 == null) {
            hashMap2.put("hand", new he1("0", 0));
        } else {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("state");
            if (optJSONObject3 == null || (optJSONObject = optJSONObject2.optJSONObject("stateUpdateTs")) == null) {
                return null;
            }
            Iterator<String> keys = optJSONObject3.keys();
            if (keys.hasNext()) {
                hashMap = new HashMap(optJSONObject3.length());
                do {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject3.optString(next));
                } while (keys.hasNext());
            } else {
                hashMap = iw4.a;
            }
            Iterator<String> keys2 = optJSONObject.keys();
            if (keys2.hasNext()) {
                do {
                    String next2 = keys2.next();
                    String str = (String) hashMap.get(next2);
                    if (str != null) {
                        hashMap2.put(next2, new he1(str, optJSONObject.optLong(next2)));
                    }
                } while (keys2.hasNext());
            }
        }
        return ie1;
    }

    public static lv1 q(ia3 ia3) {
        lv1 lv1 = new lv1(8);
        ia3.b(new j9(lv1, 15, ia3));
        return lv1;
    }

    public void A(boolean z) {
        k77[] k77Arr = CallBottomPanelWidget.w0;
        taf.o(((CallBottomPanelWidget) this.b).m0().c.Q0, new rh1(z));
    }

    public void B() {
        rr3 rr3 = (rr3) this.b;
        if (!rr3.isDetachFrozen) {
            rr3.detach(rr3.view, false, false);
        }
    }

    public List C(JSONObject jSONObject) {
        try {
            return n(jSONObject.getJSONArray("participants"));
        } catch (JSONException e) {
            ((xwb) this.b).logException("ParticipantStateParser", "Can't parse state from participantList " + jSONObject, e);
            return hw4.a;
        }
    }

    public ie1 D(JSONObject jSONObject) {
        try {
            ge1 J = x87.J(jSONObject);
            if (J.a == 0) {
                J = x87.K(jSONObject);
            }
            return h(J, jSONObject);
        } catch (JSONException e) {
            ((xwb) this.b).logException("ParticipantStateParser", "Can't parse state from " + jSONObject, e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [lja, java.lang.Object] */
    public void E(gj7 gj7, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        nja nja = (nja) gj7;
        uy3 uy3 = (uy3) this.b;
        uy3.getClass();
        long j5 = nja.a;
        Uri uri = nja.o.c;
        yi7 yi7 = new yi7(j4);
        uy3.m.getClass();
        uy3.q.z(yi7, nja.c, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        ey3 ey3 = (ey3) nja.Y;
        ey3 ey32 = uy3.H;
        int size = ey32 == null ? 0 : ey32.m.size();
        long j6 = ey3.b(0).b;
        int i = 0;
        while (i < size && uy3.H.b(i).b < j6) {
            i++;
        }
        if (ey3.d) {
            if (size - i > ey3.m.size()) {
                ez3.j0("Loaded out of sync manifest");
            } else {
                long j7 = uy3.N;
                if (j7 == -9223372036854775807L || ey3.h * 1000 > j7) {
                    uy3.M = 0;
                } else {
                    ez3.j0("Loaded stale dynamic manifest: " + ey3.h + ", " + uy3.N);
                }
            }
            int i2 = uy3.M;
            uy3.M = i2 + 1;
            if (i2 < uy3.m.k(nja.c)) {
                uy3.D.postDelayed(uy3.v, (long) Math.min((uy3.M - 1) * 1000, 5000));
                return;
            } else {
                uy3.C = new DashManifestStaleException();
                return;
            }
        }
        uy3.H = ey3;
        uy3.I = ey3.d & uy3.I;
        uy3.J = j3 - j4;
        uy3.K = j3;
        uy3.O += i;
        synchronized (uy3.t) {
            try {
                if (nja.b.a == uy3.F) {
                    Uri uri2 = uy3.H.k;
                    if (uri2 == null) {
                        uri2 = nja.o.c;
                    }
                    uy3.F = uri2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ey3 ey33 = uy3.H;
        if (!ey33.d || uy3.L != -9223372036854775807L) {
            uy3.y(true);
            return;
        }
        k64 k64 = ey33.i;
        if (k64 != null) {
            String str = k64.b;
            if (oze.a(str, "urn:mpeg:dash:utc:direct:2014") || oze.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    uy3.L = oze.V(k64.c) - uy3.K;
                    uy3.y(true);
                } catch (ParserException e) {
                    uy3.x(e);
                }
            } else if (oze.a(str, "urn:mpeg:dash:utc:http-iso:2014") || oze.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                nja nja2 = new nja(uy3.z, Uri.parse(k64.c), 5, new Object());
                uy3.q.F(new yi7(nja2.a, nja2.b, uy3.A.F(nja2, new e3((Object) uy3), 1)), nja2.c, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
            } else if (oze.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || oze.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                nja nja3 = new nja(uy3.z, Uri.parse(k64.c), 5, new y76(9));
                uy3.q.F(new yi7(nja3.a, nja3.b, uy3.A.F(nja3, new e3((Object) uy3), 1)), nja3.c, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
            } else if (oze.a(str, "urn:mpeg:dash:utc:ntp:2014") || oze.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                uy3.v();
            } else {
                uy3.x(new IOException("Unsupported UTC timing scheme"));
            }
        } else {
            uy3.v();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(b7c r8, ms r9, ms r10) {
        /*
            r7 = this;
            java.lang.Object r7 = r7.b
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r7.getClass()
            r0 = 0
            r8.v(r0)
            k6c r0 = r7.e1
            r1 = r0
            w84 r1 = (w84) r1
            if (r9 == 0) goto L_0x002b
            r1.getClass()
            int r3 = r9.b
            int r5 = r10.b
            if (r3 != r5) goto L_0x0021
            int r0 = r9.c
            int r2 = r10.c
            if (r0 == r2) goto L_0x002b
        L_0x0021:
            int r4 = r9.c
            int r6 = r10.c
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L_0x003a
        L_0x002b:
            r1.m(r8)
            android.view.View r9 = r8.a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r1.i
            r9.add(r8)
            r8 = 1
        L_0x003a:
            if (r8 == 0) goto L_0x003f
            r7.i0()
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv1.F(b7c, ms, ms):void");
    }

    public void G(b7c b7c, ms msVar, ms msVar2) {
        boolean z;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.c.k(b7c);
        recyclerView.i(b7c);
        b7c.v(false);
        w84 w84 = recyclerView.e1;
        w84.getClass();
        int i = msVar.b;
        int i2 = msVar.c;
        View view = b7c.a;
        int left = msVar2 == null ? view.getLeft() : msVar2.b;
        int top = msVar2 == null ? view.getTop() : msVar2.c;
        if (b7c.p() || (i == left && i2 == top)) {
            w84.m(b7c);
            w84.h.add(b7c);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = w84.g(b7c, i, i2, left, top);
        }
        if (z) {
            recyclerView.i0();
        }
    }

    public void H() {
        ((InputContentInfo) this.b).requestPermission();
    }

    public Object T0(Object obj, k77 k77) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + k77.getName() + " should be initialized before get.");
    }

    public sz0 U(gj7 gj7, long j, long j2, IOException iOException, int i) {
        long j3;
        nja nja = (nja) gj7;
        uy3 uy3 = (uy3) this.b;
        uy3.getClass();
        long j4 = nja.a;
        Uri uri = nja.o.c;
        yi7 yi7 = new yi7(j2);
        uy3.m.getClass();
        if (!(iOException instanceof ParserException) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof HttpDataSource.CleartextNotPermittedException) && !(iOException instanceof Loader.UnexpectedLoaderException)) {
            int i2 = DataSourceException.b;
            Throwable th = iOException;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        sz0 sz0 = j3 == -9223372036854775807L ? ul7.Y : new sz0(j3, 0, 5, false);
        uy3.q.C(yi7, nja.c, iOException, !sz0.a());
        return sz0;
    }

    public ClipData a() {
        return tp3.c((ContentInfo) this.b);
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 9:
                List list = (List) obj;
                b92 b92 = (b92) this.b;
                g37 g37 = b92.M0;
                if (g37 != null) {
                    g37.cancel((CancellationException) null);
                }
                b92.N0.set(true);
                p82 p82 = new p82(list, b92, (Continuation) null);
                b92.M0 = xs7.E(b92.Z, (ju3) b92.b.getValue(), (ru3) null, p82, 2);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                udd.s(((nd7) this.b).Z, "failed to store sticker set", (Throwable) obj);
                return;
            default:
                udd.s(((r0d) this.b).X, "onServiceNotAvailable", (Throwable) obj);
                return;
        }
    }

    public InputStream b(String str) {
        try {
            return ((AssetManager) this.b).open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }

    public Uri d() {
        return tp3.h((ContentInfo) this.b);
    }

    public void e(le1 le1, boolean z) {
        k77[] k77Arr = CallOpponentsListWidget.L0;
        ((vx0) ((CallOpponentsListWidget) this.b).p0().w0.getValue()).c(le1, z);
    }

    public hq2 f() {
        List<g49> list = (List) ((AtomicReference) ((h49) ((s5a) this.b).b.getValue()).c).get();
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (g49 g49 : list) {
            String str = g49.r;
            Uri parse = str != null ? Uri.parse(str) : null;
            long j = g49.p;
            arrayList.add(new pi2(g49.a, parse, g49.b, g49.c, g49.t, g49.f, (CharSequence) null, g49.g, false, g49.u, g49.h, (oi2) oi2.Z.get(g49.i), g49.j, g49.k, g49.l, g49.m, g49.n, (Long) null, j, g49.q, true, false));
        }
        return new hq2(arrayList, true);
    }

    public void g() {
        oc1 oc1 = oc1.c;
        oc1.getClass();
        oc1.P1().b(":call-admin-waiting-room", (Bundle) null);
    }

    public Bundle getExtras() {
        return tp3.i((ContentInfo) this.b);
    }

    public int getFlags() {
        return tp3.b((ContentInfo) this.b);
    }

    public ContentInfo i() {
        return (ContentInfo) this.b;
    }

    public void j(kyc kyc) {
        pj6 pj6 = (pj6) kyc;
        ci6 ci6 = (ci6) this.b;
        ci6.H0.j(ci6);
    }

    public void k(Object obj) {
        ov0 ov0 = (ov0) obj;
        ((kk9) this.b).getClass();
    }

    public int l() {
        return tp3.x((ContentInfo) this.b);
    }

    public void m(Object obj) {
        ov0 ov0 = (ov0) obj;
        ((kk9) this.b).getClass();
    }

    public List n(JSONArray jSONArray) {
        ie1 ie1;
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ie1 = h(ge1.a(jSONObject.getString(ApiProtocol.KEY_ID)), jSONObject);
            } catch (JSONException e) {
                ((xwb) this.b).logException("ParticipantStateParser", "Can't parse one state with index=" + i + " from participantList=" + jSONArray, e);
                ie1 = null;
            }
            arrayList.add(ie1);
        }
        return o23.T(arrayList);
    }

    public ob9 o() {
        throw null;
    }

    public void o1(Object obj, k77 k77, Object obj2) {
        this.b = obj2;
    }

    public mv4 p() {
        return new mv4(7, hga.a((fc9) this.b));
    }

    public void s() {
        rr3 rr3 = (rr3) this.b;
        rr3.viewIsAttached = true;
        rr3.viewWasDetached = false;
        rr3.attach(rr3.view);
    }

    public void t() {
        k77[] k77Arr = CallBottomPanelWidget.w0;
        u01 m0 = ((CallBottomPanelWidget) this.b).m0();
        po1 r = m0.r();
        doc doc = r.i;
        doc.getClass();
        aoc aoc = ((eoc) doc.Z.getValue()).b;
        boolean f = hhd.f(aoc != null ? aoc.c : null, r.d.c().a.getId());
        aj1 aj1 = m0.c;
        if (f) {
            taf.o(aj1.Q0, hh1.C);
        } else {
            taf.o(aj1.Q0, ch1.C);
        }
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            case 22:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            case 24:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (this.b != null) {
                    str = "value=" + this.b;
                } else {
                    str = "value not initialized yet";
                }
                return me4.l(sb, str, ')');
            default:
                return super.toString();
        }
    }

    public void u(Object obj) {
        ov0 ov0 = (ov0) obj;
        ((kk9) this.b).getClass();
    }

    public void v(boolean z) {
        rr3 rr3 = (rr3) this.b;
        rr3.viewIsAttached = false;
        rr3.viewWasDetached = true;
        if (!rr3.isDetachFrozen) {
            rr3.detach(rr3.view, false, z);
        }
    }

    public void w(View view) {
        k77[] k77Arr = CallBottomPanelWidget.w0;
        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) this.b;
        if (((aj1) callBottomPanelWidget.c.getValue()).u()) {
            if (callBottomPanelWidget.m0().t()) {
                mq3 b2 = pfa.a(1).d().j(view).b();
                ArrayList q = callBottomPanelWidget.m0().q();
                ArrayList arrayList = new ArrayList(q23.H(q, 10));
                Iterator it = q.iterator();
                while (it.hasNext()) {
                    l31 l31 = (l31) it.next();
                    arrayList.add(new pq3(l31.getId(), l31.getTitle(), Integer.valueOf(j9a.L), Integer.valueOf(l31.getIcon()), Integer.valueOf(j9a.G)));
                }
                nq3 build = b2.e(arrayList).build();
                callBottomPanelWidget.Y = build;
                build.q(callBottomPanelWidget);
            }
        } else if (callBottomPanelWidget.m0().t()) {
            callBottomPanelWidget.l0().e(callBottomPanelWidget.m0().q());
        }
    }

    public void x(gj7 gj7, long j, long j2, boolean z) {
        ((uy3) this.b).w((nja) gj7, j, j2);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [wt1, java.lang.Exception] */
    public void y(ImageCaptureException imageCaptureException) {
        udd.q(lv1.class.getName(), "capture image with error");
        gvf gvf = ((CameraxCameraApiView) this.b).w0;
        if (gvf != null) {
            gvf.i(new Exception(imageCaptureException));
        }
    }

    public void z() {
        ci6 ci6 = (ci6) this.b;
        int i = ci6.I0 - 1;
        ci6.I0 = i;
        if (i <= 0) {
            int i2 = 0;
            for (pj6 pj6 : ci6.K0) {
                pj6.d();
                i2 += pj6.X0.a;
            }
            uoe[] uoeArr = new uoe[i2];
            int i3 = 0;
            for (pj6 pj62 : ci6.K0) {
                pj62.d();
                int i4 = pj62.X0.a;
                int i5 = 0;
                while (i5 < i4) {
                    pj62.d();
                    uoeArr[i3] = pj62.X0.a(i5);
                    i5++;
                    i3++;
                }
            }
            ci6.J0 = new woe(uoeArr);
            ci6.H0.c(ci6);
        }
    }

    public /* synthetic */ lv1(int i, boolean z) {
        this.a = i;
    }

    public lv1(Context context) {
        this.a = 16;
        on4 oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setId(gaa.a);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        y66 hierarchy = oneMeDraweeView.getHierarchy();
        int i = faa.a;
        jlc jlc = jlc.h;
        hierarchy.i(hierarchy.b.getDrawable(i), 1);
        glc f = hierarchy.f(1);
        if (!at7.o(f.X, jlc)) {
            f.X = jlc;
            f.Y = null;
            f.p();
            f.invalidateSelf();
        }
        this.b = oneMeDraweeView;
    }

    public lv1(zl3 zl3) {
        this.a = 10;
        this.b = new nfc(10, zl3);
    }

    public lv1(int i) {
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
                this.b = new q16(5, 1, (byte) 0);
                return;
            case 28:
                this.b = new LruCache(10);
                return;
            default:
                this.b = fc9.c();
                return;
        }
    }

    public lv1(Object obj) {
        this.a = 19;
        this.b = (InputContentInfo) obj;
    }

    public lv1(ContentInfo contentInfo) {
        this.a = 11;
        contentInfo.getClass();
        this.b = p20.m(contentInfo);
    }
}
