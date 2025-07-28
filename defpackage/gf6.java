package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: gf6  reason: default package */
public final class gf6 implements wh6, i83, dld, x89, of3, h67, b38, vu9, gw3, Provider {
    public static final gf6 X = new gf6(4);
    public static final gf6 b = new gf6(1);
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public static final gf6 o = new gf6(3);
    public final /* synthetic */ int a;

    public /* synthetic */ gf6(int i) {
        this.a = i;
    }

    public static void g(ArrayList arrayList, int i) {
        if (xie.v(i, 0, 7, c) != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static File j(Context context, x3a x3a) {
        File k = k(context);
        h2g.t(k);
        return ng5.N(k, ((String) x3a.b) + '_' + System.currentTimeMillis() + ".bin");
    }

    public static File k(Context context) {
        String str;
        String B = xs7.B();
        if (B.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(B.replace(':', '-'));
        }
        return new File(context.getCacheDir(), str);
    }

    public MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public void accept(Object obj) {
    }

    public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public yu9 call() {
        return new bv9();
    }

    public int d() {
        return MediaCodecList.getCodecCount();
    }

    public boolean e() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, lk] */
    public Object f(ws8 ws8) {
        ? obj = new Object();
        obj.c = BuildConfig.FLAVOR;
        int K = jjd.K(ws8);
        for (int i = 0; i < K; i++) {
            String M = jjd.M(ws8);
            M.getClass();
            char c2 = 65535;
            switch (M.hashCode()) {
                case -1724546052:
                    if (M.equals("description")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (M.equals("name")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 93925698:
                    if (M.equals("botId")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.c = jjd.M(ws8);
                    break;
                case 1:
                    obj.b = jjd.M(ws8);
                    break;
                case 2:
                    obj.a = jjd.J(ws8, 0);
                    break;
                default:
                    ws8.z();
                    break;
            }
        }
        return new xo0(obj);
    }

    public Object get() {
        return new eye(1);
    }

    public Object h(uwb uwb) {
        return kjd.r((Executor) uwb.f(new pjb(eo0.class, Executor.class)));
    }

    public void i(jx4 jx4) {
        p70 p70 = p70.a;
        x57 x57 = (x57) jx4;
        x57.a(bk0.class, p70);
        x57.a(r80.class, p70);
        s70 s70 = s70.a;
        x57.a(vn7.class, s70);
        x57.a(x90.class, s70);
        q70 q70 = q70.a;
        x57.a(d03.class, q70);
        x57.a(y80.class, q70);
        o70 o70 = o70.a;
        x57.a(ld.class, o70);
        x57.a(j80.class, o70);
        r70 r70 = r70.a;
        x57.a(pn7.class, r70);
        x57.a(w90.class, r70);
        t70 t70 = t70.a;
        x57.a(ph9.class, t70);
        x57.a(aa0.class, t70);
    }

    public Object parse(m67 m67) {
        if (m67.peek() == 0) {
            return null;
        }
        m67.z();
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public gf6(bd4 bd4) {
        this.a = 6;
    }
}
