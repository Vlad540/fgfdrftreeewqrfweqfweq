package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.work.WorkRequest;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.arch.Widget;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: gvf  reason: default package */
public final class gvf implements uw9, ta9, of3, ot4, b9f, ys, lwa, ju1, Provider, htd {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ gvf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static Object a(String str) {
        ClassLoader classLoader = gvf.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get((Object) null);
    }

    public static void e(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public static gvf f() {
        boolean z;
        synchronized (bg9.class) {
            z = bg9.a;
        }
        if (z || bg9.class.getClassLoader() == ClassLoader.getSystemClassLoader()) {
            try {
                synchronized (gvf.class) {
                    h("JNI");
                    throw null;
                }
            } catch (Throwable unused) {
                g();
                throw null;
            }
        } else {
            g();
            throw null;
        }
    }

    public static gvf g() {
        if (!pze.b) {
            synchronized (gvf.class) {
                h("JavaSafe");
                throw null;
            }
        }
        try {
            synchronized (gvf.class) {
                h("JavaUnsafe");
                throw null;
            }
        } catch (Throwable unused) {
            synchronized (gvf.class) {
                h("JavaSafe");
                throw null;
            }
        }
    }

    public static void h(String str) {
        try {
            new gvf(str);
            throw null;
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public void G(Surface surface) {
        String str = ((GifViewerWidget) this.b).a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Media viewer. Video viewer, set surface " + surface, (Throwable) null);
        }
        k7f o0 = ((GifViewerWidget) this.b).o0();
        if (o0 != null) {
            o0.L0(surface);
        }
    }

    public void H() {
        v40.c((v40) this.b);
    }

    public void I() {
        v40.c((v40) this.b);
    }

    public void K() {
        v40.c((v40) this.b);
    }

    public nsf M(View view, nsf nsf) {
        boolean z;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        nsf nsf2 = nsf;
        int d = nsf.d();
        dn dnVar = (dn) this.b;
        dnVar.getClass();
        int d2 = nsf.d();
        ActionBarContextView actionBarContextView = dnVar.K0;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) dnVar.K0.getLayoutParams();
            boolean z3 = true;
            if (dnVar.K0.isShown()) {
                if (dnVar.r1 == null) {
                    dnVar.r1 = new Rect();
                    dnVar.s1 = new Rect();
                }
                Rect rect = dnVar.r1;
                Rect rect2 = dnVar.s1;
                rect.set(nsf.b(), nsf.d(), nsf.c(), nsf.a());
                ncf.a(dnVar.P0, rect, rect2);
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup = dnVar.P0;
                WeakHashMap weakHashMap = eaf.a;
                nsf a2 = u9f.a(viewGroup);
                int b2 = a2 == null ? 0 : a2.b();
                int c = a2 == null ? 0 : a2.c();
                if (marginLayoutParams2.topMargin == i3 && marginLayoutParams2.leftMargin == i4 && marginLayoutParams2.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i3;
                    marginLayoutParams2.leftMargin = i4;
                    marginLayoutParams2.rightMargin = i5;
                    z2 = true;
                }
                Context context = dnVar.z0;
                if (i3 <= 0 || dnVar.R0 != null) {
                    View view2 = dnVar.R0;
                    if (!(view2 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()).height == (i = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == b2 && marginLayoutParams.rightMargin == c))) {
                        marginLayoutParams.height = i;
                        marginLayoutParams.leftMargin = b2;
                        marginLayoutParams.rightMargin = c;
                        dnVar.R0.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view3 = new View(context);
                    dnVar.R0 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c;
                    dnVar.P0.addView(dnVar.R0, -1, layoutParams);
                }
                View view4 = dnVar.R0;
                if (view4 == null) {
                    z3 = false;
                }
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = dnVar.R0;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? hq3.a(context, lmb.abc_decor_view_status_guard_light) : hq3.a(context, lmb.abc_decor_view_status_guard));
                }
                if (!dnVar.W0 && z3) {
                    d2 = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                dnVar.K0.setLayoutParams(marginLayoutParams2);
            }
        }
        View view6 = dnVar.R0;
        if (view6 != null) {
            if (!z) {
                i2 = 8;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b3 = nsf.b();
            int c2 = nsf.c();
            int a3 = nsf.a();
            csf dsf = Build.VERSION.SDK_INT >= 30 ? new dsf(nsf2) : new csf(nsf2);
            dsf.f(qy6.b(b3, d2, c2, a3));
            nsf2 = dsf.b();
        }
        return eaf.f(view, nsf2);
    }

    public int M0() {
        v2f v2f = ((GifViewerWidget) this.b).w0;
        if (v2f != null) {
            return v2f.getHeight();
        }
        return 0;
    }

    public void N() {
        v40.c((v40) this.b);
    }

    public int R() {
        v2f v2f = ((GifViewerWidget) this.b).w0;
        if (v2f != null) {
            return v2f.getWidth();
        }
        return 0;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 7:
                TamErrorException tamErrorException = (Throwable) obj;
                wy1 wy1 = (wy1) this.b;
                udd.s(wy1.Z, "onUploadFailed: failed", tamErrorException);
                jee s = wy1.s();
                long j = wy1.b;
                s.d(j);
                wy1.z();
                wy1.y();
                wy1.t().c(new jh0(j, tamErrorException instanceof TamErrorException ? tamErrorException.a : new uae("internal-error", tamErrorException.toString(), (String) null)));
                return;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                udd.s(((zs8) this.b).getClass().getName(), "fail restore uploads", (Throwable) obj);
                return;
            default:
                Integer num = (Integer) obj;
                udd.p(((h6e) this.b).b, "Connection restored", new Object[0]);
                return;
        }
    }

    public void b() {
        Widget widget = (PipScreen) this.b;
        if (widget.getRouter().n()) {
            im requireActivity = widget.requireActivity();
            Intent intent = new Intent(widget.requireActivity(), widget.requireActivity().getClass());
            intent.setFlags(131072);
            requireActivity.startActivity(intent);
            return;
        }
        widget.requireActivity().finish();
    }

    public void c(a06 a06) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new v93(0, "EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new g5(this, a06, threadPoolExecutor, 27));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = n62.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String d(xo0 r2, uj3 r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0019
            n62 r0 = n62.a
            java.lang.Object r1 = r1.b
            n62 r1 = (n62) r1
            if (r1 == r0) goto L_0x0019
            java.lang.String r1 = r3.A0
            java.lang.String r1 = ehe.c(r1)
            java.lang.String r2 = r2.b
            java.lang.String r3 = " /"
            java.lang.String r1 = me4.i(r1, r3, r2)
            return r1
        L_0x0019:
            java.lang.String r1 = r2.b
            java.lang.String r2 = "/"
            java.lang.String r1 = rf0.h(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvf.d(xo0, uj3):java.lang.String");
    }

    public Object get() {
        eye eye = (eye) ((Provider) this.b).get();
        HashMap hashMap = new HashMap();
        t3b t3b = t3b.a;
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            Long l = 86400000L;
            hashMap.put(t3b, new qa0(Long.valueOf(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).longValue(), l.longValue(), emptySet));
            t3b t3b2 = t3b.c;
            Set emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                Long l2 = 1000L;
                Long l3 = 86400000L;
                hashMap.put(t3b2, new qa0(l2.longValue(), l3.longValue(), emptySet2));
                t3b t3b3 = t3b.b;
                if (Collections.emptySet() != null) {
                    Long l4 = 86400000L;
                    Long l5 = 86400000L;
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new tmc[]{tmc.b})));
                    if (unmodifiableSet != null) {
                        hashMap.put(t3b3, new qa0(l4.longValue(), l5.longValue(), unmodifiableSet));
                        if (eye == null) {
                            throw new NullPointerException("missing required property: clock");
                        } else if (hashMap.keySet().size() >= t3b.values().length) {
                            new HashMap();
                            return new pa0(eye, hashMap);
                        } else {
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                    } else {
                        throw new NullPointerException("Null flags");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }

    public void i(wt1 wt1) {
        ykb ykb = ((vkb) this.b).o;
        if (ykb == null) {
            ykb = null;
        }
        ykb.getClass();
        udd.t("QuickCameraViewModel", "onCameraError", wt1);
    }

    public int j() {
        v2f v2f = ((GifViewerWidget) this.b).w0;
        return 2;
    }

    public void k() {
        pqe pqe = (pqe) this.b;
        pqe.H0 = true;
        if (pqe.A0.isEmpty()) {
            rc4 rc4 = pqe.D0;
            rc4.getClass();
            rc4.f();
            return;
        }
        pqe.b();
    }

    public at l(gs4 gs4, Looper looper, zs zsVar, s93 s93) {
        return new sp6(gs4, zsVar, (sz3) ((wm0) this.b), s93.a);
    }

    public void m(ktd ktd) {
        ((xud) this.b).Y.a(ktd);
    }

    public void n() {
        v40.c((v40) this.b);
    }

    public void o() {
        long j;
        uy3 uy3 = (uy3) this.b;
        synchronized (vx3.d) {
            try {
                j = vx3.e ? vx3.f : -9223372036854775807L;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        uy3.L = j;
        uy3.y(true);
    }

    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((GifViewerWidget) this.b).a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, (Throwable) null);
        }
    }

    public kn1 p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("participants");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject(HasExtraData.KEY_ID);
                arrayList.add(new cn1(new dn1(ge1.a(jSONObject3.getString(HasExtraData.KEY_ID)), jSONObject3.getLong("addedTs")), x87.m(jSONObject2)));
            }
            return new kn1(arrayList, jSONObject.optInt("totalCount", 0), jSONObject.optBoolean("hasMore", false));
        } catch (JSONException e) {
            ((xwb) this.b).log("WaitingRoomParticipantsParser", "can't parse waiting room participants " + e.getMessage());
            return null;
        }
    }

    public void q() {
        v40.c((v40) this.b);
    }

    public ge1 r(int i) {
        xm1 xm1 = (xm1) ((ConcurrentHashMap) this.b).get(Integer.valueOf(i));
        if (xm1 != null) {
            return xm1.b;
        }
        return null;
    }

    public int s(int i) {
        int i2;
        xld xld;
        xld[] xldArr = (xld[]) this.b;
        int length = xldArr.length - 1;
        int i3 = 0;
        while (i3 <= length && (xld = xldArr[i2]) != null) {
            int i4 = xld.b;
            int i5 = xld.a;
            if (i >= i5 && i < i4) {
                return i2;
            }
            if (i4 <= i) {
                i3 = (i2 = (i3 + length) >>> 1) + 1;
            } else if (i5 > i) {
                length = i2 - 1;
            }
        }
        return -1;
    }

    public void t(ktd ktd) {
        u68 u68 = (u68) ((xud) this.b).Y.a.b.getValue();
        u68.getClass();
        r68 r68 = new r68(ktd.a);
        l05 l05 = u68.X;
        taf.o(l05, r68);
        taf.o(l05, q68.a);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return gvf.class.getSimpleName() + ":" + ((String) this.b);
            default:
                return super.toString();
        }
    }

    public void z() {
        v40.c((v40) this.b);
    }

    public /* synthetic */ gvf(int i, boolean z) {
        this.a = i;
    }

    public gvf(Spannable spannable) {
        Object obj;
        this.a = 26;
        try {
            obj = spannable.getSpans(0, spannable.length(), yu4.class);
        } catch (Throwable unused) {
            obj = null;
        }
        yu4[] yu4Arr = (yu4[]) (obj == null ? new yu4[0] : obj);
        this.b = new xld[yu4Arr.length];
        int length = yu4Arr.length;
        for (int i = 0; i < length; i++) {
            ((xld[]) this.b)[i] = new xld(spannable.getSpanStart(yu4Arr[i]), spannable.getSpanEnd(yu4Arr[i]));
        }
        Arrays.sort((xld[]) this.b);
    }

    public gvf(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = Handler.createAsync(Looper.getMainLooper());
                return;
            case 18:
                this.b = new ConcurrentHashMap();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                this.b = a06.g;
                return;
            case 25:
                this.b = new r7e(new vfc(24));
                return;
            case 29:
                this.b = new SparseArray();
                return;
            default:
                this.b = new d1c(kee.h, TimeUnit.MINUTES);
                return;
        }
    }

    public gvf(Context context) {
        this.a = 13;
        this.b = context.getApplicationContext();
    }

    public gvf(String str) {
        this.a = 0;
        this.b = str;
        hr1.r(a("net.jpountz.xxhash.XXHash32".concat(str)));
        hr1.r(a("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory"));
        hr1.r(a("net.jpountz.xxhash.XXHash64".concat(str)));
        hr1.r(a("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory"));
        Random random = new Random();
        random.nextBytes(new byte[100]);
        random.nextInt();
        throw null;
    }
}
