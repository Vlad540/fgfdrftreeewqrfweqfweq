package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.waiting_room.ConversationWaitingParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: joc  reason: default package */
public final /* synthetic */ class joc implements StatsObserver, iba, j26, tn1, au, bid, of3, lh7, l7e, yx7, h73 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ joc(bye bye) {
        this.a = 15;
        rxe rxe = rxe.UPLOADING;
        this.b = bye;
        this.c = rxe;
    }

    public void J(jba jba) {
        ((s16) this.b).invoke();
        int i = bld.$EnumSwitchMapping$0[jba.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            ((s16) this.c).invoke();
        }
    }

    public Object a() {
        switch (this.a) {
            case 13:
                xic xic = ((vxe) this.b).c;
                xic.getClass();
                Iterable iterable = (Iterable) this.c;
                if (!iterable.iterator().hasNext()) {
                    return null;
                }
                xic.m().compileStatement("DELETE FROM events WHERE _id in " + xic.m0(iterable)).execute();
                return null;
            default:
                vxe vxe = (vxe) this.b;
                vxe.getClass();
                for (Map.Entry entry : ((Map) this.c).entrySet()) {
                    vxe.i.U((long) ((Integer) entry.getValue()).intValue(), qn7.Z, (String) entry.getKey());
                }
                return null;
        }
    }

    public void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 7:
                ((yfe) obj3).a.put((CharSequence) obj2, (xfe) obj);
                return;
            case 10:
                ewe ewe = (ewe) obj3;
                ewe.getClass();
                if (((Throwable) obj) instanceof HttpUrlExpiredException) {
                    vve b2 = ((wve) obj2).b();
                    b2.d = null;
                    b2.e = 0.0f;
                    ewe.b(b2.a());
                    return;
                }
                return;
            case 11:
                ewe ewe2 = (ewe) obj3;
                ewe2.getClass();
                StringBuilder sb = new StringBuilder("onErrorUpload: data=");
                fwe fwe = (fwe) obj2;
                sb.append(fwe);
                udd.s("ewe", sb.toString(), (Throwable) obj);
                ewe2.d(fwe);
                ewe2.c(fwe);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Throwable th = (Throwable) obj;
                hxe hxe = (hxe) obj3;
                hxe.getClass();
                if ((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b)) {
                    fwe b3 = hxe.b((ys8) obj2);
                    ewe ewe3 = hxe.a;
                    ewe3.d(b3);
                    ewe3.c(b3);
                    return;
                }
                return;
            case 22:
                j3f j3f = (j3f) obj3;
                j3f.getClass();
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder("onError: conversionData=");
                a3f a3f = (a3f) obj2;
                sb2.append(a3f);
                udd.s("j3f", sb2.toString(), (Throwable) obj);
                j3f.a(a3f);
                return;
            default:
                Throwable th2 = (Throwable) obj;
                l8f l8f = (l8f) obj3;
                if (!l8f.a(th2)) {
                    bd bdVar = (bd) l8f.c.get();
                    n10 n10 = (n10) obj2;
                    if (bdVar != null) {
                        if (r1g.p(n10.i)) {
                            bdVar.f("ACTION_VIDEO_FETCH_FAILURE");
                        } else {
                            bdVar.g("ACTION_VIDEO_FETCH_FAILURE", n10.i);
                        }
                    }
                    udd.s("VideoRipper", "ripVideo: failed to fetch " + n10.h, th2);
                    return;
                }
                return;
        }
    }

    public ch7 apply(Object obj) {
        switch (this.a) {
            case 5:
                List list = (List) obj;
                ((p7e) this.b).toString();
                Objects.toString(list);
                if (list.isEmpty()) {
                    return new as6(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
                }
                if (!list.contains((Object) null)) {
                    return ct0.w(list);
                }
                return new as6(1, new DeferrableSurface.SurfaceClosedException((xc4) ((List) this.c).get(list.indexOf((Object) null)), "Surface closed"));
            default:
                Void voidR = (Void) obj;
                ecc ecc = (ecc) this.b;
                ecc.getClass();
                List list2 = (List) this.c;
                Integer num = (Integer) ((pw1) list2.get(0)).b.d(pw1.j, 100);
                Objects.requireNonNull(num);
                int intValue = num.intValue();
                Integer num2 = (Integer) ((pw1) list2.get(0)).b.d(pw1.i, 0);
                Objects.requireNonNull(num2);
                int intValue2 = num2.intValue();
                ydc ydc = ((nzd) ((sic) ecc.d).b).u;
                if (ydc != null) {
                    return ((r4e) ydc.b).b(intValue, intValue2);
                }
                return new as6(1, new Exception("Failed to take picture: pipeline is not ready."));
        }
    }

    public void b(x63 x63) {
        switch (this.a) {
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                bye bye = (bye) this.b;
                String str = (String) this.c;
                bye.getClass();
                udd.q("bye", "removeUploadWithPhotoToken: token=" + str);
                synchronized (bye) {
                    bye.a.e(str).e(((zxe) bye.b.getValue()).e(str)).a();
                }
                if (!x63.h()) {
                    x63.b();
                    return;
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                bye bye2 = (bye) this.b;
                wve wve = (wve) this.c;
                bye2.getClass();
                udd.q("bye", "putUpload: upload=" + wve);
                synchronized (bye2) {
                    bye2.a.a(wve).e(((zxe) bye2.b.getValue()).a(wve)).a();
                }
                if (!x63.h()) {
                    x63.b();
                    return;
                }
                return;
            case 18:
                dye dye = (dye) this.b;
                dye.getClass();
                wve wve2 = (wve) this.c;
                ((Map) dye.b).put(wve2.a, wve2);
                x63.b();
                return;
            default:
                dye dye2 = (dye) this.b;
                v1b v1b = (v1b) this.c;
                synchronized (((Map) dye2.b)) {
                    try {
                        Iterator it = ((Map) dye2.b).entrySet().iterator();
                        while (it.hasNext()) {
                            qxe qxe = ((wve) ((Map.Entry) it.next()).getValue()).h;
                            if (qxe != null) {
                                if (v1b.test(qxe)) {
                                    it.remove();
                                }
                            }
                        }
                    } finally {
                        while (true) {
                            break;
                        }
                    }
                }
                if (!x63.h()) {
                    x63.b();
                    return;
                }
                return;
        }
    }

    public void c(ex7 ex7) {
        List list;
        bye bye = (bye) this.b;
        bye.getClass();
        udd.q("bye", "getUploadsWithStatus: uploadStatus=" + ((rxe) this.c));
        synchronized (bye) {
            list = (List) ((zxe) bye.b.getValue()).f().b();
        }
        if (ex7.h()) {
            return;
        }
        if (list == null || list.isEmpty()) {
            ex7.b();
        } else {
            ex7.a(list);
        }
    }

    public void invoke(Object obj) {
        ig8 ig8 = (ig8) obj;
        kqe kqe = (kqe) this.b;
        kqe.t.getClass();
        o55 a2 = kqe.q.a();
        String str = ig8.b;
        ExportException exportException = (ExportException) this.c;
        udd.s(str, "onError", exportException);
        RuntimeException runtimeException = new RuntimeException("Media transform failed", exportException);
        gg8 gg8 = ig8.a;
        gg8.f.set(a2);
        gg8.g.set(runtimeException);
        ig8.a();
    }

    public void j(ihd ihd) {
        ArrayList arrayList;
        boolean z;
        ihd ihd2 = ihd;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 6:
                ybe ybe = (ybe) obj2;
                ybe.getClass();
                wbe wbe = new wbe(0, ihd2);
                t97 t97 = ybe.B0;
                ((dce) t97.getValue()).f(false);
                vbe vbe = new vbe(wbe);
                dce dce = (dce) t97.getValue();
                ibe ibe = (ibe) obj;
                long d = ybe.d(ibe);
                u1d u1d = (u1d) dce.Z.get();
                if (u1d != null && !dce.e(ibe, vbe)) {
                    u1d.g(ibe, false, d, vbe);
                    return;
                }
                return;
            case 21:
                j3f j3f = (j3f) obj2;
                j3f.getClass();
                z2f z2f = (z2f) obj;
                a3f a3f = z2f.a;
                o6a o6a = j3f.a;
                xh0 xh0 = (xh0) o6a;
                String str = z2f.c;
                xh0.getClass();
                rjb rjb = null;
                try {
                    arrayList = ete.y(Uri.parse(str), xh0.a, xh0);
                } catch (Throwable th) {
                    udd.s("xh0", "getAvailableQualitiesForVideo: failed", th);
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    qjb qjb = a3f.b.a;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        rjb rjb2 = rjb;
                        while (true) {
                            if (it.hasNext()) {
                                rjb = (rjb) it.next();
                                if (rjb.a == qjb) {
                                }
                            } else if (rjb2 != null) {
                                boolean z2 = rjb2.f;
                                f3f f3f = a3f.b;
                                if (!z2 || f3f.b != 0.0f || f3f.c != 1.0f || f3f.d) {
                                    zl3.j(z2f.d);
                                    try {
                                        z = o6a.e(z2f.c, z2f.d, f3f.b, f3f.c, rjb2, f3f.d, new are(20));
                                        bd bdVar = j3f.d;
                                        if (z) {
                                            bdVar.f("VIDEO_CONVERT_SUCCESS");
                                        } else {
                                            bdVar.f("VIDEO_CONVERT_ERROR");
                                        }
                                    } catch (InterruptedException e) {
                                        if (!ihd.h()) {
                                            ihd2.onError(e);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    e06 a2 = z2f.a();
                                    a2.o = str;
                                    z2f = new z2f(a2);
                                    z = true;
                                }
                                if (ihd.h()) {
                                    return;
                                }
                                if (z) {
                                    e06 a3 = z2f.a();
                                    a3.a = true;
                                    ihd2.a(new z2f(a3));
                                    return;
                                }
                                ihd2.onError(new RuntimeException("failed to convert video"));
                                return;
                            } else if (!ihd.h()) {
                                ihd2.onError(new RuntimeException("no available quality found for video"));
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (!ihd.h()) {
                    ihd2.onError(new RuntimeException("no available qualities for video"));
                    return;
                } else {
                    return;
                }
                break;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$1((WaitingRoomParticipants) obj2, (ConversationWaitingParticipantId) obj, ihd2);
                return;
        }
    }

    public void onComplete(StatsReport[] statsReportArr) {
        String str;
        StatsReport[] statsReportArr2 = statsReportArr;
        izc izc = (izc) this.b;
        izc.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = statsReportArr2.length;
        int i = 0;
        while (i < length) {
            StatsReport statsReport = statsReportArr2[i];
            if ("ssrc".equals(statsReport.type) && "ssrc".equals(statsReport.type)) {
                StatsReport.Value[] valueArr = statsReport.values;
                int length2 = valueArr.length;
                int i2 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    StatsReport.Value value = valueArr[i2];
                    if ("googTrackId".equals(value.name)) {
                        String str2 = value.value;
                        if (str2 != null && str2.endsWith("audio-mix")) {
                            arrayList2.add(new wwf((ge1) null, true, false));
                            arrayList.add(statsReport);
                            break;
                        }
                        String str3 = value.value;
                        ge1 b2 = (TextUtils.isEmpty(str3) || !str3.startsWith("audio-") || str3.length() == 6) ? null : ge1.b(str3.substring(6));
                        if (b2 == null) {
                            b2 = x87.x0(str3);
                        }
                        if (b2 == null) {
                            d dVar = izc.w0;
                            if (!(dVar == null || (str = value.value) == null || !str.startsWith(((jl7) dVar.a().b).m))) {
                                arrayList2.add(new wwf((ge1) null, false, true));
                                arrayList.add(statsReport);
                                break;
                            }
                        } else {
                            arrayList2.add(new wwf(b2, false, false));
                            arrayList.add(statsReport);
                            break;
                        }
                    } else if ("mediaType".equals(value.name) && MediaStreamTrack.AUDIO_TRACK_KIND.equals(value.value)) {
                        z = true;
                    } else if ("packetsReceived".equals(value.name)) {
                        z2 = true;
                    }
                    if (z && z2) {
                        arrayList2.add(new wwf((ge1) null, true, false));
                        arrayList.add(statsReport);
                        break;
                    }
                    i2++;
                    StatsReport[] statsReportArr3 = statsReportArr;
                }
            }
            i++;
            statsReportArr2 = statsReportArr;
        }
        izc.a.post(new co1(izc, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[0]), arrayList2, (jsd) this.c, 7));
    }

    public String z(sn1 sn1) {
        switch (this.a) {
            case 4:
                y4e y4e = (y4e) this.b;
                y4e.getClass();
                ((AtomicReference) this.c).set(sn1);
                return "SurfaceRequest-surface-recreation(" + y4e.hashCode() + ")";
            case 8:
                jhe jhe = (jhe) this.b;
                y4e y4e2 = jhe.h;
                mh4 j = pa2.j();
                jv1 jv1 = new jv1(9, sn1);
                Surface surface = (Surface) this.c;
                y4e2.b(surface, j, jv1);
                return "provideSurface[request=" + jhe.h + " surface=" + surface + "]";
            default:
                ((h2f) this.b).getClass();
                Integer valueOf = Integer.valueOf(sn1.hashCode());
                y1d y1d = (y1d) this.c;
                ((nc9) y1d.b.g).a.put("androidx.camera.video.VideoCapture.streamUpdate", valueOf);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                d2f d2f = new d2f(atomicBoolean, sn1, y1d);
                sn1.a(new ncd(atomicBoolean, y1d, d2f, 11), pa2.j());
                y1d.b.b(d2f);
                return String.format("%s[0x%x]", new Object[]{"androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(sn1.hashCode())});
        }
    }

    public /* synthetic */ joc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [vtd, java.lang.Object] */
    /* renamed from: apply  reason: collision with other method in class */
    public Object m4apply(Object obj) {
        ((lud) this.b).getClass();
        bud bud = (bud) this.c;
        long j = bud.a;
        ? obj2 = new Object();
        obj2.a = j;
        obj2.b = bud.b;
        obj2.c = bud.c;
        obj2.d = bud.d;
        obj2.e = bud.e;
        obj2.f = bud.f;
        obj2.g = bud.g;
        obj2.h = (List) obj;
        obj2.i = bud.i;
        return new xtd(obj2);
    }
}
