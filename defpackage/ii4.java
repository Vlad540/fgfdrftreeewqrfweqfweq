package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.EglRenderer;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ii4  reason: default package */
public final /* synthetic */ class ii4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ii4(tg5 tg5, Exception exc, long j) {
        this.a = 26;
        this.c = tg5;
        this.b = exc;
    }

    public final void run() {
        ix4 ix4;
        Executor executor;
        long j;
        boolean z;
        long j2;
        boolean z2;
        long j3;
        switch (this.a) {
            case 0:
                ji4 ji4 = (ji4) this.c;
                ji4.g--;
                SparseIntArray sparseIntArray = ji4.b;
                gi4 gi4 = (gi4) this.b;
                int i = sparseIntArray.get(gi4.o) - 1;
                int i2 = gi4.o;
                if (i == 0) {
                    sparseIntArray.delete(i2);
                    ji4.c.remove(gi4);
                    ji4.a.add(gi4);
                    return;
                }
                sparseIntArray.put(i2, i);
                return;
            case 1:
                ki4 ki4 = (ki4) this.c;
                ki4.g--;
                SparseIntArray sparseIntArray2 = ki4.b;
                gi4 gi42 = (gi4) this.b;
                int i3 = sparseIntArray2.get(gi42.o) - 1;
                int i4 = gi42.o;
                if (i3 == 0) {
                    sparseIntArray2.delete(i4);
                    ki4.c.remove(gi42);
                    ki4.a.add(gi42);
                    return;
                }
                sparseIntArray2.put(i4, i3);
                return;
            case 2:
                rl4.a((rl4) this.b, ((ql4) this.c).b.l);
                return;
            case 3:
                pp4 pp4 = (pp4) this.c;
                pp4.X++;
                y4e y4e = (y4e) this.b;
                boolean z3 = y4e.f;
                np4 np4 = pp4.a;
                w36.d((AtomicBoolean) np4.c, true);
                w36.c((Thread) np4.e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(z3 ? np4.o : np4.p);
                Size size = y4e.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                y4e.b(surface, pp4.c, new op4(pp4, surfaceTexture, surface));
                if (y4e.f) {
                    pp4.x0 = surfaceTexture;
                    return;
                }
                pp4.y0 = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(pp4, pp4.o);
                return;
            case 4:
                pp4 pp42 = (pp4) this.c;
                vd6 vd6 = pp42.c;
                q4e q4e = (q4e) this.b;
                Surface d = q4e.d(vd6, new cv1(pp42, 2, q4e));
                pp42.a.p(d);
                pp42.w0.put(q4e, d);
                return;
            case 5:
                ((EglRenderer) this.c).lambda$releaseEglSurface$3((Runnable) this.b);
                return;
            case 6:
                ((EglRenderer) this.c).lambda$release$0((CountDownLatch) this.b);
                return;
            case 7:
                ((xx4) this.c).m.remove((bx6) this.b);
                return;
            case 8:
                vx4 vx4 = (vx4) this.b;
                Objects.requireNonNull(vx4);
                ((Executor) this.c).execute(new oc4(12, vx4));
                return;
            case 9:
                ((xx4) this.c).l.remove((sn1) this.b);
                return;
            case 10:
                ((ls9) ((Map.Entry) this.c).getKey()).a((gs0) this.b);
                return;
            case 11:
                ((ls9) this.c).a((gs0) this.b);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                LinkedHashMap linkedHashMap = ((tx4) this.c).a;
                ls9 ls9 = (ls9) this.b;
                ls9.getClass();
                linkedHashMap.remove(ls9);
                return;
            case 13:
                xx4 xx4 = ((vx4) this.c).k;
                switch (hr1.t(xx4.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.b;
                        xx4.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(me4.r(xx4.D)));
                }
            case Protos.Attaches.Attach.LOCATION /*14*/:
                vx4 vx42 = (vx4) this.c;
                MediaFormat mediaFormat = (MediaFormat) this.b;
                if (vx42.j) {
                    String str = vx42.k.a;
                    return;
                }
                switch (hr1.t(vx42.k.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (vx42.k.b) {
                            xx4 xx42 = vx42.k;
                            ix4 = xx42.r;
                            executor = xx42.s;
                        }
                        try {
                            executor.execute(new ii4((Object) ix4, 15, (Object) mediaFormat));
                            return;
                        } catch (RejectedExecutionException unused) {
                            String str2 = vx42.k.a;
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(me4.r(vx42.k.D)));
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((ix4) this.c).p(new r34(11, (MediaFormat) this.b));
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                ((ix4) this.c).m((yw4) this.b);
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((fx4) this.c).a((Surface) this.b);
                return;
            case 18:
                n45 n45 = (n45) this.c;
                u45 u45 = (u45) this.b;
                int i5 = n45.X0 - u45.b;
                n45.X0 = i5;
                boolean z4 = true;
                if (u45.e) {
                    n45.Y0 = u45.c;
                    n45.Z0 = true;
                }
                if (i5 == 0) {
                    uza uza = ((uxa) u45.f).a;
                    if (!n45.v1.a.q() && uza.q()) {
                        n45.w1 = -1;
                        n45.x1 = 0;
                    }
                    if (!uza.q()) {
                        List asList = Arrays.asList(uza.k);
                        oyb.k(asList.size() == n45.E0.size());
                        for (int i6 = 0; i6 < asList.size(); i6++) {
                            ((l45) n45.E0.get(i6)).c = (vje) asList.get(i6);
                        }
                    }
                    if (n45.Z0) {
                        if (((uxa) u45.f).b.equals(n45.v1.b) && ((uxa) u45.f).d == n45.v1.s) {
                            z4 = false;
                        }
                        if (z4) {
                            if (uza.q() || ((uxa) u45.f).b.b()) {
                                j = ((uxa) u45.f).d;
                            } else {
                                uxa uxa = (uxa) u45.f;
                                se8 se8 = uxa.b;
                                long j4 = uxa.d;
                                Object obj = se8.a;
                                qje qje = n45.D0;
                                uza.h(obj, qje);
                                j = j4 + qje.e;
                            }
                            z = z4;
                            n45.Z0 = false;
                            n45.t2((uxa) u45.f, 1, z, n45.Y0, j, -1, false);
                            return;
                        }
                        z = z4;
                    } else {
                        z = false;
                    }
                    j = -9223372036854775807L;
                    n45.Z0 = false;
                    n45.t2((uxa) u45.f, 1, z, n45.Y0, j, -1, false);
                    return;
                }
                return;
            case 19:
                m45 m45 = (m45) this.c;
                t45 t45 = (t45) this.b;
                int i7 = m45.S0 - t45.c;
                m45.S0 = i7;
                boolean z5 = true;
                if (t45.d) {
                    m45.T0 = t45.e;
                    m45.U0 = true;
                }
                if (t45.f) {
                    m45.V0 = t45.g;
                }
                if (i7 == 0) {
                    tza tza = t45.b.a;
                    if (!m45.o1.a.q() && tza.q()) {
                        m45.p1 = -1;
                        m45.q1 = 0;
                    }
                    if (!tza.q()) {
                        List asList2 = Arrays.asList(tza.w0);
                        swb.h(asList2.size() == m45.E0.size());
                        for (int i8 = 0; i8 < asList2.size(); i8++) {
                            ((k45) m45.E0.get(i8)).b = (uje) asList2.get(i8);
                        }
                    }
                    if (m45.U0) {
                        if (t45.b.b.equals(m45.o1.b) && t45.b.d == m45.o1.s) {
                            z5 = false;
                        }
                        if (z5) {
                            if (tza.q() || t45.b.b.a()) {
                                j3 = t45.b.d;
                            } else {
                                txa txa = t45.b;
                                re8 re8 = txa.b;
                                long j5 = txa.d;
                                Object obj2 = re8.a;
                                pje pje = m45.D0;
                                tza.h(obj2, pje);
                                j3 = j5 + pje.X;
                            }
                            j2 = j3;
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        z2 = z5;
                    } else {
                        j2 = -9223372036854775807L;
                        z2 = false;
                    }
                    m45.U0 = false;
                    m45.q2(t45.b, 1, m45.V0, false, z2, m45.T0, j2, -1);
                    return;
                }
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                kza kza = (kza) this.b;
                ((y45) this.c).getClass();
                try {
                    synchronized (kza) {
                    }
                    kza.a.a(kza.d, kza.e);
                    kza.b(true);
                    return;
                } catch (ExoPlaybackException e) {
                    oyb.b("Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    kza.b(true);
                    throw th;
                }
            case 21:
                lza lza = (lza) this.b;
                ((z45) this.c).getClass();
                try {
                    synchronized (lza) {
                    }
                    lza.a.a(lza.d, lza.e);
                    lza.b(true);
                    return;
                } catch (androidx.media3.exoplayer.ExoPlaybackException e2) {
                    ez3.B("Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                } catch (Throwable th2) {
                    lza.b(true);
                    throw th2;
                }
            case 22:
                y65 y65 = (y65) this.c;
                y65.getClass();
                ((ew0) y65.a).v(new x65(y65, (CountDownLatch) this.b, 1));
                return;
            case 23:
                s39 s39 = (s39) this.c;
                s39.getClass();
                ((qh7) s39.b).f(-1, new r34(s39, (iqe) this.b));
                return;
            case 24:
                FeedbackListenerManagerImpl.onFeedback$lambda$2((FeedbackListenerManagerImpl) this.c, (ArrayList) ((List) this.b));
                return;
            case 25:
                tg5 tg5 = (tg5) this.c;
                tg5.getClass();
                tg5.k.c(VideoFrameProcessingException.a((InterruptedException) this.b));
                return;
            case 26:
                ((tg5) this.c).k.c(VideoFrameProcessingException.a((Exception) this.b));
                return;
            case 27:
                tg5 tg52 = (tg5) this.c;
                tg52.getClass();
                tg52.k.c(VideoFrameProcessingException.a((GlUtil.GlException) this.b));
                return;
            case 28:
                tg5 tg53 = (tg5) this.c;
                tg53.getClass();
                gjd gjd = (gjd) this.b;
                tg53.k.o(gjd.a, gjd.b);
                return;
            default:
                z3d.L(((ij5) this.c).x0, ((hj5) this.b).a);
                return;
        }
    }

    public /* synthetic */ ii4(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
