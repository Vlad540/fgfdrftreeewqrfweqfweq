package defpackage;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesListenerProxy;
import ru.ok.tamtam.nano.Protos;

/* renamed from: eq6  reason: default package */
public final /* synthetic */ class eq6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eq6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                fq6 fq6 = (fq6) this.b;
                fq6.getClass();
                udd.p("fq6", "Clear fresco. BitmapMemoryCache size: %d bytes", new Object[]{Integer.valueOf(a06.u().f.getSizeInBytes())});
                ArrayList arrayList = new ArrayList();
                List j = ((di3) fq6.c.getValue()).j(di3.r, di3.t);
                int i2 = 0;
                while (true) {
                    int size = j.size();
                    fj0 fj0 = fj0.c;
                    if (i2 < size) {
                        String q = ((tf3) j.get(i2)).q(fq6.a.a.p(), fj0);
                        if (!TextUtils.isEmpty(q)) {
                            arrayList.add(fq6.a(Uri.parse(q)));
                        }
                        i2++;
                    } else {
                        List unmodifiableList = Collections.unmodifiableList(((t52) fq6.b.getValue()).C(t52.K, false, (w1b) null));
                        while (i < unmodifiableList.size()) {
                            String b2 = ((i22) unmodifiableList.get(i)).b.b(fj0, ej0.a);
                            if (!TextUtils.isEmpty(b2)) {
                                arrayList.add(fq6.a(Uri.parse(b2)));
                            }
                            i++;
                        }
                        a06.u().f.m(new e44(fq6, 13, arrayList));
                        return;
                    }
                }
            case 1:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) this.b;
                inviteByPhoneScreen.getRouter().B(inviteByPhoneScreen);
                return;
            case 2:
                ((VideoFrame.I420Buffer) this.b).release();
                return;
            case 3:
                fb7 fb7 = (fb7) this.b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fb7, "translationY", new float[]{-8.0f, 8.0f});
                ofFloat.setDuration(2500);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(2);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new c00(10, fb7));
                ofFloat.start();
                return;
            case 4:
                bp7 bp7 = (bp7) this.b;
                try {
                    ((iz2) bp7.C.getValue()).a();
                    return;
                } catch (Throwable th) {
                    udd.s("bp7", "Can't clearCache", th);
                    ((r4a) ((g15) bp7.w.getValue())).c(new IllegalStateException("Can't clearCache"), false);
                    return;
                }
            case 5:
                ((n9f) this.b).b.setOnClickListener((View.OnClickListener) null);
                return;
            case 6:
                ((r38) this.b).release();
                return;
            case 7:
                o48 o48 = (o48) this.b;
                n48 n48 = o48.l;
                if (n48 != null) {
                    o48.d.unbindService(n48);
                    o48.l = null;
                }
                o48.c.c.clear();
                return;
            case 8:
                k77[] k77Arr = MediaKeyboardWidget.G0;
                ((MediaKeyboardWidget) this.b).l0();
                return;
            case 9:
                ((aa8) this.b).n = -1;
                return;
            case 10:
                ((vb8) this.b).a();
                return;
            case 11:
                synchronized (((vd8) this.b).a) {
                }
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                zs8 zs8 = (zs8) this.b;
                if (!((zy9) zs8.b.getValue()).d()) {
                    udd.s("zs8", "restoreUploads: not authorized", (Throwable) null);
                    return;
                }
                udd.q("zs8", "restoreUploadsFromStorage");
                ((ft8) zs8.a.getValue()).a().a(new bx7(new mod(22, zs8), new gvf(20, zs8), new f5(12, zs8)));
                return;
            case 13:
                k77[] k77Arr2 = MessagesListWidget.b1;
                MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
                if (messagesListWidget.isAttached()) {
                    messagesListWidget.t0().x1.set(false);
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                pqe pqe = (pqe) ((mod) this.b).b;
                pqe.X.i(pqe.J0);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((qa9) this.b).e = false;
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                nb9 nb9 = (nb9) this.b;
                Handler handler = nb9.q;
                eq6 eq6 = nb9.r;
                if (handler != null) {
                    handler.removeCallbacks(eq6);
                }
                r38 r38 = nb9.m;
                long j2 = 0;
                long k = r38 != null ? r38.k() : 0;
                r38 r382 = nb9.m;
                if (r382 != null) {
                    j2 = r382.e0();
                }
                nb9.s.m((Object) null, Long.valueOf(k));
                nb9.u.m((Object) null, Long.valueOf(j2));
                nb9.G.m((Object) null, Float.valueOf(gwf.i((float) (((double) k) / ((double) nb9.E)), 0.0f, 1.0f)));
                Handler handler2 = nb9.q;
                if (handler2 != null) {
                    handler2.postDelayed(eq6, 17);
                    return;
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                ad9 ad9 = (ad9) this.b;
                if (!ad9.p) {
                    ad9.p = true;
                    k2e k2e = ad9.c;
                    long j3 = ad9.h;
                    LinkedHashMap linkedHashMap = b24.a;
                    synchronized (b24.class) {
                    }
                    Locale locale = Locale.US;
                    ExportException d = ExportException.d(new IllegalStateException(us8.j(j3, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002);
                    oqe oqe = ((kqe) k2e.a).r;
                    oqe.getClass();
                    oqe.g();
                    oqe.j.b(d, 4, 2, 0).b();
                    return;
                }
                return;
            case 18:
                ((id9) this.b).a2();
                return;
            case 19:
                px9 px9 = (px9) this.b;
                boolean isAlive = px9.o.isAlive();
                View view = px9.a;
                if (isAlive) {
                    px9.o.removeOnPreDrawListener(px9);
                } else {
                    view.getViewTreeObserver().removeOnPreDrawListener(px9);
                }
                view.removeOnAttachStateChangeListener(px9);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                ((AtomicBoolean) this.b).set(true);
                return;
            case 21:
                ParticipantStatesListenerProxy.raiseRunnable$lambda$0((ParticipantStatesListenerProxy) this.b);
                return;
            case 22:
                vja vja = (vja) this.b;
                synchronized (vja) {
                    while (i < vja.Y.size()) {
                        try {
                            ((VideoTrack) vja.Y.get(i)).removeSink((VideoSink) vja.Z.get(i));
                            ((VideoTrack) vja.Y.get(i)).removeSink((VideoSink) vja.w0.get(i));
                            i++;
                        } catch (Throwable th2) {
                            ((xwb) vja.b).log("ParticipantsAgnosticVideoTracks", "close error: " + th2.getMessage());
                        }
                    }
                }
                return;
            case 23:
                throw ((RuntimeException) this.b);
            case 24:
                pva pva = (pva) this.b;
                if (((zy9) pva.c.getValue()).d() && ((rf4) pva.b.getValue()).d()) {
                    udd.q("pva", "processScheduledPing: app is visible, ping and schedule");
                    ((gy9) ((pk) pva.a.getValue())).H(true);
                    pva.a();
                    o1d.y((luf) pva.d.getValue());
                    return;
                }
                return;
            case 25:
                udd.q("mv4", "execute()");
                ((bv6) ((gl7) ((t97) ((mv4) this.b).b).getValue())).f();
                udd.q("mv4", "repository prefetch ok");
                return;
            case 26:
                ((b3b) this.b).q();
                return;
            case 27:
                k4b k4b = (k4b) this.b;
                int i3 = k4b.b;
                pc7 pc7 = k4b.Y;
                if (i3 == 0) {
                    k4b.c = true;
                    pc7.d(nb7.ON_PAUSE);
                }
                if (k4b.a == 0 && k4b.c) {
                    pc7.d(nb7.ON_STOP);
                    k4b.o = true;
                    return;
                }
                return;
            case 28:
                RLottieDrawable rLottieDrawable = ((rwb) this.b).b;
                try {
                    rn0 rn0 = rLottieDrawable.w1;
                    if (rn0 != null) {
                        rn0.b();
                    }
                } catch (Throwable unused) {
                }
                RLottieDrawable.L1.post(rLottieDrawable.v1);
                return;
            default:
                ((cxb) this.b).w();
                return;
        }
    }
}
