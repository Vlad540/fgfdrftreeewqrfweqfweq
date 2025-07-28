package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: s59  reason: default package */
public final class s59 implements j26, of3, i83, i13, ix4, v1b, z1b, gg9, tab, lw9, gu3 {
    public static final s59 X = new Object();
    public static s59 Y;
    public static final s59 a = new Object();
    public static final s59 b = new Object();
    public static final s59 c = new Object();
    public static final s59 o = new Object();

    public static uu0 a(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (vx3.b(str.charAt(i2 + 1)) + (vx3.b(str.charAt(i2)) << 4));
            }
            return new uu0(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static uu0 l(String str) {
        uu0 uu0 = new uu0(str.getBytes(e22.a));
        uu0.b = str;
        return uu0;
    }

    public static uu0 s(byte[] bArr) {
        int length = bArr.length;
        oyb.i((long) bArr.length, (long) 0, (long) length);
        return new uu0(cs.T(0, bArr, length));
    }

    public static bp8 t(int i) {
        Object obj;
        Iterator it = bp8.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((bp8) obj).a == i) {
                break;
            }
        }
        bp8 bp8 = (bp8) obj;
        if (bp8 != null) {
            return bp8;
        }
        throw new IllegalArgumentException(rf0.f(i, "No such value ", " for MessageStatus"));
    }

    public void accept(Object obj) {
        udd.s(gm4.g, "restoreUploadsFromStorage: failed", (Throwable) obj);
    }

    public Object apply(Object obj) {
        return ((OneMeRoomDatabase) obj).v();
    }

    public vtc b() {
        return new wc0(-9223372036854775807L);
    }

    public void c(long j) {
    }

    public void d(int i, Serializable serializable) {
    }

    public void e(String str) {
        udd.q("Webm", str);
    }

    public long f(r74 r74) {
        return -1;
    }

    public void g(EncodeException encodeException) {
    }

    public Object h(uwb uwb) {
        return kjd.r((Executor) uwb.f(new pjb(zte.class, Executor.class)));
    }

    public void i() {
    }

    public void j(String str, Throwable th) {
        udd.s("Webm", str, th);
    }

    public CharSequence k(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (!TextUtils.isEmpty((CharSequence) null)) {
            return null;
        }
        return listPreference.a.getString(yub.not_set);
    }

    public void m(xw4 xw4) {
    }

    public km4 n(Context context) {
        if (km4.z0 == null) {
            synchronized (this) {
                if (km4.z0 == null) {
                    km4.z0 = new km4(context);
                }
            }
        }
        return km4.z0;
    }

    public void o(Throwable th) {
        udd.s("Webm", "fail!", th);
    }

    public void p(r34 r34) {
    }

    public lbe q(ws8 ws8) {
        int i;
        String str;
        ArrayList arrayList;
        boolean m = ws8.m();
        List list = hw4.a;
        if (!m) {
            return new x2b(list);
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
            return new x2b(list);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            List list2 = null;
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
                if (str.equals("presetAvatars")) {
                    if (ws8.n().a() == 7) {
                        arrayList = new ArrayList();
                        int s0 = ws8.s0();
                        for (int i3 = 0; i3 < s0; i3++) {
                            arrayList.add(n06.z(ws8));
                        }
                    } else {
                        ws8.z();
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        list2 = o23.T(arrayList);
                    }
                    if (list2 == null) {
                        list2 = list;
                    }
                    arrayList2.addAll(list2);
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 != 0) {
                            if (t3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }
        return new x2b(arrayList2);
    }

    public pda r(View view) {
        return n(view.getContext()).g();
    }

    public boolean test(Object obj) {
        return true;
    }
}
