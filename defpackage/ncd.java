package defpackage;

import android.content.Context;
import android.media.projection.MediaProjection;
import android.text.TextUtils;
import android.util.Size;
import androidx.media3.transformer.ExportException;
import com.my.tracker.obfuscated.g0;
import com.my.tracker.obfuscated.t;
import com.my.tracker.obfuscated.z0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ncd  reason: default package */
public final /* synthetic */ class ncd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ncd(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final void run() {
        boolean z;
        int i;
        int i2 = 6;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ocd ocd = (ocd) this.b;
                EglBase eglBase = (EglBase) this.c;
                xwb xwb = (xwb) this.o;
                ocd.h = eglBase;
                xwb.log("SharedPeerConnectionFac", "create");
                ocd.c = "H264";
                xwb.log("SharedPeerConnectionFac", "Preferred video codec: " + ocd.c);
                xwb.log("SharedPeerConnectionFac", "Create internal peer connection factory ...");
                m50 m50 = new m50(xwb);
                f2b f2b = new f2b(m50, xwb, false, 5);
                JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(ContextUtils.getApplicationContext());
                e3 e3Var = new e3(20);
                ocd.f = e3Var;
                ocd.g = builder.setAudioRecordSampleHook(e3Var).setAudioRecordStateCallback(m50).setAudioRecordErrorCallback(f2b).setAudioTrackStateCallback(m50).setAudioTrackErrorCallback(m50).setUseSilenceProvider(true).createAudioDeviceModule();
                if (zla.A().g) {
                    ocd.g.setMicrophoneMute(true);
                }
                cma A = zla.A();
                String str = "WebRTC-IntelVP8/Enabled/WebRTC-Audio-SendSideBwe/Enabled/WebRTC-SendSideBwe-WithOverhead/Enabled/WebRTC-FeedbackTimeout/Enabled/WebRTC-Bwe-SafeResetOnRouteChange/Enabled/".concat((A.a || A.b) ? "WebRTC-Audio-Red-For-Opus/Enabled-2/" : "WebRTC-Audio-Red-For-Opus/Disabled/") + "WebRTC-SpsPpsIdrIsH264Keyframe/Enabled/";
                String str2 = A.c;
                if (!TextUtils.isEmpty(str2)) {
                    str = str + "WebRTC-OK-StunCustomAttr/Enabled-" + str2 + "/";
                }
                String str3 = A.d;
                if (!TextUtils.isEmpty(str3)) {
                    str = str + "WebRTC-OK-TurnChannelDataMark/" + str3 + "/";
                }
                Integer num = A.e;
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue < 0) {
                        intValue = 1000;
                    }
                    str = str + "WebRTC-RttMult/Enabled-1.0," + intValue + "/";
                }
                String str4 = str + "WebRTC-Bwe-LossBasedBweV2/Enabled:true,CandidateFactors:1.02|1.0|0.95,DelayBasedCandidate:true,HigherBwBiasFactor:0.0002,HigherLogBwBiasFactor:0.02,ObservationDurationLowerBound:250ms,InstantUpperBoundBwBalance:75kbps,BwRampupUpperBoundFactor:1000000.0,InstantUpperBoundTemporalWeightFactor:0.9,TemporalWeightFactor:0.9,MaxIncreaseFactor:1.3,NewtonStepSize:0.75,InherentLossUpperBoundBwBalance:75kbps,LossThresholdOfHighBandwidthPreference:0.15,NotIncreaseIfInherentLossLessThanAverageLoss:true,_20230522/";
                if (A.f) {
                    str4 = str4 + "CallsSDK-Audio-EarlyStartPlayout/Enabled/";
                }
                if (A.g) {
                    str4 = str4 + "CallsSDK-Audio-EarlyStartRecording/Enabled/";
                }
                if (A.h) {
                    str4 = str4 + "WebRTC-IceFieldTrials/skip_relay_to_non_relay_connections:true/";
                }
                bma bma = A.j;
                if (bma == null || !bma.a) {
                    z = false;
                } else {
                    Boolean bool = Boolean.TRUE;
                    if (hhd.f(bma.c, bool)) {
                        str4 = str4 + "CallsSDK-Audio-OpusFECWithDRED/Enabled/";
                    }
                    if (hhd.f(bma.b, bool)) {
                        str4 = str4 + "CallsSDK-Audio-OpusNOLACE/Enabled/";
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer num2 = bma.f;
                    if (num2 != null) {
                        str4 = str4 + "CallsSDK-Audio-OpusDREDByBitrate/Enabled:" + num2 + "/";
                    }
                    Integer num3 = bma.e;
                    if (num3 != null) {
                        str4 = str4 + "CallsSDK-Audio-OpusAdapterMinBitrate/Enabled:" + num3 + "/";
                    }
                    if (hhd.f(bma.d, bool)) {
                        str4 = str4 + cma.a(z);
                        z2 = true;
                    }
                }
                ama b2 = A.b();
                Integer num4 = b2.b;
                int intValue2 = num4 != null ? num4.intValue() : 6;
                Integer num5 = b2.a;
                if (num5 != null) {
                    i2 = num5.intValue();
                }
                Boolean bool2 = b2.c;
                String str5 = str4 + "WebRTC-Audio-AdaptivePtime/enabled:true,min_payload_bitrate:" + intValue2 + "kbps,min_encoder_bitrate:" + i2 + "kbps,use_slow_adaptation:" + (bool2 != null ? bool2.booleanValue() : true) + "/";
                if (A.k && !z2) {
                    str5 = str5 + cma.a(z);
                }
                String str6 = A.l;
                if (!(str6 == null || str6.length() == 0)) {
                    str5 = str5 + str6;
                }
                xwb.log("SharedPeerConnectionFac", "Field trials: " + str5);
                PeerConnectionFactory.initializeFieldTrials(str5);
                ocd.d = PeerConnectionFactory.builder().setVideoDecoderFactory(ocd.e).setVideoEncoderFactory(ocd.j).setAudioDeviceModule(ocd.g).createPeerConnectionFactory();
                if (ocd.d != null) {
                    xwb.log("SharedPeerConnectionFac", d59.c(ocd.d) + " was created");
                    boolean z3 = d59.a ^ true;
                    xwb.log("SharedPeerConnectionFac", "Is VIDEO HW acceleration enabled? ".concat(z3 ? "yes" : "no"));
                    if (z3 && eglBase != null) {
                        xwb.log("SharedPeerConnectionFac", "Enable video hardware acceleration options for " + d59.c(ocd.d));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            case 1:
                ocd ocd2 = (ocd) this.b;
                MediaProjection mediaProjection = (MediaProjection) this.o;
                ocd2.getClass();
                jl7 jl7 = ((d) this.c).D0;
                if (jl7 != null) {
                    jl7.j(true);
                }
                ocd2.g.startDeviceAudioShare(mediaProjection);
                return;
            case 2:
                mfd mfd = (mfd) this.b;
                boolean z4 = mfd.p;
                JSONObject jSONObject = (JSONObject) this.c;
                xwb xwb2 = mfd.b;
                if (!z4) {
                    xwb2.log("OKSignaling", "<!> ignoring " + jSONObject.toString());
                    return;
                }
                try {
                    Iterator it = mfd.l.iterator();
                    while (it.hasNext()) {
                        ((lfd) it.next()).k(jSONObject);
                    }
                    return;
                } catch (JSONException e) {
                    xwb2.reportException("OKSignaling", (String) this.o, e);
                    return;
                }
            case 3:
                StereoRoomManagerImpl.withInternalId$lambda$12((StereoRoomManagerImpl) this.b, (ParticipantId) this.c, (u16) this.o);
                return;
            case 4:
                ssd ssd = ((rsd) this.b).a;
                if (ssd.f != null) {
                    String str7 = (String) this.o;
                    boolean p = r1g.p(str7);
                    File file = (File) this.c;
                    if (!p) {
                        mg5 mg5 = (mg5) ssd.e;
                        mg5.getClass();
                        File r = lp.r(mg5.g(mg5.b(), "stickerCache"), js.e(str7));
                        if (!r.exists() || !r.canRead()) {
                            try {
                                r.getParentFile().mkdirs();
                                ete.r(file, r);
                            } catch (IOException unused) {
                            }
                        }
                        file = r;
                    }
                    ssd.c(ssd.f, file);
                    return;
                }
                return;
            case 5:
                ((ydc) this.b).t((o4e) this.c, (Map.Entry) this.o);
                return;
            case 6:
                b5e b5e = ((c5e) this.b).f;
                y4e y4e = b5e.b;
                if (y4e != null) {
                    Objects.toString(y4e);
                    b5e.b.d();
                }
                boolean z5 = b5e.Z;
                y4e y4e2 = (y4e) this.c;
                if (z5) {
                    b5e.Z = false;
                    y4e2.d();
                    y4e2.j.b((Object) null);
                    return;
                }
                b5e.b = y4e2;
                b5e.o = (xz) this.o;
                Size size = y4e2.b;
                b5e.a = size;
                b5e.Y = false;
                if (!b5e.a()) {
                    b5e.w0.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                    return;
                }
                return;
            case 7:
                oqe oqe = (oqe) this.b;
                oqe.getClass();
                e8c j = ((ts6) this.c).j();
                ydc ydc = oqe.d;
                String str8 = (String) ydc.c;
                String str9 = (String) ydc.o;
                k2e k2e = oqe.e;
                k2e.getClass();
                ExportException exportException = (ExportException) this.o;
                int i3 = exportException.a;
                kqe kqe = (kqe) k2e.a;
                if (i3 == 7003 && ((i = kqe.v) == 5 || i == 6 || i == 1 || i == 2 || i == 3 || i == 4)) {
                    kqe.s = null;
                    kqe.r = null;
                    m55 m55 = kqe.q;
                    m55.b();
                    m55.p = 6;
                    kqe.a(kqe);
                    return;
                }
                kqe.q.a.e(j);
                m55 m552 = kqe.q;
                if (str8 != null) {
                    m552.g = str8;
                }
                if (str9 != null) {
                    m552.n = str9;
                }
                m552.q = exportException;
                kqe.r = null;
                joc joc = new joc(kqe, 9, exportException);
                qh7 qh7 = kqe.f;
                qh7.c(-1, joc);
                qh7.b();
                kqe.v = 0;
                return;
            case 8:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$0((UrlSharingListenerManagerImpl) this.b, (egd) this.c, (w2d) this.o);
                return;
            case 9:
                ch7 ch7 = (ch7) this.b;
                a4d a4d = (a4d) this.c;
                try {
                    try {
                        a4d.n(((zt) this.o).apply(swb.u(ch7)));
                        return;
                    } catch (Throwable th) {
                        a4d.m(th);
                        return;
                    }
                } catch (CancellationException unused2) {
                    a4d.cancel(false);
                    return;
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    a4d.m(e);
                    return;
                } catch (Error | RuntimeException e3) {
                    a4d.m(e3);
                    return;
                }
            case 10:
                a4d a4d2 = (a4d) this.b;
                Runnable runnable = (Runnable) this.c;
                Object obj = this.o;
                try {
                    if (!(a4d2.a instanceof q0)) {
                        runnable.run();
                        a4d2.l(obj);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    a4d2.m(th2);
                    return;
                }
            case 11:
                e07.p("Surface update cancellation should only occur on main thread.", gt0.C());
                ((AtomicBoolean) this.b).set(true);
                y1d y1d = (y1d) this.c;
                ps1 ps1 = (ps1) this.o;
                ((ArrayList) y1d.b.d).remove(ps1);
                y1d.e.remove(ps1);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.o);
                return;
            case 13:
                v4b v4b = (v4b) this.b;
                v4b.getClass();
                int i4 = oze.a;
                n45 n45 = ((h45) v4b.c).a;
                n45.getClass();
                g44 g44 = n45.H0;
                gd I = g44.I();
                g44.J(I, 1017, new v34(I, (xu5) this.c, (q24) this.o, 0));
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                d4b d4b = (d4b) this.b;
                d4b.getClass();
                int i5 = mze.a;
                g45 g45 = (g45) d4b.c;
                g45.getClass();
                m45 m45 = g45.a;
                m45.getClass();
                f44 f44 = m45.G0;
                fd P = f44.P();
                f44.Q(P, 1017, new t34(P, (vu5) this.c, (p24) this.o));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ahc ahc = (ahc) this.c;
                khc khc = (khc) this.o;
                jj7 jj7 = (jj7) this.b;
                Iterator it2 = ((CopyOnWriteArrayList) jj7.b).iterator();
                while (it2.hasNext()) {
                    ehc ehc = (ehc) it2.next();
                    try {
                        Long l = (Long) ehc.d.get(ahc);
                        if (l != null) {
                            ehc.b.log(ehc.a, "<- [" + l + "]: " + khc);
                        }
                    } catch (Throwable th3) {
                        ((xwb) jj7.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsuccess", th3);
                    }
                }
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                ahc ahc2 = (ahc) this.c;
                Throwable th4 = (Throwable) this.o;
                jj7 jj72 = (jj7) this.b;
                Iterator it3 = ((CopyOnWriteArrayList) jj72.b).iterator();
                while (it3.hasNext()) {
                    ehc ehc2 = (ehc) it3.next();
                    try {
                        Long l2 = (Long) ehc2.d.get(ahc2);
                        if (l2 != null) {
                            ehc2.b.log(ehc2.a, "<- [" + l2 + "]: " + th4);
                        }
                    } catch (Throwable th5) {
                        ((xwb) jj72.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th5);
                    }
                }
                return;
            default:
                g0.b((Context) this.b, (z0) this.c, (t) this.o);
                return;
        }
    }
}
