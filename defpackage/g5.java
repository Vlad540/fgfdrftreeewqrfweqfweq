package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.fragment.app.a;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink;
import com.my.tracker.campaign.CampaignService;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import org.webrtc.DumpCallback;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: g5  reason: default package */
public final /* synthetic */ class g5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ g5(ix4 ix4, int i, String str, Throwable th) {
        this.a = 28;
        this.b = ix4;
        this.c = str;
        this.o = th;
    }

    public final void run() {
        is4 is4;
        Iterator it;
        char c2;
        char c3;
        Rect rect;
        char c4;
        AbstractMap.SimpleEntry simpleEntry;
        Iterator it2;
        Iterator it3;
        Rect rect2;
        char c5 = 6;
        char c6 = 5;
        switch (this.a) {
            case 0:
                h5 h5Var = (h5) this.b;
                h5Var.getClass();
                HashSet hashSet = ActAttachesView.D1;
                h5Var.c.j0((a) this.c, (xm8) this.o);
                return;
            case 1:
                qe4 qe4 = (qe4) this.b;
                qe4.getClass();
                int i = oze.a;
                n45 n45 = ((h45) qe4.c).a;
                n45.getClass();
                g44 g44 = n45.H0;
                gd I = g44.I();
                g44.J(I, 1009, new v34(I, (xu5) this.c, (q24) this.o, 1));
                return;
            case 2:
                otf otf = (otf) this.b;
                otf.getClass();
                int i2 = mze.a;
                g45 g45 = (g45) otf.b;
                g45.getClass();
                m45 m45 = g45.a;
                m45.getClass();
                f44 f44 = m45.G0;
                fd P = f44.P();
                f44.Q(P, 1009, new no3(P, (vu5) this.c, (p24) this.o));
                return;
            case 3:
                d60 d60 = (d60) this.b;
                int t = hr1.t(d60.g);
                if (t == 0) {
                    d60.j = (Executor) this.c;
                    d60.k = (f2b) this.o;
                    return;
                } else if (t == 1 || t == 2) {
                    throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                } else {
                    return;
                }
            case 4:
                ((ls0) this.b).g.a((nfc) this.c, (Executor) this.o);
                return;
            case 5:
                ov0 ov0 = (ov0) this.c;
                ax4 ax4 = (ax4) this.o;
                ys0 ys0 = (ys0) this.b;
                mod mod = ys0.g;
                try {
                    ys0.f(ov0, ax4);
                    mod.Q(ov0, ax4);
                    ax4.d(ax4);
                    return;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    mod.Q(ov0, ax4);
                    ax4.d(ax4);
                    throw th2;
                }
            case 6:
                gx0 gx0 = (gx0) this.b;
                ocd ocd = (ocd) this.c;
                String str = (String) this.o;
                gx0.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = ocd.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.submitDumpRequest(str, Integer.MAX_VALUE, (DumpCallback) null);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    gx0.Z0.logException("OKRTCCall", "Error starting local audio dump", th3);
                    return;
                }
            case 7:
                g41 g41 = (g41) this.c;
                Object obj = this.o;
                gx0 gx02 = (gx0) this.b;
                Iterator it4 = gx02.Q0.iterator();
                while (it4.hasNext()) {
                    try {
                        ((dx0) it4.next()).onEvent(gx02, g41, obj);
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        gx02.Z0.logException("OKRTCCall", "Error on dispatch event " + g41, th5);
                    }
                }
                return;
            case 8:
                ge1 ge1 = (ge1) this.c;
                JSONObject jSONObject = (JSONObject) this.o;
                cx0 cx0 = ((gx0) this.b).A1;
                if (cx0 != null) {
                    cx0.onCustomData(ge1, jSONObject);
                    return;
                }
                return;
            case 9:
                rc1 rc1 = (rc1) this.b;
                xwb xwb = rc1.a;
                String str2 = rc1.j;
                xwb.log(str2, "Initialize OpenGL context on openGL thread");
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    xwb.log(str2, "No default display found, will not initialize");
                    return;
                }
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    if (!EGL14.eglChooseConfig(eglGetDisplay, (int[]) this.c, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                        throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "getEglConfig()");
                    } else if (iArr2[0] > 0) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        if (eGLConfig != null) {
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, (EGLContext) this.o, new int[]{12440, EglBase.getOpenGlesVersionFromConfig(EglBase.CONFIG_PLAIN), 12344}, 0);
                            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                                rc1.d = eglCreateContext;
                                rc1.e = eglGetDisplay;
                                rc1.f = eGLConfig;
                                return;
                            }
                            throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Failed to create EGL context");
                        }
                        throw new RuntimeException("Returned matching OpenGL context is null");
                    } else {
                        throw new RuntimeException("No valid OpenGL context present, can not continue");
                    }
                } else {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Unable to initialize EGL14");
                }
            case 10:
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                appCompatTextView.setText(charSequence);
                appCompatTextView.setVisibility((charSequence == null || h0e.c0(charSequence)) ^ true ? 0 : 8);
                ((zj1) this.o).x();
                return;
            case 11:
                CallsAudioManagerV3Impl.reportAudioDeviceOnMainThread$lambda$9((CallsAudioManagerV3Impl) this.b, (CallsAudioDeviceInfo) this.c, (CallsAudioManager.OnAudioDeviceInfoChangeListener) this.o);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                wq1 wq1 = ((zq1) this.b).z;
                ps1 ps1 = (ps1) this.o;
                ((HashSet) wq1.b).add(ps1);
                ((ArrayMap) wq1.c).put(ps1, (Executor) this.c);
                return;
            case 13:
                es1 es1 = (es1) this.b;
                es1.getClass();
                es1.d.a(TimeUnit.SECONDS.toMillis(3) + System.currentTimeMillis(), (cs1) ((AtomicReference) this.c).get());
                ((sn1) this.o).b((Object) null);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                CampaignService.a((CampaignService) this.b, (String) this.c, (Runnable) this.o);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                t52 t52 = (t52) this.b;
                t52.getClass();
                md4 md4 = (md4) this.c;
                String name = md4.name();
                Collection<Long> collection = (Collection) this.o;
                udd.p("t52", "syncMessages, itemType = %s, chatIds size = %d", new Object[]{name, Integer.valueOf(collection.size())});
                for (Long l : collection) {
                    udd.p("t52", "syncMessages, itemType = %s, chatId = %d", new Object[]{md4.name(), l});
                    ((jee) t52.t.get()).g(new n1d(((j2b) t52.n).a.n(), l.longValue(), 0, md4), 0, 0);
                }
                o1d.y((luf) t52.w.get());
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                h93 h93 = (h93) this.b;
                h93.getClass();
                xu5 xu5 = h93.f;
                oyb.l(xu5);
                ((p8f) this.c).k(new VideoSink.VideoSinkException((VideoFrameProcessingException) this.o, xu5));
                return;
            case LangUtils.HASH_SEED /*17*/:
                List singletonList = Collections.singletonList((mv3) this.c);
                ((oa2) ((kv2) this.b).Y).getClass();
                oa2.I(singletonList);
                ((CountDownLatch) this.o).countDown();
                return;
            case 18:
                ((ViewGroup) this.b).endViewTransition((View) this.c);
                qa4 qa4 = (qa4) this.o;
                ((jmd) qa4.c.b).c(qa4);
                return;
            case 19:
                if (((bb4) this.b).y0) {
                    ((Runnable) this.c).run();
                    return;
                } else {
                    ((Runnable) this.o).run();
                    return;
                }
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                ji4 ji4 = (ji4) this.b;
                ji4.getClass();
                ((Runnable) this.c).run();
                je.d(new ii4((Object) ji4, 0, (Object) (gi4) this.o));
                return;
            case 21:
                ki4 ki4 = (ki4) this.b;
                ki4.getClass();
                ((Runnable) this.c).run();
                ((ScheduledExecutorService) ((r7e) ez3.e.f.b).getValue()).execute(new ii4((Object) ki4, 1, (Object) (gi4) this.o));
                return;
            case 22:
                eo4 eo4 = (eo4) this.b;
                ((go4) this.c).g(eo4.a, eo4.b, (Exception) this.o);
                return;
            case 23:
                fo4 fo4 = (fo4) this.b;
                ((ho4) this.c).s(fo4.a, fo4.b, (Exception) this.o);
                return;
            case 24:
                if (((pp4) this.b).Y) {
                    ((Runnable) this.c).run();
                    return;
                } else {
                    ((Runnable) this.o).run();
                    return;
                }
            case 25:
                ls4 ls4 = (ls4) this.b;
                ls4.getClass();
                Rect rect3 = new Rect();
                js4 js4 = (js4) this.c;
                sd0 sd0 = (sd0) this.o;
                ps4 ps4 = ls4.a;
                if (js4 != null && js4.o) {
                    int width = ps4.getWidth();
                    int height = ps4.getHeight();
                    sd0.c = width;
                    sd0.d = height;
                } else if (sd0.c == -1 && sd0.d == -1) {
                    if (js4 != null) {
                        Rect rect4 = js4.c;
                        int width2 = rect4.width();
                        int height2 = rect4.height();
                        sd0.c = width2;
                        sd0.d = height2;
                    } else {
                        int width3 = ps4.getWidth();
                        int measuredHeight = ps4.getMeasuredHeight();
                        sd0.c = width3;
                        sd0.d = measuredHeight;
                    }
                }
                sd0.a(sd0, ps4.getMeasuredWidth(), ps4.getMeasuredHeight(), rect3);
                ps4.setBounds(rect3);
                if (js4 != null) {
                    Rect bounds = ps4.getBounds();
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    Iterator it5 = js4.a.iterator();
                    while (it5.hasNext()) {
                        o97 o97 = (o97) it5.next();
                        if (hr1.t(o97.b) != 0) {
                            rect = bounds;
                            c3 = c5;
                            c2 = c6;
                            it = it5;
                            simpleEntry = null;
                            c4 = 7;
                        } else {
                            Rect rect5 = js4.c;
                            float width4 = ((float) bounds.width()) / ((float) rect5.width());
                            float height3 = ((float) bounds.height()) / ((float) rect5.height());
                            List<sn4> list = o97.X;
                            for (sn4 sn4 : list) {
                                float[] fArr = sn4.b;
                                if (fArr != null) {
                                    for (int i3 = 0; i3 < fArr.length; i3++) {
                                        if (i3 % 2 == 0) {
                                            float f = fArr[i3] - ((float) rect5.left);
                                            fArr[i3] = f;
                                            float f2 = f * width4;
                                            fArr[i3] = f2;
                                            fArr[i3] = f2 + ((float) bounds.left);
                                        } else {
                                            float f3 = fArr[i3] - ((float) rect5.top);
                                            fArr[i3] = f3;
                                            float f4 = f3 * height3;
                                            fArr[i3] = f4;
                                            fArr[i3] = f4 + ((float) bounds.top);
                                        }
                                    }
                                }
                            }
                            rn4 rn4 = new rn4(o97.c, (((float) bounds.width()) / ((float) rect5.width())) * o97.o);
                            for (Iterator it6 = list.iterator(); it6.hasNext(); it6 = it2) {
                                sn4 sn42 = (sn4) it6.next();
                                float[] fArr2 = sn42.b;
                                int t2 = hr1.t(sn42.a);
                                Path path = rn4.b;
                                ArrayList arrayList2 = rn4.a;
                                if (t2 == 0) {
                                    rect2 = bounds;
                                    float f5 = fArr2[0];
                                    float f6 = fArr2[1];
                                    float f7 = fArr2[2];
                                    float f8 = fArr2[3];
                                    it2 = it6;
                                    it3 = it5;
                                    arrayList2.add(new sn4(1, new float[]{f5, f6, f7, f8}));
                                    path.moveTo(f5, f6);
                                    path.lineTo(f7, f8);
                                } else if (t2 != 1) {
                                    rect2 = bounds;
                                    it2 = it6;
                                    it3 = it5;
                                } else {
                                    float f9 = fArr2[0];
                                    float f10 = fArr2[1];
                                    float f11 = fArr2[2];
                                    float f12 = fArr2[3];
                                    float f13 = fArr2[4];
                                    float f14 = fArr2[5];
                                    float f15 = fArr2[6];
                                    float f16 = fArr2[7];
                                    rect2 = bounds;
                                    arrayList2.add(new sn4(2, new float[]{f9, f10, f11, f12, f13, f14, f15, f16}));
                                    path.moveTo(f9, f10);
                                    path.cubicTo(f11, f12, f13, f14, f15, f16);
                                    it2 = it6;
                                    it3 = it5;
                                }
                                bounds = rect2;
                                it5 = it3;
                            }
                            rect = bounds;
                            it = it5;
                            c4 = 7;
                            c3 = 6;
                            c2 = 5;
                            simpleEntry = new AbstractMap.SimpleEntry(Integer.valueOf(o97.a), rn4);
                        }
                        if (simpleEntry != null) {
                            arrayList.add((is4) simpleEntry.getValue());
                            hashMap.put((Integer) simpleEntry.getKey(), (is4) simpleEntry.getValue());
                        }
                        char c7 = c4;
                        bounds = rect;
                        c5 = c3;
                        c6 = c2;
                        it5 = it;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (v33 v33 : js4.b) {
                        w9 w9Var = (hr1.t(v33.a) == 0 && (is4 = (is4) hashMap.get(Integer.valueOf(v33.b))) != null) ? new w9(is4) : null;
                        if (w9Var != null) {
                            arrayList3.add(w9Var);
                        }
                    }
                    Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        ps4.a.add((is4) it7.next());
                        ps4.invalidate();
                    }
                    ls4.d.addAll(arrayList3);
                    ps4.setDrawStickerEnabled(js4.o);
                }
                ls4.b();
                return;
            case 26:
                ((EglRenderer) this.b).lambda$removeFrameListener$2((CountDownLatch) this.c, (EglRenderer.FrameListener) this.o);
                return;
            case 27:
                gvf gvf = (gvf) this.b;
                a06 a06 = (a06) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.o;
                gvf.getClass();
                try {
                    tt5 h = xs7.h((Context) gvf.b);
                    if (h != null) {
                        st5 st5 = h.a;
                        synchronized (st5.o) {
                            st5.Y = threadPoolExecutor;
                        }
                        h.a.c(new st4(a06, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th6) {
                    a06.A(th6);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 28:
                ((ix4) this.b).g(new Exception((String) this.c, (Throwable) this.o));
                return;
            default:
                xx4 xx4 = (xx4) this.b;
                List list2 = (List) this.c;
                Runnable runnable = (Runnable) this.o;
                if (xx4.D != 8) {
                    list2.isEmpty();
                    if (!(xx4.f instanceof wx4) || xx4.A || xf4.a.j(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null) {
                        xx4.e.stop();
                    } else {
                        xx4.e.flush();
                        xx4.z = true;
                    }
                }
                if (runnable != null) {
                    runnable.run();
                }
                int i4 = xx4.D;
                if (i4 == 7) {
                    xx4.f();
                    return;
                }
                if (!xx4.z) {
                    xx4.h();
                }
                xx4.i(1);
                if (i4 == 5 || i4 == 6) {
                    xx4.k();
                    if (i4 == 6) {
                        xx4.e();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }
}
