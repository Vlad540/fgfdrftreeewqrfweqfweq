package defpackage;

import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;

/* renamed from: rgc  reason: default package */
public final /* synthetic */ class rgc implements NativeDoubleArrayConsumer.Consumer, kx9, of3, tn1, otc, h67, d1a, ym1, VideoTracker, CallsAudioManager.OnAudioDeviceInfoChangeListener, au, mr6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rgc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 18:
                gm1.J((gm1) obj, z);
                return;
            default:
                sm1.w((sm1) obj, z);
                return;
        }
    }

    public void accept(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 3:
                Long l = (Long) obj;
                uy uyVar = (uy) this.b;
                LiveVideoPlaceHolderView liveVideoPlaceHolderView = uyVar.s;
                if (liveVideoPlaceHolderView != null && liveVideoPlaceHolderView.getVisibility() == 0) {
                    if (!ete.a0(vl.b().n(), uyVar.i)) {
                        uyVar.s.setVisibility(8);
                    } else {
                        uyVar.s.x();
                    }
                    ty tyVar = uyVar.h;
                    if (tyVar != null) {
                        tyVar.j();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Throwable th = (Throwable) obj;
                udd.s("oz", "Can't download attach", (Throwable) null);
                ((oz) this.b).a.C(false);
                return;
            case 5:
                ((n83) this.b).a((xi4) obj);
                return;
            case 6:
                ((Map) this.b).putAll((Map) obj);
                return;
            case 7:
                m00 m00 = (m00) obj;
                if (m00.e != null) {
                    z = true;
                }
                if (!z && m00.d == null && m00.r == null) {
                    udd.s("w10", "Attach is not audio/video/file. Ignore", (Throwable) null);
                    return;
                } else if (m00.w == c10.c) {
                    udd.s("w10", "Try to update processingOnServerStatus from PROCESSED. Ignore", (Throwable) null);
                    return;
                } else {
                    m00.w = (c10) this.b;
                    return;
                }
            case 9:
                sh0 sh0 = (sh0) this.b;
                sh0.a.w((om0) obj);
                sh0.a.y();
                return;
            default:
                lb1 lb1 = (lb1) this.b;
                List list = (List) obj;
                synchronized (lb1) {
                    udd.p("lb1", "onLoaded: " + list.size(), new Object[0]);
                    Iterator it = lb1.e.iterator();
                    if (it.hasNext()) {
                        hr1.r(it.next());
                        throw null;
                    }
                }
                return;
        }
    }

    public ch7 apply(Object obj) {
        yr1 yr1 = (yr1) this.b;
        yr1.getClass();
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return as6.c;
        }
        long j = yr1.g;
        ak0 ak0 = new ak0(12);
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        as1 as1 = new as1(ak0);
        zq1 zq1 = yr1.d;
        zq1.p(as1);
        dr1 dr1 = new dr1(zq1, 4, as1);
        vn1 vn1 = as1.b;
        vn1.b.c(dr1, zq1.c);
        return hwf.f(new vd4(vn1, yr1.c, millis));
    }

    public Object b(CameraCharacteristics.Key key) {
        return ((et1) this.b).a(key);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00df, code lost:
        r10 = (defpackage.py0) ((defpackage.vx0) r10.p0().w0.getValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r11) {
        /*
            r10 = this;
            r0 = 0
            k77[] r1 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            int r1 = defpackage.o1a.U0
            java.lang.Object r10 = r10.b
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r10 = (one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget) r10
            if (r11 != r1) goto L_0x0030
            td1 r10 = r10.p0()
            r10.getClass()
            gh1 r11 = new gh1
            po1 r0 = r10.X
            grd r0 = r0.b()
            java.lang.Object r0 = r0.getValue()
            zw3 r0 = (defpackage.zw3) r0
            java.lang.String r0 = r0.d
            java.lang.String r0 = defpackage.at7.W(r0)
            r11.<init>(r0)
            l05 r10 = r10.G0
            taf.o(r10, r11)
            goto L_0x0100
        L_0x0030:
            int r1 = defpackage.o1a.T0
            if (r11 != r1) goto L_0x0059
            td1 r10 = r10.p0()
            r10.getClass()
            qh1 r11 = new qh1
            po1 r0 = r10.X
            grd r0 = r0.b()
            java.lang.Object r0 = r0.getValue()
            zw3 r0 = (defpackage.zw3) r0
            java.lang.String r0 = r0.d
            java.lang.String r0 = defpackage.at7.W(r0)
            r11.<init>(r0)
            l05 r10 = r10.G0
            taf.o(r10, r11)
            goto L_0x0100
        L_0x0059:
            int r1 = defpackage.o1a.b
            k88 r2 = k88.b
            if (r11 != r1) goto L_0x009b
            td1 r10 = r10.p0()
            t97 r11 = r10.w0
            java.lang.Object r11 = r11.getValue()
            vx0 r11 = (defpackage.vx0) r11
            py0 r11 = (defpackage.py0) r11
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r3 = r11.e()
            if (r3 == 0) goto L_0x0093
            ht7 r0 = new ht7
            r0.<init>()
            j88 r1 = j88.b
            r0.put(r1, r2)
            ht7 r4 = r0.b()
            by0 r6 = new by0
            r0 = 3
            r6.<init>(r11, r0)
            cy0 r7 = new cy0
            r0 = 1
            r7.<init>(r11, r0)
            r5 = 0
            r8 = 2
            r9 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForAll$default(r3, r4, r5, r6, r7, r8, r9)
        L_0x0093:
            ch1 r11 = defpackage.ch1.C
            l05 r10 = r10.G0
            taf.o(r10, r11)
            goto L_0x0100
        L_0x009b:
            int r1 = defpackage.o1a.d
            if (r11 != r1) goto L_0x00db
            td1 r10 = r10.p0()
            t97 r11 = r10.w0
            java.lang.Object r11 = r11.getValue()
            vx0 r11 = (defpackage.vx0) r11
            py0 r11 = (defpackage.py0) r11
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r3 = r11.e()
            if (r3 == 0) goto L_0x00d3
            ht7 r0 = new ht7
            r0.<init>()
            j88 r1 = j88.a
            r0.put(r1, r2)
            ht7 r4 = r0.b()
            by0 r6 = new by0
            r0 = 4
            r6.<init>(r11, r0)
            cy0 r7 = new cy0
            r0 = 2
            r7.<init>(r11, r0)
            r5 = 0
            r8 = 2
            r9 = 0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.updateMediaOptionsForAll$default(r3, r4, r5, r6, r7, r8, r9)
        L_0x00d3:
            ch1 r11 = defpackage.ch1.C
            l05 r10 = r10.G0
            taf.o(r10, r11)
            goto L_0x0100
        L_0x00db:
            int r1 = defpackage.o1a.c
            if (r11 != r1) goto L_0x0100
            td1 r10 = r10.p0()
            t97 r10 = r10.w0
            java.lang.Object r10 = r10.getValue()
            vx0 r10 = (defpackage.vx0) r10
            py0 r10 = (defpackage.py0) r10
            ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager r11 = r10.f()
            if (r11 == 0) goto L_0x0100
            by0 r1 = new by0
            r1.<init>(r10, r0)
            cy0 r2 = new cy0
            r2.<init>(r10, r0)
            r11.lowerHandForAll(r1, r2)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgc.c(int):void");
    }

    public void consume(Double[] dArr) {
        ((AtomicInteger) ((h2d) ((bd4) this.b).o).Z).incrementAndGet();
    }

    public void d() {
        sgc sgc = (sgc) this.b;
        if (sgc.f) {
            Iterator it = sgc.e().iterator();
            int i = 0;
            while (it.hasNext()) {
                ww9 ww9 = ((vgc) it.next()).a.onBackPressedCallback;
                int i2 = i + 1;
                boolean z = true;
                if (i <= 0 && sgc.e == 1) {
                    z = false;
                }
                ww9.f(z);
                i = i2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    public void f(nr6 nr6) {
        j54 j54 = (j54) this.b;
        j54.getClass();
        try {
            lr6 c = nr6.c();
            if (c != null) {
                j54.I(c);
                return;
            }
            s4b s4b = (s4b) j54.a;
            if (s4b != null) {
                j54.K(new eb0(s4b.a, new Exception("Failed to acquire latest image", (Throwable) null)));
            }
        } catch (IllegalStateException e) {
            s4b s4b2 = (s4b) j54.a;
            if (s4b2 != null) {
                j54.K(new eb0(s4b2.a, new Exception("Failed to acquire latest image", e)));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [ig7, ux0] */
    public int i(int i) {
        switch (this.a) {
            case 13:
                yy0 yy0 = (pg7) ((CallAdminSettingsScreen) this.b).c.C(i);
                int a2 = yy0.a();
                if (yy0.i()) {
                    return a2;
                }
                return 0;
            default:
                return ((pg7) ((CallLinkInfoScreen) this.b).D0.C(i)).v();
        }
    }

    public void onAudioDeviceChanged(CallsAudioManager.AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent) {
        Object value;
        mc9 mc9 = (mc9) ((po1) this.b).p.getValue();
        do {
            value = mc9.getValue();
            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
        } while (!mc9.b(value, audioDeviceInfoChangedEvent.getNewDevice()));
    }

    public void onFailure(Exception exc) {
        vp.a.getClass();
        ek8.G((Activity) this.b, up.b);
    }

    public Object parse(m67 m67) {
        return CallAnalyticsApiRequest.a((CallAnalyticsApiRequest) this.b, m67);
    }

    public boolean preferSpeakerOverEarpiece() {
        return ((Boolean) ((gc9) ((e77) this.b)).invoke()).booleanValue();
    }

    public String z(sn1 sn1) {
        switch (this.a) {
            case 8:
                d60 d60 = (d60) this.b;
                d60.a.execute(new c(d60, 10, sn1));
                return "AudioSource-release";
            case 22:
                zq1 zq1 = (zq1) this.b;
                zq1.getClass();
                zq1.c.execute(new c(zq1, 28, sn1));
                return "updateSessionConfigAsync";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                tr1 tr1 = (tr1) this.b;
                tr1.a.h.d(sn1);
                tr1.b.b = true;
                return "AePreCapture";
            case 25:
                ((vr1) this.b).b.i.c();
                sn1.b((Object) null);
                return "invokePostCaptureFuture";
            default:
                ((as1) this.b).a = sn1;
                return "waitFor3AResult";
        }
    }
}
