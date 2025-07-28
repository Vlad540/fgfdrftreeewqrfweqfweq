package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import android.util.Rational;
import android.util.SparseArray;
import android.view.View;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: ea6  reason: default package */
public final class ea6 implements pu, ywb, af1, i36, j7f, vv1, lj7, of3, Provider, i39, a3b, vy3, god {
    public static volatile ea6 c;
    public static final int[] o = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ea6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static String F(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public boolean A() {
        return true;
    }

    public void B(int i, int i2, r74 r74) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        r74 r742 = r74;
        yw7 yw7 = (yw7) this.b;
        SparseArray sparseArray = yw7.c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i7 == 161 || i7 == 163) {
            int i12 = yw7.X0;
            ija ija = yw7.x0;
            if (i12 == 0) {
                yze yze = yw7.b;
                yw7.d1 = (int) yze.C(r742, false, true, 8);
                yw7.e1 = yze.c;
                yw7.Z0 = -9223372036854775807L;
                yw7.X0 = 1;
                ija.D(0);
            }
            ww7 ww7 = (ww7) sparseArray.get(yw7.d1);
            if (ww7 == null) {
                r742.z(i8 - yw7.e1);
                yw7.X0 = 0;
                return;
            }
            ww7.Y.getClass();
            if (yw7.X0 == 1) {
                yw7.f(r742, 3);
                int i13 = (ija.a[2] & 6) >> 1;
                if (i13 == 0) {
                    yw7.b1 = 1;
                    int[] iArr = yw7.c1;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    yw7.c1 = iArr;
                    iArr[0] = (i8 - yw7.e1) - 3;
                } else {
                    yw7.f(r742, 4);
                    int i14 = (ija.a[3] & 255) + 1;
                    yw7.b1 = i14;
                    int[] iArr2 = yw7.c1;
                    if (iArr2 == null) {
                        iArr2 = new int[i14];
                    } else if (iArr2.length < i14) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i14)];
                    }
                    yw7.c1 = iArr2;
                    if (i13 == 2) {
                        int i15 = yw7.b1;
                        Arrays.fill(iArr2, 0, i15, ((i8 - yw7.e1) - 4) / i15);
                    } else if (i13 == 1) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i4 = yw7.b1 - 1;
                            if (i16 >= i4) {
                                break;
                            }
                            yw7.c1[i16] = 0;
                            while (true) {
                                i5 = i9 + 1;
                                yw7.f(r742, i5);
                                byte b2 = ija.a[i9] & 255;
                                int[] iArr3 = yw7.c1;
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
                        yw7.c1[i4] = ((i8 - yw7.e1) - i9) - i17;
                    } else if (i13 == 3) {
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = yw7.b1 - i11;
                            if (i18 >= i20) {
                                yw7.c1[i20] = ((i8 - yw7.e1) - i9) - i19;
                                break;
                            }
                            yw7.c1[i18] = i10;
                            int i21 = i9 + 1;
                            yw7.f(r742, i21);
                            if (ija.a[i9] != 0) {
                                int i22 = i10;
                                int i23 = 8;
                                while (true) {
                                    if (i22 >= i23) {
                                        j = 0;
                                        i9 = i21;
                                        break;
                                    }
                                    int i24 = i11 << (7 - i22);
                                    if ((ija.a[i9] & i24) != 0) {
                                        int i25 = i21 + i22;
                                        yw7.f(r742, i25);
                                        j = (long) (ija.a[i9] & 255 & (~i24));
                                        while (i21 < i25) {
                                            j = (j << 8) | ((long) (ija.a[i21] & 255));
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
                                    int[] iArr4 = yw7.c1;
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
                        throw ParserException.a((RuntimeException) null, "Unexpected lacing value: " + i13);
                    }
                }
                byte[] bArr = ija.a;
                yw7.Y0 = yw7.i((long) ((bArr[1] & 255) | (bArr[0] << 8))) + yw7.S0;
                yw7.f1 = (ww7.d == 2 || (i7 == 163 && (ija.a[2] & 128) == 128)) ? 1 : 0;
                yw7.X0 = 2;
                yw7.a1 = 0;
                i3 = 163;
            } else {
                i3 = 163;
            }
            if (i7 == i3) {
                while (true) {
                    int i28 = yw7.a1;
                    if (i28 < yw7.b1) {
                        yw7.c(ww7, yw7.Y0 + ((long) ((yw7.a1 * ww7.e) / 1000)), yw7.f1, yw7.j(r742, ww7, yw7.c1[i28], false), 0);
                        yw7.a1++;
                    } else {
                        yw7.X0 = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = yw7.a1;
                    if (i29 < yw7.b1) {
                        int[] iArr5 = yw7.c1;
                        iArr5[i29] = yw7.j(r742, ww7, iArr5[i29], true);
                        yw7.a1++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i7 != 165) {
            if (i7 == 16877) {
                yw7.b(i7);
                ww7 ww72 = yw7.L0;
                int i30 = ww72.g;
                if (i30 == 1685485123 || i30 == 1685480259) {
                    byte[] bArr2 = new byte[i8];
                    ww72.O = bArr2;
                    r742.i(bArr2, 0, i8, false);
                    return;
                }
                r742.z(i8);
            } else if (i7 == 16981) {
                yw7.b(i7);
                ww7 ww73 = yw7.L0;
                byte[] bArr3 = new byte[i8];
                ww73.i = bArr3;
                r742.i(bArr3, 0, i8, false);
            } else if (i7 == 18402) {
                byte[] bArr4 = new byte[i8];
                r742.i(bArr4, 0, i8, false);
                yw7.b(i7);
                yw7.L0.j = new zoe(1, 0, 0, bArr4);
            } else if (i7 == 21419) {
                ija ija2 = yw7.z0;
                Arrays.fill(ija2.a, (byte) 0);
                r742.i(ija2.a, 4 - i8, i8, false);
                ija2.G(0);
                yw7.N0 = (int) ija2.w();
            } else if (i7 == 25506) {
                yw7.b(i7);
                ww7 ww74 = yw7.L0;
                byte[] bArr5 = new byte[i8];
                ww74.k = bArr5;
                r742.i(bArr5, 0, i8, false);
            } else if (i7 == 30322) {
                yw7.b(i7);
                ww7 ww75 = yw7.L0;
                byte[] bArr6 = new byte[i8];
                ww75.w = bArr6;
                r742.i(bArr6, 0, i8, false);
            } else {
                throw ParserException.a((RuntimeException) null, "Unexpected id: " + i7);
            }
        } else if (yw7.X0 == 2) {
            ww7 ww76 = (ww7) sparseArray.get(yw7.d1);
            if (yw7.g1 != 4 || !"V_VP9".equals(ww76.b)) {
                r742.z(i8);
                return;
            }
            ija ija3 = yw7.E0;
            ija3.D(i8);
            r742.i(ija3.a, 0, i8, false);
        }
    }

    public long C() {
        return 0;
    }

    public long D(long j) {
        return 1;
    }

    public long E(long j, long j2) {
        return 1;
    }

    public void G(a9 a9Var) {
        int i = a9Var.a;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (i == 1) {
            recyclerView.F0.d0(a9Var.b, a9Var.d);
        } else if (i == 2) {
            recyclerView.F0.g0(a9Var.b, a9Var.d);
        } else if (i == 4) {
            recyclerView.F0.i0(recyclerView, a9Var.b, a9Var.d);
        } else if (i == 8) {
            recyclerView.F0.f0(a9Var.b, a9Var.d);
        }
    }

    public b7c H(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int D = recyclerView.x0.D();
        int i2 = 0;
        b7c b7c = null;
        while (true) {
            if (i2 >= D) {
                break;
            }
            b7c U = RecyclerView.U(recyclerView.x0.C(i2));
            if (U != null && !U.p() && U.c == i) {
                if (!recyclerView.x0.H(U.a)) {
                    b7c = U;
                    break;
                }
                b7c = U;
            }
            i2++;
        }
        if (b7c == null) {
            return null;
        }
        if (!recyclerView.x0.H(b7c.a)) {
            return b7c;
        }
        boolean z = RecyclerView.P1;
        return null;
    }

    public void I(int i, long j) {
        yw7 yw7 = (yw7) this.b;
        yw7.getClass();
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        yw7.b(i);
                        yw7.L0.d = (int) j;
                        return;
                    case 136:
                        yw7.b(i);
                        ww7 ww7 = yw7.L0;
                        if (j == 1) {
                            z = true;
                        }
                        ww7.W = z;
                        return;
                    case 155:
                        yw7.Z0 = yw7.i(j);
                        return;
                    case 159:
                        yw7.b(i);
                        yw7.L0.P = (int) j;
                        return;
                    case 176:
                        yw7.b(i);
                        yw7.L0.m = (int) j;
                        return;
                    case 179:
                        yw7.a(i);
                        yw7.T0.a(yw7.i(j));
                        return;
                    case 186:
                        yw7.b(i);
                        yw7.L0.n = (int) j;
                        return;
                    case 215:
                        yw7.b(i);
                        yw7.L0.c = (int) j;
                        return;
                    case 231:
                        yw7.S0 = yw7.i(j);
                        return;
                    case 238:
                        yw7.g1 = (int) j;
                        return;
                    case 241:
                        if (!yw7.V0) {
                            yw7.a(i);
                            yw7.U0.a(j);
                            yw7.V0 = true;
                            return;
                        }
                        return;
                    case 251:
                        yw7.h1 = true;
                        return;
                    case 16871:
                        yw7.b(i);
                        yw7.L0.g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw ParserException.a((RuntimeException) null, "ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw ParserException.a((RuntimeException) null, "DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw ParserException.a((RuntimeException) null, "EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw ParserException.a((RuntimeException) null, "ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw ParserException.a((RuntimeException) null, "AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        yw7.O0 = j + yw7.H0;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        yw7.b(i);
                        if (i2 == 0) {
                            yw7.L0.x = 0;
                            return;
                        } else if (i2 == 1) {
                            yw7.L0.x = 2;
                            return;
                        } else if (i2 == 3) {
                            yw7.L0.x = 1;
                            return;
                        } else if (i2 == 15) {
                            yw7.L0.x = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        yw7.b(i);
                        yw7.L0.p = (int) j;
                        return;
                    case 21682:
                        yw7.b(i);
                        yw7.L0.r = (int) j;
                        return;
                    case 21690:
                        yw7.b(i);
                        yw7.L0.q = (int) j;
                        return;
                    case 21930:
                        yw7.b(i);
                        ww7 ww72 = yw7.L0;
                        if (j == 1) {
                            z = true;
                        }
                        ww72.V = z;
                        return;
                    case 21938:
                        yw7.b(i);
                        ww7 ww73 = yw7.L0;
                        ww73.y = true;
                        ww73.o = (int) j;
                        return;
                    case 21998:
                        yw7.b(i);
                        yw7.L0.f = (int) j;
                        return;
                    case 22186:
                        yw7.b(i);
                        yw7.L0.S = j;
                        return;
                    case 22203:
                        yw7.b(i);
                        yw7.L0.T = j;
                        return;
                    case 25188:
                        yw7.b(i);
                        yw7.L0.Q = (int) j;
                        return;
                    case 30114:
                        yw7.i1 = j;
                        return;
                    case 30321:
                        yw7.b(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            yw7.L0.s = 0;
                            return;
                        } else if (i3 == 1) {
                            yw7.L0.s = 1;
                            return;
                        } else if (i3 == 2) {
                            yw7.L0.s = 2;
                            return;
                        } else if (i3 == 3) {
                            yw7.L0.s = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        yw7.b(i);
                        yw7.L0.e = (int) j;
                        return;
                    case 2807729:
                        yw7.I0 = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                yw7.b(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    yw7.L0.B = 2;
                                    return;
                                } else if (i4 == 2) {
                                    yw7.L0.B = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                yw7.b(i);
                                int i5 = z23.i((int) j);
                                if (i5 != -1) {
                                    yw7.L0.A = i5;
                                    return;
                                }
                                return;
                            case 21947:
                                yw7.b(i);
                                yw7.L0.y = true;
                                int h = z23.h((int) j);
                                if (h != -1) {
                                    yw7.L0.z = h;
                                    return;
                                }
                                return;
                            case 21948:
                                yw7.b(i);
                                yw7.L0.C = (int) j;
                                return;
                            case 21949:
                                yw7.b(i);
                                yw7.L0.D = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw ParserException.a((RuntimeException) null, "ContentEncodingScope " + j + " not supported");
            }
        } else if (j != 0) {
            throw ParserException.a((RuntimeException) null, "ContentEncodingOrder " + j + " not supported");
        }
    }

    public jue J(long j, List list) {
        boolean isEmpty = list.isEmpty();
        jue jue = jue.a;
        if (isEmpty) {
            return jue;
        }
        ((fw) this.b).B();
        ((fw) this.b).o(j, list, true, false);
        return jue;
    }

    public void K(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int D = recyclerView.x0.D();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < D; i6++) {
            View C = recyclerView.x0.C(i6);
            b7c U = RecyclerView.U(C);
            if (U != null && !U.w() && (i4 = U.c) >= i && i4 < i5) {
                U.f(2);
                if (obj == null) {
                    U.f(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                } else if ((1024 & U.y0) == 0) {
                    if (U.z0 == null) {
                        ArrayList arrayList = new ArrayList();
                        U.z0 = arrayList;
                        U.A0 = Collections.unmodifiableList(arrayList);
                    }
                    U.z0.add(obj);
                }
                ((n6c) C.getLayoutParams()).c = true;
            }
        }
        t6c t6c = recyclerView.c;
        for (int size = t6c.c.size() - 1; size >= 0; size--) {
            b7c b7c = (b7c) t6c.c.get(size);
            if (b7c != null && (i3 = b7c.c) >= i && i3 < i5) {
                b7c.f(2);
                t6c.f(size);
            }
        }
        recyclerView.A1 = true;
    }

    public void L(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int D = recyclerView.x0.D();
        for (int i3 = 0; i3 < D; i3++) {
            b7c U = RecyclerView.U(recyclerView.x0.C(i3));
            if (U != null && !U.w() && U.c >= i) {
                if (RecyclerView.Q1) {
                    U.toString();
                }
                U.t(i2, false);
                recyclerView.w1.g = true;
            }
        }
        t6c t6c = recyclerView.c;
        int size = t6c.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            b7c b7c = (b7c) t6c.c.get(i4);
            if (b7c != null && b7c.c >= i) {
                if (RecyclerView.Q1) {
                    b7c.toString();
                }
                b7c.t(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.z1 = true;
    }

    public void M(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int D = recyclerView.x0.D();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < D; i11++) {
            b7c U = RecyclerView.U(recyclerView.x0.C(i11));
            if (U != null && (i9 = U.c) >= i5 && i9 <= i4) {
                if (RecyclerView.Q1) {
                    U.toString();
                }
                if (U.c == i) {
                    U.t(i2 - i, false);
                } else {
                    U.t(i3, false);
                }
                recyclerView.w1.g = true;
            }
        }
        t6c t6c = recyclerView.c;
        t6c.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = t6c.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            b7c b7c = (b7c) t6c.c.get(i12);
            if (b7c != null && (i8 = b7c.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    b7c.t(i2 - i, false);
                } else {
                    b7c.t(i10, false);
                }
                if (RecyclerView.Q1) {
                    b7c.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.z1 = true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ui7, java.lang.Object] */
    public void N() {
        udd.s("LoadEmojiFontWorker", "onDownloadEmojiFontFailed", (Throwable) null);
        LoadEmojiFontWorker.access$setState$p((LoadEmojiFontWorker) this.b, new Object());
    }

    public void O(mb8 mb8, ta8 ta8, ArrayList arrayList) {
        ub8 ub8 = (ub8) this.b;
        if (mb8 == ub8.u && ta8 != null) {
            wb8 wb8 = ub8.t.a;
            String c2 = ta8.c();
            xb8 xb8 = new xb8(wb8, c2, ub8.b(wb8, c2));
            xb8.i(ta8);
            if (ub8.r != xb8) {
                mb8 mb82 = ub8.u;
                xb8 xb82 = ub8.t;
                vb8 vb8 = ub8.z;
                if (vb8 != null) {
                    if (!vb8.i && !vb8.j) {
                        vb8.j = true;
                        nb8 nb8 = vb8.a;
                        if (nb8 != null) {
                            nb8.h(0);
                            nb8.d();
                        }
                    }
                    ub8.z = null;
                }
                vb8 vb82 = new vb8(ub8, xb8, mb82, 3, xb82, arrayList);
                ub8.z = vb82;
                vb82.a();
                ub8.t = null;
                ub8.u = null;
            }
        } else if (mb8 == ub8.s) {
            if (ta8 != null) {
                ub8.m(ub8.r, ta8);
            }
            ub8.r.n(arrayList);
        }
    }

    public y29 P(q74 q74, so6 so6) {
        yze yze = (yze) this.b;
        y29 y29 = null;
        int i = 0;
        while (true) {
            try {
                q74.r(yze.a, 0, 10, false);
                yze.H(0);
                if (yze.x() != 4801587) {
                    break;
                }
                yze.I(3);
                int u = yze.u();
                int i2 = u + 10;
                if (y29 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(yze.a, 0, bArr, 0, 10);
                    q74.r(bArr, 10, u, false);
                    y29 = new vo6(so6).V(i2, bArr);
                } else {
                    q74.b(u, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        q74.Y = 0;
        q74.b(i, false);
        return y29;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [ww7, java.lang.Object] */
    public void Q(int i, long j, long j2) {
        yw7 yw7 = (yw7) this.b;
        oyb.l(yw7.s1);
        if (i == 160) {
            yw7.h1 = false;
            yw7.i1 = 0;
        } else if (i == 174) {
            ? obj = new Object();
            obj.m = -1;
            obj.n = -1;
            obj.o = -1;
            obj.p = -1;
            obj.q = -1;
            obj.r = 0;
            obj.s = -1;
            obj.t = 0.0f;
            obj.u = 0.0f;
            obj.v = 0.0f;
            obj.w = null;
            obj.x = -1;
            obj.y = false;
            obj.z = -1;
            obj.A = -1;
            obj.B = -1;
            obj.C = 1000;
            obj.D = 200;
            obj.E = -1.0f;
            obj.F = -1.0f;
            obj.G = -1.0f;
            obj.H = -1.0f;
            obj.I = -1.0f;
            obj.J = -1.0f;
            obj.K = -1.0f;
            obj.L = -1.0f;
            obj.M = -1.0f;
            obj.N = -1.0f;
            obj.P = 1;
            obj.Q = -1;
            obj.R = 8000;
            obj.S = 0;
            obj.T = 0;
            obj.W = true;
            obj.X = "eng";
            yw7.L0 = obj;
        } else if (i == 187) {
            yw7.V0 = false;
        } else if (i == 19899) {
            yw7.N0 = -1;
            yw7.O0 = -1;
        } else if (i == 20533) {
            yw7.b(i);
            yw7.L0.h = true;
        } else if (i == 21968) {
            yw7.b(i);
            yw7.L0.y = true;
        } else if (i == 408125543) {
            long j3 = yw7.H0;
            if (j3 == -1 || j3 == j) {
                yw7.H0 = j;
                yw7.G0 = j2;
                return;
            }
            throw ParserException.a((RuntimeException) null, "Multiple Segment elements not supported");
        } else if (i == 475249515) {
            yw7.T0 = new lq7(1);
            yw7.U0 = new lq7(1);
        } else if (i != 524531317 || yw7.M0) {
        } else {
            if (!yw7.o || yw7.Q0 == -1) {
                yw7.s1.M(new wc0(yw7.K0));
                yw7.M0 = true;
                return;
            }
            yw7.P0 = true;
        }
    }

    public void a(Object obj) {
        switch (this.a) {
            case 7:
                Void voidR = (Void) obj;
                return;
            default:
                bx6 bx6 = (bx6) obj;
                xx4 xx4 = (xx4) this.b;
                xx4.q.getClass();
                long m = xhd.m();
                if (!bx6.f.get()) {
                    e07.k(m >= 0);
                    bx6.g = m;
                    if (!bx6.f.get()) {
                        bx6.h = true;
                        bx6.b();
                        ct0.a(ct0.A(bx6.d), new mv4(13, this), xx4.h);
                        return;
                    }
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 15:
                Objects.requireNonNull(obj, "value is null");
                ((of3) this.b).accept(new um9(obj));
                return;
            default:
                udd.s(((r0d) this.b).X, "Error while runAfterDelay", (Throwable) obj);
                return;
        }
    }

    public long b(long j) {
        return 0;
    }

    public void c() {
        uy3 uy3 = (uy3) this.b;
        uy3.A.c();
        DashManifestStaleException dashManifestStaleException = uy3.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [io9, jhe] */
    public void d(y4e y4e) {
        c5e c5e;
        if (!gt0.C()) {
            kq3.a(((k3b) this.b).getContext()).execute(new hg9(this, 17, y4e));
            return;
        }
        hu1 hu1 = y4e.e;
        ((k3b) this.b).C0 = hu1.p();
        l3b l3b = ((k3b) this.b).A0;
        Rect e = hu1.g().e();
        l3b.getClass();
        l3b.a = new Rational(e.width(), e.height());
        synchronized (l3b) {
            l3b.c = e;
        }
        y4e.c(kq3.a(((k3b) this.b).getContext()), new xz(this, hu1, y4e, 24));
        k3b k3b = (k3b) this.b;
        io9 io9 = k3b.b;
        h3b h3b = k3b.a;
        if (!(io9 instanceof c5e) || k3b.c(y4e, h3b)) {
            k3b k3b2 = (k3b) this.b;
            if (k3b.c(y4e, k3b2.a)) {
                k3b k3b3 = (k3b) this.b;
                ? io92 = new io9(k3b3, k3b3.o);
                io92.i = false;
                io92.k = new AtomicReference();
                c5e = io92;
            } else {
                k3b k3b4 = (k3b) this.b;
                c5e = new c5e(k3b4, k3b4.o);
            }
            k3b2.b = c5e;
        }
        fu1 p = hu1.p();
        k3b k3b5 = (k3b) this.b;
        e3b e3b = new e3b(p, k3b5.x0, k3b5.b);
        ((k3b) this.b).y0.set(e3b);
        hu1.f().g(kq3.a(((k3b) this.b).getContext()), e3b);
        ((k3b) this.b).b.l(y4e, new xz(this, e3b, hu1, 25));
        k3b k3b6 = (k3b) this.b;
        if (k3b6.indexOfChild(k3b6.c) == -1) {
            k3b k3b7 = (k3b) this.b;
            k3b7.addView(k3b7.c);
        }
        ((k3b) this.b).getClass();
    }

    public void e(Throwable th) {
        switch (this.a) {
            case 7:
                synchronized (((ww1) this.b).a) {
                    try {
                        ((ww1) this.b).d.p();
                        int t = hr1.t(((ww1) this.b).i);
                        if (t == 3 || t == 5 || t == 6) {
                            if (!(th instanceof CancellationException)) {
                                ww1 ww1 = (ww1) this.b;
                                int i = ww1.i;
                                ww1.d();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                ((xx4) this.b).b(0, "Unable to acquire InputBuffer.", th);
                return;
        }
    }

    public void f() {
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
        if (ChatMediaViewerScreen.t0(chatMediaViewerScreen)) {
            chatMediaViewerScreen.C0(true);
            sf8 sf8 = chatMediaViewerScreen.E0;
            if (sf8 != null) {
                sf8.b(5);
            }
        }
    }

    public long g() {
        return (long) ((ByteBuffer) this.b).position();
    }

    public Object get() {
        return this.b;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public void h() {
        sf8 sf8;
        ? r2 = (ChatMediaViewerScreen) this.b;
        View view = r2.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (ChatMediaViewerScreen.t0(r2) && (sf8 = r2.E0) != null) {
            sf8.b(2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public void i() {
        sf8 sf8;
        ? r2 = (ChatMediaViewerScreen) this.b;
        View view = r2.getView();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        if (r2.z0().a() && ChatMediaViewerScreen.t0(r2) && (sf8 = r2.E0) != null) {
            sf8.b(3);
        }
    }

    public long j(long j, long j2) {
        return j2;
    }

    public int k() {
        return ((ByteBuffer) this.b).getInt();
    }

    public long l(long j, long j2) {
        return 0;
    }

    public void m(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        byteBuffer.position(byteBuffer.position() + i);
    }

    public long n(long j, long j2) {
        return -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public void o() {
        sf8 sf8;
        ? r2 = (ChatMediaViewerScreen) this.b;
        View view = r2.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (ChatMediaViewerScreen.t0(r2) && (sf8 = r2.E0) != null) {
            sf8.b(2);
        }
    }

    public mxb p(long j) {
        return (mxb) this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.PointF q() {
        /*
            r1 = this;
            java.lang.Object r1 = r1.b
            cf1 r1 = (defpackage.cf1) r1
            af1 r0 = r1.getApplicationPipDepended()
            if (r0 == 0) goto L_0x0010
            android.graphics.PointF r0 = r0.q()
            if (r0 != 0) goto L_0x0018
        L_0x0010:
            android.content.Context r1 = r1.getContext()
            android.graphics.PointF r0 = defpackage.kjd.y(r1)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea6.q():android.graphics.PointF");
    }

    public void r(Typeface typeface) {
        j23 j23 = (j23) this.b;
        if (j23.m(typeface)) {
            j23.i(false);
        }
    }

    public int readUnsignedShort() {
        return ((ByteBuffer) this.b).getShort() & 65535;
    }

    public long s() {
        return ((long) ((ByteBuffer) this.b).getInt()) & 4294967295L;
    }

    public boolean shouldHideSensitiveInformation() {
        ((q0a) ((t97) this.b).getValue()).getClass();
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public void u() {
        sf8 sf8;
        ? r2 = (ChatMediaViewerScreen) this.b;
        View view = r2.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (ChatMediaViewerScreen.t0(r2) && (sf8 = r2.E0) != null) {
            sf8.b(2);
        }
    }

    public long v(long j, long j2) {
        return 0;
    }

    public fod w() {
        return (om3) this.b;
    }

    public void x(float f, float f2) {
        cf1 cf1 = (cf1) this.b;
        af1 applicationPipDepended = cf1.getApplicationPipDepended();
        if (applicationPipDepended != null) {
            applicationPipDepended.x(f, f2);
        }
        PointF pointF = cf1.w0;
        pointF.x = f;
        pointF.y = f2;
    }

    public void y(boolean z) {
        sf8 sf8;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
        if (ChatMediaViewerScreen.t0(chatMediaViewerScreen) && (sf8 = chatMediaViewerScreen.E0) != null) {
            sf8.b(z ? 3 : 2);
        }
    }

    public void y0() {
        sf8 sf8;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
        if (ChatMediaViewerScreen.t0(chatMediaViewerScreen) && (sf8 = chatMediaViewerScreen.E0) != null) {
            sf8.b(4);
        }
    }

    public void z(int i, boolean z) {
        ui5 ui5 = (ui5) this.b;
        if (z) {
            ui5.a(i);
        } else {
            ui5.getClass();
        }
    }

    public ea6(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ui5(1);
                return;
            case 3:
                this.b = new CopyOnWriteArrayList();
                return;
            case 14:
                return;
            case 16:
                this.b = new yze(10);
                return;
            case 25:
                this.b = new LinkedHashSet();
                return;
            case 28:
                this.b = new Object();
                return;
            default:
                this.b = new HashSet();
                return;
        }
    }

    public ea6(CameraCaptureSession cameraCaptureSession) {
        this.a = 6;
        this.b = new b2b(cameraCaptureSession, (h2g) null);
    }

    public ea6(Context context) {
        boolean isEmpty;
        this.a = 29;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(gq3.c(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    e.getMessage();
                }
            }
        }
    }

    public ea6(ByteBuffer byteBuffer) {
        this.a = 21;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
