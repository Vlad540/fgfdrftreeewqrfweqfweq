package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.util.HandledException;

/* renamed from: k7f  reason: default package */
public final class k7f implements hya, hd, AudioManager.OnAudioFocusChangeListener, r30 {
    public final s30 X;
    public j7f Y;
    public v2f Z;
    public final g15 a;
    public final g35 b;
    public final String c = k7f.class.getName();
    public final n45 o;

    /* JADX WARNING: type inference failed for: r12v1, types: [om3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, ve] */
    public k7f(Context context, g15 g15, g35 g35, t97 t97, gza gza) {
        e49 e49;
        this.a = g15;
        this.b = g35;
        this.X = new s30(context, this);
        if (gza.b) {
            int i = gza.g;
            if (i >= 0) {
                int i2 = gza.d;
                if (i2 >= 0) {
                    int i3 = gza.e;
                    if (i3 < i) {
                        throw new IllegalStateException("The min_buffer must be greater than or equal to playback_buffer".toString());
                    } else if (i3 >= i2) {
                        int i4 = gza.f;
                        if (i4 >= i3) {
                            int i5 = gza.h;
                            if (i5 > 0) {
                                ? obj = new Object();
                                obj.a = 5000;
                                obj.b = 13000;
                                obj.c = 500;
                                obj.d = 3000;
                                obj.e = 4;
                                obj.a = i3;
                                obj.b = i4;
                                obj.c = i;
                                obj.d = i2;
                                obj.e = i5;
                                e49 = new e49(obj);
                            } else {
                                throw new IllegalStateException("The format_max_input_size_scale_up_factor must be greater than 0".toString());
                            }
                        } else {
                            throw new IllegalStateException("The max_buffer must be greater than or equal to min_buffer".toString());
                        }
                    } else {
                        throw new IllegalStateException("The min_buffer must be greater than or equal to playback_buffer_after_rebuffer".toString());
                    }
                } else {
                    throw new IllegalStateException("The playback_buffer_after_rebuffer must be greater than or equal to 0".toString());
                }
            } else {
                throw new IllegalStateException("The playback_buffer must be greater than or equal to 0".toString());
            }
        } else {
            int i6 = gza.g;
            d94.l("bufferForPlaybackMs", i6, 0, "0");
            int i7 = gza.d;
            d94.l("bufferForPlaybackAfterRebufferMs", i7, 0, "0");
            int i8 = gza.e;
            d94.l("minBufferMs", i8, i6, "bufferForPlaybackMs");
            d94.l("minBufferMs", i8, i7, "bufferForPlaybackAfterRebufferMs");
            int i9 = gza.f;
            d94.l("maxBufferMs", i9, i8, "minBufferMs");
            e49 = new d94(new l34(1), i8, i9, i6, i7, gza.c);
        }
        bc4 bc4 = new bc4(context, new Object());
        nb4 f = bc4.f();
        f.getClass();
        lb4 lb4 = new lb4(f);
        String iSO3Language = ((lqc) ((f03) t97.getValue())).u().getISO3Language();
        if (iSO3Language == null) {
            lb4.h(new String[0]);
        } else {
            lb4.h(new String[]{iSO3Language});
        }
        q35 q35 = new q35(context);
        oyb.k(!q35.v);
        q35.e = new k94(3, bc4);
        oyb.k(!q35.v);
        q35.f = new k94(7, e49);
        n45 a2 = q35.a();
        this.o = a2;
        a2.B0.a(this);
        g44 g44 = a2.H0;
        g44.getClass();
        g44.Y.a(this);
    }

    public final long F0() {
        if (this.Z != null) {
            return this.o.k();
        }
        return 0;
    }

    public final void G(gd gdVar, int i) {
        udd.q(this.c, wn6.h(i, "Player. Video frames dropped: "));
    }

    public final long G0() {
        v2f v2f = this.Z;
        if (v2f == null) {
            return 0;
        }
        if (v2f.k() > 0) {
            return v2f.k();
        }
        n45 n45 = this.o;
        if (n45.c() > 0) {
            return n45.c();
        }
        return 0;
    }

    public final void H0(v2f v2f) {
        vm8 vm8;
        no4 no4;
        no4 u;
        j7f j7f;
        v2f v2f2 = v2f;
        v2f v2f3 = this.Z;
        jo4 jo4 = null;
        if (v2f3 == null || !v2f3.equals(v2f2) || this.o.getPlaybackState() == 1) {
            String str = this.c;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, "Player. Prepare new video content: " + v2f2, (Throwable) null);
            }
            j7f j7f2 = this.Y;
            if (j7f2 != null) {
                j7f2.y0();
            }
            boolean f = hhd.f(this.Z, v2f2);
            this.Z = v2f2;
            this.o.Y(true);
            String str2 = this.c;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.X, str2, "Player. Prepare mediaSource by content:" + v2f2, (Throwable) null);
            }
            Uri l = v2f.l();
            g35 g35 = this.b;
            nz3 nz3 = v2f.c0() ^ true ? (nz3) g35.b.getValue() : (nz3) g35.a.getValue();
            if (v2f2 instanceof yy3) {
                vm8 = new DashMediaSource.Factory(nz3).f(l68.c(l));
            } else if (v2f2 instanceof vj6) {
                vm8 = new HlsMediaSource.Factory(nz3).f(l68.c(l));
            } else if (v2f2 instanceof z79) {
                List list = ((z79) v2f2).a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ss8 ss8 = new ss8(24, (Object) new t74());
                    Object obj = new Object();
                    mk9 mk9 = new mk9(9);
                    l68 c2 = l68.c(((x79) list.get(i)).e);
                    c2.b.getClass();
                    c2.b.getClass();
                    w58 w58 = c2.b.c;
                    if (w58 == null) {
                        no4 = no4.a;
                    } else {
                        synchronized (obj) {
                            try {
                                u = !w58.equals((Object) null) ? ydc.u(w58) : null;
                                u.getClass();
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        no4 = u;
                    }
                    arrayList.add(new dhb(c2, nz3, ss8, no4, mk9, 1048576));
                }
                zh0[] zh0Arr = (zh0[]) arrayList.toArray(new zh0[0]);
                vm8 = new vm8((zh0[]) Arrays.copyOf(zh0Arr, zh0Arr.length));
            } else {
                ss8 ss82 = new ss8(24, (Object) new t74());
                Object obj2 = new Object();
                mk9 mk92 = new mk9(9);
                l68 c3 = l68.c(l);
                c3.b.getClass();
                c3.b.getClass();
                w58 w582 = c3.b.c;
                if (w582 == null) {
                    jo4 = no4.a;
                } else {
                    synchronized (obj2) {
                        try {
                            if (!w582.equals((Object) null)) {
                                jo4 = ydc.u(w582);
                            }
                            jo4.getClass();
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                            }
                        }
                    }
                }
                vm8 = new dhb(c3, nz3, ss82, jo4, mk92, 1048576);
            }
            long k = f ? this.o.k() : Math.max(v2f.d(), 0);
            if (v2f.c0() || k == 0) {
                n45 n45 = this.o;
                n45.w2();
                List singletonList = Collections.singletonList(vm8);
                n45.w2();
                n45.w2();
                n45.o2(singletonList, -1, -9223372036854775807L, true);
            } else {
                n45 n452 = this.o;
                n452.w2();
                List singletonList2 = Collections.singletonList(vm8);
                n452.w2();
                n452.o2(singletonList2, 0, k, false);
            }
            this.o.prepare();
            j7f j7f3 = this.Y;
            if (j7f3 != null) {
                j7f3.i();
            }
            this.X.p(3);
            return;
        }
        String str3 = this.c;
        fn6 fn63 = udd.e;
        if (fn63 != null && fn63.c()) {
            fn63.d(tn7.X, str3, "Player. Restart same content: " + this.Z, (Throwable) null);
        }
        if (this.o.getPlaybackState() == 4) {
            udd.q(this.c, "Player. Video ended. Seek to start");
            J0();
        }
        if (this.o.getPlaybackState() == 3 && (j7f = this.Y) != null) {
            j7f.y(true);
        }
        this.o.Y(true);
        j7f j7f4 = this.Y;
        if (j7f4 != null) {
            j7f4.i();
        }
        this.X.p(3);
    }

    public final void I0(long j) {
        String i = us8.i(j, "Player. Seek to: ");
        String str = this.c;
        udd.q(str, i);
        if (this.Z != null) {
            n45 n45 = this.o;
            if (n45.c() == 0 || j <= n45.c()) {
                n45.W1(5, j);
                return;
            }
            udd.q(str, "Player. Can't seek to: " + j + ", position greater than duration. Seek to end.");
            n45.W1(5, n45.c());
        }
    }

    public final void J0() {
        udd.q(this.c, "Player. Seek to start: 0");
        this.o.W1(5, 0);
    }

    public final void K(gd gdVar, l24 l24) {
        udd.q(this.c, "Player. Video renderer is disabled");
    }

    public final void K0(boolean z) {
        this.o.setRepeatMode(z ? 2 : 0);
    }

    public final void L0(Surface surface) {
        String str = this.c;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Player. Set surface " + surface, (Throwable) null);
        }
        if (surface == null) {
            n45 n45 = this.o;
            n45.w2();
            n45.p2((Object) null);
            n45.k2(0, 0);
            return;
        }
        this.o.m(surface);
    }

    public final void M0() {
        n45 n45 = this.o;
        n45.w2();
        if (!n45.r1) {
            udd.q(this.c, "Player. Stop");
            n45.stop();
            j7f j7f = this.Y;
            if (j7f != null) {
                j7f.u();
            }
        }
    }

    public final void R(gd gdVar, i78 i78, IOException iOException, boolean z) {
        v2f v2f = this.Z;
        udd.s(this.c, "Player. Load error, wasCanceled " + z + ", videoContent: " + v2f, iOException);
    }

    public final boolean a() {
        n45 n45 = this.o;
        int playbackState = n45.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && n45.u() && n45.v0() == 0;
    }

    public final float e() {
        n45 n45 = this.o;
        n45.w2();
        return n45.l1;
    }

    public final void e0(gd gdVar, Object obj, long j) {
        String str = this.c;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Player. First frame rendered: output=" + obj + " renderTimeMs=" + j, (Throwable) null);
        }
    }

    public final void f(float f) {
        j7f j7f = this.Y;
        if (j7f != null) {
            j7f.t(f);
        }
    }

    public final void f0(vje vje, int i) {
        udd.p(this.c, "Player. onTimelineChanged %d", new Object[]{Integer.valueOf(i)});
    }

    public final void g(float f) {
        n45 n45 = this.o;
        n45.w2();
        float f2 = n45.l1;
        String str = this.c;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Player. New volume: " + f + ", prev: " + f2, (Throwable) null);
        }
        this.o.g(f);
        if (f2 <= 0.0f && f > 0.0f) {
            this.X.p(3);
        } else if (f2 != f && f <= 0.0f) {
            this.X.o();
        }
    }

    public final void h(int i) {
        String str = this.c;
        if (i == 1) {
            udd.q(str, "Player. State changed: ExoPlayer.STATE_IDLE");
        } else if (i != 2) {
            n45 n45 = this.o;
            if (i == 3) {
                udd.q(str, "Player. State changed: ExoPlayer.STATE_READY");
                j7f j7f = this.Y;
                if (j7f != null) {
                    j7f.y(n45.u());
                }
            } else if (i == 4) {
                udd.q(str, "Player. State changed: ExoPlayer.STATE_ENDED");
                n45.w2();
                if (n45.V0 == 1) {
                    udd.q(str, "Player. State ended, but video is looping. Restart");
                    play();
                    return;
                }
                j7f j7f2 = this.Y;
                if (j7f2 != null) {
                    j7f2.o();
                }
            }
        } else {
            udd.q(str, "Player. State changed: ExoPlayer.STATE_BUFFERING");
            j7f j7f3 = this.Y;
            if (j7f3 != null) {
                j7f3.y0();
            }
        }
    }

    public final void onAudioFocusChange(int i) {
        String str = this.c;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, wn6.h(i, "Player. On audio focus change: "), (Throwable) null);
        }
        this.X.n(i);
    }

    public final void pause() {
        n45 n45 = this.o;
        n45.w2();
        if (!n45.r1) {
            udd.q(this.c, "Player. Pause");
            n45.Y(false);
            j7f j7f = this.Y;
            if (j7f != null) {
                j7f.h();
            }
        }
    }

    public final void play() {
        udd.q(this.c, "Player. Play");
        n45 n45 = this.o;
        if (n45.getPlaybackState() == 4) {
            J0();
        }
        n45.Y(true);
        j7f j7f = this.Y;
        if (j7f != null) {
            j7f.i();
        }
        this.X.p(3);
    }

    public final void x0(PlaybackException playbackException) {
        udd.s(this.c, "Player. Error", playbackException);
        this.a.c(new HandledException(playbackException), false);
        j7f j7f = this.Y;
        if (j7f != null) {
            j7f.f();
        }
    }
}
