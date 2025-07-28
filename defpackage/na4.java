package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* renamed from: na4  reason: default package */
public final class na4 extends lh0 implements u65, q9c {
    public static final e8c v;
    public static final float[] w = {1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
    public static final float[] x = {1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    public final k96 h;
    public final ws6 i;
    public final ws6 j;
    public final boolean k;
    public final float[][] l;
    public final float[][] m;
    public final float[] n = gt0.k();
    public final float[] o = gt0.k();
    public final float[] p = new float[16];
    public e8c q = v;
    public Gainmap r;
    public int s = -1;
    public boolean t;
    public boolean u;

    static {
        po5 po5 = ws6.b;
        Object[] objArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}};
        e07.n(4, objArr);
        v = ws6.h(4, objArr);
    }

    public na4(k96 k96, ws6 ws6, ws6 ws62, int i2, boolean z) {
        super(z);
        this.h = k96;
        this.i = ws6;
        this.j = ws62;
        this.k = z;
        int size = ws6.size();
        int[] iArr = new int[2];
        iArr[1] = 16;
        iArr[0] = size;
        Class cls = Float.TYPE;
        this.l = (float[][]) Array.newInstance(cls, iArr);
        int size2 = ws62.size();
        int[] iArr2 = new int[2];
        iArr2[1] = 16;
        iArr2[0] = size2;
        this.m = (float[][]) Array.newInstance(cls, iArr2);
    }

    public static na4 h(Context context, e8c e8c, e8c e8c2, boolean z) {
        return new na4(j(context, "shaders/vertex_shader_transformation_es2.glsl", e8c2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl"), ws6.j(e8c), ws6.j(e8c2), 1, z);
    }

    public static na4 i(Context context, e8c e8c, List list, z23 z23, int i2) {
        boolean g = z23.g(z23);
        boolean z = false;
        boolean z2 = i2 == 2;
        k96 j2 = j(context, g ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", g ? "shaders/fragment_shader_oetf_es3.glsl" : z2 ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i3 = z23.c;
        if (g) {
            if (i3 == 7 || i3 == 6) {
                z = true;
            }
            oyb.d(z);
            j2.t(i3, "uOutputColorTransfer");
        } else if (z2) {
            if (i3 == 3 || i3 == 10) {
                z = true;
            }
            oyb.d(z);
            j2.t(i3, "uOutputColorTransfer");
        }
        return new na4(j2, ws6.j(e8c), ws6.j(list), z23.c, g);
    }

    public static k96 j(Context context, String str, String str2) {
        try {
            k96 k96 = new k96(context, str, str2);
            k96.p("uTexTransformationMatrix", gt0.k());
            return k96;
        } catch (GlUtil$GlException | IOException e) {
            throw new Exception(e);
        }
    }

    public static na4 k(k96 k96, z23 z23, z23 z232, int i2, e8c e8c) {
        k96 k962 = k96;
        z23 z233 = z232;
        boolean g = z23.g(z23);
        int i3 = z23.a;
        boolean z = false;
        boolean z2 = (i3 == 1 || i3 == 2) && z233.a == 6;
        int i4 = z233.c;
        if (g) {
            if (i4 == 3) {
                i4 = 10;
            }
            oyb.d(i4 == 1 || i4 == 10 || i4 == 6 || i4 == 7);
            k96.t(i4, "uOutputColorTransfer");
        } else if (z2) {
            oyb.d(i4 == 1 || i4 == 6 || i4 == 7);
            k96.t(i4, "uOutputColorTransfer");
        } else {
            int i5 = i2;
            k96.t(i2, "uSdrWorkingColorSpace");
            oyb.d(i4 == 3 || i4 == 1);
            k96.t(i4, "uOutputColorTransfer");
        }
        e8c e8c2 = e8c.X;
        if (g || z2) {
            z = true;
        }
        return new na4(k96, e8c, e8c2, z233.c, z);
    }

    public static boolean n(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            float[] fArr3 = fArr[i2];
            float[] fArr4 = fArr2[i2];
            if (!Arrays.equals(fArr3, fArr4)) {
                oyb.j("A 4x4 transformation matrix must have 16 elements", fArr4.length == 16);
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    public final void d(int i2, long j2) {
        boolean z;
        k96 k96 = this.h;
        ws6 ws6 = this.j;
        int size = ws6.size();
        int[] iArr = new int[2];
        iArr[1] = 16;
        int i3 = 0;
        iArr[0] = size;
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance(cls, iArr);
        if (ws6.size() <= 0) {
            boolean n2 = n(this.m, fArr);
            float[] fArr2 = this.o;
            if (!n2) {
                z = false;
            } else {
                gt0.K(fArr2);
                if (ws6.size() <= 0) {
                    z = true;
                } else {
                    hr1.r(ws6.get(0));
                    throw null;
                }
            }
            ws6 ws62 = this.i;
            int size2 = ws62.size();
            int[] iArr2 = new int[2];
            iArr2[1] = 16;
            iArr2[0] = size2;
            float[][] fArr3 = (float[][]) Array.newInstance(cls, iArr2);
            for (int i4 = 0; i4 < ws62.size(); i4++) {
                fArr3[i4] = ((uw7) ws62.get(i4)).b(j2);
            }
            float[][] fArr4 = this.l;
            boolean n3 = n(fArr4, fArr3);
            float[] fArr5 = this.n;
            if (n3) {
                gt0.K(fArr5);
                this.q = v;
                int length = fArr4.length;
                int i5 = 0;
                while (true) {
                    float[] fArr6 = this.p;
                    if (i5 >= length) {
                        int i6 = i3;
                        float[] fArr7 = fArr6;
                        Matrix.invertM(fArr7, i6, fArr5, i6);
                        this.q = x87.H0(fArr7, this.q);
                        break;
                    }
                    float[] fArr8 = fArr4[i5];
                    float[] fArr9 = fArr6;
                    Matrix.multiplyMM(fArr6, 0, fArr8, 0, this.n, 0);
                    System.arraycopy(fArr9, i3, fArr5, i3, fArr9.length);
                    e8c H0 = x87.H0(fArr8, this.q);
                    oyb.c("A polygon must have at least 3 vertices.", H0.size() >= 3);
                    ts6 ts6 = new ts6();
                    ts6.f(H0);
                    float[][] fArr10 = x87.b;
                    int i7 = 0;
                    while (i7 < 6) {
                        float[] fArr11 = fArr10[i7];
                        e8c j3 = ts6.j();
                        ts6 ts62 = new ts6();
                        for (int i8 = 0; i8 < j3.size(); i8++) {
                            float[] fArr12 = (float[]) j3.get(i8);
                            float[] fArr13 = (float[]) j3.get(((j3.size() + i8) - 1) % j3.size());
                            if (x87.j0(fArr12, fArr11)) {
                                if (!x87.j0(fArr13, fArr11)) {
                                    float[] g = x87.g(fArr11, fArr11, fArr13, fArr12);
                                    if (!Arrays.equals(fArr12, g)) {
                                        ts62.d(g);
                                    }
                                }
                                ts62.d(fArr12);
                            } else if (x87.j0(fArr13, fArr11)) {
                                float[] g2 = x87.g(fArr11, fArr11, fArr13, fArr12);
                                if (!Arrays.equals(fArr13, g2)) {
                                    ts62.d(g2);
                                }
                            }
                        }
                        i7++;
                        ts6 = ts62;
                    }
                    e8c j4 = ts6.j();
                    this.q = j4;
                    if (j4.size() < 3) {
                        break;
                    }
                    i5++;
                    i3 = 0;
                }
                i3 = 1;
            }
            boolean z2 = z || i3 != 0;
            if (this.q.size() >= 3) {
                if (!this.t || z2 || !this.u) {
                    try {
                        k96.w();
                        m();
                        k96.u(i2, 0, "uTexSampler");
                        k96.p("uTransformationMatrix", fArr5);
                        k96.q(fArr2);
                        k96.n(gt0.o(this.q));
                        k96.h();
                        GLES20.glDrawArrays(6, 0, this.q.size());
                        gt0.g();
                        this.u = true;
                    } catch (GlUtil$GlException e) {
                        throw new Exception(e);
                    }
                }
            }
        } else {
            hr1.r(ws6.get(0));
            throw null;
        }
    }

    public final void l(Gainmap gainmap) {
        if (this.k) {
            Gainmap gainmap2 = this.r;
            if (gainmap2 == null || gainmap2.getGamma() != gainmap.getGamma() || gainmap2.getRatioMax() != gainmap.getRatioMax() || gainmap2.getRatioMin() != gainmap.getRatioMin() || gainmap2.getEpsilonHdr() != gainmap.getEpsilonHdr() || gainmap2.getEpsilonSdr() != gainmap.getEpsilonSdr() || gainmap2.getDisplayRatioForFullHdr() != gainmap.getDisplayRatioForFullHdr() || gainmap2.getMinDisplayRatioForHdrTransition() != gainmap.getMinDisplayRatioForHdrTransition() || gainmap2.getGainmapContents() != gainmap.getGainmapContents() || gainmap2.getGainmapContents().getGenerationId() != gainmap.getGainmapContents().getGenerationId()) {
                this.u = false;
                this.r = gainmap;
                int i2 = this.s;
                if (i2 == -1) {
                    Bitmap b = gainmap.getGainmapContents();
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    gt0.g();
                    int i3 = iArr[0];
                    gt0.d(b.getWidth(), b.getHeight());
                    gt0.e(3553, i3, 9729);
                    GLUtils.texImage2D(3553, 0, b, 0);
                    gt0.g();
                    this.s = i3;
                    return;
                }
                Bitmap b2 = gainmap.getGainmapContents();
                gt0.d(b2.getWidth(), b2.getHeight());
                gt0.e(3553, i2, 9729);
                GLUtils.texImage2D(3553, 0, b2, 0);
                gt0.g();
            }
        }
    }

    public final void m() {
        if (this.r != null) {
            if (oze.a >= 34) {
                int i2 = this.s;
                k96 k96 = this.h;
                k96.u(i2, 1, "uGainmapTexSampler");
                Gainmap gainmap = this.r;
                int i3 = gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
                float[] k2 = gainmap.getGamma();
                int i4 = (k2[0] == 1.0f && k2[1] == 1.0f && k2[2] == 1.0f) ? 1 : 0;
                int i5 = (!udd.e(k2) || !udd.e(gainmap.getRatioMax()) || !udd.e(gainmap.getRatioMin())) ? 0 : 1;
                k96.t(i3, "uGainmapIsAlpha");
                k96.t(i4, "uNoGamma");
                k96.t(i5, "uSingleChannel");
                float[] o2 = gainmap.getRatioMin();
                k96.p("uLogRatioMin", new float[]{(float) Math.log((double) o2[0]), (float) Math.log((double) o2[1]), (float) Math.log((double) o2[2])});
                float[] n2 = gainmap.getRatioMax();
                k96.p("uLogRatioMax", new float[]{(float) Math.log((double) n2[0]), (float) Math.log((double) n2[1]), (float) Math.log((double) n2[2])});
                k96.p("uEpsilonSdr", gainmap.getEpsilonSdr());
                k96.p("uEpsilonHdr", gainmap.getEpsilonHdr());
                k96.p("uGainmapGamma", k2);
                k96.o("uDisplayRatioHdr", gainmap.getDisplayRatioForFullHdr());
                k96.o("uDisplayRatioSdr", gainmap.getMinDisplayRatioForHdrTransition());
                gt0.g();
                return;
            }
            throw new IllegalStateException("Gainmaps not supported under API 34.");
        }
    }

    public final void release() {
        try {
            this.a.d();
            try {
                GLES20.glDeleteProgram(this.h.a);
                gt0.g();
                int i2 = this.s;
                if (i2 != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                    gt0.g();
                }
            } catch (GlUtil$GlException e) {
                throw new Exception(e);
            }
        } catch (GlUtil$GlException e2) {
            throw new Exception(e2);
        }
    }
}
