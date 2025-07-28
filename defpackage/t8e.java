package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: t8e  reason: default package */
public abstract class t8e extends v8e implements ac8, bc8 {
    public static final ArrayList H0;
    public static final ArrayList I0;
    public final cc8 A0;
    public final MediaRouter.RouteCategory B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public final ArrayList F0 = new ArrayList();
    public final ArrayList G0 = new ArrayList();
    public final u8e x0;
    public final Object y0;
    public final Object z0;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        H0 = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        I0 = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public t8e(Context context, u8e u8e) {
        super(context, new lv1(22, new ComponentName("android", v8e.class.getName())));
        this.x0 = u8e;
        Object systemService = context.getSystemService("media_router");
        this.y0 = systemService;
        this.z0 = new ec8((p8e) this);
        this.A0 = new cc8(this);
        this.B0 = ((MediaRouter) systemService).createRouteCategory(context.getResources().getString(nub.mr_user_route_category_name), false);
        v();
    }

    public static s8e n(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof s8e) {
            return (s8e) tag;
        }
        return null;
    }

    public final void a(int i, Object obj) {
        s8e n = n(obj);
        if (n != null) {
            n.a.k(i);
        }
    }

    public final void b(int i, Object obj) {
        s8e n = n(obj);
        if (n != null) {
            n.a.j(i);
        }
    }

    public final nb8 d(String str) {
        int k = k(str);
        if (k >= 0) {
            return new q8e(((r8e) this.F0.get(k)).a);
        }
        return null;
    }

    public final void f(va8 va8) {
        boolean z;
        int i = 0;
        if (va8 != null) {
            va8.a();
            ArrayList b = va8.b.b();
            int size = b.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) b.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            z = va8.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.C0 != i || this.D0 != z) {
            this.C0 = i;
            this.D0 = z;
            v();
        }
    }

    public final boolean i(Object obj) {
        String str;
        String str2;
        if (n(obj) != null || j(obj) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo m = m();
        String str3 = BuildConfig.FLAVOR;
        Context context = this.a;
        if (m == obj) {
            str = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = ((MediaRouter.RouteInfo) obj).getName(context);
            str = String.format(locale, "ROUTE_%08x", new Object[]{Integer.valueOf((name != null ? name.toString() : str3).hashCode())});
        }
        if (k(str) >= 0) {
            int i = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = str + "_" + i;
                if (k(str2) < 0) {
                    break;
                }
                i++;
            }
            str = str2;
        }
        r8e r8e = new r8e(obj, str);
        CharSequence name2 = ((MediaRouter.RouteInfo) obj).getName(context);
        if (name2 != null) {
            str3 = name2.toString();
        }
        ul7 ul7 = new ul7(str, str3);
        o(r8e, ul7);
        r8e.c = ul7.o();
        this.F0.add(r8e);
        return true;
    }

    public final int j(Object obj) {
        ArrayList arrayList = this.F0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((r8e) arrayList.get(i)).a == obj) {
                return i;
            }
        }
        return -1;
    }

    public final int k(String str) {
        ArrayList arrayList = this.F0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((r8e) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int l(xb8 xb8) {
        ArrayList arrayList = this.G0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((s8e) arrayList.get(i)).a == xb8) {
                return i;
            }
        }
        return -1;
    }

    public abstract MediaRouter.RouteInfo m();

    public void o(r8e r8e, ul7 ul7) {
        int supportedTypes = ((MediaRouter.RouteInfo) r8e.a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            ul7.j(H0);
        }
        if ((supportedTypes & 2) != 0) {
            ul7.j(I0);
        }
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) r8e.a;
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = (Bundle) ul7.a;
        bundle.putInt("playbackType", playbackType);
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
    }

    public final void p(xb8 xb8) {
        ob8 c = xb8.c();
        Object obj = this.y0;
        if (c != this) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.B0);
            s8e s8e = new s8e(xb8, createUserRoute);
            createUserRoute.setTag(s8e);
            createUserRoute.setVolumeCallback(this.A0);
            w(s8e);
            this.G0.add(s8e);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int j = j(((MediaRouter) obj).getSelectedRoute(8388611));
        if (j >= 0 && ((r8e) this.F0.get(j)).b.equals(xb8.b)) {
            xb8.l();
        }
    }

    public final void q(xb8 xb8) {
        int l;
        if (xb8.c() != this && (l = l(xb8)) >= 0) {
            s8e s8e = (s8e) this.G0.remove(l);
            ((MediaRouter.UserRouteInfo) s8e.b).setTag((Object) null);
            Object obj = s8e.b;
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) null);
            try {
                ((MediaRouter) this.y0).removeUserRoute((MediaRouter.UserRouteInfo) obj);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void r(xb8 xb8) {
        if (xb8.g()) {
            if (xb8.c() != this) {
                int l = l(xb8);
                if (l >= 0) {
                    t(((s8e) this.G0.get(l)).b);
                    return;
                }
                return;
            }
            int k = k(xb8.b);
            if (k >= 0) {
                t(((r8e) this.F0.get(k)).a);
            }
        }
    }

    public final void s() {
        ArrayList arrayList = this.F0;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        int i = 0;
        while (i < size) {
            ta8 ta8 = ((r8e) arrayList.get(i)).c;
            if (ta8 != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                } else if (arrayList2.contains(ta8)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList2.add(ta8);
                i++;
            } else {
                throw new IllegalArgumentException("route must not be null");
            }
        }
        g(new pb8(arrayList2, false));
    }

    public abstract void t(Object obj);

    public abstract void u();

    public final void v() {
        u();
        MediaRouter mediaRouter = (MediaRouter) this.y0;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z |= i(it.next());
        }
        if (z) {
            s();
        }
    }

    public void w(s8e s8e) {
        int i;
        Object obj = s8e.b;
        xb8 xb8 = s8e.a;
        ((MediaRouter.UserRouteInfo) obj).setName(xb8.d);
        int i2 = xb8.k;
        MediaRouter.UserRouteInfo userRouteInfo = (MediaRouter.UserRouteInfo) s8e.b;
        userRouteInfo.setPlaybackType(i2);
        userRouteInfo.setPlaybackStream(xb8.l);
        userRouteInfo.setVolume(xb8.o);
        userRouteInfo.setVolumeMax(xb8.p);
        if (xb8.e()) {
            if (yb8.d == null) {
                i = 0;
                userRouteInfo.setVolumeHandling(i);
            }
            yb8.c().getClass();
        }
        i = xb8.n;
        userRouteInfo.setVolumeHandling(i);
    }
}
