package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Process;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.camera.core.ImageCaptureException;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import one.me.android.media.service.OneMeDownloadService;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.AudioTrack;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* renamed from: hg9  reason: default package */
public final /* synthetic */ class hg9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hg9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [uyf, java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r1v23, types: [uyf, java.lang.Runnable] */
    public final void run() {
        int i;
        mg9 mg9 = null;
        int i2 = 7;
        boolean z = false;
        switch (this.a) {
            case 0:
                ig9 ig9 = (ig9) this.b;
                jg9 jg9 = (jg9) this.c;
                try {
                    Future future = ig9.g;
                    if (future != null) {
                        mg9 = (mg9) future.get();
                    }
                    ig9.b(mg9, jg9);
                    return;
                } catch (Throwable th) {
                    if (th instanceof ExecutionException) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            jg9.onFailed(cause);
                        }
                    } else {
                        jg9.onFailed(th);
                    }
                    if (ig9.e) {
                        ig9.a(jg9);
                        ig9.d();
                        return;
                    }
                    return;
                }
            case 1:
                ci9 ci9 = (ci9) this.b;
                synchronized (ci9.c) {
                    i = ci9.b;
                }
                ((d54) this.c).a(i);
                return;
            case 2:
                ((e54) this.c).a(((di9) this.b).i());
                return;
            case 3:
                i4a i4a = (i4a) this.b;
                pl4 pl4 = (pl4) this.c;
                try {
                    Context context = i4a.a;
                    HashMap hashMap = rl4.x0;
                    context.startService(new Intent(context, OneMeDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", pl4).putExtra("stop_reason", 0));
                    return;
                } catch (Throwable th2) {
                    udd.s("OneMeDownloadController", "fail to sendAddDownload", th2);
                    return;
                }
            case 4:
                ((InputMethodManager) ((y7a) this.b).getContext().getSystemService("input_method")).showSoftInput((EditText) this.c, 1);
                return;
            case 5:
                k40 k40 = (k40) this.b;
                ViewGroup viewGroup = (ViewGroup) ((WeakReference) k40.c).get();
                if (viewGroup != null) {
                    viewGroup.removeView((b7e) k40.X);
                }
                k40.X = null;
                k40.Y = null;
                afa afa = (afa) ((l7c) this.c).a;
                if (afa != null) {
                    afa.b();
                    return;
                }
                return;
            case 6:
                zla zla = (zla) this.b;
                PeerConnection.SignalingState signalingState = (PeerConnection.SignalingState) this.c;
                zla.getClass();
                zla.p1 = signalingState == PeerConnection.SignalingState.HAVE_REMOTE_OFFER || signalingState == PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER || signalingState == PeerConnection.SignalingState.STABLE;
                if (signalingState == PeerConnection.SignalingState.STABLE) {
                    z = true;
                }
                zla.q1 = z;
                if (z) {
                    zla.i("maybeUpdateSenders", new uyf(zla, 1));
                }
                yla yla = zla.d1;
                if (yla != null) {
                    yla.l(zla, signalingState);
                    return;
                }
                return;
            case 7:
                zla zla2 = (zla) this.b;
                zla2.getClass();
                PeerConnection.IceConnectionState iceConnectionState = PeerConnection.IceConnectionState.CONNECTED;
                PeerConnection.IceConnectionState iceConnectionState2 = (PeerConnection.IceConnectionState) this.c;
                if (iceConnectionState2 == iceConnectionState) {
                    zla2.i("maybeUpdateSenders", new uyf(zla2, 0));
                }
                yla yla2 = zla2.d1;
                if (yla2 != null) {
                    yla2.o(zla2, iceConnectionState2);
                    return;
                }
                return;
            case 8:
                zla zla3 = (zla) this.b;
                if (zla3.d1 != null) {
                    for (AudioTrack id : ((MediaStream[]) this.c)[0].audioTracks) {
                        zla3.d1.f(id.id());
                    }
                    return;
                }
                return;
            case 9:
                zla zla4 = (zla) this.b;
                yla yla3 = zla4.d1;
                if (yla3 != null) {
                    yla3.m(zla4, (IceCandidate) this.c);
                    return;
                }
                return;
            case 10:
                zla zla5 = (zla) this.b;
                yla yla4 = zla5.d1;
                if (yla4 != null) {
                    yla4.i(zla5, (IceCandidate[]) this.c);
                    return;
                }
                return;
            case 11:
                zla zla6 = (zla) this.b;
                List list = (List) this.c;
                zla6.getClass();
                try {
                    if (zla6.Z0 != null) {
                        zla6.O0.log("PCRTCClient", zla6.toString() + ": peer connection is already created");
                        return;
                    }
                    zla6.h1 = list;
                    zla6.t();
                    zla6.z();
                    zla6.G0.post(new ola(zla6, 0));
                    return;
                } catch (Exception e) {
                    zla6.a1 = true;
                    zla6.O0.reportException("PCRTCClient", "pc.create", e);
                    throw e;
                }
            case Protos.Attaches.Attach.PRESENT /*12*/:
                k7e k7e = (k7e) this.c;
                xoa xoa = (xoa) this.b;
                xoa.getClass();
                try {
                    xoa.b(k7e.b, k7e.c, k7e.o);
                    return;
                } catch (Exception e2) {
                    udd.s("xoa", "onSyncSuccess: exception", e2);
                    xoa.h.c(new HandledException(e2), true);
                    return;
                }
            case 13:
                ((d2b) this.b).b((RecyclerView) this.c, 0, 0);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                try {
                    ((o2b) this.b).g((zb9) this.c);
                    return;
                } catch (Throwable th3) {
                    udd.s("o2b", "updatePresence failure!", th3);
                    return;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                b3b b3b = (b3b) this.b;
                o4e o4e = b3b.t;
                gt0.i();
                if (((hu1) this.c) == b3b.c()) {
                    o4e.e();
                    return;
                }
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                ((a3b) this.b).d((y4e) this.c);
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((k3b) ((ea6) this.b).b).G0.d((y4e) this.c);
                return;
            case 18:
                try {
                    ((zf9) this.b).getClass();
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                ((Runnable) this.c).run();
                return;
            case 19:
                xac xac = ((s4b) this.b).f;
                xac.getClass();
                gt0.i();
                boolean z2 = xac.g;
                lr6 lr6 = (lr6) this.c;
                if (z2) {
                    lr6.close();
                    return;
                }
                e07.p("onImageCaptured() must be called before onFinalResult()", xac.c.b.isDone());
                xac.a();
                fb0 fb0 = xac.a;
                fb0.getClass();
                fb0.b.execute(new sbc(fb0, 28, lr6));
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                xac xac2 = ((s4b) this.b).f;
                xac2.getClass();
                gt0.i();
                if (!xac2.g) {
                    fb0 fb02 = xac2.a;
                    fb02.getClass();
                    fb02.b.execute(new aae(fb02, (Bitmap) this.c));
                    return;
                }
                return;
            case 21:
                xac xac3 = ((s4b) this.b).f;
                xac3.getClass();
                gt0.i();
                if (!xac3.g) {
                    e07.p("onImageCaptured() must be called before onFinalResult()", xac3.c.b.isDone());
                    xac3.a();
                    gt0.i();
                    fb0 fb03 = xac3.a;
                    fb03.getClass();
                    fb03.b.execute(new sbc(fb03, 27, (ImageCaptureException) this.c));
                    return;
                }
                return;
            case 22:
                ((ProfileInstallerInitializer) this.b).getClass();
                vab.a(Looper.getMainLooper()).postDelayed(new nm((Context) this.c, 4), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
            case 23:
                xgb xgb = (xgb) this.b;
                oo6 oo6 = xgb.G0;
                utc utc = (utc) this.c;
                xgb.N0 = oo6 == null ? utc : new si5(-9223372036854775807L);
                xgb.O0 = utc.f();
                if (xgb.U0 == -1 && utc.f() == -9223372036854775807L) {
                    z = true;
                }
                xgb.P0 = z;
                if (!z) {
                    i2 = 1;
                }
                xgb.Q0 = i2;
                xgb.Z.q(xgb.O0, utc.c(), xgb.P0);
                if (!xgb.K0) {
                    xgb.l();
                    return;
                }
                return;
            case 24:
                ygb ygb = (ygb) this.b;
                po6 po6 = ygb.H0;
                vtc vtc = (vtc) this.c;
                ygb.P0 = po6 == null ? vtc : new wc0(-9223372036854775807L);
                ygb.Q0 = vtc.f();
                if (!ygb.W0 && vtc.f() == -9223372036854775807L) {
                    z = true;
                }
                ygb.R0 = z;
                if (!z) {
                    i2 = 1;
                }
                ygb.S0 = i2;
                if (ygb.L0) {
                    ygb.Z.v(ygb.Q0, vtc.c(), ygb.R0);
                    return;
                } else {
                    ygb.q();
                    return;
                }
            case 25:
                Gson gson = RLottieDrawable.gson;
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.b;
                rLottieDrawable.getClass();
                Iterator it = new ArrayList(rLottieDrawable.I1).iterator();
                while (it.hasNext()) {
                    ((RLottieDrawable.DrawableLoadListener) it.next()).onError((Throwable) this.c);
                }
                return;
            case 26:
                n2c n2c = (n2c) this.b;
                n2c.getClass();
                new yt9(ms9.j((List) this.c), new l2c(n2c, 0)).a();
                return;
            case 27:
                RecordManagerImpl.onRecordStarted$lambda$4((RecordManagerImpl) this.b, (tf1) this.c);
                return;
            case 28:
                ((Executor) this.b).execute((Runnable) this.c);
                return;
            default:
                ((na0) this.b).y0.accept((f8f) this.c);
                return;
        }
    }
}
