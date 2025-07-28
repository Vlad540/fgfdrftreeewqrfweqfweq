package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.MediaCodec;
import android.net.Uri;
import android.util.SparseArray;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import org.json.JSONArray;
import ru.ok.tamtam.nano.Protos;

/* renamed from: mv4  reason: default package */
public class mv4 implements pu, af1, q55, q0c, kj7, i36, nbc, of3, tn1, god, b9f {
    public static final zo4 c = new zo4(20);
    public static final rt2 o = new rt2(new rt2(new h63(new zo4(22), 0), 1), 2);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mv4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static mv3 L(File file) {
        try {
            String name = file.getName();
            int e0 = h0e.e0(name, '_', 0, 6);
            if (e0 >= 0) {
                int o2 = m4b.o(name.substring(0, e0));
                long parseLong = Long.parseLong(name.substring(e0 + 1));
                File N = ng5.N(file, "system_info");
                if (N.exists()) {
                    File N2 = ng5.N(file, "stacktrace");
                    if (N2.exists()) {
                        File N3 = ng5.N(file, "tags");
                        File N4 = ng5.N(file, "all_stacktraces");
                        File N5 = ng5.N(file, "all_logs");
                        return new mv3(parseLong, o2, file.getPath(), N.getPath(), N3.getPath(), N2.getPath(), N4.getPath(), N5.getPath());
                    }
                    throw new IllegalStateException("No stacktrace file".toString());
                }
                throw new IllegalStateException("No system info file".toString());
            }
            throw new IllegalStateException("Malformed directory name ".concat(name).toString());
        } catch (Exception e) {
            ng5.J(file);
            throw e;
        }
    }

    public void C(x39... x39Arr) {
        for (x39 x39 : x39Arr) {
            int i = x39.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
            Integer valueOf = Integer.valueOf(i);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i2 = x39.b;
            if (treeMap.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap.get(Integer.valueOf(i2)));
                x39.toString();
            }
            treeMap.put(Integer.valueOf(i2), x39);
        }
    }

    public void D(int i, int i2, q74 q74) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        q74 q742 = q74;
        xw7 xw7 = (xw7) this.b;
        SparseArray sparseArray = xw7.c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i7 == 161 || i7 == 163) {
            int i12 = xw7.G;
            yze yze = xw7.g;
            if (i12 == 0) {
                yze yze2 = xw7.b;
                xw7.M = (int) yze2.B(q742, false, true, 8);
                xw7.N = yze2.c;
                xw7.I = -9223372036854775807L;
                xw7.G = 1;
                yze.E(0);
            }
            vw7 vw7 = (vw7) sparseArray.get(xw7.M);
            if (vw7 == null) {
                q742.z(i8 - xw7.N);
                xw7.G = 0;
                return;
            }
            vw7.X.getClass();
            if (xw7.G == 1) {
                xw7.f(q742, 3);
                int i13 = (yze.a[2] & 6) >> 1;
                if (i13 == 0) {
                    xw7.K = 1;
                    int[] iArr = xw7.L;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    xw7.L = iArr;
                    iArr[0] = (i8 - xw7.N) - 3;
                } else {
                    xw7.f(q742, 4);
                    int i14 = (yze.a[3] & 255) + 1;
                    xw7.K = i14;
                    int[] iArr2 = xw7.L;
                    if (iArr2 == null) {
                        iArr2 = new int[i14];
                    } else if (iArr2.length < i14) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i14)];
                    }
                    xw7.L = iArr2;
                    if (i13 == 2) {
                        int i15 = xw7.K;
                        Arrays.fill(iArr2, 0, i15, ((i8 - xw7.N) - 4) / i15);
                    } else if (i13 == 1) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i4 = xw7.K - 1;
                            if (i16 >= i4) {
                                break;
                            }
                            xw7.L[i16] = 0;
                            while (true) {
                                i5 = i9 + 1;
                                xw7.f(q742, i5);
                                byte b2 = yze.a[i9] & 255;
                                int[] iArr3 = xw7.L;
                                i6 = iArr3[i16] + b2;
                                iArr3[i16] = i6;
                                if (b2 != 255) {
                                    break;
                                }
                                i9 = i5;
                            }
                            i17 += i6;
                            i16++;
                            i9 = i5;
                        }
                        xw7.L[i4] = ((i8 - xw7.N) - i9) - i17;
                    } else if (i13 == 3) {
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = xw7.K - i11;
                            if (i18 >= i20) {
                                xw7.L[i20] = ((i8 - xw7.N) - i9) - i19;
                                break;
                            }
                            xw7.L[i18] = i10;
                            int i21 = i9 + 1;
                            xw7.f(q742, i21);
                            if (yze.a[i9] != 0) {
                                int i22 = i10;
                                int i23 = 8;
                                while (true) {
                                    if (i22 >= i23) {
                                        j = 0;
                                        i9 = i21;
                                        break;
                                    }
                                    int i24 = i11 << (7 - i22);
                                    if ((yze.a[i9] & i24) != 0) {
                                        int i25 = i21 + i22;
                                        xw7.f(q742, i25);
                                        j = (long) (yze.a[i9] & 255 & (~i24));
                                        while (i21 < i25) {
                                            j = (j << 8) | ((long) (yze.a[i21] & 255));
                                            i21++;
                                            i25 = i25;
                                        }
                                        int i26 = i25;
                                        if (i18 > 0) {
                                            j -= (1 << ((i22 * 7) + 6)) - 1;
                                        }
                                        i9 = i26;
                                    } else {
                                        i22++;
                                        i23 = 8;
                                        i11 = 1;
                                    }
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i27 = (int) j;
                                    int[] iArr4 = xw7.L;
                                    if (i18 != 0) {
                                        i27 += iArr4[i18 - 1];
                                    }
                                    iArr4[i18] = i27;
                                    i19 += i27;
                                    i18++;
                                    i10 = 0;
                                    i11 = 1;
                                }
                            } else {
                                throw ParserException.a((RuntimeException) null, "No valid varint length mask found");
                            }
                        }
                        throw ParserException.a((RuntimeException) null, "EBML lacing sample size out of range.");
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i13);
                        throw ParserException.a((RuntimeException) null, sb.toString());
                    }
                }
                byte[] bArr = yze.a;
                xw7.H = xw7.k((long) ((bArr[1] & 255) | (bArr[0] << 8))) + xw7.B;
                xw7.O = (vw7.d == 2 || (i7 == 163 && (yze.a[2] & 128) == 128)) ? 1 : 0;
                xw7.G = 2;
                xw7.J = 0;
                i3 = 163;
            } else {
                i3 = 163;
            }
            if (i7 == i3) {
                while (true) {
                    int i28 = xw7.J;
                    if (i28 < xw7.K) {
                        xw7.c(vw7, xw7.H + ((long) ((xw7.J * vw7.e) / 1000)), xw7.O, xw7.l(q742, vw7, xw7.L[i28]), 0);
                        xw7.J++;
                    } else {
                        xw7.G = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = xw7.J;
                    if (i29 < xw7.K) {
                        int[] iArr5 = xw7.L;
                        iArr5[i29] = xw7.l(q742, vw7, iArr5[i29]);
                        xw7.J++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i7 != 165) {
            if (i7 == 16877) {
                xw7.b(i7);
                vw7 vw72 = xw7.u;
                int i30 = vw72.g;
                if (i30 == 1685485123 || i30 == 1685480259) {
                    byte[] bArr2 = new byte[i8];
                    vw72.N = bArr2;
                    q742.i(bArr2, 0, i8, false);
                    return;
                }
                q742.z(i8);
            } else if (i7 == 16981) {
                xw7.b(i7);
                vw7 vw73 = xw7.u;
                byte[] bArr3 = new byte[i8];
                vw73.i = bArr3;
                q742.i(bArr3, 0, i8, false);
            } else if (i7 == 18402) {
                byte[] bArr4 = new byte[i8];
                q742.i(bArr4, 0, i8, false);
                xw7.b(i7);
                xw7.u.j = new yoe(1, 0, 0, bArr4);
            } else if (i7 == 21419) {
                yze yze3 = xw7.i;
                Arrays.fill(yze3.a, (byte) 0);
                q742.i(yze3.a, 4 - i8, i8, false);
                yze3.H(0);
                xw7.w = (int) yze3.w();
            } else if (i7 == 25506) {
                xw7.b(i7);
                vw7 vw74 = xw7.u;
                byte[] bArr5 = new byte[i8];
                vw74.k = bArr5;
                q742.i(bArr5, 0, i8, false);
            } else if (i7 == 30322) {
                xw7.b(i7);
                vw7 vw75 = xw7.u;
                byte[] bArr6 = new byte[i8];
                vw75.v = bArr6;
                q742.i(bArr6, 0, i8, false);
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unexpected id: ");
                sb2.append(i7);
                throw ParserException.a((RuntimeException) null, sb2.toString());
            }
        } else if (xw7.G == 2) {
            vw7 vw76 = (vw7) sparseArray.get(xw7.M);
            if (xw7.P != 4 || !"V_VP9".equals(vw76.b)) {
                q742.z(i8);
                return;
            }
            yze yze4 = xw7.n;
            yze4.E(i8);
            q742.i(yze4.a, 0, i8, false);
        }
    }

    public ByteBuffer E() {
        return ((Image.Plane) this.b).getBuffer();
    }

    public int F() {
        return ((Image.Plane) this.b).getPixelStride();
    }

    public void G(Surface surface) {
        k7f z0;
        String str = ((VideoViewerWidget) this.b).a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Media viewer. Video viewer, set surface " + surface, (Throwable) null);
        }
        ChatMediaViewerScreen n0 = ((VideoViewerWidget) this.b).n0();
        if (n0 != null && (z0 = n0.z0()) != null) {
            z0.L0(surface);
        }
    }

    public int H() {
        return ((Image.Plane) this.b).getRowStride();
    }

    public void I(int i, long j) {
        xw7 xw7 = (xw7) this.b;
        xw7.getClass();
        if (i != 20529) {
            if (i != 20530) {
                boolean z = true;
                int i2 = 3;
                switch (i) {
                    case 131:
                        xw7.b(i);
                        xw7.u.d = (int) j;
                        return;
                    case 136:
                        xw7.b(i);
                        vw7 vw7 = xw7.u;
                        if (j != 1) {
                            z = false;
                        }
                        vw7.V = z;
                        return;
                    case 155:
                        xw7.I = xw7.k(j);
                        return;
                    case 159:
                        xw7.b(i);
                        xw7.u.O = (int) j;
                        return;
                    case 176:
                        xw7.b(i);
                        xw7.u.m = (int) j;
                        return;
                    case 179:
                        xw7.a(i);
                        xw7.C.a(xw7.k(j));
                        return;
                    case 186:
                        xw7.b(i);
                        xw7.u.n = (int) j;
                        return;
                    case 215:
                        xw7.b(i);
                        xw7.u.c = (int) j;
                        return;
                    case 231:
                        xw7.B = xw7.k(j);
                        return;
                    case 238:
                        xw7.P = (int) j;
                        return;
                    case 241:
                        if (!xw7.E) {
                            xw7.a(i);
                            xw7.D.a(j);
                            xw7.E = true;
                            return;
                        }
                        return;
                    case 251:
                        xw7.Q = true;
                        return;
                    case 16871:
                        xw7.b(i);
                        xw7.u.g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw ParserException.a((RuntimeException) null, sb5.toString());
                        }
                        return;
                    case 21420:
                        xw7.x = j + xw7.q;
                        return;
                    case 21432:
                        int i3 = (int) j;
                        xw7.b(i);
                        if (i3 == 0) {
                            xw7.u.w = 0;
                            return;
                        } else if (i3 == 1) {
                            xw7.u.w = 2;
                            return;
                        } else if (i3 == 3) {
                            xw7.u.w = 1;
                            return;
                        } else if (i3 == 15) {
                            xw7.u.w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        xw7.b(i);
                        xw7.u.o = (int) j;
                        return;
                    case 21682:
                        xw7.b(i);
                        xw7.u.q = (int) j;
                        return;
                    case 21690:
                        xw7.b(i);
                        xw7.u.p = (int) j;
                        return;
                    case 21930:
                        xw7.b(i);
                        vw7 vw72 = xw7.u;
                        if (j != 1) {
                            z = false;
                        }
                        vw72.U = z;
                        return;
                    case 21998:
                        xw7.b(i);
                        xw7.u.f = (int) j;
                        return;
                    case 22186:
                        xw7.b(i);
                        xw7.u.R = j;
                        return;
                    case 22203:
                        xw7.b(i);
                        xw7.u.S = j;
                        return;
                    case 25188:
                        xw7.b(i);
                        xw7.u.P = (int) j;
                        return;
                    case 30321:
                        xw7.b(i);
                        int i4 = (int) j;
                        if (i4 == 0) {
                            xw7.u.r = 0;
                            return;
                        } else if (i4 == 1) {
                            xw7.u.r = 1;
                            return;
                        } else if (i4 == 2) {
                            xw7.u.r = 2;
                            return;
                        } else if (i4 == 3) {
                            xw7.u.r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        xw7.b(i);
                        xw7.u.e = (int) j;
                        return;
                    case 2807729:
                        xw7.r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                xw7.b(i);
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    xw7.u.A = 2;
                                    return;
                                } else if (i5 == 2) {
                                    xw7.u.A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                xw7.b(i);
                                int i6 = (int) j;
                                if (i6 != 1) {
                                    if (i6 == 16) {
                                        i2 = 6;
                                    } else if (i6 == 18) {
                                        i2 = 7;
                                    } else if (!(i6 == 6 || i6 == 7)) {
                                        i2 = -1;
                                    }
                                }
                                if (i2 != -1) {
                                    xw7.u.z = i2;
                                    return;
                                }
                                return;
                            case 21947:
                                xw7.b(i);
                                xw7.u.x = true;
                                int a2 = y23.a((int) j);
                                if (a2 != -1) {
                                    xw7.u.y = a2;
                                    return;
                                }
                                return;
                            case 21948:
                                xw7.b(i);
                                xw7.u.B = (int) j;
                                return;
                            case 21949:
                                xw7.b(i);
                                xw7.u.C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw ParserException.a((RuntimeException) null, sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw ParserException.a((RuntimeException) null, sb7.toString());
        }
    }

    public jue J(long j, List list) {
        boolean isEmpty = list.isEmpty();
        jue jue = jue.a;
        if (isEmpty) {
            return jue;
        }
        ((fw) this.b).B();
        ((fw) this.b).o(j, list, false, true);
        return jue;
    }

    public void K(ym8 ym8) {
        String str = ym8.Z;
        udd.p("mv4", "got broken message element, text: %s, elements: %s", new Object[]{Integer.valueOf(str != null ? str.length() : 0), ym8.G0});
        ((bd) this.b).f("MENTION_BROKEN_RANGE");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        urd.l(r1, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.mv3 M(int r10, java.lang.Throwable r11, defpackage.c9e r12, java.util.List r13, java.util.Map r14, java.util.List r15) {
        /*
            r9 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.nio.charset.Charset r1 = e22.a
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r0, r1)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r3 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r3)
            defpackage.pa2.b(r11, r1)     // Catch:{ all -> 0x0029 }
            r11 = 0
            urd.l(r1, r11)
            byte[] r4 = r0.toByteArray()
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            mv3 r9 = r2.N(r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0029:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x002b }
        L_0x002b:
            r10 = move-exception
            urd.l(r1, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv4.M(int, java.lang.Throwable, c9e, java.util.List, java.util.Map, java.util.List):mv3");
    }

    public int M0() {
        v2f v2f = ((VideoViewerWidget) this.b).w0;
        if (v2f != null) {
            return v2f.getHeight();
        }
        return 0;
    }

    public mv3 N(int i, byte[] bArr, c9e c9e, List list, Map map, List list2) {
        String str;
        String str2;
        Throwable th;
        Throwable th2;
        int i2;
        Throwable th3;
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        String B = xs7.B();
        Context context = (Context) this.b;
        if (B.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(B.replace(':', '-'));
        }
        File N = ng5.N(new File(context.getCacheDir(), str), "crashes");
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 1:
                str2 = "CRASH";
                break;
            case 2:
                str2 = "NON_FATAL";
                break;
            case 3:
                str2 = "FATAL";
                break;
            case 4:
                str2 = "ERROR";
                break;
            case 5:
                str2 = "WARNING";
                break;
            case 6:
                str2 = "NOTICE";
                break;
            case 7:
                str2 = "INFO";
                break;
            case 8:
                str2 = "DEBUG";
                break;
            case 9:
                str2 = "MINIDUMP";
                break;
            case 10:
                str2 = "ANR";
                break;
            default:
                throw null;
        }
        sb.append(str2);
        sb.append('_');
        sb.append(currentTimeMillis);
        File N2 = ng5.N(N, sb.toString());
        if (N2.exists()) {
            N2.getName();
            return null;
        }
        try {
            h2g.t(N2);
            File N3 = ng5.N(N2, "stacktrace");
            FileOutputStream fileOutputStream = new FileOutputStream(N3);
            try {
                fileOutputStream.write(bArr);
                urd.l(fileOutputStream, (Throwable) null);
                File N4 = ng5.N(N2, "system_info");
                ng5.O(N4, xs7.S(c9e).toString());
                File N5 = ng5.N(N2, "tags");
                if (!list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((Object) (String) it.next());
                    }
                    ng5.O(N5, jSONArray.toString());
                }
                File N6 = ng5.N(N2, "all_stacktraces");
                th = 0;
                if (!map.isEmpty()) {
                    TreeMap treeMap = new TreeMap(c);
                    treeMap.putAll(map);
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(N6), e22.a), 8192));
                    try {
                        for (Map.Entry entry : treeMap.entrySet()) {
                            Thread thread = (Thread) entry.getKey();
                            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
                            printWriter.append("Thread: ").append(thread.getName()).append(" (").append(thread.getState().toString()).append(")");
                            printWriter.append(10);
                            int length = stackTraceElementArr.length;
                            while (i3 < length) {
                                pa2.d(stackTraceElementArr[i3], printWriter, th, 6);
                                i3++;
                            }
                        }
                        urd.l(printWriter, (Throwable) null);
                    } catch (Throwable th4) {
                        urd.l(printWriter, th3);
                        throw th3;
                    } finally {
                        th3 = th4;
                    }
                }
                File N7 = ng5.N(N2, "all_logs");
                if (!list2.isEmpty()) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(N7), 8192);
                    try {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            int i4 = i2 + 1;
                            ((mn7) it2.next()).a(bufferedOutputStream, i2);
                            i2 = i4;
                        }
                        urd.l(bufferedOutputStream, (Throwable) null);
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        urd.l(bufferedOutputStream, th2);
                        throw th6;
                    }
                }
                return new mv3(currentTimeMillis, i, N2.getPath(), N4.getPath(), N5.getPath(), N3.getPath(), N6.getPath(), N7.getPath());
            } catch (Throwable th7) {
                urd.l(fileOutputStream, th);
                throw th;
            } finally {
                th = th7;
            }
        } catch (IOException unused) {
            ng5.J(N2);
            return null;
        }
    }

    public void P(CaptureRequest.Key key, Object obj) {
        ha3 ha3 = ha3.c;
        ((fc9) this.b).g(js1.Q(key), ha3, obj);
    }

    public int R() {
        v2f v2f = ((VideoViewerWidget) this.b).w0;
        if (v2f != null) {
            return v2f.getWidth();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x002c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 15: goto L_0x0076;
                case 19: goto L_0x001d;
                case 22: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r5 = r5.b
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r5 = (ru.ok.tamtam.upload.workers.UploadDraftMediaWorker) r5
            r5.e(r6)
            return
        L_0x000f:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r5 = r5.b
            r0d r5 = (defpackage.r0d) r5
            java.lang.String r5 = r5.X
            java.lang.String r0 = "onSuccess"
            udd.s(r5, r0, r6)
            return
        L_0x001d:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0075
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0028
            goto L_0x0075
        L_0x0028:
            java.util.Iterator r6 = r6.iterator()
        L_0x002c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r6.next()
            ym8 r0 = (defpackage.ym8) r0
            java.util.List r1 = r0.G0
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0043
            goto L_0x002c
        L_0x0043:
            java.lang.String r1 = r0.Z
            if (r1 == 0) goto L_0x0071
            int r2 = r1.length()
            if (r2 != 0) goto L_0x004e
            goto L_0x0071
        L_0x004e:
            java.util.List r2 = r0.G0
            java.util.Iterator r2 = r2.iterator()
        L_0x0054:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()
            dp8 r3 = (defpackage.dp8) r3
            short r4 = r3.o
            if (r4 < 0) goto L_0x006d
            short r3 = r3.X
            int r4 = r4 + r3
            int r3 = r1.length()
            if (r4 <= r3) goto L_0x0054
        L_0x006d:
            r5.K(r0)
            goto L_0x002c
        L_0x0071:
            r5.K(r0)
            goto L_0x002c
        L_0x0075:
            return
        L_0x0076:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.String r0 = "error is null"
            java.util.Objects.requireNonNull(r6, r0)
            um9 r0 = new um9
            yo9 r1 = new yo9
            r1.<init>(r6)
            r0.<init>(r1)
            java.lang.Object r5 = r5.b
            of3 r5 = (of3) r5
            r5.accept(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv4.accept(java.lang.Object):void");
    }

    public void c() {
        ty3 ty3 = (ty3) this.b;
        ty3.A.c();
        DashManifestStaleException dashManifestStaleException = ty3.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    public void e(Throwable th) {
        boolean z = th instanceof MediaCodec.CodecException;
        ea6 ea6 = (ea6) this.b;
        if (z) {
            xx4 xx4 = (xx4) ea6.b;
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            xx4.getClass();
            xx4.b(1, codecException.getMessage(), codecException);
            return;
        }
        ((xx4) ea6.b).b(0, th.getMessage(), th);
    }

    public void g(Object obj) {
        ((zi5) this.b).b.g((byte[]) obj);
    }

    public ia3 getConfig() {
        return (ia3) this.b;
    }

    public int j() {
        v2f v2f = ((VideoViewerWidget) this.b).w0;
        return 2;
    }

    public ob9 o() {
        throw null;
    }

    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((VideoViewerWidget) this.b).a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, (Throwable) null);
        }
    }

    public PointF q() {
        return ((cf1) this.b).w0;
    }

    public fod w() {
        return (zl3) this.b;
    }

    public void x(float f, float f2) {
        k77[] k77Arr = cf1.B0;
        PointF pointF = ((cf1) this.b).w0;
        pointF.x = f;
        pointF.y = f2;
    }

    public String z(sn1 sn1) {
        og7 og7 = (og7) this.b;
        e07.p("The result can only set once!", og7.Y == null);
        og7.Y = sn1;
        return "ListFuture[" + this + "]";
    }

    public mv4(Resources resources) {
        InputStream openRawResource;
        Throwable th;
        this.a = 0;
        Class<mv4> cls = mv4.class;
        udd.q(cls.getName(), "Create emoji tree from bin. Start");
        try {
            openRawResource = resources.openRawResource(q9a.a);
            byte[] bArr = new byte[4];
            openRawResource.read(bArr);
            int i = 0;
            char c2 = 8;
            this.b = new long[((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8))];
            byte[] bArr2 = new byte[(openRawResource.available() & -8)];
            int i2 = 0;
            while (true) {
                int read = openRawResource.read(bArr2);
                if (read != -1) {
                    int i3 = read / 8;
                    int i4 = i;
                    while (i4 < i3) {
                        int i5 = i4 * 8;
                        ((long[]) this.b)[i2 + i4] = ((((long) bArr2[i5 + 1]) & 255) << 48) | (((long) bArr2[i5]) << 56) | ((((long) bArr2[i5 + 2]) & 255) << 40) | ((((long) bArr2[i5 + 3]) & 255) << 32) | ((((long) bArr2[i5 + 4]) & 255) << 24) | ((((long) bArr2[i5 + 5]) & 255) << 16) | ((((long) bArr2[i5 + 6]) & 255) << 8) | (((long) bArr2[i5 + 7]) & 255);
                        i4++;
                        c2 = 8;
                    }
                    char c3 = c2;
                    i2 += i3;
                    i = 0;
                } else {
                    udd.q(cls.getName(), "Create emoji tree from bin. Finish. Size:" + ((long[]) this.b).length);
                    openRawResource.close();
                    return;
                }
            }
        } catch (IOException e) {
            udd.s(cls.getName(), "Can't create emoji tree from bin", e);
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public mv4(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = fc9.c();
                return;
            case 8:
                this.b = o23.s0(ie2.o);
                return;
            case 9:
                this.b = new r7e(new ke(13, this));
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                this.b = zf4.a.j(SmallDisplaySizeQuirk.class);
                return;
            case 21:
                this.b = new LinkedHashMap();
                return;
            case 23:
                this.b = new Object();
                return;
            case 25:
                this.b = new ConcurrentHashMap();
                return;
            default:
                this.b = new CopyOnWriteArrayList();
                return;
        }
    }
}
