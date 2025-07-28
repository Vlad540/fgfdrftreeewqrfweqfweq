package defpackage;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Bundle;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.MyTrackerConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.OneMeApplication;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import org.webrtc.Predicate;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: dd9  reason: default package */
public final /* synthetic */ class dd9 implements of3, j26, mk0, v1b, MyTrackerConfig.OkHttpClientProvider, MyTracker.AttributionListener, x89, Predicate, j75, k75, mle, Provider, otc, kt0, nbc {
    public final /* synthetic */ int a;

    public /* synthetic */ dd9(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: d75[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d75[] a() {
        /*
            r2 = this;
            fw9 r2 = new fw9
            r2.<init>()
            r0 = 1
            d75[] r0 = new d75[r0]
            r1 = 0
            r0[r1] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd9.a():d75[]");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                udd.r("fd9", "Can't update not started live video");
                return;
            case 1:
                Throwable th2 = (Throwable) obj;
                udd.r("fd9", "Can't update seek");
                return;
            case 2:
                Throwable th3 = (Throwable) obj;
                udd.r("md9", "Error in timer");
                return;
            case 6:
                Throwable th4 = (Throwable) obj;
                udd.r("xd9", "Can't hide controls");
                return;
            case 7:
                Throwable th5 = (Throwable) obj;
                udd.r("xd9", "Can't update seek");
                return;
            case 8:
                udd.s("be9", "Can't setupUpdateAddress", (Throwable) obj);
                return;
            case 9:
                udd.s("be9", "Can't setupLiveLocationUpdate", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                udd.s("be9", "Error in timer", (Throwable) obj);
                return;
            case 13:
                Throwable th6 = (Throwable) obj;
                udd.r("be9", "Can't load initial live switch state");
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                udd.s("de9", "Error in extractThumbnail", (Throwable) obj);
                return;
            default:
                Long l = (Long) obj;
                ConcurrentHashMap concurrentHashMap = eha.b;
                return;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new xia((Uri) obj, (Uri) obj2);
    }

    public String c() {
        return null;
    }

    public lt0 e(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
            z = true;
        }
        swb.e(z);
        float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f == -1.0f ? new jma() : new jma(f);
    }

    public Object f(ws8 ws8) {
        int i;
        String str;
        switch (this.a) {
            case 18:
                try {
                    i = jjd.K(ws8);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                    Iterator it = uzc.a.iterator();
                    while (it.hasNext()) {
                        ((ny9) it.next()).getClass();
                        ny9.a(th2);
                    }
                    int t = hr1.t(m4b.a);
                    if (t == 0) {
                        i = 0;
                    } else if (t != 1) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        throw th2;
                    }
                }
                if (i == 0) {
                    return null;
                }
                String str2 = "";
                boolean z = false;
                long j = 0;
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        str = jjd.M(ws8);
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it2 = uzc.a.iterator();
                        while (it2.hasNext()) {
                            ((ny9) it2.next()).getClass();
                            ny9.a(th4);
                        }
                        int t2 = hr1.t(m4b.a);
                        if (t2 == 0) {
                            str = null;
                        } else if (t2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th4;
                        }
                    }
                    if (str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != 3355) {
                            if (hashCode != 99333) {
                                if (hashCode == 116079 && str.equals("url")) {
                                    try {
                                        str2 = jjd.M(ws8);
                                    } catch (Throwable th5) {
                                        Throwable th6 = th5;
                                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                        Iterator it3 = uzc.a.iterator();
                                        while (it3.hasNext()) {
                                            ((ny9) it3.next()).getClass();
                                            ny9.a(th6);
                                        }
                                        int t3 = hr1.t(m4b.a);
                                        if (t3 == 0) {
                                            str2 = null;
                                        } else if (t3 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        } else {
                                            throw th6;
                                        }
                                    }
                                    if (str2 == null) {
                                        return null;
                                    }
                                }
                            } else if (str.equals("def")) {
                                try {
                                    z = jjd.E(ws8);
                                } catch (Throwable th7) {
                                    Throwable th8 = th7;
                                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                    Iterator it4 = uzc.a.iterator();
                                    while (it4.hasNext()) {
                                        ((ny9) it4.next()).getClass();
                                        ny9.a(th8);
                                    }
                                    int t4 = hr1.t(m4b.a);
                                    if (t4 == 0) {
                                        z = false;
                                    } else if (t4 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    } else {
                                        throw th8;
                                    }
                                }
                            }
                        } else if (str.equals(ApiProtocol.KEY_ID)) {
                            try {
                                j = jjd.J(ws8, 0);
                            } catch (Throwable th9) {
                                Throwable th10 = th9;
                                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                Iterator it5 = uzc.a.iterator();
                                while (it5.hasNext()) {
                                    ((ny9) it5.next()).getClass();
                                    ny9.a(th10);
                                }
                                int t5 = hr1.t(m4b.a);
                                if (t5 == 0) {
                                    j = 0;
                                } else if (t5 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th10;
                                }
                            }
                        }
                        try {
                            ws8.z();
                        } catch (Throwable th11) {
                            Throwable th12 = th11;
                            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                            Iterator it6 = uzc.a.iterator();
                            while (it6.hasNext()) {
                                ((ny9) it6.next()).getClass();
                                ny9.a(th12);
                            }
                            int t6 = hr1.t(m4b.a);
                            if (t6 != 0) {
                                if (t6 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th12;
                            }
                        }
                    }
                    ws8 ws82 = ws8;
                }
                return new li9(j, str2, Boolean.valueOf(z));
            default:
                return gk9.h(ws8);
        }
    }

    public void g(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public Object get() {
        return null;
    }

    public qw9 getOkHttpClient() {
        return ((gyb) o2a.a.getAccessor().c(gyb.class)).a;
    }

    public int i(int i) {
        k77[] k77Arr = OtherNotificationsSettingsScreen.Y;
        return 4;
    }

    public void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution) {
        rf9.c.g(myTrackerAttribution.getDeeplink());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((av7) obj).a.a();
            default:
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
                int i = ds9.a;
                return true;
        }
    }

    public /* synthetic */ dd9(OneMeApplication oneMeApplication) {
        this.a = 24;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return ms9.j((List) obj);
            case 4:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return hx7.a;
                }
                return ax7.e(list);
            case 10:
                return (List) obj;
            default:
                ((ar8) obj).getClass();
                return 0L;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: e75[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e75[] m0a() {
        /*
            r2 = this;
            gw9 r2 = new gw9
            r2.<init>()
            r0 = 1
            e75[] r0 = new e75[r0]
            r1 = 0
            r0[r1] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd9.m0a():e75[]");
    }
}
