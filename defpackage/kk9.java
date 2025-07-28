package defpackage;

import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.media.MediaCodec;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import javax.inject.Provider;

/* renamed from: kk9  reason: default package */
public final class kk9 implements jo2, j26, lh6, of3, swe, dld, d13, bj6, Provider, h67, mt7, g28, rh {
    public static final j53 X;
    public static final qme Y = new qme(new pme(-1, -15921907, 336136457, -15757630, 2047675661, 168364297, -1727033662), new tme(-15921907, -2062742259, -1, -15757630, -1552977290, -1552977290, -1543503873, -1191182337), new rme(-15921907, -11447211, -7762804, -4407874, -1, -15757630, 336136457, -1552977290, -1552977290, -1552977290, -1552977290, -1191182337, -1191182337, -1727033662, 168364297), new sme(688655630, 252448014));
    public static final avf Z = new avf(new zuf(-1, -1, -592138, 336136457), new dvf(-15987442, -2062807794, -2062807794, -1207169778, 1712065806, -15987442, -15757630), new bvf(-15757630, -15987442, -7762804, -7762804, 1879837966), new cvf(-15757630, 252448014, 252448014));
    public static kk9 a;
    public static final kk9 b = new Object();
    public static final dr0 c;
    public static final dr0 o;
    public static final kk9 w0 = new Object();
    public static final kk9 x0 = new Object();
    public static final kk9 y0 = new Object();
    public static final kk9 z0 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [kk9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [kk9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [kk9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [kk9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [kk9, java.lang.Object] */
    static {
        cr0 cr0 = new cr0(-15757630, 336563906, -1, -2062577982);
        c = new dr0(new xq0(new wq0(-1559261502, -1559261502, 1712295618), new yq0(new zq0(1019586, 521113282), new ar0(1019586, 1024429762), new br0(821435, 1024231611)), cr0, -1, -15757630, 1024429762, 336563906, 336563906, 336563906, 336563906, -1, new int[]{-1, -1, -1}), new gr0(new hr0(-1, -15757630, -15757630, -1), -15757630, -15757630, -15987442, -2062807794, -2062807794, -15757630, -1207169778, -2062807794, -2062807794, -1207169778), new er0(-15757630, -1, -1, -15757630, -8682855, -1307603262, -15757630, -53188, -8682855, -15757630, -1559491314, -1895035634, 1879837966, -1895035634), new fr0(-15757630, -1, 336563906));
        cr0 cr02 = new cr0(-15757630, 521113282, -1, -2062577982);
        o = new dr0(new xq0(new wq0(-1728006644, -1728006644, 1711322636), new yq0(new zq0(1019586, 521113282), new ar0(1019586, 1024429762), new br0(821435, 1024231611)), cr02, -1442305, -15757630, 1544523458, 336563906, 336563906, 336563906, 521113282, -656897, new int[]{-1442305, -1442305, -1442305}), new gr0(new hr0(-1, -15757630, -15757630, -1), -15757630, -15757630, -16438468, -2063258820, -15757630, -15757630, -1207620804, -2063258820, -2063258820, -1207620804), new er0(-15757630, -1, -1442305, -15757630, -2063258820, -15757630, -15757630, -53188, -2063258820, -15757630, -1559942340, -1895486660, 1879386940, -1895486660), new fr0(-15757630, -1442305, 336563906));
        f43 f43 = new f43(new d43(1308622847, new int[]{16777215, 1090519039, -2130706433}), new e43(-986638, new int[]{16777215, 1090519039, -2130706433}), new h43(new g43(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new j43(new i43(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444}));
        X = new j53(new b43(new a43(526344, -6695465, -8340225, 1291877119), new c43(-371456, 1039815936, 704271616, -1543503873, 1024489791, 688945471, -2409396, 1037777996, 702233676, -16544549, 1023642843, 688098523, 1033643952, 698099632, -10587743, 1029599649, 694055329, 1025203902, 689659582, 1024429762, 688885442, -9158436, 1031028956, 695484636), f43, -8734748, 1543503872, -1192234767, -2062577982, -1249810, -1184014, new int[]{-2062577982, -2062577982}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-6695465, -8340225}), new w53(-1, -15987442), new k53(-15757630), new v53(1308622847, -1, 688655630), new z33(-15757630, -2693121, -15921907, -53188, -15757630, -15987442, -4933959), new p53(251658240, 167772160, 251658240, 251658240), new s53(new r53(new q53(-16089170)), new t53(-1545253546, -1727033662), new u53(-1545253546, -1727033662)));
    }

    public static MediaCodec p(e28 e28) {
        e28.a.getClass();
        String str = e28.a.a;
        String valueOf = String.valueOf(str);
        xs7.e(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        xs7.l();
        return createByCodecName;
    }

    public static Font q(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int r = r(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int r2 = r(fontStyle, font2.getStyle());
            if (r2 < r) {
                font = font2;
                r = r2;
            }
        }
        return font;
    }

    public static int r(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public void accept(Object obj) {
        int i = v2c.g;
        udd.s("v2c", "RECENT REMOVED update handle fail", (Throwable) obj);
    }

    public Object apply(Object obj) {
        return ms9.j((List) obj);
    }

    public lja b() {
        return new zi6();
    }

    public dr0 c() {
        return c;
    }

    public avf d() {
        return Z;
    }

    public boolean e() {
        return false;
    }

    public dr0 f() {
        return o;
    }

    public i28 g(e28 e28) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = p(e28);
            xs7.e("configureCodec");
            mediaCodec.configure(e28.b, e28.d, e28.e, 0);
            xs7.l();
            xs7.e("startCodec");
            mediaCodec.start();
            xs7.l();
            return new w4g(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    public Object get() {
        return new c27(Executors.newSingleThreadExecutor());
    }

    public long h() {
        return 0;
    }

    public lja i(vi6 vi6, ni6 ni6) {
        return new zi6(vi6, ni6);
    }

    public void j() {
    }

    public qme k() {
        return Y;
    }

    public void l(rcd rcd, Throwable th) {
        Object b2 = rcd.b();
        m75.j(e13.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(rcd)), b2 == null ? null : b2.getClass().getName());
    }

    public Map m(Map map) {
        return map == null ? new LinkedHashMap() : map;
    }

    public boolean n(long j) {
        return true;
    }

    public j53 o() {
        return X;
    }

    public Object parse(m67 m67) {
        return gwf.D(m67);
    }
}
