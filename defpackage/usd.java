package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: usd  reason: default package */
public final /* synthetic */ class usd implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zsd b;

    public /* synthetic */ usd(zsd zsd, int i) {
        this.a = i;
        this.b = zsd;
    }

    /* JADX WARNING: type inference failed for: r3v17, types: [h10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v21, types: [ctd, java.lang.Object] */
    public final void run() {
        pec pec;
        int i;
        String str;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        switch (this.a) {
            case 0:
                this.b.f();
                return;
            default:
                zsd zsd = this.b;
                zud zud = (zud) ((r7e) ((hz3) ((a04) zsd.c.get())).h.b).getValue();
                zud.getClass();
                pec a2 = pec.a(0, "SELECT * FROM stickers");
                aec aec = zud.a;
                aec.b();
                Cursor o = aec.o(a2, (CancellationSignal) null);
                try {
                    int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                    int o3 = gp0.o(o, "sticker_id");
                    int o4 = gp0.o(o, "width");
                    int o5 = gp0.o(o, "height");
                    int o6 = gp0.o(o, "url");
                    int o7 = gp0.o(o, "update_time");
                    int o8 = gp0.o(o, "mp4_url");
                    int o9 = gp0.o(o, "first_url");
                    int o10 = gp0.o(o, "preview_url");
                    int o11 = gp0.o(o, "tags");
                    int o12 = gp0.o(o, "sticker_type");
                    int o13 = gp0.o(o, "set_id");
                    int o14 = gp0.o(o, "lottie_url");
                    pec = a2;
                    try {
                        int o15 = gp0.o(o, MediaStreamTrack.AUDIO_TRACK_KIND);
                        int o16 = gp0.o(o, "author_type");
                        int o17 = gp0.o(o, "video_url");
                        int i6 = o14;
                        ArrayList arrayList = new ArrayList(o.getCount());
                        while (true) {
                            ArrayList arrayList2 = arrayList;
                            if (o.moveToNext()) {
                                long j = o.getLong(o2);
                                long j2 = o.getLong(o3);
                                int i7 = o.getInt(o4);
                                int i8 = o.getInt(o5);
                                String string = o.isNull(o6) ? null : o.getString(o6);
                                long j3 = o.getLong(o7);
                                String string2 = o.isNull(o8) ? null : o.getString(o8);
                                String string3 = o.isNull(o9) ? null : o.getString(o9);
                                String string4 = o.isNull(o10) ? null : o.getString(o10);
                                int i9 = o2;
                                int i10 = o3;
                                List q0 = h0e.q0(o.isNull(o11) ? null : o.getString(o11), new String[]{","}, false, 6);
                                int i11 = o.getInt(o12);
                                if (i11 != 0) {
                                    if (i11 == 10) {
                                        i5 = 2;
                                    } else if (i11 == 20) {
                                        i = 3;
                                    } else if (i11 == 40) {
                                        i5 = 4;
                                    } else {
                                        throw new IllegalArgumentException("No such value " + i11 + " for StickerType");
                                    }
                                    i = i5;
                                } else {
                                    i = 1;
                                }
                                long j4 = o.getLong(o13);
                                int i12 = i6;
                                if (o.isNull(i12)) {
                                    i2 = o15;
                                    str = null;
                                } else {
                                    str = o.getString(i12);
                                    i2 = o15;
                                }
                                if (o.getInt(i2) != 0) {
                                    i3 = o13;
                                    i6 = i12;
                                    i4 = o16;
                                    z = true;
                                } else {
                                    i3 = o13;
                                    i6 = i12;
                                    i4 = o16;
                                    z = false;
                                }
                                int i13 = o.getInt(i4);
                                o16 = i4;
                                int[] w = hr1.w(3);
                                int i14 = o12;
                                int length = w.length;
                                int i15 = i2;
                                int i16 = 0;
                                while (i16 < length) {
                                    int i17 = w[i16];
                                    int[] iArr = w;
                                    if (c3d.b(i17) == i13) {
                                        int i18 = o17;
                                        ArrayList arrayList3 = arrayList2;
                                        arrayList3.add(new ftd(j, j2, i7, i8, string, j3, string2, string3, string4, q0, i, j4, str, z, i17, o.isNull(i18) ? null : o.getString(i18)));
                                        arrayList = arrayList3;
                                        o17 = i18;
                                        o12 = i14;
                                        o13 = i3;
                                        o2 = i9;
                                        o3 = i10;
                                        o15 = i15;
                                    } else {
                                        List list = q0;
                                        ArrayList arrayList4 = arrayList2;
                                        i16++;
                                        o17 = o17;
                                        q0 = list;
                                        w = iArr;
                                    }
                                }
                                Locale locale = Locale.ENGLISH;
                                throw new IllegalArgumentException("No such value " + i13 + " for StickerAuthorType");
                            }
                            ArrayList arrayList5 = arrayList2;
                            o.close();
                            pec.m();
                            ArrayList arrayList6 = new ArrayList(q23.H(arrayList5, 10));
                            Iterator it = arrayList5.iterator();
                            while (it.hasNext()) {
                                ftd ftd = (ftd) it.next();
                                ? obj = new Object();
                                obj.a = ftd.a;
                                obj.b = ftd.b;
                                obj.c = ftd.c;
                                obj.d = ftd.d;
                                obj.e = ftd.e;
                                obj.f = ftd.f;
                                obj.g = ftd.g;
                                obj.h = ftd.h;
                                obj.i = ftd.i;
                                obj.j = ftd.j;
                                obj.k = ftd.k;
                                obj.l = ftd.l;
                                obj.m = ftd.m;
                                obj.n = ftd.n;
                                obj.o = ftd.o;
                                obj.p = ftd.p;
                                arrayList6.add(new dtd(obj));
                            }
                            Iterator it2 = arrayList6.iterator();
                            while (it2.hasNext()) {
                                dtd dtd = (dtd) it2.next();
                                ? obj2 = new Object();
                                obj2.a = dtd.c;
                                obj2.b = dtd.o;
                                obj2.c = dtd.X;
                                obj2.d = dtd.Y;
                                obj2.e = dtd.Z;
                                obj2.f = dtd.w0;
                                obj2.g = dtd.x0;
                                obj2.h = dtd.y0;
                                obj2.i = dtd.z0;
                                obj2.j = dtd.A0;
                                obj2.k = dtd.B0;
                                obj2.l = dtd.C0;
                                obj2.m = dtd.D0;
                                obj2.n = dtd.E0;
                                obj2.o = dtd.F0;
                                osd b2 = obj2.b();
                                zsd.a.put(Long.valueOf(b2.a), b2);
                            }
                            ConcurrentHashMap concurrentHashMap = zsd.b;
                            synchronized (zsd) {
                                try {
                                    Object y = lp.y(((mg5) ((bf5) zsd.e.get())).p());
                                    if (y != null) {
                                        Map map = (Map) y;
                                        if (!map.isEmpty()) {
                                            concurrentHashMap.putAll(map);
                                        }
                                    }
                                } catch (Exception e) {
                                    udd.o("zsd", "Failed to load initial showcase", e);
                                    ((j2b) zsd.d).a.k("user.stickersLastSync", 0L);
                                }
                            }
                            zsd.l.c(zsd.b.values());
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        o.close();
                        pec.m();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    pec = a2;
                    o.close();
                    pec.m();
                    throw th;
                }
        }
    }
}
