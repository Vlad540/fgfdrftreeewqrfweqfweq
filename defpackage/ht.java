package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ht  reason: default package */
public final class ht extends lbe {
    public List X;
    public List Y;
    public List c;
    public List o;

    public ht(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
        if (this.X == null) {
            this.X = Collections.emptyList();
        }
        if (this.Y == null) {
            this.Y = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        int i;
        String str2;
        long j;
        long j2;
        long j3;
        int i2;
        mj mjVar;
        String str3;
        ws8 ws82 = ws8;
        String str4 = str;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -794795562:
                if (str4.equals("animojis")) {
                    c2 = 0;
                    break;
                }
                break;
            case 399262766:
                if (str4.equals("animojiSets")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1531715286:
                if (str4.equals("stickers")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1596679982:
                if (str4.equals("stickerSets")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                int D = jjd.D(ws8);
                this.X = new ArrayList(D);
                for (int i3 = 0; i3 < D; i3++) {
                    List list = this.X;
                    try {
                        i = jjd.K(ws8);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                        Iterator it = uzc.a.iterator();
                        while (it.hasNext()) {
                            ((ny9) it.next()).getClass();
                            ny9.a(th2);
                        }
                        int t = hr1.t(m4b.a);
                        if (t == 0) {
                            i = 0;
                        } else if (t != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th2;
                        }
                    }
                    long j4 = 0;
                    long j5 = 0;
                    String str5 = null;
                    long j6 = 0;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    for (int i4 = 0; i4 < i; i4++) {
                        try {
                            str2 = jjd.M(ws8);
                        } catch (Throwable th3) {
                            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                            Iterator it2 = uzc.a.iterator();
                            while (it2.hasNext()) {
                                ((ny9) it2.next()).getClass();
                                ny9.a(th3);
                            }
                            int t2 = hr1.t(m4b.a);
                            if (t2 != 0) {
                                if (t2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th3;
                            }
                        }
                        if (str2 != null) {
                            try {
                                switch (str2.hashCode()) {
                                    case -295931082:
                                        if (str2.equals("updateTime")) {
                                            j = jjd.J(ws82, 0);
                                            j5 = j;
                                            break;
                                        }
                                        break;
                                    case 3355:
                                        if (str2.equals(ApiProtocol.KEY_ID)) {
                                            j2 = jjd.J(ws82, 0);
                                            j4 = j2;
                                            break;
                                        }
                                        break;
                                    case 96632902:
                                        if (str2.equals("emoji")) {
                                            str5 = jjd.M(ws8);
                                            break;
                                        }
                                        break;
                                    case 109327645:
                                        if (str2.equals("setId")) {
                                            j3 = jjd.J(ws82, 0);
                                            j6 = j3;
                                            break;
                                        }
                                        break;
                                    case 803933436:
                                        if (str2.equals("lottiePlayUrl")) {
                                            str7 = jjd.M(ws8);
                                            break;
                                        }
                                        break;
                                    case 1539122512:
                                        if (str2.equals("lottieUrl")) {
                                            str6 = jjd.M(ws8);
                                            break;
                                        }
                                        break;
                                    case 1638765110:
                                        if (str2.equals("iconUrl")) {
                                            str8 = jjd.M(ws8);
                                            break;
                                        }
                                        break;
                                }
                                ws8.z();
                            } catch (Throwable th4) {
                                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                                Iterator it3 = uzc.a.iterator();
                                while (it3.hasNext()) {
                                    ((ny9) it3.next()).getClass();
                                    ny9.a(th4);
                                }
                                int t3 = hr1.t(m4b.a);
                                if (t3 != 0) {
                                    if (t3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th4;
                                }
                            }
                        }
                    }
                    list.add((str5 == null || str5.length() == 0) ? null : new oh(j4, j5, str5, j6, str6, str7, str8));
                }
                return;
            case 1:
                int D2 = jjd.D(ws8);
                this.Y = new ArrayList(D2);
                for (int i5 = 0; i5 < D2; i5++) {
                    List list2 = this.Y;
                    ArrayList arrayList = hw4.a;
                    try {
                        i2 = jjd.K(ws8);
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                        Iterator it4 = uzc.a.iterator();
                        while (it4.hasNext()) {
                            ((ny9) it4.next()).getClass();
                            ny9.a(th6);
                        }
                        int t4 = hr1.t(m4b.a);
                        if (t4 == 0) {
                            i2 = 0;
                        } else if (t4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th6;
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    String str9 = null;
                    long j7 = 0;
                    String str10 = null;
                    String str11 = null;
                    long j8 = 0;
                    for (int i6 = 0; i6 < i2; i6++) {
                        try {
                            str3 = jjd.M(ws8);
                        } catch (Throwable th7) {
                            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                            Iterator it5 = uzc.a.iterator();
                            while (it5.hasNext()) {
                                ((ny9) it5.next()).getClass();
                                ny9.a(th7);
                            }
                            int t5 = hr1.t(m4b.a);
                            if (t5 != 0) {
                                if (t5 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th7;
                            }
                        }
                        if (str3 != null) {
                            try {
                                switch (str3.hashCode()) {
                                    case -295931082:
                                        if (str3.equals("updateTime")) {
                                            j8 = jjd.J(ws82, 0);
                                            break;
                                        }
                                        break;
                                    case 3355:
                                        if (str3.equals(ApiProtocol.KEY_ID)) {
                                            j7 = jjd.J(ws82, 0);
                                            break;
                                        }
                                        break;
                                    case 3373707:
                                        if (str3.equals("name")) {
                                            str10 = jjd.M(ws8);
                                            break;
                                        }
                                        break;
                                    case 660078807:
                                        if (str3.equals("iconLottieUrl")) {
                                            str11 = jjd.M(ws8);
                                            break;
                                        }
                                        break;
                                    case 705606459:
                                        if (str3.equals("animojiIds")) {
                                            ArrayList T = jjd.T(ws82, new ns7(6));
                                            if (T == null) {
                                                T = arrayList;
                                            }
                                            arrayList2 = T;
                                            break;
                                        }
                                        break;
                                    case 1638765110:
                                        if (str3.equals("iconUrl")) {
                                            str9 = jjd.M(ws8);
                                            break;
                                        }
                                        break;
                                }
                                ws8.z();
                            } catch (Throwable th8) {
                                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                Iterator it6 = uzc.a.iterator();
                                while (it6.hasNext()) {
                                    ((ny9) it6.next()).getClass();
                                    ny9.a(th8);
                                }
                                int t6 = hr1.t(m4b.a);
                                if (t6 != 0) {
                                    if (t6 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th8;
                                }
                            }
                        }
                    }
                    if (str10 == null || str10.length() == 0) {
                        mjVar = null;
                    } else {
                        mjVar = new mj(j7, str10, str9 == null ? "" : str9, str11, j8, arrayList2);
                    }
                    list2.add(mjVar);
                }
                return;
            case 2:
                int D3 = jjd.D(ws8);
                this.c = new ArrayList(D3);
                for (int i7 = 0; i7 < D3; i7++) {
                    this.c.add(psd.a(ws8));
                }
                return;
            case 3:
                int D4 = jjd.D(ws8);
                this.o = new ArrayList(D4);
                for (int i8 = 0; i8 < D4; i8++) {
                    this.o.add(ytd.a(ws8));
                }
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        int p = ete.p(this.c);
        int p2 = ete.p(this.o);
        int p3 = ete.p(this.X);
        int p4 = ete.p(this.Y);
        StringBuilder i = rf0.i("{stickers=", p, "stickerSets=", p2, "animojis=");
        i.append(p3);
        i.append("animojiSets=");
        i.append(p4);
        i.append("}");
        return i.toString();
    }
}
