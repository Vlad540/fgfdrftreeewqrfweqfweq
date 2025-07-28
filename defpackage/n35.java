package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Looper;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.tamtam.util.HandledException;

/* renamed from: n35  reason: default package */
public final class n35 implements gya, AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int C0 = 0;
    public int A0;
    public boolean B0;
    public final mn X;
    public al7 Y;
    public u2f Z;
    public final tgd a;
    public final kv2 b;
    public final g15 c;
    public final f35 o;
    public float w0 = 0.0f;
    public yh0 x0;
    public int y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r1v2, types: [zl3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [kv2, java.lang.Object] */
    public n35(Context context, g15 g15, f35 f35, oa7 oa7, i03 i03) {
        this.c = g15;
        this.o = f35;
        c94.a("bufferForPlaybackMs", 500, 0, "0");
        c94.a("bufferForPlaybackAfterRebufferMs", 3000, 0, "0");
        c94.a("minBufferMs", 7000, 500, "bufferForPlaybackMs");
        c94.a("minBufferMs", 7000, 3000, "bufferForPlaybackAfterRebufferMs");
        c94.a("maxBufferMs", 15000, 7000, "minBufferMs");
        c94 c94 = new c94(new l34(0), 7000, 15000, 500, 3000);
        ac4 ac4 = new ac4(context, new Object());
        ob4 b2 = ac4.b();
        String iSO3Language = i03.u().getISO3Language();
        if (iSO3Language == null) {
            b2.c(new String[0]);
        } else {
            b2.c(new String[]{iSO3Language});
        }
        hbe hbe = new hbe(context);
        p35 p35 = new p35(context, hbe);
        swb.h(!p35.p);
        p35.e = new k94(4, ac4);
        swb.h(!p35.p);
        p35.f = new k94(1, c94);
        swb.h(!p35.p);
        p35.p = true;
        tgd tgd = new tgd(p35);
        this.a = tgd;
        tgd.Z1();
        m45 m45 = tgd.c;
        m45.getClass();
        oz2 oz2 = m45.B0;
        oz2.getClass();
        ((CopyOnWriteArraySet) oz2.d).add(new oh7(this));
        tgd.Z1();
        f44 f44 = m45.G0;
        f44.getClass();
        oz2 oz22 = f44.Y;
        oz22.getClass();
        ((CopyOnWriteArraySet) oz22.d).add(new oh7(this));
        ? obj = new Object();
        obj.o = Collections.emptyList();
        obj.b = tgd;
        obj.a = ac4;
        obj.X = i03;
        obj.Y = oa7;
        obj.Z = hbe;
        this.b = obj;
        this.X = new mn(20, new ep(context));
        context.registerReceiver(new an(6, this), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    public static void u() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is NOT main!");
        }
    }

    public final void A() {
        u();
        u2f u2f = this.Z;
        tgd tgd = this.a;
        if (u2f != null && u2f.m() > 0) {
            u2f u2f2 = this.Z;
            if (!((jj0) u2f2).c) {
                udd.p("n35", "seekToStart seekTo: %d", new Object[]{Long.valueOf(u2f2.m())});
                tgd.r(tgd.p0(), this.Z.m());
                return;
            }
        }
        udd.q("n35", "seekToStart seekTo: 0");
        tgd.r(tgd.p0(), 0);
    }

    public final void D() {
        udd.q("n35", "Stop");
        u();
        tgd tgd = this.a;
        tgd.Z1();
        m45 m45 = tgd.c;
        m45.s2();
        m45.s2();
        m45.M0.d(1, m45.u());
        m45.n2((ExoPlaybackException) null);
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        al7 al7 = this.Y;
        if (al7 != null) {
            al7.o();
        }
    }

    public final void I(voe voe, epe epe) {
        p98 p98;
        u();
        if (!this.B0) {
            this.B0 = this.b.l();
        }
        al7 al7 = this.Y;
        if (al7 != null && (p98 = al7.e) != null) {
            p98.K();
        }
    }

    public final boolean a() {
        tgd tgd = this.a;
        tgd.Z1();
        m45 m45 = tgd.c;
        m45.s2();
        int i = m45.o1.e;
        if (i != 2 && i != 3) {
            return false;
        }
        tgd.Z1();
        if (!m45.u()) {
            return false;
        }
        tgd.Z1();
        m45.s2();
        return m45.o1.m == 0;
    }

    public final void g(float f) {
        u();
        tgd tgd = this.a;
        float e = tgd.e();
        tgd.Z1();
        m45 m45 = tgd.c;
        m45.s2();
        float i = mze.i(f, 0.0f, 1.0f);
        if (m45.i1 != i) {
            m45.i1 = i;
            m45.k2(1, 2, Float.valueOf(m45.M0.e * i));
            m45.B0.m(22, new u35(0, i));
        }
        al7 al7 = this.Y;
        if (al7 != null) {
            p98 p98 = al7.e;
            if (p98 != null) {
                p98.d1();
            }
            if (al7.b.a()) {
                if (al7.k()) {
                    al7.a();
                } else {
                    al7.o();
                }
            }
        }
        if (e <= 0.0f && f > 0.0f) {
            w();
        }
    }

    public final void h(int i) {
        p98 p98;
        p98 p982;
        u();
        if (i == 1) {
            udd.q("n35", "onPlayerStateChanged ExoPlayer.STATE_IDLE");
        } else if (i == 2) {
            udd.q("n35", "onPlayerStateChanged ExoPlayer.STATE_BUFFERING");
            al7 al7 = this.Y;
            if (al7 != null && (p98 = al7.e) != null) {
                p98.y0();
            }
        } else if (i == 3) {
            udd.q("n35", "onPlayerStateChanged ExoPlayer.STATE_READY");
            al7 al72 = this.Y;
            if (al72 != null && (p982 = al72.e) != null) {
                p982.j1();
            }
        } else if (i == 4) {
            udd.q("n35", "onPlayerStateChanged ExoPlayer.STATE_ENDED");
            if (this.a.getRepeatMode() == 1) {
                udd.q("n35", "State ended, but video is looping. Restart");
                play();
                return;
            }
            al7 al73 = this.Y;
            if (al73 != null) {
                p98 p983 = al73.e;
                if (p983 != null) {
                    p983.o();
                }
                al73.o();
            }
        }
    }

    public final void onAudioFocusChange(int i) {
        udd.p("n35", "On audio focus change, %d", new Object[]{Integer.valueOf(i)});
        tgd tgd = this.a;
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    udd.n("n35", "onAudioFocusChange: AUDIOFOCUS_LOSS");
                    if (a() && tgd.e() > 0.0f) {
                        udd.n("n35", "onAudioFocusChange: AUDIOFOCUS_LOSS. Stop");
                        pause();
                    }
                } else if (i == 1) {
                    if (!a()) {
                        udd.n("n35", "onAudioFocusChange: AUDIOFOCUS_GAIN. Resuming player");
                        play();
                    }
                    float e = tgd.e();
                    if (e > 0.0f && ((double) e) < 1.0d) {
                        udd.n("n35", "onAudioFocusChange: AUDIOFOCUS_GAIN. Volume up");
                        g(1.0f);
                    }
                }
            } else if (a() && tgd.e() > 0.0f) {
                udd.n("n35", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player");
                pause();
            }
        } else if (a() && tgd.e() > 0.0f) {
            udd.n("n35", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2");
            g(0.2f);
        }
    }

    public final void pause() {
        udd.q("n35", "Pause");
        u();
        this.a.Y(false);
        al7 al7 = this.Y;
        if (al7 != null) {
            p98 p98 = al7.e;
            if (p98 != null) {
                p98.h();
            }
            al7.o();
        }
    }

    public final void play() {
        udd.q("n35", "Play");
        u();
        tgd tgd = this.a;
        tgd.Z1();
        m45 m45 = tgd.c;
        m45.s2();
        if (m45.o1.e == 4) {
            A();
        }
        tgd.Y(true);
        al7 al7 = this.Y;
        if (al7 != null) {
            al7.l();
        }
        w();
    }

    public final void r(PlaybackException playbackException) {
        u();
        udd.s("n35", "onPlayerError", playbackException);
        if (playbackException != null) {
            this.c.c(new HandledException(playbackException), false);
        }
        al7 al7 = this.Y;
        if (al7 != null) {
            p98 p98 = al7.e;
            if (p98 != null) {
                p98.D1(playbackException);
            }
            al7.o();
        }
    }

    public final long v() {
        u2f u2f = this.Z;
        if (u2f == null) {
            return 0;
        }
        int i = (u2f.k() > 0 ? 1 : (u2f.k() == 0 ? 0 : -1));
        tgd tgd = this.a;
        if (i > 0) {
            tgd.Z1();
            return Math.min(tgd.c.c(), this.Z.k() - this.Z.m());
        }
        tgd.Z1();
        return tgd.c.c();
    }

    public final void w() {
        if (this.a.e() > 0.0f && a()) {
            ((AudioManager) this.X.get()).requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).build());
        }
    }

    public final void y(int i) {
        udd.p("n35", "onTimelineChanged %d", new Object[]{Integer.valueOf(i)});
    }
}
