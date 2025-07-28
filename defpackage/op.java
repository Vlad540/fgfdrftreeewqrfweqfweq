package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: op  reason: default package */
public final class op extends pv3 implements c6a {
    public static final op a = new Object();
    public static t97 b;
    public static final String[] c = {"Prefs", "FilePrefs", av2.b, "chats-list-job-executor"};
    public static final r7e d = new r7e(new m(7));
    public static final r7e e = new r7e(new m(8));

    /* JADX WARNING: type inference failed for: r0v0, types: [op, java.lang.Object] */
    static {
        bv2.m.getClass();
    }

    public final void a(String str, Throwable th) {
        t97 t97;
        yzc yzc;
        r7e r7e = e;
        if (str == null || str.length() == 0) {
            if (((th instanceof Error) || !((t97 = b) == null || (yzc = (yzc) t97.getValue()) == null || !yzc.m(PmsKey.tracer-non-fatal-crashed-enabled, false))) && ((sne) r7e.getValue()) != null) {
                sne.b((z9d) null, th, (String) null);
            }
        } else if (((sne) r7e.getValue()) != null) {
            sne.b((z9d) null, th, str);
        }
    }

    public final void b(String str, String str2) {
        if (((nne) d.getValue()) != null) {
            nne nne = nne.a;
            Map singletonMap = Collections.singletonMap(str, str2);
            if (!nne.b) {
                try {
                    i3d i3d = nne.e;
                    if (i3d == null) {
                        i3d = null;
                    }
                    i3d.f(singletonMap);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void c(String str) {
        if (((nne) d.getValue()) != null) {
            try {
                i3d i3d = nne.e;
                if (i3d == null) {
                    i3d = null;
                }
                i3d.getClass();
                i3d.f(Collections.singletonMap("userId", str));
            } catch (Exception unused) {
            }
        }
    }
}
