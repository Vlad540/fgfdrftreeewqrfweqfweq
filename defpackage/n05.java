package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: n05  reason: default package */
public final class n05 implements hd {
    public static final NumberFormat o;
    public final tje a = new tje();
    public final qje b = new qje();
    public final long c = SystemClock.elapsedRealtime();

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        o = instance;
        instance.setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
        instance.setGroupingUsed(false);
    }

    public static String a(z50 z50) {
        return z50.a + "," + z50.c + "," + z50.b + "," + z50.d + "," + z50.e + "," + z50.f;
    }

    public static String d(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return o.format((double) (((float) j) / 1000.0f));
    }

    public final void A(gd gdVar, boolean z) {
        f(gdVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    public final void A0(gd gdVar, spe spe) {
        a39 a39;
        ez3.v("tracks [" + c(gdVar));
        ws6 a2 = spe.a();
        for (int i = 0; i < a2.size(); i++) {
            rpe rpe = (rpe) a2.get(i);
            ez3.v("  group [");
            for (int i2 = 0; i2 < rpe.a; i2++) {
                String str = rpe.g(i2) ? "[X]" : "[ ]";
                ez3.v("    " + str + " Track:" + i2 + ", " + xu5.e(rpe.c(i2)) + ", supported=" + oze.z(rpe.d(i2)));
            }
            ez3.v("  ]");
        }
        boolean z = false;
        int i3 = 0;
        while (!z && i3 < a2.size()) {
            rpe rpe2 = (rpe) a2.get(i3);
            int i4 = 0;
            while (!z && i4 < rpe2.a) {
                if (rpe2.g(i4) && (a39 = rpe2.c(i4).k) != null && a39.d() > 0) {
                    ez3.v("  Metadata [");
                    g(a39, "    ");
                    ez3.v("  ]");
                    z = true;
                }
                i4++;
            }
            i3++;
        }
        ez3.v("]");
    }

    public final void B(gd gdVar, jya jya, jya jya2, int i) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(jya.b);
        sb.append(", period=");
        sb.append(jya.e);
        sb.append(", pos=");
        sb.append(jya.f);
        int i2 = jya.h;
        if (i2 != -1) {
            sb.append(", contentPos=");
            sb.append(jya.g);
            sb.append(", adGroup=");
            sb.append(i2);
            sb.append(", ad=");
            sb.append(jya.i);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(jya2.b);
        sb.append(", period=");
        sb.append(jya2.e);
        sb.append(", pos=");
        sb.append(jya2.f);
        int i3 = jya2.h;
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(jya2.g);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(jya2.i);
        }
        sb.append("]");
        f(gdVar, "positionDiscontinuity", sb.toString());
    }

    public final void B0(gd gdVar, Exception exc) {
        ez3.A(b(gdVar, "internalError", "drmSessionManagerError", exc));
    }

    public final void C(gd gdVar, wxa wxa) {
        f(gdVar, "playbackParameters", wxa.toString());
    }

    public final void C0(gd gdVar, int i) {
        f(gdVar, "playbackSuppressionReason", i != 0 ? i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    public final void D(gd gdVar, String str) {
        f(gdVar, "audioDecoderInitialized", str);
    }

    public final void D0(gd gdVar) {
        e(gdVar, "drmKeysRestored");
    }

    public final void E(gd gdVar, a39 a39) {
        ez3.v("metadata [" + c(gdVar));
        g(a39, "  ");
        ez3.v("]");
    }

    public final void E0(gd gdVar, i78 i78) {
        f(gdVar, "upstreamDiscarded", xu5.e((xu5) i78.g));
    }

    public final void F(gd gdVar, int i) {
        f(gdVar, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    public final void G(gd gdVar, int i) {
        f(gdVar, "droppedFrames", Integer.toString(i));
    }

    public final void I(gd gdVar, xu5 xu5) {
        f(gdVar, "audioInputFormat", xu5.e(xu5));
    }

    public final void J(gd gdVar, int i, int i2) {
        f(gdVar, "surfaceSize", i + ", " + i2);
    }

    public final void K(gd gdVar, l24 l24) {
        e(gdVar, "videoDisabled");
    }

    public final void L(gd gdVar, int i) {
        f(gdVar, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    public final void M(gd gdVar, int i, long j) {
    }

    public final void N(gd gdVar, k20 k20) {
        f(gdVar, "audioAttributes", k20.a + "," + k20.b + "," + k20.c + "," + k20.d);
    }

    public final void P(gd gdVar, z50 z50) {
        f(gdVar, "audioTrackInit", a(z50));
    }

    public final void Q(gd gdVar) {
        e(gdVar, "videoEnabled");
    }

    public final void R(gd gdVar, i78 i78, IOException iOException, boolean z) {
        ez3.A(b(gdVar, "internalError", "loadError", iOException));
    }

    public final void T(gd gdVar, r8f r8f) {
        f(gdVar, "videoSize", r8f.a + ", " + r8f.b);
    }

    public final void U(gd gdVar, int i) {
        vje vje = gdVar.b;
        int i2 = vje.i();
        int p = vje.p();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(c(gdVar));
        sb.append(", periodCount=");
        sb.append(i2);
        sb.append(", windowCount=");
        sb.append(p);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        ez3.v(sb.toString());
        for (int i3 = 0; i3 < Math.min(i2, 3); i3++) {
            qje qje = this.b;
            vje.g(i3, qje, false);
            ez3.v("  period [" + d(oze.h0(qje.d)) + "]");
        }
        if (i2 > 3) {
            ez3.v("  ...");
        }
        for (int i4 = 0; i4 < Math.min(p, 3); i4++) {
            tje tje = this.a;
            vje.o(i4, tje);
            ez3.v("  window [" + d(oze.h0(tje.m)) + ", seekable=" + tje.h + ", dynamic=" + tje.i + "]");
        }
        if (p > 3) {
            ez3.v("  ...");
        }
        ez3.v("]");
    }

    public final void V(gd gdVar, xu5 xu5) {
        f(gdVar, "videoInputFormat", xu5.e(xu5));
    }

    public final void W(gd gdVar, i78 i78) {
        f(gdVar, "downstreamFormat", xu5.e((xu5) i78.g));
    }

    public final void Z(gd gdVar, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(c(gdVar));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        ez3.v(sb.toString());
    }

    public final String b(gd gdVar, String str, String str2, Throwable th) {
        StringBuilder n = me4.n(str, " [");
        n.append(c(gdVar));
        String sb = n.toString();
        if (th instanceof PlaybackException) {
            StringBuilder n2 = me4.n(sb, ", errorCode=");
            n2.append(((PlaybackException) th).b());
            sb = n2.toString();
        }
        if (str2 != null) {
            sb = me4.i(sb, ", ", str2);
        }
        String L = ez3.L(th);
        if (!TextUtils.isEmpty(L)) {
            StringBuilder n3 = me4.n(sb, "\n  ");
            n3.append(L.replace("\n", "\n  "));
            n3.append(10);
            sb = n3.toString();
        }
        return hr1.g(sb, "]");
    }

    public final String c(gd gdVar) {
        String str = "window=" + gdVar.c;
        se8 se8 = gdVar.d;
        if (se8 != null) {
            StringBuilder n = me4.n(str, ", period=");
            n.append(gdVar.b.b(se8.a));
            str = n.toString();
            if (se8.b()) {
                StringBuilder n2 = me4.n(str, ", adGroup=");
                n2.append(se8.b);
                StringBuilder n3 = me4.n(n2.toString(), ", ad=");
                n3.append(se8.c);
                str = n3.toString();
            }
        }
        return "eventTime=" + d(gdVar.a - this.c) + ", mediaPos=" + d(gdVar.e) + ", " + str;
    }

    public final void e(gd gdVar, String str) {
        ez3.v(b(gdVar, str, (String) null, (Throwable) null));
    }

    public final void e0(gd gdVar, Object obj, long j) {
        f(gdVar, "renderedFirstFrame", String.valueOf(obj));
    }

    public final void f(gd gdVar, String str, String str2) {
        ez3.v(b(gdVar, str, str2, (Throwable) null));
    }

    public final void g(a39 a39, String str) {
        for (x29 append : a39.a) {
            StringBuilder l = hr1.l(str);
            l.append(append);
            ez3.v(l.toString());
        }
    }

    public final void g0(gd gdVar, String str) {
        f(gdVar, "videoDecoderReleased", str);
    }

    public final void h0(gd gdVar, z50 z50) {
        f(gdVar, "audioTrackReleased", a(z50));
    }

    public final void j0(gd gdVar) {
        e(gdVar, "audioEnabled");
    }

    public final void k0(gd gdVar, int i) {
        f(gdVar, "drmSessionAcquired", "state=" + i);
    }

    public final void l0(gd gdVar) {
        e(gdVar, "audioDisabled");
    }

    public final void m0(gd gdVar, PlaybackException playbackException) {
        ez3.A(b(gdVar, "playerFailed", (String) null, playbackException));
    }

    public final void n0(gd gdVar, float f) {
        f(gdVar, "volume", Float.toString(f));
    }

    public final void o0(gd gdVar, int i, long j, long j2) {
        ez3.A(b(gdVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, (Throwable) null));
    }

    public final void r(gd gdVar, boolean z) {
        f(gdVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    public final void s(gd gdVar) {
        e(gdVar, "drmKeysLoaded");
    }

    public final void t(gd gdVar, boolean z) {
        f(gdVar, "isPlaying", Boolean.toString(z));
    }

    public final void v0(gd gdVar) {
        e(gdVar, "drmSessionReleased");
    }

    public final void w0(gd gdVar, String str) {
        f(gdVar, "videoDecoderInitialized", str);
    }

    public final void x(gd gdVar) {
        e(gdVar, "drmKeysRemoved");
    }

    public final void y(gd gdVar, String str) {
        f(gdVar, "audioDecoderReleased", str);
    }

    public final void y0(gd gdVar, boolean z) {
        f(gdVar, "loading", Boolean.toString(z));
    }

    public final void z0(gd gdVar, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        f(gdVar, "playWhenReady", sb.toString());
    }
}
