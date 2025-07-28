package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* renamed from: r38  reason: default package */
public final class r38 implements kya {
    public final Handler X;
    public final long Y = -9223372036854775807L;
    public boolean Z;
    public final tje a = new tje();
    public boolean b;
    public final q38 c;
    public final p38 o;
    public final o38 w0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: u48} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: o48} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: u48} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: u48} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r38(android.content.Context r7, defpackage.m3d r8, android.os.Bundle r9, defpackage.p38 r10, android.os.Looper r11, defpackage.z38 r12, defpackage.mn r13) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "context must not be null"
            defpackage.oyb.h(r7, r0)
            java.lang.String r0 = "token must not be null"
            defpackage.oyb.h(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Init "
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " [AndroidXMedia3/1.4.1] ["
            r0.append(r1)
            java.lang.String r1 = defpackage.oze.e
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.ez3.M(r0)
            tje r0 = new tje
            r0.<init>()
            r6.a = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.Y = r0
            r6.o = r10
            android.os.Handler r10 = new android.os.Handler
            r10.<init>(r11)
            r6.X = r10
            r6.w0 = r12
            l3d r10 = r8.a
            boolean r10 = r10.e()
            if (r10 == 0) goto L_0x0065
            u48 r9 = new u48
            r13.getClass()
            r0 = r9
            r1 = r7
            r2 = r6
            r3 = r8
            r4 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0071
        L_0x0065:
            o48 r10 = new o48
            r0 = r10
            r1 = r7
            r2 = r6
            r3 = r8
            r4 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r10
        L_0x0071:
            r6.c = r9
            r9.connect()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r38.<init>(android.content.Context, m3d, android.os.Bundle, p38, android.os.Looper, z38, mn):void");
    }

    public final long A() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.A();
        }
        return -9223372036854775807L;
    }

    public final void A0(int i, l68 l68) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring replaceMediaItem().");
        } else {
            q38.A0(i, l68);
        }
    }

    public final int B() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.B();
        }
        return -1;
    }

    public final r8f C() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() ? q38.C() : r8f.e;
    }

    public final void C0(l68 l68) {
        K();
        oyb.h(l68, "mediaItems must not be null");
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setMediaItems().");
        } else {
            q38.C0(l68);
        }
    }

    public final void D() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekToPreviousMediaItem().");
        } else {
            q38.D();
        }
    }

    public final void D0() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            q38.D0();
        }
    }

    public final void E() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekTo().");
        } else {
            q38.E();
        }
    }

    public final boolean E0() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() && q38.E0();
    }

    public final k20 F() {
        K();
        q38 q38 = this.c;
        return !q38.isConnected() ? k20.g : q38.F();
    }

    public final mpe F0() {
        K();
        q38 q38 = this.c;
        return !q38.isConnected() ? mpe.C : q38.F0();
    }

    public final void G(Runnable runnable) {
        oze.W(this.X, runnable);
    }

    public final long G0() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.G0();
        }
        return 0;
    }

    public final void H(int i, boolean z) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            q38.H(i, z);
        }
    }

    public final void H0(int i, long j, List list) {
        K();
        oyb.h(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            oyb.c("items must not contain null, index=" + i2, list.get(i2) != null);
        }
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setMediaItems().");
        } else {
            q38.H0(i, j, list);
        }
    }

    public final uf4 I() {
        K();
        q38 q38 = this.c;
        return !q38.isConnected() ? uf4.e : q38.I();
    }

    public final void I0(int i) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            q38.I0(i);
        }
    }

    public final void J() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            q38.J();
        }
    }

    public final void J0() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekToNext().");
        } else {
            q38.J0();
        }
    }

    public final void K() {
        oyb.j("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.X.getLooper());
    }

    public final void K0() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekForward().");
        } else {
            q38.K0();
        }
    }

    public final boolean K1() {
        K();
        vje x0 = x0();
        return !x0.q() && x0.n(p0(), this.a, 0).a();
    }

    public final void L(int i, int i2) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            q38.L(i, i2);
        }
    }

    public final void L0() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekBack().");
        } else {
            q38.L0();
        }
    }

    public final boolean M() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() && q38.M();
    }

    public final void N(int i) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            q38.N(i);
        }
    }

    public final z78 N0() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() ? q38.N0() : z78.J;
    }

    public final int O() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.O();
        }
        return -1;
    }

    public final void O0(List list) {
        K();
        oyb.h(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            oyb.c("items must not contain null, index=" + i, list.get(i) != null);
        }
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setMediaItems().");
        } else {
            q38.O0(list);
        }
    }

    public final long P0() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.P0();
        }
        return 0;
    }

    public final void Q(mpe mpe) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        q38.Q(mpe);
    }

    public final l68 R0() {
        vje x0 = x0();
        if (x0.q()) {
            return null;
        }
        return x0.n(p0(), this.a, 0).c;
    }

    public final void S(int i) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring removeMediaItem().");
        } else {
            q38.S(i);
        }
    }

    public final void U(int i, int i2) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring removeMediaItems().");
        } else {
            q38.U(i, i2);
        }
    }

    public final void V() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekToPrevious().");
        } else {
            q38.V();
        }
    }

    public final PlaybackException X() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.X();
        }
        return null;
    }

    public final void Y(boolean z) {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            q38.Y(z);
        }
    }

    public final void Z(int i) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekTo().");
        } else {
            q38.Z(i);
        }
    }

    public final boolean a() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() && q38.a();
    }

    public final long a0() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.a0();
        }
        return 0;
    }

    public final boolean b() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() && q38.b();
    }

    public final long b0() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.b0();
        }
        return 0;
    }

    public final long c() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.c();
        }
        return -9223372036854775807L;
    }

    public final wxa d() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() ? q38.d() : wxa.d;
    }

    public final void d0(int i, List list) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring addMediaItems().");
        } else {
            q38.d0(i, list);
        }
    }

    public final float e() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.e();
        }
        return 1.0f;
    }

    public final long e0() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.e0();
        }
        return 0;
    }

    public final void f(wxa wxa) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setPlaybackParameters().");
        } else {
            q38.f(wxa);
        }
    }

    public final void f0() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekToNextMediaItem().");
        } else {
            q38.f0();
        }
    }

    public final void g(float f) {
        K();
        oyb.c("volume must be between 0 and 1", f >= 0.0f && f <= 1.0f);
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setVolume().");
        } else {
            q38.g(f);
        }
    }

    public final void g0(int i) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            q38.g0(i);
        }
    }

    public final int getPlaybackState() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.getPlaybackState();
        }
        return 1;
    }

    public final int getRepeatMode() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.getRepeatMode();
        }
        return 0;
    }

    public final int h() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.T0();
        }
        return -1;
    }

    public final spe h0() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() ? q38.h0() : spe.b;
    }

    public final int i() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.R0();
        }
        return -1;
    }

    public final void j() {
        oyb.k(Looper.myLooper() == this.X.getLooper());
        oyb.k(!this.Z);
        this.Z = true;
        z38 z38 = (z38) this.w0;
        z38.y0 = true;
        r38 r38 = z38.x0;
        if (r38 != null) {
            z38.l(r38);
        }
    }

    public final boolean j0() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() && q38.j0();
    }

    public final long k() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.k();
        }
        return 0;
    }

    public final z78 k0() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() ? q38.k0() : z78.J;
    }

    public final int l() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            return 0;
        }
        return q38.l();
    }

    public final vw3 l0() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() ? q38.l0() : vw3.c;
    }

    public final void m(Surface surface) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setVideoSurface().");
        } else {
            q38.m(surface);
        }
    }

    public final void m0(k20 k20, boolean z) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setAudioAttributes().");
        } else {
            q38.m0(k20, z);
        }
    }

    public final boolean n() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() && q38.n();
    }

    public final void n0(z78 z78) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setPlaylistMetadata().");
        } else {
            q38.n0(z78);
        }
    }

    public final boolean n1() {
        K();
        vje x0 = x0();
        return !x0.q() && x0.n(p0(), this.a, 0).h;
    }

    public final void o(nf3 nf3) {
        oyb.k(Looper.myLooper() == this.X.getLooper());
        nf3.accept(this.o);
    }

    public final int o0() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.o0();
        }
        return -1;
    }

    public final long p() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.p();
        }
        return -9223372036854775807L;
    }

    public final int p0() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.p0();
        }
        return -1;
    }

    public final void pause() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring pause().");
        } else {
            q38.pause();
        }
    }

    public final void play() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring play().");
        } else {
            q38.play();
        }
    }

    public final void prepare() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring prepare().");
        } else {
            q38.prepare();
        }
    }

    public final long q() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.q();
        }
        return 0;
    }

    public final void q0(boolean z) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            q38.q0(z);
        }
    }

    public final void r(int i, long j) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekTo().");
        } else {
            q38.r(i, j);
        }
    }

    public final void r0(hya hya) {
        K();
        oyb.h(hya, "listener must not be null");
        this.c.r0(hya);
    }

    public final void release() {
        K();
        if (!this.b) {
            ez3.M("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oze.e + "] [" + g78.b() + "]");
            boolean z = true;
            this.b = true;
            Handler handler = this.X;
            handler.removeCallbacksAndMessages((Object) null);
            try {
                this.c.release();
            } catch (Exception e) {
                ez3.u(e, "Exception while releasing impl");
            }
            if (this.Z) {
                if (Looper.myLooper() != handler.getLooper()) {
                    z = false;
                }
                oyb.k(z);
                this.o.onDisconnected();
                return;
            }
            this.Z = true;
            z38 z38 = (z38) this.w0;
            z38.getClass();
            z38.m(new SecurityException("Session rejected the connection request."));
        }
    }

    public final eya s() {
        K();
        q38 q38 = this.c;
        return !q38.isConnected() ? eya.b : q38.s();
    }

    public final void s0(List list, int i, int i2) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring replaceMediaItems().");
        } else {
            q38.s0(list, i, i2);
        }
    }

    public final void seekTo(long j) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring seekTo().");
        } else {
            q38.seekTo(j);
        }
    }

    public final void setPlaybackSpeed(float f) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setPlaybackSpeed().");
        } else {
            q38.setPlaybackSpeed(f);
        }
    }

    public final void setRepeatMode(int i) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setRepeatMode().");
        } else {
            q38.setRepeatMode(i);
        }
    }

    public final void stop() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring stop().");
        } else {
            q38.stop();
        }
    }

    public final void t(l68 l68, long j) {
        K();
        oyb.h(l68, "mediaItems must not be null");
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setMediaItem().");
        } else {
            q38.t(l68, j);
        }
    }

    public final void t0(int i, int i2) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring moveMediaItem().");
        } else {
            q38.t0(i, i2);
        }
    }

    public final boolean t1(int i) {
        return s().a(i);
    }

    public final boolean u() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() && q38.u();
    }

    public final void u0(int i, int i2, int i3) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring moveMediaItems().");
        } else {
            q38.u0(i, i2, i3);
        }
    }

    public final void v() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring clearMediaItems().");
        } else {
            q38.v();
        }
    }

    public final int v0() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.v0();
        }
        return 0;
    }

    public final void w(boolean z) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring setShuffleMode().");
        } else {
            q38.w(z);
        }
    }

    public final void w0(List list) {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            ez3.j0("The controller is not connected. Ignoring addMediaItems().");
        } else {
            q38.w0(list);
        }
    }

    public final int x() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.x();
        }
        return 0;
    }

    public final vje x0() {
        K();
        q38 q38 = this.c;
        return q38.isConnected() ? q38.x0() : vje.a;
    }

    public final long y() {
        K();
        q38 q38 = this.c;
        if (q38.isConnected()) {
            return q38.y();
        }
        return 0;
    }

    public final boolean y1() {
        K();
        vje x0 = x0();
        return !x0.q() && x0.n(p0(), this.a, 0).i;
    }

    public final void z(hya hya) {
        this.c.z(hya);
    }

    public final boolean z0() {
        K();
        q38 q38 = this.c;
        if (!q38.isConnected()) {
            return false;
        }
        return q38.z0();
    }

    public final Looper z1() {
        return this.X.getLooper();
    }
}
