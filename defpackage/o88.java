package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: o88  reason: default package */
public final class o88 extends f6c implements lrd {
    public boolean A0;
    public final List B0;
    public final qk7 C0;
    public final HashMap D0;
    public final c X;
    public final uq7 Y = new uq7((Object) null);
    public final uq7 Z = new uq7((Object) null);
    public final pc7 o;
    public final uq7 w0 = new uq7((Object) null);
    public mu7 x0;
    public final gvf y0;
    public boolean z0;

    public o88(b bVar, ArrayList arrayList, qk7 qk7) {
        vx5 P = bVar.P();
        gvf gvf = new gvf(15, false);
        gvf.b = new CopyOnWriteArrayList();
        this.y0 = gvf;
        this.z0 = false;
        this.A0 = false;
        this.X = P;
        this.o = bVar.a;
        A(true);
        this.B0 = arrayList;
        this.C0 = qk7;
        this.D0 = new HashMap();
    }

    public static void C(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public final boolean D(long j) {
        return j >= 0 && j < ((long) this.B0.size());
    }

    public final void E() {
        uq7 uq7;
        uq7 uq72;
        a aVar;
        View l0;
        if (this.A0 && !this.X.Q()) {
            bs bsVar = new bs(0);
            int i = 0;
            while (true) {
                uq7 = this.Y;
                int h = uq7.h();
                uq72 = this.w0;
                if (i >= h) {
                    break;
                }
                long e = uq7.e(i);
                if (!D(e)) {
                    bsVar.add(Long.valueOf(e));
                    uq72.g(e);
                }
                i++;
            }
            if (!this.z0) {
                this.A0 = false;
                for (int i2 = 0; i2 < uq7.h(); i2++) {
                    long e2 = uq7.e(i2);
                    if (uq72.d(e2) < 0 && ((aVar = (a) uq7.c(e2)) == null || (l0 = aVar.l0()) == null || l0.getParent() == null)) {
                        bsVar.add(Long.valueOf(e2));
                    }
                }
            }
            ur urVar = new ur(bsVar);
            while (urVar.hasNext()) {
                I(((Long) urVar.next()).longValue());
            }
        }
    }

    public final FrgLocalMedia F(long j) {
        WeakReference weakReference = (WeakReference) this.D0.get(Long.valueOf(j));
        if (weakReference != null) {
            return (FrgLocalMedia) weakReference.get();
        }
        return null;
    }

    public final Long G(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            uq7 uq7 = this.w0;
            if (i2 >= uq7.h()) {
                return l;
            }
            if (((Integer) uq7.i(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(uq7.e(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i2++;
        }
    }

    public final void H(ey5 ey5) {
        a aVar = (a) this.Y.c(ey5.X);
        if (aVar != null) {
            FrameLayout frameLayout = (FrameLayout) ey5.a;
            View l0 = aVar.l0();
            if (aVar.p0() || l0 == null) {
                boolean p0 = aVar.p0();
                c cVar = this.X;
                if (p0 && l0 == null) {
                    ((CopyOnWriteArrayList) cVar.o.c).add(new kx5(new duf(this, aVar, frameLayout)));
                } else if (!aVar.p0() || l0.getParent() == null) {
                    if (aVar.p0()) {
                        C(l0, frameLayout);
                    } else if (!cVar.Q()) {
                        ((CopyOnWriteArrayList) cVar.o.c).add(new kx5(new duf(this, aVar, frameLayout)));
                        gvf gvf = this.y0;
                        gvf.getClass();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((CopyOnWriteArrayList) gvf.b).iterator();
                        if (!it.hasNext()) {
                            try {
                                aVar.a1(false);
                                hd0 hd0 = new hd0(cVar);
                                hd0.f(0, aVar, "f" + ey5.X, 1);
                                hd0.i(aVar, ob7.o);
                                hd0.e();
                                this.x0.b(false);
                            } finally {
                                gvf.e(arrayList);
                            }
                        } else {
                            hr1.r(it.next());
                            throw null;
                        }
                    } else if (!cVar.J) {
                        this.o.a(new z84(this, ey5));
                    }
                } else if (l0.getParent() != frameLayout) {
                    C(l0, frameLayout);
                }
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void I(long j) {
        ViewParent parent;
        uq7 uq7 = this.Y;
        a aVar = (a) uq7.c(j);
        if (aVar != null) {
            if (!(aVar.l0() == null || (parent = aVar.l0().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            boolean D = D(j);
            uq7 uq72 = this.Z;
            if (!D) {
                uq72.g(j);
            }
            if (!aVar.p0()) {
                uq7.g(j);
                return;
            }
            c cVar = this.X;
            if (cVar.Q()) {
                this.A0 = true;
                return;
            }
            boolean p0 = aVar.p0();
            gvf gvf = this.y0;
            if (p0 && D(j)) {
                gvf.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((CopyOnWriteArrayList) gvf.b).iterator();
                if (!it.hasNext()) {
                    fx5 b0 = cVar.b0(aVar);
                    gvf.e(arrayList);
                    uq72.f(j, b0);
                } else {
                    hr1.r(it.next());
                    throw null;
                }
            }
            gvf.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ((CopyOnWriteArrayList) gvf.b).iterator();
            if (!it2.hasNext()) {
                try {
                    hd0 hd0 = new hd0(cVar);
                    hd0.h(aVar);
                    hd0.e();
                    uq7.g(j);
                } finally {
                    gvf.e(arrayList2);
                }
            } else {
                hr1.r(it2.next());
                throw null;
            }
        }
    }

    public final Parcelable a() {
        uq7 uq7 = this.Y;
        int h = uq7.h();
        uq7 uq72 = this.Z;
        Bundle bundle = new Bundle(uq72.h() + h);
        for (int i = 0; i < uq7.h(); i++) {
            long e = uq7.e(i);
            a aVar = (a) uq7.c(e);
            if (aVar != null && aVar.p0()) {
                this.X.W(bundle, us8.i(e, "f#"), aVar);
            }
        }
        for (int i2 = 0; i2 < uq72.h(); i2++) {
            long e2 = uq72.e(i2);
            if (D(e2)) {
                bundle.putParcelable(us8.i(e2, "s#"), (Parcelable) uq72.c(e2));
            }
        }
        return bundle;
    }

    public final void c(Parcelable parcelable) {
        String next;
        uq7 uq7 = this.Z;
        if (uq7.h() == 0) {
            uq7 uq72 = this.Y;
            if (uq72.h() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(o88.class.getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean z = true;
                    if (it.hasNext()) {
                        next = it.next();
                        if (!next.startsWith("f#") || next.length() <= 2) {
                            z = false;
                        }
                        if (z) {
                            uq72.f(Long.parseLong(next.substring(2)), this.X.H(next, bundle));
                        } else if (next.startsWith("s#") && next.length() > 2) {
                            long parseLong = Long.parseLong(next.substring(2));
                            fx5 parcelable2 = bundle.getParcelable(next);
                            if (D(parseLong)) {
                                uq7.f(parseLong, parcelable2);
                            }
                        }
                    } else if (uq72.h() != 0) {
                        this.A0 = true;
                        this.z0 = true;
                        E();
                        Handler handler = new Handler(Looper.getMainLooper());
                        re reVar = new re(26, this);
                        this.o.a(new z84(handler, 2, reVar));
                        handler.postDelayed(reVar, 10000);
                        return;
                    } else {
                        return;
                    }
                }
                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final int j() {
        return this.B0.size();
    }

    public final long k(int i) {
        return (long) i;
    }

    public final void q(RecyclerView recyclerView) {
        e07.k(this.x0 == null);
        mu7 mu7 = new mu7(this);
        this.x0 = mu7;
        ViewPager2 a = mu7.a(recyclerView);
        mu7.e = a;
        hg0 hg0 = new hg0(8, mu7);
        mu7.b = hg0;
        a.b(hg0);
        jw4 jw4 = new jw4(2, mu7);
        mu7.c = jw4;
        z(jw4);
        d6c d6c = new d6c(5, mu7);
        mu7.d = d6c;
        this.o.a(d6c);
    }

    public final void r(b7c b7c, int i) {
        a aVar;
        Bundle bundle;
        ey5 ey5 = (ey5) b7c;
        long j = ey5.X;
        FrameLayout frameLayout = (FrameLayout) ey5.a;
        int id = frameLayout.getId();
        Long G = G(id);
        uq7 uq7 = this.w0;
        if (!(G == null || G.longValue() == j)) {
            I(G.longValue());
            uq7.g(G.longValue());
        }
        uq7.f(j, Integer.valueOf(id));
        long j2 = (long) i;
        uq7 uq72 = this.Y;
        if (uq72.d(j2) < 0) {
            tk7 tk7 = (tk7) this.B0.get(i);
            String a = tk7.a();
            qk7 qk7 = this.C0;
            String str = qk7.Y;
            Bundle bundle2 = null;
            boolean c = ct0.c(a != null ? Uri.parse(a) : null, str != null ? Uri.parse(str) : null);
            HashMap hashMap = this.D0;
            int i2 = tk7.a;
            long j3 = tk7.b;
            if (i2 != 1) {
                if (i2 == 3) {
                    aVar = new FrgLocalVideo();
                    aVar.Y0(FrgLocalMedia.t1(tk7, c, qk7));
                    hashMap.put(Long.valueOf(j3), new WeakReference(aVar));
                } else {
                    throw new IllegalStateException(wn6.h(i2, "media type should be known, type = "));
                }
            } else if (tk7.d()) {
                aVar = new FrgLocalGif();
                aVar.Y0(FrgLocalMedia.t1(tk7, c, qk7));
                hashMap.put(Long.valueOf(j3), new WeakReference(aVar));
            } else {
                aVar = new FrgLocalPhoto();
                aVar.Y0(FrgLocalMedia.t1(tk7, c, qk7));
                hashMap.put(Long.valueOf(j3), new WeakReference(aVar));
            }
            fx5 fx5 = (fx5) this.Z.c(j2);
            if (aVar.J0 == null) {
                if (!(fx5 == null || (bundle = fx5.a) == null)) {
                    bundle2 = bundle;
                }
                aVar.b = bundle2;
                uq72.f(j2, aVar);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        if (frameLayout.isAttachedToWindow()) {
            H(ey5);
        }
        E();
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        int i2 = ey5.J0;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new b7c(frameLayout);
    }

    public final void u(RecyclerView recyclerView) {
        mu7 mu7 = this.x0;
        mu7.getClass();
        mu7.a(recyclerView).g((hg0) mu7.b);
        o88 o88 = (o88) mu7.f;
        o88.B((jw4) mu7.c);
        o88.o.f((d6c) mu7.d);
        mu7.e = null;
        this.x0 = null;
    }

    public final /* bridge */ /* synthetic */ boolean v(b7c b7c) {
        ey5 ey5 = (ey5) b7c;
        return true;
    }

    public final void w(b7c b7c) {
        H((ey5) b7c);
        E();
    }

    public final void y(b7c b7c) {
        Long G = G(((FrameLayout) ((ey5) b7c).a).getId());
        if (G != null) {
            I(G.longValue());
            this.w0.g(G.longValue());
        }
    }
}
