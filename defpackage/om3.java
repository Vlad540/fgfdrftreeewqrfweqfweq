package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: om3  reason: default package */
public final class om3 implements o20, i83, i13, hl0, z1b, i75, nw9, fod {
    public static final om3 X = new Object();
    public static om3 Y;
    public static final om3 a = new Object();
    public static final om3 b = new Object();
    public static final om3 c = new Object();
    public static final om3 o = new Object();

    public static final long c(long j, Long l) {
        if (l != null) {
            return j - l.longValue();
        }
        return -1;
    }

    public static int f(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return 7000;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return 3062500;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return 8000;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return 256000;
            case LangUtils.HASH_SEED /*17*/:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    public bpe B(int i, int i2) {
        return new qh4();
    }

    public void M(vtc vtc) {
    }

    public long a(long j) {
        return j;
    }

    public long b(long j) {
        return j;
    }

    public g55[] d(e55[] e55Arr, cf0 cf0) {
        int i;
        aj0 aj0;
        int i2;
        e55[] e55Arr2 = e55Arr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= e55Arr2.length) {
                break;
            }
            e55 e55 = e55Arr2[i4];
            if (e55 == null || e55.b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                ts6 i5 = ws6.i();
                i5.d(new e9(0, 0));
                arrayList.add(i5);
            }
            i4++;
        }
        int length = e55Arr2.length;
        long[][] jArr = new long[length][];
        for (int i6 = 0; i6 < e55Arr2.length; i6++) {
            e55 e552 = e55Arr2[i6];
            if (e552 == null) {
                jArr[i6] = new long[0];
            } else {
                int[] iArr = e552.b;
                jArr[i6] = new long[iArr.length];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    long j = (long) e552.a.d[iArr[i7]].i;
                    long[] jArr2 = jArr[i6];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i7] = j;
                }
                Arrays.sort(jArr[i6]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            long[] jArr4 = jArr[i8];
            jArr3[i8] = jArr4.length == 0 ? 0 : jArr4[0];
        }
        g9.v(arrayList, jArr3);
        ia9 g = og0.H().e().g();
        int i9 = 0;
        while (i9 < length) {
            long[] jArr5 = jArr[i9];
            if (jArr5.length <= i) {
                i2 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i10 = i3;
                while (true) {
                    long[] jArr6 = jArr[i9];
                    double d = 0.0d;
                    if (i10 >= jArr6.length) {
                        break;
                    }
                    int i11 = length;
                    long j2 = jArr6[i10];
                    if (j2 != -1) {
                        d = Math.log((double) j2);
                    }
                    dArr[i10] = d;
                    i10++;
                    length = i11;
                }
                i2 = length;
                int i12 = length2 - 1;
                double d2 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d3 = dArr[i13];
                    i13++;
                    g.g(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i13]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i9));
                }
            }
            i9++;
            length = i2;
            i3 = 0;
            i = 1;
        }
        ws6 j3 = ws6.j(g.h());
        for (int i14 = 0; i14 < j3.size(); i14++) {
            int intValue = ((Integer) j3.get(i14)).intValue();
            int i15 = iArr2[intValue] + 1;
            iArr2[intValue] = i15;
            jArr3[intValue] = jArr[intValue][i15];
            g9.v(arrayList, jArr3);
        }
        for (int i16 = 0; i16 < e55Arr2.length; i16++) {
            if (arrayList.get(i16) != null) {
                jArr3[i16] = jArr3[i16] * 2;
            }
        }
        g9.v(arrayList, jArr3);
        ts6 i17 = ws6.i();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            ts6 ts6 = (ts6) arrayList.get(i18);
            i17.d(ts6 == null ? ws6.m() : ts6.j());
        }
        e8c j4 = i17.j();
        g55[] g55Arr = new g55[e55Arr2.length];
        for (int i19 = 0; i19 < e55Arr2.length; i19++) {
            e55 e553 = e55Arr2[i19];
            if (e553 != null) {
                int[] iArr3 = e553.b;
                if (iArr3.length != 0) {
                    if (iArr3.length == 1) {
                        aj0 = new aj0(e553.a, new int[]{iArr3[0]});
                    } else {
                        long j5 = (long) 25000;
                        aj0 = new g9(e553.a, iArr3, cf0, (long) 10000, j5, j5, (ws6) j4.get(i19));
                    }
                    g55Arr[i19] = aj0;
                }
            }
        }
        return g55Arr;
    }

    public Object h(uwb uwb) {
        return kjd.r((Executor) uwb.f(new pjb(ld0.class, Executor.class)));
    }

    public CharSequence k(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (!TextUtils.isEmpty((CharSequence) null)) {
            return null;
        }
        return editTextPreference.a.getString(yub.not_set);
    }

    public lbe q(ws8 ws8) {
        int i;
        String str;
        int i2;
        if (!ws8.m()) {
            return null;
        }
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        kgd kgd = new kgd(0);
        for (int i3 = 0; i3 < i; i3++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th2) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th2);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("messagesReactions")) {
                    try {
                        i2 = jjd.K(ws8);
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 == 0) {
                            i2 = 0;
                        } else if (t3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        long j = 0;
                        try {
                            j = jjd.J(ws8, 0);
                        } catch (Throwable th4) {
                            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = uzc.a.iterator();
                            while (it4.hasNext()) {
                                ((ny9) it4.next()).getClass();
                                ny9.a(th4);
                            }
                            int t4 = hr1.t(m4b.a);
                            if (t4 != 0) {
                                if (t4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th4;
                            }
                        }
                        vr8 G = n1g.G(ws8);
                        if (G != null) {
                            kgd.put(Long.valueOf(j), G);
                        }
                    }
                    continue;
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th5) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = uzc.a.iterator();
                        while (it5.hasNext()) {
                            ((ny9) it5.next()).getClass();
                            ny9.a(th5);
                        }
                        int t5 = hr1.t(m4b.a);
                        if (t5 != 0) {
                            if (t5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th5;
                        }
                    }
                }
            }
        }
        return new w89(kgd);
    }

    public void w() {
    }
}
