package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: ea8  reason: default package */
public final class ea8 extends ob8 {
    public final ca8 A0 = new ca8(this);
    public final da8 B0 = new da8(this);
    public final z98 C0 = new z98(this);
    public final y44 D0;
    public ArrayList E0 = new ArrayList();
    public final ArrayMap F0 = new ArrayMap();
    public final MediaRouter2 x0;
    public final za6 y0;
    public final ArrayMap z0 = new ArrayMap();

    public ea8(Context context, za6 za6) {
        super(context, (lv1) null);
        this.x0 = MediaRouter2.getInstance(context);
        this.y0 = za6;
        this.D0 = new y44(new Handler(Looper.getMainLooper()), 0);
    }

    public final mb8 c(String str) {
        for (Map.Entry value : this.z0.entrySet()) {
            aa8 aa8 = (aa8) value.getValue();
            if (TextUtils.equals(str, aa8.f)) {
                return aa8;
            }
        }
        return null;
    }

    public final nb8 d(String str) {
        return new ba8((String) this.F0.get(str), (aa8) null);
    }

    public final nb8 e(String str, String str2) {
        String str3 = (String) this.F0.get(str);
        for (aa8 aa8 : this.z0.values()) {
            ta8 ta8 = aa8.o;
            if (TextUtils.equals(str2, ta8 != null ? ta8.c() : aa8.g.getId())) {
                return new ba8(str3, aa8);
            }
        }
        return new ba8(str3, (aa8) null);
    }

    public final void f(va8 va8) {
        ArrayList arrayList;
        qb8 qb8;
        RouteDiscoveryPreference routeDiscoveryPreference;
        int i = yb8.d == null ? 0 : yb8.c().y;
        z98 z98 = this.C0;
        da8 da8 = this.B0;
        ca8 ca8 = this.A0;
        if (i > 0) {
            yb8.c();
            if (va8 == null) {
                va8 = new va8(qb8.c, false);
            }
            va8.a();
            ArrayList b = va8.b.b();
            b.remove("android.media.intent.category.LIVE_AUDIO");
            if (!b.isEmpty()) {
                Iterator it = b.iterator();
                arrayList = null;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("category must not be null");
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                qb8 = qb8.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                qb8 = new qb8(arrayList, bundle);
            }
            boolean b2 = va8.b();
            if (qb8 != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("selector", qb8.a);
                bundle2.putBoolean("activeScan", b2);
                MediaRouter2 mediaRouter2 = this.x0;
                qb8.a();
                if (!(!qb8.b.contains((Object) null))) {
                    y98.n();
                    routeDiscoveryPreference = y98.f(new ArrayList()).build();
                } else {
                    boolean z = bundle2.getBoolean("activeScan");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = qb8.b().iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        str2.getClass();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case -2065577523:
                                if (str2.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 956939050:
                                if (str2.equals("android.media.intent.category.LIVE_AUDIO")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 975975375:
                                if (str2.equals("android.media.intent.category.LIVE_VIDEO")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                                break;
                            case 1:
                                str2 = "android.media.route.feature.LIVE_AUDIO";
                                break;
                            case 2:
                                str2 = "android.media.route.feature.LIVE_VIDEO";
                                break;
                        }
                        arrayList2.add(str2);
                    }
                    routeDiscoveryPreference = y98.g(arrayList2, z).build();
                }
                y44 y44 = this.D0;
                mediaRouter2.registerRouteCallback(y44, ca8, routeDiscoveryPreference);
                this.x0.registerTransferCallback(y44, da8);
                this.x0.registerControllerCallback(y44, z98);
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
        this.x0.unregisterRouteCallback(ca8);
        this.x0.unregisterTransferCallback(da8);
        this.x0.unregisterControllerCallback(z98);
    }

    public final MediaRoute2Info i(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.E0.iterator();
        while (it.hasNext()) {
            MediaRoute2Info i = d4.i(it.next());
            if (TextUtils.equals(i.getId(), str)) {
                return i;
            }
        }
        return null;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (Object i : this.x0.getRoutes()) {
            MediaRoute2Info i2 = d4.i(i);
            if (i2 != null && !arraySet.contains(i2) && !i2.isSystemRoute()) {
                arraySet.add(i2);
                arrayList.add(i2);
            }
        }
        if (!arrayList.equals(this.E0)) {
            this.E0 = arrayList;
            ArrayMap arrayMap = this.F0;
            arrayMap.clear();
            Iterator it = this.E0.iterator();
            while (it.hasNext()) {
                MediaRoute2Info i3 = d4.i(it.next());
                Bundle j = i3.getExtras();
                if (j == null || j.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                    i3.toString();
                } else {
                    arrayMap.put(i3.getId(), j.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = this.E0.iterator();
            while (it2.hasNext()) {
                MediaRoute2Info i4 = d4.i(it2.next());
                ta8 R = swb.R(i4);
                if (i4 != null) {
                    arrayList2.add(R);
                }
            }
            ArrayList arrayList3 = null;
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ta8 ta8 = (ta8) it3.next();
                    if (ta8 != null) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        } else if (arrayList3.contains(ta8)) {
                            throw new IllegalArgumentException("route descriptor already added");
                        }
                        arrayList3.add(ta8);
                    } else {
                        throw new IllegalArgumentException("route must not be null");
                    }
                }
            }
            g(new pb8(arrayList3, true));
        }
    }

    public final void k(MediaRouter2.RoutingController routingController) {
        aa8 aa8 = (aa8) this.z0.get(routingController);
        if (aa8 == null) {
            Objects.toString(routingController);
            return;
        }
        List u = routingController.getSelectedRoutes();
        if (u.isEmpty()) {
            routingController.toString();
            return;
        }
        ArrayList z = swb.z(u);
        ta8 R = swb.R(d4.i(u.get(0)));
        Bundle k = routingController.getControlHints();
        String string = this.a.getString(nub.mr_dialog_default_group_name);
        ta8 ta8 = null;
        if (k != null) {
            try {
                String string2 = k.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = k.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    ta8 = new ta8(bundle);
                }
            } catch (Exception unused) {
            }
        }
        if (ta8 == null) {
            ul7 ul7 = new ul7(routingController.getId(), string);
            Bundle bundle2 = (Bundle) ul7.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
            bundle2.putInt("volume", routingController.getVolume());
            bundle2.putInt("volumeMax", routingController.getVolumeMax());
            bundle2.putInt("volumeHandling", routingController.getVolumeHandling());
            R.a();
            ul7.j(R.c);
            if (!z.isEmpty()) {
                Iterator it = z.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        if (((ArrayList) ul7.b) == null) {
                            ul7.b = new ArrayList();
                        }
                        if (!((ArrayList) ul7.b).contains(str)) {
                            ((ArrayList) ul7.b).add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                }
            }
            ta8 = ul7.o();
        }
        ArrayList z2 = swb.z(routingController.getSelectableRoutes());
        ArrayList z3 = swb.z(routingController.getDeselectableRoutes());
        pb8 pb8 = this.Z;
        if (pb8 != null) {
            ArrayList arrayList = new ArrayList();
            List<ta8> list = pb8.c;
            if (!list.isEmpty()) {
                for (ta8 ta82 : list) {
                    String c = ta82.c();
                    arrayList.add(new lb8(ta82, z.contains(c) ? 3 : 1, z3.contains(c), z2.contains(c), true));
                }
            }
            aa8.o = ta8;
            aa8.l(ta8, arrayList);
        }
    }
}
